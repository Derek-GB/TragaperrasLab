/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Interfaces.Observable;
import Interfaces.Observador;

/**
 *
 * @author d2tod
 */
public class Campo extends Thread implements Observable {

    private boolean stop;
    private int cont;
    private int velocidad;
    private Icon[] iconos;
    private Observador observador;
    private char id;

    public Campo(char id, int velocidad) {
        this.iconos = inicializarIconos();
        this.id = id;
        this.cont = 0;
        this.velocidad = velocidad;
    }

    public void detener(){
        this.stop = true;
    }
    
    public Icon getIcono() {
        return iconos[cont];
    }

    public void cambiarIcono() {
        emitirSeñal(nextIcon(), id);
    }

    private Icon nextIcon() {
        cont++;
        if (cont >= iconos.length) {
            cont = 0;
        }
        return iconos[cont];
    }

    private Icon[] inicializarIconos() {
        return new Icon[]{
            Icon.SIETE, Icon.LIMONES, Icon.NARANJAS, Icon.SANDIAS, Icon.UVAS, Icon.CEREZAS, Icon.CAMPANAS, Icon.BAR, Icon.ESTRELLA
        };
    }

    @Override
    public void setObservador(Observador observador) {
        this.observador = observador;
    }

    @Override
    public void emitirSeñal(Object señal, char id) {
        observador.actulizar(señal, id);
    }

    @Override
    public void run() {
        stop = false;
        int timeSleep = velocidad + 1;
        int maxTime = velocidad * 100;
        do {
            cambiarIcono();
            try {
                Thread.sleep(timeSleep += timeSleep / 10);
            } catch (InterruptedException e) {

            }
            if (timeSleep >= maxTime){
                timeSleep = maxTime;
            }
        } while (!stop);
    }

}
