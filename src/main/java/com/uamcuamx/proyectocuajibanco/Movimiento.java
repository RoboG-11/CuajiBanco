
package com.uamcuamx.proyectocuajibanco;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

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
public class Movimiento {
    protected long numTran;
    protected String tipoTran;
    protected long numCliente;
    protected String FechayHora;
    protected String correo;
    
    public  void crearComprobante(){
        
    }

    public long getNumTran() {
        return numTran;
    }

    public void setNumTran(long numTran) {
        this.numTran = numTran;
    }

    public String getTipoTran() {
        return tipoTran;
    }

    public void setTipoTran(String tipoTran) {
        this.tipoTran = tipoTran;
    }

    public long getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(long numCliente) {
        this.numCliente = numCliente;
    }

    public String getFechayHora() {
        return FechayHora;
    }

    public void setFechayHora(String FechayHora) {
        this.FechayHora = FechayHora;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public long generarID() {
        long idNuevo=0;
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File("Datos.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            String keyValue[];
            while ((linea = br.readLine()) != null) {
                keyValue = linea.split(":");
                if (keyValue[0].equals(("NumeroDeTransacciones"))) {
                    idNuevo = Long.parseLong(keyValue[1])+1;
                    
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return idNuevo;
    }
}
