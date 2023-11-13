
package com.uamcuamx.proyectocuajibanco;

import com.itextpdf.text.DocumentException;
import com.uamcuamx.interfazgrafica.VentanaEsperando;
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
public class movRetiroConTarjeta extends Movimiento{
    protected long numCuenta;
    protected long numTarjeta;
    protected String monto;
    protected String nombre;
    protected Date Fecha;
    //con tarjeta
    public movRetiroConTarjeta(long tarjeta, String monto) throws SQLException, ClassNotFoundException{
        this.numTarjeta=tarjeta;
        BdTarjeta dbt=new BdTarjeta();
        Cliente ci;
         ci = dbt.buscarClienteT(numTarjeta);
        this.numCliente=ci.getId();
        this.nombre=ci.getNombres()+" "+ci.getApPaterno()+" "+ci.getApMaterno();
        this.correo=ci.getCorreo();
        Cuenta c;
        c = dbt.buscarCuentaT(numTarjeta);
        this.numCuenta=c.getNumero();
        this.monto=monto;
        this.Fecha=new Date();
       String strDateFormat = "dd-MMM-yyyy  hh: mm: ss a";  
       SimpleDateFormat formato = new SimpleDateFormat(strDateFormat);
       this.FechayHora= formato.format(Fecha);
       this.tipoTran="RETIRO_CON_TARJETA";
       BdMovimiento bdm=new BdMovimiento();
       this.numTran=bdm.registrarMovimiento(this);

    }
    @Override
    public void crearComprobante() {
        try {
            comprobanteRetiroCon.crearComprobanteRetiroConTarjeta(this);
            Correo c = new Correo();
            
            c.enviar(this.correo, "Comprobante Retiro con tarjeta", "Te enviamos tu comprobante", "./IMPRESORA/"+this.tipoTran+"_"+this.numTran+".pdf");
       
        } catch (DocumentException ex) {
            Logger.getLogger(movRetiroConTarjeta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(movRetiroConTarjeta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
