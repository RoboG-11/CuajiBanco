
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
public class VentanaRFCCliente extends javax.swing.JFrame {

    
    public VentanaRFCCliente(Cliente cliente) {
        this.cliente = cliente;
        initComponents();
        
        SolicitudRFC.setForeground(Color.white);
        BotonSiguiente.setForeground(Color.white);
        
        this.setTitle("RFC del cliente");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoAzul = new javax.swing.JPanel();
        SolicitudRFC = new javax.swing.JLabel();
        RFCCliente = new javax.swing.JTextField();
        BotonSiguiente = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        FondoAzul.setBackground(new java.awt.Color(1, 32, 96));

        SolicitudRFC.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        SolicitudRFC.setText("Ingresa tu RFC");

        RFCCliente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        RFCCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        BotonSiguiente.setBackground(new java.awt.Color(244, 127, 11));
        BotonSiguiente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonSiguiente.setText("Siguiente");
        BotonSiguiente.setToolTipText("");
        BotonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoAzulLayout = new javax.swing.GroupLayout(FondoAzul);
        FondoAzul.setLayout(FondoAzulLayout);
        FondoAzulLayout.setHorizontalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoAzulLayout.createSequentialGroup()
                .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoAzulLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(SolicitudRFC))
                    .addGroup(FondoAzulLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(RFCCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoAzulLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(BotonSiguiente)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        FondoAzulLayout.setVerticalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoAzulLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(SolicitudRFC)
                .addGap(18, 18, 18)
                .addComponent(RFCCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(BotonSiguiente)
                .addContainerGap(40, Short.MAX_VALUE))
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

        
        if(this.RFCCliente.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor, ingresa datos válidos","Aviso",JOptionPane.INFORMATION_MESSAGE);
            this.RFCCliente.requestFocus();
        }
        else{
        cliente.setRFC(RFCCliente.getText());
        
        VentanaCorreoCliente correo = new VentanaCorreoCliente(cliente);
        
        correo.setLocationRelativeTo(null);
        
        this.dispose();
        
        correo.setVisible(true);
        }
    }//GEN-LAST:event_BotonSiguienteActionPerformed

    private Cliente cliente;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotonSiguiente;
    private javax.swing.JPanel FondoAzul;
    private javax.swing.JTextField RFCCliente;
    private javax.swing.JLabel SolicitudRFC;
    // End of variables declaration//GEN-END:variables
}
