
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
public class VentanaFechaNacimientoCliente extends javax.swing.JFrame {

   
    public VentanaFechaNacimientoCliente(Cliente cliente) {
        this.cliente = cliente;
        initComponents();
        
        SolicitudFechaN.setForeground(Color.white);
        BotonSiguiente.setForeground(Color.white);
        
        this.setTitle("Fecha de nacimiento");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoAzul = new javax.swing.JPanel();
        SolicitudFechaN = new javax.swing.JLabel();
        BotonSiguiente = new javax.swing.JToggleButton();
        Fecha = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        FondoAzul.setBackground(new java.awt.Color(1, 32, 96));
        FondoAzul.setPreferredSize(new java.awt.Dimension(400, 300));

        SolicitudFechaN.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        SolicitudFechaN.setText("Ingresa tu fecha de nacimiento");

        BotonSiguiente.setBackground(new java.awt.Color(244, 127, 11));
        BotonSiguiente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonSiguiente.setText("Siguiente");
        BotonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSiguienteActionPerformed(evt);
            }
        });

        try {
            Fecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Fecha.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N

        javax.swing.GroupLayout FondoAzulLayout = new javax.swing.GroupLayout(FondoAzul);
        FondoAzul.setLayout(FondoAzulLayout);
        FondoAzulLayout.setHorizontalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoAzulLayout.createSequentialGroup()
                .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoAzulLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(SolicitudFechaN))
                    .addGroup(FondoAzulLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(BotonSiguiente)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoAzulLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        FondoAzulLayout.setVerticalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoAzulLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(SolicitudFechaN)
                .addGap(18, 18, 18)
                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(BotonSiguiente)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoAzul, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiguienteActionPerformed
       
        
        if(this.Fecha.getText().equals("  /  /    ")){
            JOptionPane.showMessageDialog(null,"Por favor, ingresa datos válidos","Aviso",JOptionPane.INFORMATION_MESSAGE);
            this.Fecha.requestFocus();
        }
        else{
        cliente.setFechaNacimiento(Fecha.getText());
        
        VentanaRFCCliente rfc = new VentanaRFCCliente(cliente);
        
        rfc.setLocationRelativeTo(null);
        
        this.dispose();
        
        rfc.setVisible(true);
        }
    }//GEN-LAST:event_BotonSiguienteActionPerformed

    private Cliente cliente;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotonSiguiente;
    private javax.swing.JFormattedTextField Fecha;
    private javax.swing.JPanel FondoAzul;
    private javax.swing.JLabel SolicitudFechaN;
    // End of variables declaration//GEN-END:variables
}
