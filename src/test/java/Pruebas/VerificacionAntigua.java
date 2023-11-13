/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import com.uamcuamx.proyectocuajibanco.*;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex Rivera
 */
public class VerificacionAntigua {

    public boolean verificarCorreo(String correo) {

        int[] codigo = new int[5];
        String codigoUsuario,codigoEnviado;
        int i, valorDado;
        boolean status=false;
        Random r = new Random();
        for (i = 0; i < 5; i++) {
            valorDado = r.nextInt(10);
            codigo[i] = valorDado;
        }
        codigoEnviado = String.valueOf(codigo[0])+String.valueOf(codigo[1])+String.valueOf(codigo[2])+String.valueOf(codigo[3])+String.valueOf(codigo[4]);
        System.out.println(codigoEnviado);
        Correo mail = new Correo();
        mail.enviar(correo, "Verificación de correo electrónico", "Código de seguridad: " + codigo[0] + " - " + codigo[1] + " - " + codigo[2] + " - " + codigo[3] + " - " + codigo[4]);
        
        codigoUsuario=JOptionPane.showInputDialog(null,"Enviamos un código a tu correo, escríbelo a continuación: ","Código de Verificación",JOptionPane.QUESTION_MESSAGE);
        
        status=codigoEnviado.equals(codigoUsuario);
        
        return status;
    }
}
