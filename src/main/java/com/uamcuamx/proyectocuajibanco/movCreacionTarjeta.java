
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
public class movCreacionTarjeta extends Movimiento{
    protected long numCuenta;
    protected long numTarjeta;
    protected Date fecha;
    protected String nombre;
    protected int codigoSeguridad;
    protected String vencimiento;
    protected int NIP;
    public movCreacionTarjeta(Tarjeta tarjeta) throws SQLException, ClassNotFoundException{
        this.numTarjeta=tarjeta.getNumTarjeta();
        this.codigoSeguridad=tarjeta.getCodigoSeguridad();
        this.vencimiento=tarjeta.getVencimiento();
        this.NIP=tarjeta.getNIP();
        Cliente c;
        BdTarjeta bdt=new BdTarjeta();
        c = bdt.buscarClienteT(numTarjeta);
        this.numCliente=c.getId();
        this.nombre = c.getNombres()+" "+c.getApPaterno()+" "+c.getApMaterno();
        this.correo= c.getCorreo();
        Cuenta x;
        x = bdt.buscarCuentaT(numTarjeta);
       this.numCuenta=x.getNumero();
       this.fecha =new Date();
       String strDateFormat = "dd-MMM-yyyy  hh: mm: ss a";  
       SimpleDateFormat formato = new SimpleDateFormat(strDateFormat);
       this.FechayHora= formato.format(fecha);       
       this.tipoTran="CREACION_TARJETA";
       BdMovimiento bdm=new BdMovimiento();
       this.numTran=bdm.registrarMovimiento(this);
    }

    @Override
    public void crearComprobante() {
        try {
            comprobanteCreacionTarjeta.crearComprobanteCreacionTarjeta(this);
             Correo c = new Correo();
            c.enviar(this.correo, "Comprobante Creacion de Tarjeta", "Te enviamos tu comprobante", "./IMPRESORA/"+this.tipoTran+"_"+this.numTran+".pdf");
       
        } catch (DocumentException ex) {
            Logger.getLogger(movCreacionTarjeta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(movCreacionTarjeta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
