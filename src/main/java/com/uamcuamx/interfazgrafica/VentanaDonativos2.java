
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
public class VentanaDonativos2 extends javax.swing.JFrame {

    
    public VentanaDonativos2(Cuenta cuenta,long saldoPedido, long numTarjeta) {
        this.cuenta=cuenta;
        this.saldoPedido=saldoPedido;
        this.numTarjeta=numTarjeta;
        initComponents();
        Titulo.setForeground(Color.white);
        Titulo1.setForeground(Color.white);
        BotonSi.setForeground(Color.white);
        BotonNo.setForeground(Color.white);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoAzul = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Titulo1 = new javax.swing.JLabel();
        BotonSi = new javax.swing.JToggleButton();
        BotonNo = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        FondoAzul.setBackground(new java.awt.Color(1, 32, 96));
        FondoAzul.setForeground(new java.awt.Color(0, 18, 96));

        Titulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        Titulo.setText("¿Deseas donar?");

        Titulo1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        Titulo1.setText("DONATIVOS");

        BotonSi.setBackground(new java.awt.Color(244, 127, 11));
        BotonSi.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        BotonSi.setForeground(new java.awt.Color(255, 255, 255));
        BotonSi.setText("SÍ");
        BotonSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSiActionPerformed(evt);
            }
        });

        BotonNo.setBackground(new java.awt.Color(244, 127, 11));
        BotonNo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        BotonNo.setForeground(new java.awt.Color(255, 255, 255));
        BotonNo.setText("NO");
        BotonNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoAzulLayout = new javax.swing.GroupLayout(FondoAzul);
        FondoAzul.setLayout(FondoAzulLayout);
        FondoAzulLayout.setHorizontalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoAzulLayout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addGap(24, 24, 24))
            .addGroup(FondoAzulLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(Titulo1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(FondoAzulLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonSi)
                .addGap(63, 63, 63)
                .addComponent(BotonNo)
                .addGap(64, 64, 64))
        );
        FondoAzulLayout.setVerticalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoAzulLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Titulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Titulo)
                .addGap(18, 18, 18)
                .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonSi)
                    .addComponent(BotonNo))
                .addContainerGap(55, Short.MAX_VALUE))
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

    private void BotonSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiActionPerformed
       
        
        VentanaDonativosAceptar aceptar = new VentanaDonativosAceptar(cuenta,saldoPedido, numTarjeta);
        
        aceptar.setLocationRelativeTo(null);
        aceptar.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BotonSiActionPerformed

    private void BotonNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNoActionPerformed
        
        RetirandoEfectivo r = new RetirandoEfectivo(cuenta,saldoPedido, numTarjeta);
        r.setLocationRelativeTo(null);
        this.dispose();
        r.setVisible(true);
        
    }//GEN-LAST:event_BotonNoActionPerformed

    private Cuenta cuenta;
    private long saldoPedido;
    private long numTarjeta;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotonNo;
    private javax.swing.JToggleButton BotonSi;
    private javax.swing.JPanel FondoAzul;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo1;
    // End of variables declaration//GEN-END:variables
}
