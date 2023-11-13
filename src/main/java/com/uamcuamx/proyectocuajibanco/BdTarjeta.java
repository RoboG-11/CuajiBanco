
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
public class BdTarjeta {

    private Tarjeta tarjeta;
    private Cuenta cuenta;
    private Cliente cliente;

    public BdTarjeta() {
        tarjeta=new Tarjeta();
        cuenta=new Cuenta();
        cliente=new Cliente();
    }

    public long registarTarjeta(Tarjeta tarjeta) throws SQLException, ClassNotFoundException {
        this.tarjeta = tarjeta;
        ConectarBD cbd = new ConectarBD();
        Connection con = cbd.getConnection();
        PreparedStatement pst = con.prepareStatement("insert into tarjeta values(?,?,?,?,?)");

        pst.setString(1, "0");
        pst.setInt(2, tarjeta.getCodigoSeguridad());
        pst.setString(3, tarjeta.getVencimiento().trim());
        pst.setInt(4, tarjeta.getNIP());
        pst.setInt(5, (int) tarjeta.getIdCuenta());

        pst.executeUpdate();
        long idtarjeta = -1;
        ResultSet rst = pst.executeQuery("SELECT MAX(ID_tarjeta) AS idtarjeta FROM tarjeta");
        if (rst.next()) {
            idtarjeta = (rst.getLong(1));
            tarjeta.setNumTarjeta(idtarjeta);
        }
        cbd.desconectar();
        return idtarjeta;
    }

    public Tarjeta buscarTarjetaT(long idTarjeta) throws SQLException, ClassNotFoundException {

        ConectarBD cbd = new ConectarBD();
        Connection con = cbd.getConnection();
        PreparedStatement pst = con.prepareStatement("select * from tarjeta where ID_tarjeta = ?");
        pst.setString(1, String.valueOf(idTarjeta).trim());

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            tarjeta.setNumTarjeta(rs.getLong("ID_tarjeta"));
            tarjeta.setCodigoSeguridad(rs.getInt("cod_seg"));
            tarjeta.setVencimiento(rs.getString("Vencimiento"));
            tarjeta.setNIP(rs.getInt("NIP"));
            tarjeta.setIdCuenta(rs.getLong("Cuenta_ID"));

        } else {
            JOptionPane.showMessageDialog(null, "Cuenta no registrada.");
        }
        cbd.desconectar();
        return tarjeta;
    }

    public Cuenta buscarCuentaT(long idTarjeta) throws SQLException, ClassNotFoundException {
        ConectarBD cbd = new ConectarBD();
        Connection con = cbd.getConnection();
        PreparedStatement pst = con.prepareStatement("select * from tarjeta where ID_tarjeta = ?");
        pst.setString(1, String.valueOf(idTarjeta).trim());
        ResultSet rs1 = pst.executeQuery();
        if (rs1.next()) {
            PreparedStatement psr = con.prepareStatement("select * from cuenta where ID_cuenta = ?");
            psr.setString(1, String.valueOf(rs1.getLong("Cuenta_ID")).trim());
            ResultSet rs2 = psr.executeQuery();
            if (rs2.next()) {
                cuenta.setNumero(rs2.getLong("ID_cuenta"));
                cuenta.setFechaCreacion(rs2.getString("Creacion"));
                cuenta.setMontoTotal(rs2.getDouble("Saldo"));
                cuenta.setIdCliente(rs2.getLong("Cliente_ID"));
            } else {
                JOptionPane.showMessageDialog(null, "Cuenta no registrada.");
            }
        }
        cbd.desconectar();
        return cuenta;
    }

    public Cliente buscarClienteT(long idTarjeta) throws SQLException, ClassNotFoundException {
        ConectarBD cbd = new ConectarBD();
        Connection con = cbd.getConnection();
        PreparedStatement pst = con.prepareStatement("select * from tarjeta where ID_tarjeta = ?");
        pst.setString(1, String.valueOf(idTarjeta).trim());
        ResultSet rs1 = pst.executeQuery();
        if (rs1.next()) {
            PreparedStatement psr = con.prepareStatement("select * from cuenta where ID_cuenta = ?");
            psr.setString(1, String.valueOf(rs1.getLong("Cuenta_ID")).trim());
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
                
            }

        }
        cbd.desconectar();
        return cliente;
    }

    public boolean verificarTarjeta(long idTarjeta) throws SQLException, ClassNotFoundException {
        ConectarBD cbd = new ConectarBD();
        Connection con = cbd.getConnection();
        PreparedStatement pst = con.prepareStatement("select * from tarjeta where ID_tarjeta = ?");
        pst.setString(1, String.valueOf(idTarjeta).trim());
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()) {
            cbd.desconectar();
            return true;
        } else {
            cbd.desconectar();
            return false;
        }
        
    }

    public int modificarNIP(long idTarjeta,int nNIP) throws SQLException, ClassNotFoundException {
        ConectarBD cbd = new ConectarBD();
        Connection con = cbd.getConnection();
        int NIP = -1;
        PreparedStatement pst = con.prepareStatement("update tarjeta set NIP = ? where ID_tarjeta = ?");
        pst.setInt(1, nNIP);
        pst.setLong(2, idTarjeta);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "NIP actualizado.");
        cbd.desconectar();
        return NIP;
    }
}
