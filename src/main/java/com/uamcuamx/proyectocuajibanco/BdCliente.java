
package com.uamcuamx.proyectocuajibanco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class BdCliente {

    private Cliente cliente;

    public BdCliente() {
        cliente=new Cliente();
    }

    public long registarCliente(Cliente cliente) throws SQLException, ClassNotFoundException {
        this.cliente = cliente;
        ConectarBD cbd = new ConectarBD();
        Connection con = cbd.getConnection();
        PreparedStatement pst = con.prepareStatement("insert into cliente values(?,?,?,?,?,?,?,?,?,?)");
        pst.setString(1, "0");
        pst.setString(2, cliente.getNombres().trim());
        pst.setString(3, cliente.getApPaterno().trim());
        pst.setString(4, cliente.getApMaterno().trim());
        pst.setString(5, cliente.getDireccion().trim());
        pst.setString(6, String.valueOf(cliente.getTelefono()));
        pst.setString(7, cliente.getCorreo().trim());
        pst.setString(8, cliente.getRFC().trim());
        pst.setString(9, cliente.getFechaNacimiento().trim());
        pst.setBoolean(10, cliente.isStatusVerificado());

        pst.executeUpdate();
        

        
        long id=-1;
        ResultSet rst = pst.executeQuery("SELECT MAX(ID_cliente) AS id FROM cliente");
        if (rst.next()) {
            id = (rst.getLong(1));
            
        }
        cbd.desconectar();
        return id;
    }

    public Cliente buscarCliente(long idCliente) throws SQLException, ClassNotFoundException {
        ConectarBD cbd = new ConectarBD();
        Connection con = cbd.getConnection();
        PreparedStatement pst = con.prepareStatement("select * from cliente where ID_cliente = ?");
        pst.setString(1, String.valueOf(idCliente).trim());

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            cliente.setId(rs.getLong("ID_cliente"));
            cliente.setNombres(rs.getString("Nombre"));
            cliente.setApPaterno(rs.getString("ApellidoP"));
            cliente.setApMaterno(rs.getString("ApellidoM"));
            cliente.setDireccion(rs.getString("Direccion"));
            cliente.setTelefono(Long.parseLong(rs.getString("Telefono")));
            cliente.setCorreo(rs.getString("Correo"));
            cliente.setRFC(rs.getString("RFC"));
            cliente.setFechaNacimiento(rs.getString("Nacimiento"));
            cliente.setStatusVerificado(rs.getBoolean("Status"));

        } else {
            JOptionPane.showMessageDialog(null, "Cliente no registrado.");
        }
        cbd.desconectar();
        return cliente;
    }
     public boolean verificarCliente(long numero) throws SQLException, ClassNotFoundException {
        ConectarBD cbd = new ConectarBD();
        Connection con = cbd.getConnection();
        PreparedStatement pst = con.prepareStatement("select * from cliente where ID_cliente = ?");
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

}
