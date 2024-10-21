/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Interfaces.Observador;
import modelo.Campo;
import vista.FrmTragaPerras;

/**
 *
 * @author d2tod
 */
public class Controlador implements Observador {

    private FrmTragaPerras frm;
    private Campo campoI;
    private Campo campoC;
    private Campo campoD;

    public Controlador(FrmTragaPerras frm) {
        this.frm = frm;
        this.campoI = new Campo('i', velocidadInicial());
        this.campoC = new Campo('c', velocidadInicial());
        this.campoD = new Campo('d', velocidadInicial());
    }

    @Override
    public void actulizar(Object señal, char id) {
        frm.actulizarCampo((modelo.Icon) señal, id);
    }

    public int velocidadInicial() {
        return (int) (Math.random() * 100);
    }

    public void jugar() {
        do {
            while (!frm.getIniciar()) {

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Algo salio terriblemente mal");
                }
            }

            this.campoI.setObservador(this);
            this.campoC.setObservador(this);
            this.campoD.setObservador(this);

            this.campoI.start();
            this.campoC.start();
            this.campoD.start();
            try {
                Thread.sleep(9000);
            } catch (InterruptedException e) {
                System.out.println("Algo salio terriblemente mal");

            }

            this.campoI.detener();
            this.campoC.detener();
            this.campoD.detener();
            
            frm.setIniciar(false);

        } while (true);
    }

}
