
package com.uamcuamx.proyectocuajibanco;

import com.uamcuamx.interfazgrafica.VentanaCrearCuenta;
import com.uamcuamx.interfazgrafica.VentanaVerificarCodigo;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

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
public class Verificacion {

    public boolean verificarCorreo(String correo) {

        int[] codigo = new int[5];
        String codigoUsuario, codigoEnviado;
        int i, valorDado;
        boolean status = false;
        Random r = new Random();
        for (i = 0; i < 5; i++) {
            valorDado = r.nextInt(10);
            codigo[i] = valorDado;
        }
        codigoEnviado = String.valueOf(codigo[0]) + String.valueOf(codigo[1]) + String.valueOf(codigo[2]) + String.valueOf(codigo[3]) + String.valueOf(codigo[4]);
        VentanaVerificarCodigo vfc = new VentanaVerificarCodigo(null, true, correo, codigoEnviado);
        vfc.setLocationRelativeTo(null);
        vfc.setVisible(true);
        codigoUsuario = vfc.getCaja1().getText() + vfc.getCaja2().getText() + vfc.getCaja3().getText() + vfc.getCaja4().getText() + vfc.getCaja5().getText();
        status = codigoEnviado.equals(codigoUsuario);
        vfc.dispose();
        return status;
    }

    public boolean verificarCliente(long numCliente) {
        BdCliente bdc = new BdCliente();
        boolean condicion = false;

        try {
            condicion = bdc.verificarCliente(numCliente);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(VentanaCrearCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return condicion;
    }

    public boolean verificarCuenta(long numCuenta) {
        BdCuenta bdc = new BdCuenta();
        boolean condicion = false;

        try {
            condicion = bdc.verificarCuentaC(numCuenta);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(VentanaCrearCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return condicion;
    }

    public boolean verificarTarjeta(Tarjeta tarjeta) throws SQLException, ClassNotFoundException {
        BdTarjeta bdt = new BdTarjeta();
        Tarjeta tbase = new Tarjeta();
        boolean status = false;
        if (bdt.verificarTarjeta(tarjeta.getNumTarjeta())) {
            tbase = bdt.buscarTarjetaT(tarjeta.getNumTarjeta());
            if (tarjeta.getCodigoSeguridad() == tbase.getCodigoSeguridad() && tbase.getVencimiento().equals(tarjeta.getVencimiento()) && tarjeta.getNIP() == tbase.getNIP()) {
                status = true;
            }
        }
        return status;
    }
    
}
