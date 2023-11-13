
package com.uamcuamx.proyectocuajibanco;

import com.uamcuamx.interfazgrafica.VentanaCorreoCliente;
import com.uamcuamx.interfazgrafica.VentanaCrearCuenta;
import com.uamcuamx.interfazgrafica.VentanaRetiroEfectivo;
import java.sql.SQLException;
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
public class Cuenta {
    private long numero;
    private String fechaCreacion;
    private double montoTotal;
    private long idCliente;
    
    public void crearCeuenta(){
        BdCuenta bdCuenta = new BdCuenta();
            long numero = 0;
            
            try {
                numero = bdCuenta.registarCuenta(this);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(VentanaCrearCuenta.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Tu cuenta es: " + numero);
            try {
                        movCreacionCuenta reg=new movCreacionCuenta(numero);
                        reg.crearComprobante();
                    } catch (SQLException | ClassNotFoundException ex) {
                        Logger.getLogger(VentanaCorreoCliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
        }
    
    public boolean retirarEfectivo(long retiro,long numTarjeta){
        boolean status=false;
    
        if (retiro <= montoTotal) {
            BdCuenta bdc=new BdCuenta();
            
            try {
                bdc.modificarSaldo(this,retiro);
                status=true;
                if(numTarjeta!=-1){
                    movRetiroConTarjeta mrct=new movRetiroConTarjeta(numTarjeta,String.valueOf(retiro));
                    mrct.crearComprobante();
                }else
                {
                    movRetiroSinTarjeta mrst=new movRetiroSinTarjeta(numero,String.valueOf(retiro));
                    mrst.crearComprobante();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(VentanaRetiroEfectivo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VentanaRetiroEfectivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return status;
    }
    
    public boolean cargarMonto(long monto){
        boolean status=false;
    
        if (monto <= montoTotal) {
            //Restar saldo
            BdCuenta bdc=new BdCuenta();
            
            try {
                bdc.modificarSaldo(this,monto);
                status=true;
            } catch (SQLException ex) {
                Logger.getLogger(VentanaRetiroEfectivo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VentanaRetiroEfectivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return status;
    }
    

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }
    
    
    
}
