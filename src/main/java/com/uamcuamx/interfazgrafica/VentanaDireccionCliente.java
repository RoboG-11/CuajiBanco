
package com.uamcuamx.interfazgrafica;

import java.awt.Color;
import com.uamcuamx.proyectocuajibanco.*;
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
public class VentanaDireccionCliente extends javax.swing.JFrame {

    
    public VentanaDireccionCliente(Cliente cliente) {
        this.cliente = cliente;
        initComponents();

        SolicitudDireccion.setForeground(Color.white);
        CalleCliente.setForeground(Color.white);
        BotonSiguiente.setForeground(Color.white);
        ColoniaCliente.setForeground(Color.white);
        NumeroECalleCliente.setForeground(Color.white);
        NumeroICalleCliente.setForeground(Color.white);
        CodigoPostalCliente.setForeground(Color.white);

        this.setTitle("Dirección");

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoAzul = new javax.swing.JPanel();
        CalleCliente = new javax.swing.JLabel();
        IngresoDireccion = new javax.swing.JTextField();
        BotonSiguiente = new javax.swing.JToggleButton();
        NumeroECalleCliente = new javax.swing.JLabel();
        IngresoNumeroECalleCliente = new javax.swing.JTextField();
        CodigoPostalCliente = new javax.swing.JLabel();
        IngresoCodigoPostal = new javax.swing.JTextField();
        NumeroICalleCliente = new javax.swing.JLabel();
        IngresoNumeroICalleCliente = new javax.swing.JTextField();
        ColoniaCliente = new javax.swing.JLabel();
        IngresoColoniaCliente = new javax.swing.JTextField();
        SolicitudDireccion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        FondoAzul.setBackground(new java.awt.Color(1, 32, 96));

        CalleCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        CalleCliente.setText("Calle");

        IngresoDireccion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        IngresoDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IngresoDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoDireccionActionPerformed(evt);
            }
        });

        BotonSiguiente.setBackground(new java.awt.Color(244, 127, 11));
        BotonSiguiente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonSiguiente.setText("Siguiente");
        BotonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSiguienteActionPerformed(evt);
            }
        });

        NumeroECalleCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        NumeroECalleCliente.setText("Num. ext.");

        IngresoNumeroECalleCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        IngresoNumeroECalleCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        CodigoPostalCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        CodigoPostalCliente.setText("C.P.");

        IngresoCodigoPostal.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        IngresoCodigoPostal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IngresoCodigoPostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoCodigoPostalActionPerformed(evt);
            }
        });

        NumeroICalleCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        NumeroICalleCliente.setText("Num. int.");

        IngresoNumeroICalleCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        IngresoNumeroICalleCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ColoniaCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        ColoniaCliente.setText("Colonia");

        IngresoColoniaCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        IngresoColoniaCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        SolicitudDireccion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        SolicitudDireccion.setText("Ingresa tu dirección completa");

        javax.swing.GroupLayout FondoAzulLayout = new javax.swing.GroupLayout(FondoAzul);
        FondoAzul.setLayout(FondoAzulLayout);
        FondoAzulLayout.setHorizontalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoAzulLayout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoAzulLayout.createSequentialGroup()
                        .addComponent(SolicitudDireccion)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoAzulLayout.createSequentialGroup()
                        .addComponent(CalleCliente)
                        .addGap(162, 162, 162))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoAzulLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoAzulLayout.createSequentialGroup()
                        .addComponent(ColoniaCliente)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoAzulLayout.createSequentialGroup()
                        .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IngresoDireccion)
                            .addGroup(FondoAzulLayout.createSequentialGroup()
                                .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FondoAzulLayout.createSequentialGroup()
                                        .addComponent(NumeroECalleCliente)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoAzulLayout.createSequentialGroup()
                                        .addComponent(NumeroICalleCliente)
                                        .addGap(23, 23, 23)))
                                .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(IngresoNumeroECalleCliente)
                                    .addComponent(IngresoNumeroICalleCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(IngresoColoniaCliente)
                            .addComponent(IngresoCodigoPostal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73))))
            .addGroup(FondoAzulLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CodigoPostalCliente)
                    .addComponent(BotonSiguiente))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        FondoAzulLayout.setVerticalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoAzulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SolicitudDireccion)
                .addGap(11, 11, 11)
                .addComponent(CalleCliente)
                .addGap(4, 4, 4)
                .addComponent(IngresoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IngresoNumeroECalleCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumeroECalleCliente))
                .addGap(11, 11, 11)
                .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumeroICalleCliente)
                    .addComponent(IngresoNumeroICalleCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ColoniaCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IngresoColoniaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IngresoCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodigoPostalCliente))
                .addGap(18, 18, 18)
                .addComponent(BotonSiguiente)
                .addContainerGap(19, Short.MAX_VALUE))
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

    private void BotonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiguienteActionPerformed
        

        if (this.IngresoDireccion.getText().equals("") || this.IngresoColoniaCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa datos válidos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.IngresoDireccion.requestFocus();
        } else {
            cliente.setDireccion(IngresoDireccion.getText() + " col. " + IngresoColoniaCliente.getText() + " num. " + IngresoNumeroECalleCliente.getText() + " int. " + IngresoNumeroICalleCliente.getText() + " cp. " + IngresoCodigoPostal.getText());

            VentanaFechaNacimientoCliente fecha = new VentanaFechaNacimientoCliente(cliente);

            fecha.setLocationRelativeTo(null);

            this.dispose();

            fecha.setVisible(true);
        }
    }//GEN-LAST:event_BotonSiguienteActionPerformed

    private void IngresoDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoDireccionActionPerformed
       


    }//GEN-LAST:event_IngresoDireccionActionPerformed

    private void IngresoCodigoPostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoCodigoPostalActionPerformed
       
    }//GEN-LAST:event_IngresoCodigoPostalActionPerformed

    private Cliente cliente;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotonSiguiente;
    private javax.swing.JLabel CalleCliente;
    private javax.swing.JLabel CodigoPostalCliente;
    private javax.swing.JLabel ColoniaCliente;
    private javax.swing.JPanel FondoAzul;
    private javax.swing.JTextField IngresoCodigoPostal;
    private javax.swing.JTextField IngresoColoniaCliente;
    private javax.swing.JTextField IngresoDireccion;
    private javax.swing.JTextField IngresoNumeroECalleCliente;
    private javax.swing.JTextField IngresoNumeroICalleCliente;
    private javax.swing.JLabel NumeroECalleCliente;
    private javax.swing.JLabel NumeroICalleCliente;
    private javax.swing.JLabel SolicitudDireccion;
    // End of variables declaration//GEN-END:variables
}
