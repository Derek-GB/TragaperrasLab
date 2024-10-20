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
public class Campo implements Observable {

    private Icon icono;
    private Observador observador;
    private char id;

    public Campo(char id) {
        this.icono = Icon.SIETE;
        this.id = id;
    }

    public Icon getIcono() {
        return icono;
    }

    public void cambiarIcono(Icon icono) {
        this.icono = icono;
        emitirSeñal(icono,id);    }

    @Override
    public void setObservador(Observador observador) {
        this.observador = observador;
    }

    @Override
    public void emitirSeñal(Object señal, char id) {
        observador.actulizar(señal, id);
    }

}
