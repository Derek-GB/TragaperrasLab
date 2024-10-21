/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import controlador.Controlador;
import vista.FrmTragaPerras;

/**
 *
 * @author Tony
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       FrmTragaPerras frm =new FrmTragaPerras();
       Controlador control =new Controlador(frm);
       
       frm.setVisible(true);
       control.jugar();
       
    }
    
}
