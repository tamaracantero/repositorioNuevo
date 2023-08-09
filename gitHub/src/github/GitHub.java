/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github;

import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 *
 * @author valkiria
 */
public class GitHub {

    /**
     * @param args the command line arguments
     */
    
        public static void limpiarPant(){
        try{
            System.out.println("Presione enter para continuar...");
            new java.util.Scanner(System.in).nextLine();

            Robot limpiar = new Robot();
            limpiar.keyPress(KeyEvent.VK_CONTROL);
            limpiar.keyPress(KeyEvent.VK_L);
            limpiar.keyRelease(KeyEvent.VK_CONTROL);
            limpiar.keyRelease(KeyEvent.VK_L);
            
        }  catch (Exception e) {
            System.out.println("Error al limpiar la pantalla"+e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println("Pinche git"); // hecho por Joaquin
        System.out.println("Pinche net beans"); //hecho Juan
        System.out.println("hola compas");//hecho por tamara
        System.out.println("Pipipipi");//by Tomi Rivero
        
        limpiarPant();
    }
    
}
