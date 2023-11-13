package com.uamcuamx.interfazgrafica;

import com.uamcuamx.proyectocuajibanco.Tarjeta;
import java.awt.Color;
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
public class VentanaCambioNIP extends javax.swing.JFrame {

    public VentanaCambioNIP(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
        initComponents();
        Titulo.setForeground(Color.white);
        BotonAceptar.setForeground(Color.white);

        this.setTitle("Cambio de NIP");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoAzul = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        IngresoNIP = new javax.swing.JPasswordField();
        BotonAceptar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        FondoAzul.setBackground(new java.awt.Color(1, 32, 96));

        Titulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        Titulo.setText("Ingresa tu NIP");

        IngresoNIP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        IngresoNIP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IngresoNIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoNIPActionPerformed(evt);
            }
        });
        IngresoNIP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IngresoNIPKeyTyped(evt);
            }
        });

        BotonAceptar.setBackground(new java.awt.Color(250, 127, 11));
        BotonAceptar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonAceptar.setText("Aceptar");
        BotonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoAzulLayout = new javax.swing.GroupLayout(FondoAzul);
        FondoAzul.setLayout(FondoAzulLayout);
        FondoAzulLayout.setHorizontalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoAzulLayout.createSequentialGroup()
                .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoAzulLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(IngresoNIP, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoAzulLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(Titulo))
                    .addGroup(FondoAzulLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(BotonAceptar)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        FondoAzulLayout.setVerticalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoAzulLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Titulo)
                .addGap(18, 18, 18)
                .addComponent(IngresoNIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
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

    private void IngresoNIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoNIPActionPerformed

    }//GEN-LAST:event_IngresoNIPActionPerformed

    private void BotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarActionPerformed

        if (Integer.parseInt(IngresoNIP.getText()) == tarjeta.getNIP()) {
            VentanaValidacionNIP nip = new VentanaValidacionNIP(tarjeta.getNumTarjeta());

            nip.setLocationRelativeTo(null);
            nip.setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "NIP incorrecto");
        }

    }//GEN-LAST:event_BotonAceptarActionPerformed

    private void IngresoNIPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IngresoNIPKeyTyped

        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
            evt.consume();  // ignorar el evento de teclado
        }
        if (IngresoNIP.getText().length() >= 4) { //10 digitos
            evt.consume();
        }

    }//GEN-LAST:event_IngresoNIPKeyTyped

    private Tarjeta tarjeta;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotonAceptar;
    private javax.swing.JPanel FondoAzul;
    private javax.swing.JPasswordField IngresoNIP;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
