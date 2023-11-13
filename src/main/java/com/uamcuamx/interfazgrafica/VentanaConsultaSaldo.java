package com.uamcuamx.interfazgrafica;

import com.uamcuamx.proyectocuajibanco.*;
import java.sql.SQLException;
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
public class VentanaConsultaSaldo extends javax.swing.JFrame {

    public VentanaConsultaSaldo(Cuenta cuenta, long numTarjeta) throws SQLException, ClassNotFoundException {
        initComponents();
        this.numTarjeta = numTarjeta;
        this.cuenta = cuenta;
        this.setTitle("Consulta Saldo");
        long numero = cuenta.getNumero();
        double montoTotal = 0;
        BdCuenta bdc = new BdCuenta();
        try {
            montoTotal = bdc.ConsultarSaldo(numero);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaConsultaSaldo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaConsultaSaldo.class.getName()).log(Level.SEVERE, null, ex);
        }

        String saldo = String.valueOf(montoTotal);
        txt_saldo.setText("C$" + saldo);
    }

    public VentanaConsultaSaldo(Cuenta cuenta) throws SQLException, ClassNotFoundException {
        initComponents();
        this.numTarjeta = -1;
        this.cuenta = cuenta;
        this.setTitle("Consulta Saldo");
        long numero = cuenta.getNumero();
        double montoTotal = 0;
        BdCuenta bdc = new BdCuenta();
        try {
            montoTotal = bdc.ConsultarSaldo(numero);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaConsultaSaldo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaConsultaSaldo.class.getName()).log(Level.SEVERE, null, ex);
        }

        String saldo = String.valueOf(montoTotal);
        txt_saldo.setText("C$" + saldo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Boton1 = new javax.swing.JButton();
        txt_saldo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(1, 32, 96));

        Boton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boton1.setText("Aceptar");
        Boton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Boton1FocusGained(evt);
            }
        });
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        txt_saldo.setBackground(new java.awt.Color(255, 255, 255));
        txt_saldo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txt_saldo.setForeground(new java.awt.Color(1, 32, 96));
        txt_saldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_saldo.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Saldo disponible:");

        jLabel4.setFont(new java.awt.Font("Geometr415 Blk BT", 1, 80)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoCuajiBanco.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(125, 125, 125))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Boton1)
                        .addGap(232, 232, 232))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(txt_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        this.dispose();
        PantallaPrincipal inicio = new PantallaPrincipal();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Boton1FocusGained


    }//GEN-LAST:event_Boton1FocusGained

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       
        if (numTarjeta != -1) {
            movSaldo ms = null;
            try {
                ms = new movSaldo(numTarjeta);
                
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(VentanaConsultaSaldo.class.getName()).log(Level.SEVERE, null, ex);
            }

            ms.crearComprobante();
        }
    }//GEN-LAST:event_formComponentShown

    private Cuenta cuenta;
    private long numTarjeta;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt_saldo;
    // End of variables declaration//GEN-END:variables
}
