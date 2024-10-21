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
    private boolean inicio;

    public Controlador(FrmTragaPerras frm) {
        this.frm = frm;
        this.campoI = new Campo('i');
        this.campoC = new Campo('c');
        this.campoD = new Campo('d');
    }

    @Override
    public void actulizar(Object señal, char id) {
        frm.actualizar((modelo.Icon) señal, id);
    }

}
