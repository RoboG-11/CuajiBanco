package com.uamcuamx.interfazgrafica;

import com.uamcuamx.proyectocuajibanco.Tarjeta;
import com.uamcuamx.proyectocuajibanco.Verificacion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

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
public class TarjetaVirtual extends javax.swing.JFrame {

    public TarjetaVirtual() {
        initComponents();
        this.setTitle("Tarjeta Virtual");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        caja1 = new javax.swing.JTextField();
        caja2 = new javax.swing.JTextField();
        caja3 = new javax.swing.JTextField();
        caja4 = new javax.swing.JTextField();
        caja5 = new javax.swing.JTextField();
        caja6 = new javax.swing.JTextField();
        caja7 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        caja1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 45)); // NOI18N
        caja1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        caja1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja1KeyTyped(evt);
            }
        });
        jPanel1.add(caja1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 120, 50));

        caja2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 45)); // NOI18N
        caja2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        caja2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja2KeyTyped(evt);
            }
        });
        jPanel1.add(caja2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 120, 50));

        caja3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 45)); // NOI18N
        caja3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        caja3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja3KeyTyped(evt);
            }
        });
        jPanel1.add(caja3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 120, 50));

        caja4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 45)); // NOI18N
        caja4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        caja4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja4KeyTyped(evt);
            }
        });
        jPanel1.add(caja4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 120, 50));

        caja5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        caja5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        caja5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja5KeyTyped(evt);
            }
        });
        jPanel1.add(caja5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 50, 30));

        caja6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        caja6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        caja6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja6KeyTyped(evt);
            }
        });
        jPanel1.add(caja6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 60, 30));

        caja7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        caja7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        caja7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja7KeyTyped(evt);
            }
        });
        jPanel1.add(caja7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 70, 30));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CVV");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TarjetaVirtual.jpg"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 320));

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

        cancelar.setBackground(new java.awt.Color(255, 0, 0));
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton1)
                .addGap(27, 27, 27)
                .addComponent(boton2)
                .addGap(86, 86, 86)
                .addComponent(cancelar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caja1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja1KeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();
        }
        if (caja1.getText().length() >= 3) {

            caja2.requestFocus();

        }
        if (caja1.getText().length() == 4) {

            evt.consume();

        }
    }//GEN-LAST:event_caja1KeyTyped

    private void caja2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja2KeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();
        }
        if (caja2.getText().length() >= 3) {

            caja3.requestFocus();

        }
        if (caja2.getText().length() == 4) {

            evt.consume();

        }

    }//GEN-LAST:event_caja2KeyTyped

    private void caja3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja3KeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();
        }
        if (caja3.getText().length() >= 3) {

            caja4.requestFocus();

        }
        if (caja3.getText().length() == 4) {

            evt.consume();

        }
    }//GEN-LAST:event_caja3KeyTyped

    private void caja4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja4KeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();
        }
        if (caja4.getText().length() >= 3) {

            caja5.requestFocus();

        }
        if (caja4.getText().length() == 4) {

            evt.consume();

        }
    }//GEN-LAST:event_caja4KeyTyped

    private void caja5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja5KeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();
        }
        if (caja5.getText().length() >= 1) {

            caja6.requestFocus();

        }
        if (caja5.getText().length() == 2) {

            evt.consume();

        }
    }//GEN-LAST:event_caja5KeyTyped

    private void caja6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja6KeyTyped
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();
        }
        if (caja6.getText().length() >= 3) {

            caja7.requestFocus();

        }
        if (caja6.getText().length() == 4) {

            evt.consume();

        }
    }//GEN-LAST:event_caja6KeyTyped

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        long numTarjeta = Long.parseLong(caja1.getText() + caja2.getText() + caja3.getText() + caja4.getText());
        String vencimiento = Integer.parseInt(caja5.getText()) + "/" + caja6.getText();
        System.out.print(vencimiento);
        int codigoSeguridad = Integer.parseInt(caja7.getText());
        //int NIP = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu NIP de 4 dígitos:"));
        String password = "";
        JPasswordField pf = new JPasswordField();
        int okCxl = JOptionPane.showConfirmDialog(null, pf, "Ingresa tu NIP de 4 dígitos:", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (okCxl == JOptionPane.OK_OPTION) {
            password = new String(pf.getPassword());
        }
        int NIP = Integer.parseInt(password);

        Tarjeta t = new Tarjeta();
        t.setNumTarjeta(numTarjeta);
        t.setCodigoSeguridad(codigoSeguridad);
        t.setVencimiento(vencimiento);
        t.setNIP(NIP);

        Verificacion v = new Verificacion();
        try {
            if (v.verificarTarjeta(t)) {
                JOptionPane.showMessageDialog(this,
                        "Tarjeta Válida ",
                        "Atención",
                        JOptionPane.INFORMATION_MESSAGE);

                MenuPrincipalCT mpct = new MenuPrincipalCT(t);
                mpct.setVisible(true);
                mpct.setLocationRelativeTo(null);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Los Datos son incorrectos",
                        "Atención",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TarjetaVirtual.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TarjetaVirtual.class.getName()).log(Level.SEVERE, null, ex);
        }

        //SI LA TARJETA ES CORRECTA

    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        caja1.setText("");
        caja2.setText("");
        caja3.setText("");
        caja4.setText("");
        caja5.setText("");
        caja6.setText("");
        caja7.setText("");
        caja1.requestFocus();
    }//GEN-LAST:event_boton2ActionPerformed

    private void caja7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja7KeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();
        }

        if (caja7.getText().length() == 3) {

            evt.consume();

        }
    }//GEN-LAST:event_caja7KeyTyped

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        int seleccion = JOptionPane.showConfirmDialog(null, "¿Realmente deseas salir?.");
        if (seleccion == 0) {
            this.dispose();
            PantallaPrincipal inicio = new PantallaPrincipal();
            inicio.setVisible(true);
            inicio.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_cancelarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JTextField caja1;
    private javax.swing.JTextField caja2;
    private javax.swing.JTextField caja3;
    private javax.swing.JTextField caja4;
    private javax.swing.JTextField caja5;
    private javax.swing.JTextField caja6;
    private javax.swing.JTextField caja7;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
