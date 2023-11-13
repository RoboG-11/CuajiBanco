
package com.uamcuamx.interfazgrafica;

import com.uamcuamx.proyectocuajibanco.Cuenta;
import com.uamcuamx.proyectocuajibanco.Verificacion;
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
public class VentanaCrearCuenta extends javax.swing.JFrame {

   
    public VentanaCrearCuenta() {
        initComponents();
        this.setTitle("Creación de Cuenta");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Encabezado = new javax.swing.JLabel();
        IngresoCliente = new javax.swing.JFormattedTextField();
        Encabezado1 = new javax.swing.JLabel();
        IngresoMonto = new javax.swing.JFormattedTextField();
        Encabezado2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(1, 32, 96));

        Encabezado.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 28)); // NOI18N
        Encabezado.setForeground(new java.awt.Color(255, 255, 255));
        Encabezado.setText("Ingresa tu número de Cliente:");

        IngresoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IngresoCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        IngresoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoClienteActionPerformed(evt);
            }
        });
        IngresoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IngresoClienteKeyTyped(evt);
            }
        });

        Encabezado1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 28)); // NOI18N
        Encabezado1.setForeground(new java.awt.Color(255, 255, 255));
        Encabezado1.setText("Depósito inicial");

        IngresoMonto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IngresoMonto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        IngresoMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoMontoActionPerformed(evt);
            }
        });
        IngresoMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IngresoMontoKeyTyped(evt);
            }
        });

        Encabezado2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 28)); // NOI18N
        Encabezado2.setForeground(new java.awt.Color(0, 153, 51));
        Encabezado2.setText("C$");

        jButton1.setBackground(new java.awt.Color(244, 127, 11));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Crear Cuenta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoCuajiBancoCircular.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(IngresoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Encabezado)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(Encabezado2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(IngresoMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1)
                                        .addGap(39, 39, 39))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(Encabezado1)
                                        .addGap(96, 96, 96)))))
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IngresoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Encabezado1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IngresoMonto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Encabezado2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
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

    private void IngresoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoClienteActionPerformed
       
    }//GEN-LAST:event_IngresoClienteActionPerformed

    private void IngresoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IngresoClienteKeyTyped
        
        char caracter = evt.getKeyChar();

        
        if (((caracter < '0')
            || (caracter > '9'))
        && (caracter != '\b' )) {
        evt.consume();  
        }
        if(IngresoCliente.getText().length() >= 6){ 
            evt.consume();
        }
    }//GEN-LAST:event_IngresoClienteKeyTyped

    private void IngresoMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoMontoActionPerformed
        
    }//GEN-LAST:event_IngresoMontoActionPerformed

    private void IngresoMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IngresoMontoKeyTyped
        
        char caracter = evt.getKeyChar();

       
        if (((caracter < '0')
            || (caracter > '9'))
        && (caracter != '\b' )) {
        evt.consume();
        }
        if(IngresoCliente.getText().length() >= 10){ 
            evt.consume();
        }
    }//GEN-LAST:event_IngresoMontoKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        long numC = Long.parseLong(IngresoCliente.getText());
        Verificacion v=new Verificacion();
        boolean condicion=v.verificarCliente(numC);
        Cuenta cuenta = new Cuenta();
        cuenta.setMontoTotal(Double.parseDouble(IngresoMonto.getText()));
        cuenta.setIdCliente(numC);
        
        if (condicion) {
            cuenta.crearCeuenta();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Número de cliente incorrecto");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Encabezado;
    private javax.swing.JLabel Encabezado1;
    private javax.swing.JLabel Encabezado2;
    private javax.swing.JFormattedTextField IngresoCliente;
    private javax.swing.JFormattedTextField IngresoMonto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
