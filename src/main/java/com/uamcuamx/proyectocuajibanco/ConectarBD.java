
package com.uamcuamx.proyectocuajibanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
public final class ConectarBD {

    
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://127.0.0.1:3306/bd_cuajibanco";
    
    
public ConectarBD() {
    
    }
public Connection getConnection() throws SQLException, ClassNotFoundException{
    conn = null;
    try{
        Class.forName(driver);
        conn = DriverManager.getConnection(url,user,password);
        if(conn!=null){
            System.out.println("Conexión establecida...");
        }
    }catch(ClassNotFoundException | SQLException e){
        System.out.printf("Error, no se hizo la conexión."+e);
    }
    return conn;
}

public void desconectar() throws SQLException{
    conn.close();
    conn = null;
    System.out.println("Conexión cerrada...");
}


}
