/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import com.uamcuamx.proyectocuajibanco.Correo;

/**
 *
 * @author marqu
 */
public class PrincipalCorreoEnviarPdf {
    public static void main(String [] args){
        
        Correo pdf = new Correo();
        pdf.enviar("2193034858@cua.uam.mx", "Comprobante Registro", "Estimado Cliente, te enviamos tu comprobante", "./IMPRESORA/DONATIVO_CAMPAÑA_1.pdf");
    }
    
}
