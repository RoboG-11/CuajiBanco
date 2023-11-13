
package com.uamcuamx.interfazgrafica;

import com.uamcuamx.proyectocuajibanco.*;
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
public class VentanaRegistroInicio extends javax.swing.JFrame {

  
    public VentanaRegistroInicio(Cliente cliente) {
        initComponents();
        this.cliente = cliente;
        //CAMBIOS DE COLORES
        Encabezado.setForeground(Color.white);
        BotonRegistroUsuario.setForeground(Color.white);
        BotonTarjeta.setForeground(Color.white);
        BotonCreacion.setForeground(Color.white);
        //DARLE NOMBRE A LA PESTAÑA
        this.setTitle("Registros");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoAzul = new javax.swing.JPanel();
        Encabezado = new javax.swing.JLabel();
        BotonRegistroUsuario = new javax.swing.JToggleButton();
        BotonTarjeta = new javax.swing.JToggleButton();
        BotonCreacion = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        boton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        FondoAzul.setBackground(new java.awt.Color(1, 32, 96));

        Encabezado.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 28)); // NOI18N
        Encabezado.setText("Registros");

        BotonRegistroUsuario.setBackground(new java.awt.Color(244, 127, 11));
        BotonRegistroUsuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        BotonRegistroUsuario.setForeground(new java.awt.Color(184, 187, 187));
        BotonRegistroUsuario.setText("Nuevo Usuario");
        BotonRegistroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistroUsuarioActionPerformed(evt);
            }
        });

        BotonTarjeta.setBackground(new java.awt.Color(244, 127, 11));
        BotonTarjeta.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonTarjeta.setText("Nueva Tarjeta");
        BotonTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTarjetaActionPerformed(evt);
            }
        });

        BotonCreacion.setBackground(new java.awt.Color(244, 127, 11));
        BotonCreacion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonCreacion.setText("Nueva Cuenta");
        BotonCreacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCreacionActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoCuajiBancoCircular.jpg"))); // NOI18N

        boton2.setBackground(new java.awt.Color(255, 0, 0));
        boton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton2.setForeground(new java.awt.Color(255, 255, 255));
        boton2.setText("SALIR");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoAzulLayout = new javax.swing.GroupLayout(FondoAzul);
        FondoAzul.setLayout(FondoAzulLayout);
        FondoAzulLayout.setHorizontalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoAzulLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boton2)
                    .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BotonRegistroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(FondoAzulLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Encabezado))
                        .addGroup(FondoAzulLayout.createSequentialGroup()
                            .addComponent(BotonCreacion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BotonTarjeta))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        FondoAzulLayout.setVerticalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoAzulLayout.createSequentialGroup()
                .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoAzulLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(FondoAzulLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addComponent(BotonRegistroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegistroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistroUsuarioActionPerformed
        
        VentanaNombreCliente nomCliente = new VentanaNombreCliente(cliente);
        
        nomCliente.setLocationRelativeTo(null);
        nomCliente.setVisible(true);
        
        
        
    }//GEN-LAST:event_BotonRegistroUsuarioActionPerformed

    private void BotonCreacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCreacionActionPerformed
       
        VentanaCrearCuenta vcc=new VentanaCrearCuenta();
        vcc.setLocationRelativeTo(null);
        vcc.setVisible(true);
    }//GEN-LAST:event_BotonCreacionActionPerformed

    private void BotonTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTarjetaActionPerformed
       
        VentanaCrearTarjeta vct=new VentanaCrearTarjeta();
        vct.setLocationRelativeTo(null);
        vct.setVisible(true);
    }//GEN-LAST:event_BotonTarjetaActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_boton2ActionPerformed

    private Cliente cliente;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotonCreacion;
    private javax.swing.JToggleButton BotonRegistroUsuario;
    private javax.swing.JToggleButton BotonTarjeta;
    private javax.swing.JLabel Encabezado;
    private javax.swing.JPanel FondoAzul;
    private javax.swing.JButton boton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
