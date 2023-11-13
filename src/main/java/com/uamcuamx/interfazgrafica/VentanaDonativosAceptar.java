
package com.uamcuamx.interfazgrafica;

import com.uamcuamx.proyectocuajibanco.Cuenta;
import java.awt.Color;

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
public class VentanaDonativosAceptar extends javax.swing.JFrame {

    
    public VentanaDonativosAceptar(Cuenta cuenta,long saldoPedido,long numTarjeta) {
        this.cuenta = cuenta;
        this.saldoPedido=saldoPedido;
        this.numTarjeta=numTarjeta;
        initComponents();
        this.setTitle("Donativo");
        Titulo1.setForeground(Color.white);
        Titulo2.setForeground(Color.white);
        SignoCuajiPesos.setForeground(Color.white);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoAzul = new javax.swing.JPanel();
        boton1 = new javax.swing.JButton();
        Titulo1 = new javax.swing.JLabel();
        Titulo2 = new javax.swing.JLabel();
        CuajiPesosDonar = new javax.swing.JTextField();
        SignoCuajiPesos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        FondoAzul.setBackground(new java.awt.Color(1, 32, 96));

        boton1.setBackground(new java.awt.Color(0, 204, 0));
        boton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton1.setText("ACEPTAR");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        Titulo1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 29)); // NOI18N
        Titulo1.setText("¿Cuántos CuajiPesos");

        Titulo2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 29)); // NOI18N
        Titulo2.setText("deseas donar?");

        CuajiPesosDonar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 29)); // NOI18N
        CuajiPesosDonar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CuajiPesosDonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuajiPesosDonarActionPerformed(evt);
            }
        });

        SignoCuajiPesos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 29)); // NOI18N
        SignoCuajiPesos.setText("C$");

        javax.swing.GroupLayout FondoAzulLayout = new javax.swing.GroupLayout(FondoAzul);
        FondoAzul.setLayout(FondoAzulLayout);
        FondoAzulLayout.setHorizontalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoAzulLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boton1)
                .addGap(103, 103, 103))
            .addGroup(FondoAzulLayout.createSequentialGroup()
                .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoAzulLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Titulo1))
                    .addGroup(FondoAzulLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(Titulo2)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(FondoAzulLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(SignoCuajiPesos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CuajiPesosDonar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        FondoAzulLayout.setVerticalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoAzulLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Titulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Titulo2)
                .addGap(18, 18, 18)
                .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignoCuajiPesos)
                    .addComponent(CuajiPesosDonar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CuajiPesosDonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuajiPesosDonarActionPerformed
        


    }//GEN-LAST:event_CuajiPesosDonarActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        long donativo = Long.parseLong(CuajiPesosDonar.getText());
        System.out.print("Donativo:"+donativo);
        this.saldoPedido=this.saldoPedido+donativo;
        RetirandoEfectivo r = new RetirandoEfectivo(cuenta,saldoPedido, numTarjeta);
        r.setLocationRelativeTo(null);
        this.dispose();
        r.setVisible(true);
    }//GEN-LAST:event_boton1ActionPerformed
    
    private Cuenta cuenta;
    private long saldoPedido;
    private long numTarjeta;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CuajiPesosDonar;
    private javax.swing.JPanel FondoAzul;
    private javax.swing.JLabel SignoCuajiPesos;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JButton boton1;
    // End of variables declaration//GEN-END:variables
}
