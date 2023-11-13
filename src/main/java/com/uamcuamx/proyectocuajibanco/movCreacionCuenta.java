package com.uamcuamx.proyectocuajibanco;
import com.itextpdf.text.DocumentException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.text.SimpleDateFormat;
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
public class movCreacionCuenta extends Movimiento{
    protected long numCuenta;
    protected Date fecha;
    protected String nombre;
    public movCreacionCuenta(long numCuenta) throws SQLException, ClassNotFoundException{
          this.numCuenta=numCuenta;
          Cliente cl;
          BdCuenta bdc=new BdCuenta();
          cl = bdc.buscarClienteC(numCuenta);
          this.numCliente=cl.getId();
          this.nombre = cl.getNombres()+" "+cl.getApPaterno()+" "+cl.getApMaterno();
          this.correo= cl.getCorreo();
        Cuenta x;
        x = bdc.buscarCuentaC(numCuenta);
       this.numCuenta=x.getNumero();
       this.fecha =new Date();
       String strDateFormat = "dd-MMM-yyyy  hh: mm: ss a";  
       SimpleDateFormat formato = new SimpleDateFormat(strDateFormat);
       this.FechayHora= formato.format(fecha);    
       this.tipoTran="CREACION_CUENTA";
       BdMovimiento bdm=new BdMovimiento();
       this.numTran=bdm.registrarMovimiento(this);
       
       
    }

    @Override
    public void crearComprobante() {
        try {
            comprobanteCreacionCuenta.crearComprobanteCreacionCuenta(this);
             Correo c = new Correo();
            c.enviar(this.correo, "Comprobante Creacion de Cuenta", "Te enviamos tu comprobante", "./IMPRESORA/"+this.tipoTran+"_"+this.numTran+".pdf");
       
        } catch (DocumentException ex) {
            Logger.getLogger(movCreacionCuenta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(movCreacionCuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
