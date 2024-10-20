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

    public Campo() {
        this.icono = Icon.SIETE;
    }

    public Icon getIcono() {
        return icono;
    }

    public void setIcono(Icon icono) {
        this.icono = icono;
    }

    @Override
    public void setObservador(Observador observador) {
        this.observador = observador;
    }

    @Override
    public void emitirSeñal(Object señal) {
        observador.actulizar(señal);
    }

}
