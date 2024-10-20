/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author d2tod
 */
public interface Observable {
    public void setObservador(Observador observer);

    public void emitirSeñal(Object señal);
}
