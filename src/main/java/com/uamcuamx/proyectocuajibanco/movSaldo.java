
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
public class movSaldo extends Movimiento {
    protected String saldo;
    protected String nombre;
    protected long numCuenta;
    protected long numTarjeta;
     protected Date Fecha;
     public movSaldo(long  numTarjeta) throws SQLException, ClassNotFoundException{
         this.numTarjeta=numTarjeta;
         Cliente clñ;
        BdTarjeta bdt=new BdTarjeta();
        clñ = bdt.buscarClienteT(numTarjeta);
        this.numCliente=clñ.getId();
         this.correo=clñ.getCorreo();
         this.nombre=clñ.getNombres()+" "+clñ.getApPaterno()+" "+clñ.getApMaterno();
         Cuenta x;
        x = bdt.buscarCuentaT(numTarjeta);
       this.numCuenta=x.getNumero();
        this.saldo=String.valueOf(x.getMontoTotal());
        this.Fecha=new Date();
       String strDateFormat = "dd-MMM-yyyy  hh: mm: ss a";  
       SimpleDateFormat formato = new SimpleDateFormat(strDateFormat);
       this.FechayHora= formato.format(Fecha);
       this.tipoTran="CONSULTA_SALDO";
       BdMovimiento bdm=new BdMovimiento();
       this.numTran=bdm.registrarMovimiento(this);
    }

    @Override
    public void crearComprobante() {
        try {
            comprobanteSaldo.crearComprobanteSaldo(this);
             
             Correo c = new Correo();
             c.enviar(this.correo, "Comprobante Consulta de Saldo", "Te enviamos tu comprobante", "./IMPRESORA/"+this.tipoTran+"_"+this.numTran+".pdf");
             
        } catch (DocumentException ex) {
            Logger.getLogger(movSaldo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(movSaldo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


 
}
