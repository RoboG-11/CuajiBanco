
package com.uamcuamx.proyectocuajibanco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

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
public class BdCuenta {

    private Cuenta cuenta;
    private Cliente cliente;

    public BdCuenta() {
        cuenta = new Cuenta();
        cliente = new Cliente();
    }

    public long registarCuenta(Cuenta cuenta) throws SQLException, ClassNotFoundException {
        this.cuenta = cuenta;
        ConectarBD cbd = new ConectarBD();
        Connection con = cbd.getConnection();

        Date fecha = new Date();
        String strDateFormat = "dd-MMM-yyyy  hh: mm: ss a";
        SimpleDateFormat formato = new SimpleDateFormat(strDateFormat);
        String FechayHora = formato.format(fecha);

        PreparedStatement pst = con.prepareStatement("insert into cuenta values(?,?,?,?)");
        pst.setString(1, "0");
        pst.setString(2, FechayHora);

        pst.setInt(3, (int) cuenta.getMontoTotal());
        pst.setInt(4, (int) cuenta.getIdCliente());

        pst.executeUpdate();

     
        long numero = -1;
        ResultSet rst = pst.executeQuery("SELECT MAX(ID_cuenta) AS numero FROM cuenta");
        if (rst.next()) {
            numero = (rst.getLong(1));

        }
        cbd.desconectar();
        return numero;
    }

    public Cuenta buscarCuentaC(long numero) throws SQLException, ClassNotFoundException {
        ConectarBD cbd = new ConectarBD();
        Connection con = cbd.getConnection();
        PreparedStatement pst = con.prepareStatement("select * from cuenta where ID_cuenta = ?");
        pst.setString(1, String.valueOf(numero).trim());

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            cuenta.setNumero(rs.getLong("ID_cuenta"));
            cuenta.setFechaCreacion(rs.getString("Creacion"));
            cuenta.setMontoTotal(rs.getDouble("Saldo"));
            cuenta.setIdCliente(rs.getLong("Cliente_ID"));

        } else {
            JOptionPane.showMessageDialog(null, "Cuenta no registrada.");
        }
        cbd.desconectar();
        return cuenta;

    }

    public double modificarSaldo(Cuenta cuenta,long numero) throws SQLException, ClassNotFoundException {
        this.cuenta=cuenta;
        ConectarBD cbd = new ConectarBD();
        Connection con = cbd.getConnection();
        double montoTotal = -1;
        PreparedStatement pst = con.prepareStatement("update cuenta set Saldo = ? where ID_cuenta = ?");
        pst.setDouble(1, cuenta.getMontoTotal()-numero);
        pst.setLong(2, cuenta.getNumero());
        pst.executeUpdate();
        
        cbd.desconectar();
        return montoTotal;

    }

    public boolean verificarCuentaC(long numero) throws SQLException, ClassNotFoundException {
        ConectarBD cbd = new ConectarBD();
        Connection con = cbd.getConnection();
        PreparedStatement pst = con.prepareStatement("select * from cuenta where ID_cuenta = ?");
        pst.setString(1, String.valueOf(numero).trim());
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()) {
            cbd.desconectar();
            return true;
        } else {
            cbd.desconectar();
            return false;
        }

    }

    public Cliente buscarClienteC(long numero) throws SQLException, ClassNotFoundException {
        ConectarBD cbd = new ConectarBD();
        Connection con = cbd.getConnection();
        
            PreparedStatement psr = con.prepareStatement("select * from cuenta where ID_cuenta = ?");
            psr.setString(1, String.valueOf(numero).trim());
            ResultSet rs2 = psr.executeQuery();
            if (rs2.next()) {
                PreparedStatement psc = con.prepareStatement("select * from cliente where ID_cliente = ?");
                psc.setString(1, String.valueOf(rs2.getLong("Cliente_ID")).trim());
                ResultSet rs3 = psc.executeQuery();
                if (rs3.next()) {
                    cliente.setId(rs3.getInt("ID_cliente"));
                    cliente.setNombres(rs3.getString("Nombre"));
                    cliente.setApPaterno(rs3.getString("ApellidoP"));
                    cliente.setApMaterno(rs3.getString("ApellidoM"));
                    cliente.setDireccion(rs3.getString("Direccion"));
                    cliente.setTelefono(Long.parseLong(rs3.getString("Telefono")));
                    cliente.setCorreo(rs3.getString("Correo"));
                    cliente.setRFC(rs3.getString("RFC"));
                    cliente.setFechaNacimiento(rs3.getString("Nacimiento"));
                    cliente.setStatusVerificado(rs3.getBoolean("Status"));
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente no registrado.");
                }
                
            cbd.desconectar();

        }
        return cliente;
    }

    public double ConsultarSaldo(long numero) throws SQLException, ClassNotFoundException {
        ConectarBD cbd = new ConectarBD();
        Connection con = cbd.getConnection();
        PreparedStatement pst = con.prepareStatement("select * from cuenta where ID_cuenta = ?");
        pst.setString(1, String.valueOf(numero).trim());
        double montoTotal = 0;
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            montoTotal=rs.getDouble("Saldo");
        }
        cbd.desconectar();
        return montoTotal;
    }

}
