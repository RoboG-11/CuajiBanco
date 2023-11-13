
package com.uamcuamx.proyectocuajibanco;

import com.itextpdf.text.DocumentException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class movRetiroSinTarjeta extends Movimiento{
    protected long numCuenta;
    protected String nombre;
    protected String monto;
    protected Date Fecha;
    
    
       public movRetiroSinTarjeta(long numCuenta, String monto) throws SQLException, ClassNotFoundException{
        BdCuenta dbt=new BdCuenta();
        Cliente ci;
        ci = dbt.buscarClienteC(numCuenta);
        this.numCliente=ci.getId();
        this.nombre=ci.getNombres()+" "+ci.getApPaterno()+" "+ci.getApMaterno();
        this.correo=ci.getCorreo();
        Cuenta c;
        c = dbt.buscarCuentaC(numCuenta);
        this.numCuenta=c.getNumero();
        this.monto=monto;
         this.Fecha=new Date();
       String strDateFormat = "dd-MMM-yyyy  hh: mm: ss a";  
       SimpleDateFormat formato = new SimpleDateFormat(strDateFormat);
       this.FechayHora= formato.format(Fecha);
       
       this.tipoTran="RETIRO_SIN_TARJETA";
       BdMovimiento bdm=new BdMovimiento();
       this.numTran=bdm.registrarMovimiento(this);
    }

    @Override
    public void crearComprobante() {
           try {
               comprobanteRetiroSin.crearComprobanteRetiroSinTarjeta(this);
                Correo c = new Correo();
                c.enviar(this.correo, "Comprobante Retiro sin tarjeta", "Te enviamos tu comprobante", "./IMPRESORA/"+this.tipoTran+"_"+this.numTran+".pdf");
       
           } catch (DocumentException ex) {
               Logger.getLogger(movRetiroSinTarjeta.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
               Logger.getLogger(movRetiroSinTarjeta.class.getName()).log(Level.SEVERE, null, ex);
           }
    }
}
