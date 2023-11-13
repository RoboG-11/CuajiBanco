
package com.uamcuamx.interfazgrafica;

import com.uamcuamx.proyectocuajibanco.Correo;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import static javax.swing.SwingConstants.CENTER;

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
public class VentanaVerificarCodigo extends javax.swing.JDialog {

   
    public VentanaVerificarCodigo(java.awt.Frame parent, boolean modal,String correo,String codigoEnviado) {
        super(parent, modal);
        this.correo=correo;
        this.codigoEnviado=codigoEnviado;
        initComponents();
        this.setTitle("Enviando Código");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Etiqueta1 = new javax.swing.JLabel();
        Etiqueta2 = new javax.swing.JLabel();
        caja1 = new javax.swing.JTextField();
        caja2 = new javax.swing.JTextField();
        caja3 = new javax.swing.JTextField();
        caja4 = new javax.swing.JTextField();
        caja5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(1, 32, 96));

        Etiqueta1.setBackground(new java.awt.Color(255, 255, 255));
        Etiqueta1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Etiqueta1.setForeground(new java.awt.Color(244, 127, 11));
        Etiqueta1.setText("Enviando código, por favor espere...");

        Etiqueta2.setBackground(new java.awt.Color(255, 255, 255));
        Etiqueta2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        Etiqueta2.setForeground(new java.awt.Color(255, 255, 255));
        Etiqueta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Etiqueta2.setText("¡Gracias por tu preferencia!");

        caja1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 45)); // NOI18N
        caja1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        caja1.setEnabled(false);
        caja1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja1KeyTyped(evt);
            }
        });

        caja2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 45)); // NOI18N
        caja2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        caja2.setEnabled(false);
        caja2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja2KeyTyped(evt);
            }
        });

        caja3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 45)); // NOI18N
        caja3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        caja3.setEnabled(false);
        caja3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja3KeyTyped(evt);
            }
        });

        caja4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 45)); // NOI18N
        caja4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        caja4.setEnabled(false);
        caja4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja4KeyTyped(evt);
            }
        });

        caja5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 45)); // NOI18N
        caja5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        caja5.setEnabled(false);
        caja5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja5KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Etiqueta1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Etiqueta2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(caja1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(caja2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(caja3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(caja4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(caja5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Etiqueta1)
                .addGap(18, 18, 18)
                .addComponent(Etiqueta2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caja1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caja2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caja3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caja4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caja5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getCaja1() {
        return caja1;
    }

    public JTextField getCaja2() {
        return caja2;
    }

    public JTextField getCaja3() {
        return caja3;
    }

    public JTextField getCaja4() {
        return caja4;
    }

    public JTextField getCaja5() {
        return caja5;
    }

    private void caja1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja1KeyTyped
        char caracter = evt.getKeyChar();
        if (caja1.getText().length() == 0) {

            caja2.requestFocus();

        }
        if (((caracter < '0') || (caracter > '9')) && (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();
            caja1.requestFocus();
        }

       
    }//GEN-LAST:event_caja1KeyTyped

    private void caja2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja2KeyTyped
        
        char caracter = evt.getKeyChar();
        if (caja2.getText().length() == 0) {

            caja3.requestFocus();

        }
        if (((caracter < '0') || (caracter > '9')) && (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();
            caja2.requestFocus();
        }
    }//GEN-LAST:event_caja2KeyTyped

    private void caja3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja3KeyTyped
        
        char caracter = evt.getKeyChar();
        if (caja3.getText().length() == 0) {

            caja4.requestFocus();

        }
        if (((caracter < '0') || (caracter > '9')) && (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();
            caja3.requestFocus();
        }
    }//GEN-LAST:event_caja3KeyTyped

    private void caja4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja4KeyTyped
        
        char caracter = evt.getKeyChar();
        if (caja4.getText().length() == 0) {

            caja5.requestFocus();

        }
        if (((caracter < '0') || (caracter > '9')) && (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();
            caja4.requestFocus();
        }
    }//GEN-LAST:event_caja4KeyTyped

    private void caja5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja5KeyTyped
        
        char caracter = evt.getKeyChar();
        if (caja5.getText().length() == 0) {

            this.setVisible(false);

        }
        if (((caracter < '0') || (caracter > '9')) && (caracter != evt.VK_BACK_SPACE)) {
            evt.consume();
            caja5.requestFocus();
        }
    }//GEN-LAST:event_caja5KeyTyped

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        Correo mail = new Correo();
        String codigoF="Código de seguridad: "+codigoEnviado.charAt(0)+" - "+codigoEnviado.charAt(1)+" - "+codigoEnviado.charAt(2)+" - "+codigoEnviado.charAt(3)+" - "+codigoEnviado.charAt(4);
        mail.enviar(correo, "Verificación de correo electrónico", codigoF);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(VentanaVerificarCodigo.class.getName()).log(Level.SEVERE, null, ex);
        }
        Etiqueta1.setText("CÓDIGO ENVIADO CON ÉXITO");
        Etiqueta1.setForeground(Color.green);
        Etiqueta1.setHorizontalAlignment(CENTER);
        Etiqueta2.setText("Escríbelo a continuación: ");
        Etiqueta2.setHorizontalAlignment(CENTER);
        caja1.requestFocus();
        caja1.enable(true);
        caja2.enable(true);
        caja3.enable(true);
        caja4.enable(true);
        caja5.enable(true);
    }//GEN-LAST:event_formWindowActivated

    
    
    private String correo;
    private String codigoEnviado;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Etiqueta1;
    private javax.swing.JLabel Etiqueta2;
    private javax.swing.JTextField caja1;
    private javax.swing.JTextField caja2;
    private javax.swing.JTextField caja3;
    private javax.swing.JTextField caja4;
    private javax.swing.JTextField caja5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
