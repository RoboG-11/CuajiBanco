
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
public class VentanaDonativos extends javax.swing.JFrame {

    
    public VentanaDonativos(Cuenta cuenta,long saldoPedido, long numTarjeta) {
        this.cuenta = cuenta;
        this.saldoPedido=saldoPedido;
        this.numTarjeta=numTarjeta;
        initComponents();
        this.setTitle("Donativo");
        BotonSiguiente.setForeground(Color.white);

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonSiguiente = new javax.swing.JToggleButton();
        ImagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonSiguiente.setBackground(new java.awt.Color(255, 102, 0));
        BotonSiguiente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        BotonSiguiente.setText("Continuar");
        BotonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(BotonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        ImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoBeca.jpg"))); // NOI18N
        jPanel1.add(ImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void BotonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiguienteActionPerformed
      

        VentanaDonativos2 donativos = new VentanaDonativos2(cuenta,saldoPedido,numTarjeta);
        donativos.setLocationRelativeTo(null);
        donativos.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_BotonSiguienteActionPerformed
    private Cuenta cuenta;
    private long saldoPedido;
    private long numTarjeta;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotonSiguiente;
    private javax.swing.JLabel ImagenFondo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
