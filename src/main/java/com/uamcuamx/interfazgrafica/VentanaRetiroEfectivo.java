
package com.uamcuamx.interfazgrafica;

import com.uamcuamx.proyectocuajibanco.Cuenta;

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
public class VentanaRetiroEfectivo extends javax.swing.JFrame {

    
    public VentanaRetiroEfectivo(Cuenta cuenta,long numTarjeta) {
        this.cuenta = cuenta;
        this.numTarjeta = numTarjeta;
        initComponents();
        extraComponents();
    }
    public VentanaRetiroEfectivo(Cuenta cuenta) {
        this.cuenta = cuenta;
        initComponents();
        extraComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CIEN = new javax.swing.JButton();
        DOCIENTOS = new javax.swing.JButton();
        TRECIENTOS = new javax.swing.JButton();
        MIL = new javax.swing.JButton();
        DOSMIL = new javax.swing.JButton();
        CINCOMIL = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cajaCantidad1 = new javax.swing.JTextField();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(1, 32, 96));
        jPanel1.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(561, 391));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿CUÁNTO DESEAS RETIRAR?");

        CIEN.setBackground(new java.awt.Color(244, 127, 11));
        CIEN.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        CIEN.setForeground(new java.awt.Color(255, 255, 255));
        CIEN.setText("C$100");
        CIEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CIENActionPerformed(evt);
            }
        });

        DOCIENTOS.setBackground(new java.awt.Color(244, 127, 11));
        DOCIENTOS.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        DOCIENTOS.setForeground(new java.awt.Color(255, 255, 255));
        DOCIENTOS.setText("C$200");
        DOCIENTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOCIENTOSActionPerformed(evt);
            }
        });

        TRECIENTOS.setBackground(new java.awt.Color(244, 127, 11));
        TRECIENTOS.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        TRECIENTOS.setForeground(new java.awt.Color(255, 255, 255));
        TRECIENTOS.setText("C$500");
        TRECIENTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRECIENTOSActionPerformed(evt);
            }
        });

        MIL.setBackground(new java.awt.Color(244, 127, 11));
        MIL.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        MIL.setForeground(new java.awt.Color(255, 255, 255));
        MIL.setText("C$1,000");
        MIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MILActionPerformed(evt);
            }
        });

        DOSMIL.setBackground(new java.awt.Color(244, 127, 11));
        DOSMIL.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        DOSMIL.setForeground(new java.awt.Color(255, 255, 255));
        DOSMIL.setText("C$2,000");
        DOSMIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOSMILActionPerformed(evt);
            }
        });

        CINCOMIL.setBackground(new java.awt.Color(244, 127, 11));
        CINCOMIL.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        CINCOMIL.setForeground(new java.awt.Color(255, 255, 255));
        CINCOMIL.setText("C$5,000");
        CINCOMIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CINCOMILActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoCuajiBancoCircular.jpg"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Otra cantidad:     C$");

        cajaCantidad1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        cajaCantidad1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cajaCantidad1.setToolTipText("");
        cajaCantidad1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaCantidad1KeyTyped(evt);
            }
        });

        boton1.setBackground(new java.awt.Color(0, 204, 0));
        boton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton1.setText("ACEPTAR");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        boton2.setBackground(new java.awt.Color(255, 0, 0));
        boton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton2.setForeground(new java.awt.Color(255, 255, 255));
        boton2.setText("LIMPIAR");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DOCIENTOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TRECIENTOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CIEN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(MIL, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DOSMIL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CINCOMIL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 72, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(boton1)
                                .addGap(18, 18, 18)
                                .addComponent(boton2)
                                .addGap(178, 178, 178))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cajaCantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MIL, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CIEN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(DOSMIL, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CINCOMIL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DOCIENTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TRECIENTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaCantidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void extraComponents() {
        this.setTitle("Retiro de efectivo");
        this.setResizable(false);
        cajaCantidad1.requestFocus();

    }
    private void avanzar(){
        
            VentanaDonativos vd=new VentanaDonativos(cuenta,saldoPedido,this.numTarjeta);
            vd.setLocationRelativeTo(null);
            this.setVisible(false);
            vd.setVisible(true);
            
    }

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        cajaCantidad1.setText("");
        cajaCantidad1.requestFocus();
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed

        saldoPedido = Long.parseLong(cajaCantidad1.getText());
        avanzar();

    }//GEN-LAST:event_boton1ActionPerformed

    private void CINCOMILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CINCOMILActionPerformed
       
        saldoPedido = 5000;
        avanzar();
    }//GEN-LAST:event_CINCOMILActionPerformed

    private void DOSMILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOSMILActionPerformed
        
        saldoPedido = 2000;
       avanzar();
    }//GEN-LAST:event_DOSMILActionPerformed

    private void MILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MILActionPerformed
        
        saldoPedido = 1000;
        avanzar();
    }//GEN-LAST:event_MILActionPerformed

    private void TRECIENTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRECIENTOSActionPerformed
        
        saldoPedido = 500;
        avanzar();
    }//GEN-LAST:event_TRECIENTOSActionPerformed

    private void DOCIENTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOCIENTOSActionPerformed
        
        saldoPedido = 200;
        avanzar();
    }//GEN-LAST:event_DOCIENTOSActionPerformed

    private void CIENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CIENActionPerformed
        
        saldoPedido = 100;
        avanzar();
    }//GEN-LAST:event_CIENActionPerformed

    private void cajaCantidad1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaCantidad1KeyTyped
        
        char caracter;
        caracter = evt.getKeyChar();
        if ((caracter < '0') || (caracter > '9')) {
            evt.consume();
        }
        if (cajaCantidad1.getText().length() == 4) {
            evt.consume();
        }
    }//GEN-LAST:event_cajaCantidad1KeyTyped
    private long numTarjeta=-1;
    private Cuenta cuenta;
    private long saldoPedido;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CIEN;
    private javax.swing.JButton CINCOMIL;
    private javax.swing.JButton DOCIENTOS;
    private javax.swing.JButton DOSMIL;
    private javax.swing.JButton MIL;
    private javax.swing.JButton TRECIENTOS;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JTextField cajaCantidad1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
