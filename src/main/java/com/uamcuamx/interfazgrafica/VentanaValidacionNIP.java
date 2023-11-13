
package com.uamcuamx.interfazgrafica;

import com.uamcuamx.proyectocuajibanco.BdTarjeta;
import com.uamcuamx.proyectocuajibanco.Cliente;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class VentanaValidacionNIP extends javax.swing.JFrame {

    
    public VentanaValidacionNIP(long numTarjeta) {
        this.numTarjeta=numTarjeta;
        initComponents();
        this.setTitle("Cambio de NIP");
        IngresoNuevoNIP.setForeground(Color.white);
        ReingresoNIP.setForeground(Color.white);
        BotonTerminar.setForeground(Color.white);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoAzul = new javax.swing.JPanel();
        IngresoNuevoNIP = new javax.swing.JLabel();
        ReingresoNIP = new javax.swing.JLabel();
        NuevoNIP = new javax.swing.JPasswordField();
        ReingresoNuevoNIP = new javax.swing.JPasswordField();
        BotonTerminar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        FondoAzul.setBackground(new java.awt.Color(1, 32, 96));

        IngresoNuevoNIP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        IngresoNuevoNIP.setText("Ingresa un nuevo NIP");

        ReingresoNIP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        ReingresoNIP.setText("Ingresa nuevamente el NIP");

        NuevoNIP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        NuevoNIP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NuevoNIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoNIPActionPerformed(evt);
            }
        });
        NuevoNIP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NuevoNIPKeyTyped(evt);
            }
        });

        ReingresoNuevoNIP.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        ReingresoNuevoNIP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ReingresoNuevoNIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReingresoNuevoNIPActionPerformed(evt);
            }
        });
        ReingresoNuevoNIP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ReingresoNuevoNIPKeyTyped(evt);
            }
        });

        BotonTerminar.setBackground(new java.awt.Color(244, 127, 11));
        BotonTerminar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        BotonTerminar.setText("Terminar");
        BotonTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTerminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoAzulLayout = new javax.swing.GroupLayout(FondoAzul);
        FondoAzul.setLayout(FondoAzulLayout);
        FondoAzulLayout.setHorizontalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoAzulLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ReingresoNuevoNIP, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(FondoAzulLayout.createSequentialGroup()
                .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoAzulLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IngresoNuevoNIP)
                            .addGroup(FondoAzulLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(NuevoNIP, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(FondoAzulLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(ReingresoNIP))
                    .addGroup(FondoAzulLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(BotonTerminar)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        FondoAzulLayout.setVerticalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoAzulLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(IngresoNuevoNIP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NuevoNIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(ReingresoNIP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ReingresoNuevoNIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonTerminar)
                .addContainerGap(25, Short.MAX_VALUE))
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

    private void BotonTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTerminarActionPerformed
        
        
        String NIP = NuevoNIP.getText();
        String NIP2 = ReingresoNuevoNIP.getText();
        
        if(NIP.equals(NIP2)){
            
            BdTarjeta bdt=new BdTarjeta();
            try {
                bdt.modificarNIP(this.numTarjeta,Integer.parseInt(NIP));
                
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(VentanaValidacionNIP.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        }else{
            
            JOptionPane.showMessageDialog(this, "Los NIP no coinciden");
            
        }
        
    }//GEN-LAST:event_BotonTerminarActionPerformed

    private void NuevoNIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoNIPActionPerformed
        
        
    }//GEN-LAST:event_NuevoNIPActionPerformed

    private void ReingresoNuevoNIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReingresoNuevoNIPActionPerformed
        
        
    }//GEN-LAST:event_ReingresoNuevoNIPActionPerformed

    private void NuevoNIPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NuevoNIPKeyTyped
        
        char caracter = evt.getKeyChar();
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != '\b' )) {
            evt.consume();  
        }
        if (NuevoNIP.getText().length() >= 3) { 
            ReingresoNuevoNIP.requestFocus();
        }
        if (NuevoNIP.getText().length() >= 4) { 
            evt.consume();
        }
    }//GEN-LAST:event_NuevoNIPKeyTyped

    private void ReingresoNuevoNIPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ReingresoNuevoNIPKeyTyped
        
        char caracter = evt.getKeyChar();
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != '\b' )) {
            evt.consume();  
        }
        if (ReingresoNuevoNIP.getText().length() >= 4) { 
            evt.consume();
        }
    }//GEN-LAST:event_ReingresoNuevoNIPKeyTyped

    

    private Cliente cliente;
    private long numTarjeta;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotonTerminar;
    private javax.swing.JPanel FondoAzul;
    private javax.swing.JLabel IngresoNuevoNIP;
    private javax.swing.JPasswordField NuevoNIP;
    private javax.swing.JLabel ReingresoNIP;
    private javax.swing.JPasswordField ReingresoNuevoNIP;
    // End of variables declaration//GEN-END:variables
}
