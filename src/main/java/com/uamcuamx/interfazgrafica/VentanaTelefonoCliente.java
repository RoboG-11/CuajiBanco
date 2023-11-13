
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
public class VentanaTelefonoCliente extends javax.swing.JFrame {

    
    public VentanaTelefonoCliente(Cliente cliente) {
        this.cliente = cliente;
        initComponents();
        
        SolicitudNumero.setForeground(Color.white);
        Restriccion.setForeground(Color.white);
        mas.setForeground(Color.white);
        BotonSiguiente.setForeground(Color.white);
        
        this.setTitle("Número telefónico");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoAzul = new javax.swing.JPanel();
        SolicitudNumero = new javax.swing.JLabel();
        Restriccion = new javax.swing.JLabel();
        BotonSiguiente = new javax.swing.JToggleButton();
        IngresoNumero = new javax.swing.JFormattedTextField();
        mas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        FondoAzul.setBackground(new java.awt.Color(1, 32, 96));

        SolicitudNumero.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        SolicitudNumero.setText("Ingresa tu número telefónico");

        Restriccion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Restriccion.setText("Deben ser 10 digitos*");

        BotonSiguiente.setBackground(new java.awt.Color(244, 127, 11));
        BotonSiguiente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        BotonSiguiente.setText("Siguiente");
        BotonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSiguienteActionPerformed(evt);
            }
        });

        IngresoNumero.setText("52");
        IngresoNumero.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        IngresoNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoNumeroActionPerformed(evt);
            }
        });
        IngresoNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IngresoNumeroKeyTyped(evt);
            }
        });

        mas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        mas.setText("+");

        javax.swing.GroupLayout FondoAzulLayout = new javax.swing.GroupLayout(FondoAzul);
        FondoAzul.setLayout(FondoAzulLayout);
        FondoAzulLayout.setHorizontalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoAzulLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(SolicitudNumero)
                .addGap(23, 23, 23))
            .addGroup(FondoAzulLayout.createSequentialGroup()
                .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoAzulLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(Restriccion))
                    .addGroup(FondoAzulLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(mas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IngresoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoAzulLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(BotonSiguiente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FondoAzulLayout.setVerticalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoAzulLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(SolicitudNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Restriccion)
                .addGap(18, 18, 18)
                .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IngresoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mas))
                .addGap(18, 18, 18)
                .addComponent(BotonSiguiente)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiguienteActionPerformed
       
        if(this.IngresoNumero.getText().equals("52")){
            JOptionPane.showMessageDialog(null,"Por favor, ingresa datos válidos","Aviso",JOptionPane.INFORMATION_MESSAGE);
            this.IngresoNumero.requestFocus();
        }
        else{
            cliente.setTelefono(Long.parseLong(IngresoNumero.getText()));
        
        VentanaDireccionCliente direccion = new VentanaDireccionCliente(cliente);

        direccion.setLocationRelativeTo(null);

        this.dispose();
        
        direccion.setVisible(true);
        }
        
    }//GEN-LAST:event_BotonSiguienteActionPerformed

    private void IngresoNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoNumeroActionPerformed
        
    }//GEN-LAST:event_IngresoNumeroActionPerformed

    private void IngresoNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IngresoNumeroKeyTyped
        
        char caracter = evt.getKeyChar();

        
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != '\b' )) {
            evt.consume();  
        }
        if(IngresoNumero.getText().length() >= 12){ 
            evt.consume();
        }

    }//GEN-LAST:event_IngresoNumeroKeyTyped

    private Cliente cliente;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotonSiguiente;
    private javax.swing.JPanel FondoAzul;
    private javax.swing.JFormattedTextField IngresoNumero;
    private javax.swing.JLabel Restriccion;
    private javax.swing.JLabel SolicitudNumero;
    private javax.swing.JLabel mas;
    // End of variables declaration//GEN-END:variables
}
