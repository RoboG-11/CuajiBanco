
package com.uamcuamx.proyectocuajibanco;

import com.uamcuamx.interfazgrafica.VentanaCorreoCliente;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
public class Cliente {

    private long id;
    private boolean statusVerificado;
    private String apPaterno;
    private String apMaterno;
    private String nombres;
    private long telefono;
    private String correo;
    private String RFC;
    private String direccion;
    private String fechaNacimiento;

    public Cliente() {

    }

    public void crearCliente() {
        BdCliente bc = new BdCliente();
        long idNuevo = -1;
        try {
            idNuevo = bc.registarCliente(this);
            JOptionPane.showMessageDialog(null, "Registro exitoso, tu número de cliente es " + idNuevo, "Registro realizado con éxito", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(VentanaCorreoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            movRegistro reg = new movRegistro(idNuevo);
            reg.crearComprobante();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(VentanaCorreoCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int calcularEdad() {
        int edad;
        String fecha;
        Calendar cal = new GregorianCalendar();
        int año = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH);
        int dia = cal.get(Calendar.DAY_OF_MONTH);

        if (dia > 9) {
            if (mes > 9) {
                fecha = año + "-" + mes + "-" + dia;
            } else {
                fecha = año + "-0" + mes + "-" + dia;
            }
        } else {
            if (mes < 10) {
                fecha = año + "-0" + mes + "-0" + dia;
            } else {
                fecha = año + "-" + mes + "-0" + dia;
            }
        }

        LocalDate primeraFecha = LocalDate.parse(this.fechaNacimiento, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate segundaFecha = LocalDate.parse(fecha, DateTimeFormatter.ISO_LOCAL_DATE);

        long diferencia = primeraFecha.until(segundaFecha, ChronoUnit.DAYS);
        edad = (int) (diferencia / 365);
        return edad;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public boolean isStatusVerificado() {
        return statusVerificado;
    }

    public void setStatusVerificado(boolean statusVerificado) {
        this.statusVerificado = statusVerificado;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
