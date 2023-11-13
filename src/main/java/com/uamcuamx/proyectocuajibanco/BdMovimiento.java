
package com.uamcuamx.proyectocuajibanco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
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
public class BdMovimiento {

    private Movimiento movimiento;

    public BdMovimiento() {
        movimiento=new Movimiento();
    }

    public long registrarMovimiento(Movimiento movimiento) throws SQLException, ClassNotFoundException {
        this.movimiento = movimiento;
        ConectarBD cbd = new ConectarBD();
        Connection con = cbd.getConnection();

        PreparedStatement pst = con.prepareStatement("insert into movimiento values(?,?,?,?)");

        pst.setString(1, "0");
        pst.setString(2, movimiento.getTipoTran().trim());
        pst.setString(3, movimiento.getFechayHora().trim());
        pst.setInt(4, (int) movimiento.getNumCliente());

        pst.executeUpdate();
        ResultSet rst = pst.executeQuery("SELECT MAX(ID_movimiento) AS numTran FROM movimiento");
        long numTran=-1;
        if (rst.next()) {
            numTran = (rst.getLong(1));
           
        }
        cbd.desconectar();
        return numTran;

    }

    public Movimiento buscarMovimineto(long numTran) throws SQLException, ClassNotFoundException {

        ConectarBD cbd = new ConectarBD();
        Connection con = cbd.getConnection();

        PreparedStatement pst = con.prepareStatement("select * from movimiento where ID_movimiento = ?");
        pst.setString(1, String.valueOf(numTran).trim());

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            movimiento.setNumTran(rs.getLong("ID_movimiento"));
            movimiento.setTipoTran(rs.getString("Tipo_transaccion"));
            movimiento.setFechayHora(rs.getString("Fecha_hora"));
            movimiento.setNumCliente(rs.getLong("Cliente_ID"));

        } else {
            JOptionPane.showMessageDialog(null, "Cliente no registrado.");
        }
        cbd.desconectar();

        return movimiento;

    }
public List<String[]> buscarMovimientos(long numCliente) throws SQLException, ClassNotFoundException {
        List<String[]> movimientos = new ArrayList<>();
        ConectarBD cbd = new ConectarBD();
        Connection con = cbd.getConnection();

        PreparedStatement pst = con.prepareStatement("select * from movimiento where Cliente_ID = ?");
        pst.setString(1, String.valueOf(numCliente).trim());

        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            String[] registros = new String[3];
            registros[0] = rs.getString("ID_movimiento");
            registros[1] = rs.getString("Tipo_transaccion");
            registros[2] = rs.getString("Fecha_Hora");
            
            movimientos.add(registros);
        }
        
        cbd.desconectar();

        return movimientos;

    }
}
