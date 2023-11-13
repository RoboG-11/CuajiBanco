
package com.uamcuamx.interfazgrafica;

import com.uamcuamx.proyectocuajibanco.BdTarjeta;
import com.uamcuamx.proyectocuajibanco.Cliente;
import com.uamcuamx.proyectocuajibanco.Cuenta;
import com.uamcuamx.proyectocuajibanco.Tarjeta;
import java.awt.Color;
import java.sql.SQLException;
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
public class MenuPrincipalCT extends javax.swing.JFrame {

    
    public MenuPrincipalCT(Tarjeta tarjeta) throws SQLException, ClassNotFoundException {
        this.tarjeta = tarjeta;
        initComponents();
        Cliente c = new Cliente();
        jLabel1.setForeground(Color.white);
        this.setTitle("Operaciones con Tarjeta");
        BdTarjeta bdt = new BdTarjeta();
        System.out.print(tarjeta.getNumTarjeta());
        c = bdt.buscarClienteT(tarjeta.getNumTarjeta());
        System.out.print(c.getApPaterno());
        Etiqueta2.setText(c.getNombres());
        this.cuenta = new Cuenta();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Boton1 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Etiqueta2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Boton6 = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(1, 32, 96));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoCuajiBanco.jpg"))); // NOI18N

        Boton1.setBackground(new java.awt.Color(244, 127, 11));
        Boton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        Boton1.setForeground(new java.awt.Color(255, 255, 255));
        Boton1.setText("Consulta de Saldo");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        Boton2.setBackground(new java.awt.Color(244, 127, 11));
        Boton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        Boton2.setForeground(new java.awt.Color(255, 255, 255));
        Boton2.setText("Retiro de Efectivo");
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });

        Boton4.setBackground(new java.awt.Color(244, 127, 11));
        Boton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        Boton4.setForeground(new java.awt.Color(255, 255, 255));
        Boton4.setText("Consulta Movimientos");
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });

        Etiqueta2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        Etiqueta2.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Etiqueta2.setText("Usuario Cualquiera");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("¿Qué quieres hacer hoy?");

        Boton6.setBackground(new java.awt.Color(244, 127, 11));
        Boton6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        Boton6.setForeground(new java.awt.Color(255, 255, 255));
        Boton6.setText("Cambio de NIP");
        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(255, 0, 0));
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Boton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Boton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 11, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Etiqueta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelar)
                        .addGap(20, 20, 20))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Etiqueta2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        BdTarjeta bdt = new BdTarjeta();

        try {
            cuenta = bdt.buscarCuentaT(tarjeta.getNumTarjeta());
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipalCT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuPrincipalCT.class.getName()).log(Level.SEVERE, null, ex);
        }

        VentanaRetiroEfectivo vre = new VentanaRetiroEfectivo(cuenta, tarjeta.getNumTarjeta());
        vre.setLocationRelativeTo(null);
        vre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton2ActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        
        int seleccion = JOptionPane.showConfirmDialog(null, "¿Realmente deseas salir?.");
        if (seleccion == 0) {
            this.dispose();
            PantallaPrincipal inicio = new PantallaPrincipal();
            inicio.setVisible(true);
            inicio.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_cancelarActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
        
        BdTarjeta bdt = new BdTarjeta();
        try {
            cuenta = bdt.buscarCuentaT(tarjeta.getNumTarjeta());
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipalCT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuPrincipalCT.class.getName()).log(Level.SEVERE, null, ex);
        }
        VentanaConsultaMovimientos cdm = null;
        try {
            cdm = new VentanaConsultaMovimientos(cuenta.getIdCliente());
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MenuPrincipalCT.class.getName()).log(Level.SEVERE, null, ex);
        }
        cdm.setVisible(true);
        cdm.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_Boton4ActionPerformed

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        
        BdTarjeta bdt = new BdTarjeta();

        try {
            cuenta = bdt.buscarCuentaT(tarjeta.getNumTarjeta());
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipalCT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuPrincipalCT.class.getName()).log(Level.SEVERE, null, ex);
        }

        VentanaConsultaSaldo vcs = null;
        try {
            vcs = new VentanaConsultaSaldo(cuenta, tarjeta.getNumTarjeta());
        } catch (SQLException ex) {
            Logger.getLogger(MenuPrincipalCT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuPrincipalCT.class.getName()).log(Level.SEVERE, null, ex);
        }
        vcs.setLocationRelativeTo(null);
        vcs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
       
        VentanaCambioNIP vcn = new VentanaCambioNIP(tarjeta);
        vcn.setLocationRelativeTo(null);
        vcn.setVisible(true);
    }//GEN-LAST:event_Boton6ActionPerformed

    
    private Cuenta cuenta;
    private Tarjeta tarjeta;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton6;
    private javax.swing.JLabel Etiqueta2;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
