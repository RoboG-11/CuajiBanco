/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;


import com.uamcuamx.interfazgrafica.VentanaRetiroEfectivo;
import com.uamcuamx.proyectocuajibanco.BdCuenta;
import com.uamcuamx.proyectocuajibanco.BdTarjeta;
import com.uamcuamx.proyectocuajibanco.Correo;
import com.uamcuamx.proyectocuajibanco.Cuenta;
import com.uamcuamx.proyectocuajibanco.Tarjeta;
import com.uamcuamx.proyectocuajibanco.Verificacion;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex Rivera
 */
public class PrincipalPruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        /*Cuenta c=new Cuenta();
        BdCuenta bdc=new BdCuenta();
        c.setIdCliente(42184);
        c.setMontoTotal(750);
        long numc=bdc.registarCuenta(c);
        System.out.print(numc);
       Tarjeta t=new Tarjeta();
        t.crearTarjeta();
        t.setIdCuenta(431901);
        BdTarjeta bdt=new BdTarjeta();
        
        bdt.registarTarjeta(t);*/
        Correo c=new Correo();
        c.enviar("2203066355@cua.uam.mx", "Prueba", "Hola", "D:\\Alex Rivera\\Documentos\\musita.pdf");
        
    }
    
}
