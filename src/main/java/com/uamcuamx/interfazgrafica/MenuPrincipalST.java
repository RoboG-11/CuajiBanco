
package com.uamcuamx.interfazgrafica;

import com.uamcuamx.proyectocuajibanco.BdCuenta;
import com.uamcuamx.proyectocuajibanco.Cliente;
import com.uamcuamx.proyectocuajibanco.Cuenta;
import com.uamcuamx.proyectocuajibanco.Verificacion;
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
public class MenuPrincipalST extends javax.swing.JFrame {

    
    public MenuPrincipalST() {
        initComponents();
        this.setTitle("Operaciones sin Tarjeta");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Boton1 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(1, 32, 96));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoCuajiBanco.jpg"))); // NOI18N

        Boton1.setBackground(new java.awt.Color(244, 127, 11));
        Boton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        Boton1.setForeground(new java.awt.Color(255, 255, 255));
        Boton1.setText("Retiro sin Tarjeta");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        Boton2.setBackground(new java.awt.Color(244, 127, 11));
        Boton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        Boton2.setForeground(new java.awt.Color(255, 255, 255));
        Boton2.setText("Saldo de Cuenta");
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("hacer hoy?");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¿Qué quieres");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("¡Recuerda que con tu tarjeta puedes realizar más operaciones!");

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
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Boton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Boton1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cancelar)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(29, 29, 29))
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

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        
        Verificacion v = new Verificacion();
        long numCuenta = Long.parseLong(JOptionPane.showInputDialog(null, "Ingresa tu número de cuenta: ", "Verificación cuenta", JOptionPane.QUESTION_MESSAGE));
        Cliente cl = null;
        Cuenta cu = null;
        if (v.verificarCuenta(numCuenta)) {
            BdCuenta bdc = new BdCuenta();
            try {
                cl = bdc.buscarClienteC(numCuenta);

            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(MenuPrincipalST.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (v.verificarCorreo(cl.getCorreo())) {
                try {
                    cu = bdc.buscarCuentaC(numCuenta);
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(MenuPrincipalST.class.getName()).log(Level.SEVERE, null, ex);
                }
                VentanaRetiroEfectivo vre = new VentanaRetiroEfectivo(cu);
                vre.setLocationRelativeTo(null);
                vre.setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this,
                    "Código Incorrecto",
                    "Atención",
                    JOptionPane.ERROR_MESSAGE);
                
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "La Cuenta No Existe",
                    "Atención",
                    JOptionPane.ERROR_MESSAGE);
        }
        


    }//GEN-LAST:event_Boton1ActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed

        int seleccion = JOptionPane.showConfirmDialog(null, "¿Realmente deseas salir?.");
        if (seleccion == 0) {
            this.dispose();
            PantallaPrincipal inicio = new PantallaPrincipal();
            inicio.setVisible(true);
            inicio.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_cancelarActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
       
        Verificacion v = new Verificacion();
        long numCuenta = Long.parseLong(JOptionPane.showInputDialog(null, "Ingresa tu número de cuenta: ", "Verificación cuenta", JOptionPane.QUESTION_MESSAGE));
        Cliente cl = null;
        Cuenta cu = null;
        if (v.verificarCuenta(numCuenta)) {
            BdCuenta bdc = new BdCuenta();
            try {
                cl = bdc.buscarClienteC(numCuenta);

            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(MenuPrincipalST.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (v.verificarCorreo(cl.getCorreo())) {
                try {
                    cu = bdc.buscarCuentaC(numCuenta);
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(MenuPrincipalST.class.getName()).log(Level.SEVERE, null, ex);
                }
                VentanaConsultaSaldo vcs=null;
                try {
                    vcs = new VentanaConsultaSaldo(cu);
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(MenuPrincipalST.class.getName()).log(Level.SEVERE, null, ex);
                }
                vcs.setLocationRelativeTo(null);
                vcs.setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this,
                    "Código Incorrecto",
                    "Atención",
                    JOptionPane.ERROR_MESSAGE);
                
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "La Cuenta No Existe",
                    "Atención",
                    JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_Boton2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
