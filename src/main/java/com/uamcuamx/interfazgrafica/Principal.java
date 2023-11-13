
package com.uamcuamx.interfazgrafica;
import com.uamcuamx.interfazgrafica.*;

/**
 * Proyecto Final Programación Orientada a Objetos
 * Simulación del funncionamiento de un cajero automatico
 * Proyecto: Cuajibanco
 * Integrantes Equipo 1 
 * Rivera Martinez Brian
 * Rivera Plata Jesus Alejandro
 * Vazquez Cerritos Marco Alejandro
 * Victoria Nava Natalia
 */
public class Principal {

   
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PantallaPrincipal inicio = new PantallaPrincipal();
                inicio.setVisible(true);
                inicio.setLocationRelativeTo(null);
                
            }
        });
        

    }

}
