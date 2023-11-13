
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

public class movRegistro extends Movimiento{
     protected Date Fecha;
      protected String nombre;
      protected long tel;
      protected String domicilio;
      protected String RFC;
      protected String correo;
      protected String fNacimiento;
      public movRegistro (long numCliente) throws SQLException, ClassNotFoundException{
          Cliente clie;
          BdCliente bdc=new BdCliente();
          clie = bdc.buscarCliente(numCliente);
          this.numCliente=clie.getId();
          this.nombre=clie.getNombres()+" "+clie.getApPaterno()+" "+clie.getApMaterno();
          this.fNacimiento=clie.getFechaNacimiento();
          this.RFC=clie.getRFC();
          this.correo=clie.getCorreo();
          this.domicilio=clie.getDireccion();
          this.tel=clie.getTelefono();
          this.Fecha=new Date();
          String strDateFormat = "dd-MMM-yyyy  hh: mm: ss a";  
          SimpleDateFormat formato = new SimpleDateFormat(strDateFormat);
          this.FechayHora= formato.format(Fecha);
          this.tipoTran="REGISTRO";
          BdMovimiento bdm=new BdMovimiento();
          this.numTran=bdm.registrarMovimiento(this);
          
       
    }

    @Override
    public void crearComprobante() {
        try {
            comprobanteRegistro.crearComprobanteRegistro(this);



            Correo c = new Correo();
            c.enviar(this.correo, "Comprobante Registro", "Te enviamos tu comprobante", "./IMPRESORA/"+this.tipoTran+"_"+this.numTran+".pdf");

        } catch (DocumentException ex) {
            Logger.getLogger(movRegistro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(movRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



}
