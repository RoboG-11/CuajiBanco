package com.uamcuamx.interfazgrafica;

import java.awt.Color;
import javax.swing.JOptionPane;
import com.uamcuamx.proyectocuajibanco.*;

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
public class VentanaCorreoCliente extends javax.swing.JFrame {

    public VentanaCorreoCliente(Cliente cliente) {
        this.cliente = cliente;
        initComponents();

        BotonTerminar.setForeground(Color.white);
        IngresoCorreoCliente.setForeground(Color.white);
        VerificacionCorreoCliente.setForeground(Color.white);

        this.setTitle("Correo del cliente");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoAzul = new javax.swing.JPanel();
        IngresoCorreoCliente = new javax.swing.JLabel();
        CorreoUsuario = new javax.swing.JTextField();
        BotonTerminar = new javax.swing.JToggleButton();
        VerificacionCorreoCliente = new javax.swing.JLabel();
        ValidacionCorreo = new javax.swing.JTextField();
        boton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        FondoAzul.setBackground(new java.awt.Color(1, 32, 96));

        IngresoCorreoCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        IngresoCorreoCliente.setText("Ingresa tu correo electrónico");

        CorreoUsuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        CorreoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoUsuarioActionPerformed(evt);
            }
        });

        BotonTerminar.setBackground(new java.awt.Color(244, 127, 11));
        BotonTerminar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonTerminar.setText("Terminar");
        BotonTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTerminarActionPerformed(evt);
            }
        });

        VerificacionCorreoCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        VerificacionCorreoCliente.setText("Confirma tu correo");

        ValidacionCorreo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        ValidacionCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ValidacionCorreoFocusGained(evt);
            }
        });
        ValidacionCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidacionCorreoActionPerformed(evt);
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

        javax.swing.GroupLayout FondoAzulLayout = new javax.swing.GroupLayout(FondoAzul);
        FondoAzul.setLayout(FondoAzulLayout);
        FondoAzulLayout.setHorizontalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoAzulLayout.createSequentialGroup()
                .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoAzulLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(IngresoCorreoCliente))
                    .addGroup(FondoAzulLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(VerificacionCorreoCliente))
                    .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FondoAzulLayout.createSequentialGroup()
                            .addGap(101, 101, 101)
                            .addComponent(BotonTerminar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                            .addComponent(boton2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FondoAzulLayout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CorreoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                                .addComponent(ValidacionCorreo)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        FondoAzulLayout.setVerticalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoAzulLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(IngresoCorreoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CorreoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(VerificacionCorreoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ValidacionCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonTerminar)
                    .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
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

    private void CorreoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoUsuarioActionPerformed

        String correo1 = "";


    }//GEN-LAST:event_CorreoUsuarioActionPerformed

    private void BotonTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTerminarActionPerformed

        long idNuevo = -1;
        if (this.CorreoUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa datos válidos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.CorreoUsuario.requestFocus();
        } else {

            String correo = CorreoUsuario.getText();

            String correo2 = ValidacionCorreo.getText();

            if (correo.equals(correo2)) {

                cliente.setCorreo(correo2);

                Verificacion v = new Verificacion();
                if (v.verificarCorreo(cliente.getCorreo()) == true) {

                    cliente.setStatusVerificado(true);
                    cliente.crearCliente();
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Código incorrecto");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, escríbe el mismo correo");
            }
        }
    }//GEN-LAST:event_BotonTerminarActionPerformed

    private void ValidacionCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidacionCorreoActionPerformed

        String correo2 = "";


    }//GEN-LAST:event_ValidacionCorreoActionPerformed

    private void ValidacionCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ValidacionCorreoFocusGained

        CorreoUsuario.enable(false);
    }//GEN-LAST:event_ValidacionCorreoFocusGained

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed

        this.CorreoUsuario.setText("");
        this.CorreoUsuario.requestFocus();
        this.CorreoUsuario.enable(true);
        this.ValidacionCorreo.setText("");
    }//GEN-LAST:event_boton2ActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden


    }//GEN-LAST:event_formComponentHidden

    private Cliente cliente;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotonTerminar;
    private javax.swing.JTextField CorreoUsuario;
    private javax.swing.JPanel FondoAzul;
    private javax.swing.JLabel IngresoCorreoCliente;
    private javax.swing.JTextField ValidacionCorreo;
    private javax.swing.JLabel VerificacionCorreoCliente;
    private javax.swing.JButton boton2;
    // End of variables declaration//GEN-END:variables
}
