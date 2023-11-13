
package com.uamcuamx.proyectocuajibanco;

import com.uamcuamx.interfazgrafica.VentanaCrearCuenta;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
public class Tarjeta {

    private long numTarjeta;
    private int codigoSeguridad;
    private String vencimiento;
    private int NIP;
    private long idCuenta;

    public void crearTarjeta() throws SQLException, ClassNotFoundException {
        generarCodSeg();
        generarVencimiento();
        generarNIP();
        long numero=-1;
        BdTarjeta bdt=new BdTarjeta();
        
        try {
                numero = bdt.registarTarjeta(this);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(VentanaCrearCuenta.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Tu tarjeta es: " + numero+"\nTe enviaremos un correo con los demás datos");
            
            movCreacionTarjeta reg=new movCreacionTarjeta(this);
            reg.crearComprobante();
    }

    public void generarNIP() {
       
        int[] codigo = new int[4];
        String NIPGenerado;
        int i, valorDado;
        Random r = new Random();
        for (i = 0; i < 4; i++) {
            valorDado = r.nextInt(10);
            codigo[i] = valorDado;
        }
        NIPGenerado = String.valueOf(codigo[0]) + String.valueOf(codigo[1]) + String.valueOf(codigo[2]) + String.valueOf(codigo[3]);

        this.NIP = Integer.parseInt(NIPGenerado);
    }

    public void generarCodSeg() {
        int[] codigo = new int[3];
        String CSGenerado;
        int i, valorDado;
        Random r = new Random();
        for (i = 0; i < 3; i++) {
            valorDado = r.nextInt(10);
            codigo[i] = valorDado;
        }
        CSGenerado = String.valueOf(codigo[0]) + String.valueOf(codigo[1]) + String.valueOf(codigo[2]);

        this.codigoSeguridad = Integer.parseInt(CSGenerado);
    }

    public void generarVencimiento() {
        int anio;
        int mes;
        Calendar c1 = Calendar.getInstance();
        anio = c1.get(Calendar.YEAR)+3;
        mes = c1.get(Calendar.MONTH);
        this.vencimiento=mes+"/"+anio;
    }

    public long getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(long numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(int codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }

    public long getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(long idCuenta) {
        this.idCuenta = idCuenta;
    }

}
