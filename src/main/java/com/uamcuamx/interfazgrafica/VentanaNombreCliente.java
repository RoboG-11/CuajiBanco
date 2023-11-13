
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
public class VentanaNombreCliente extends javax.swing.JFrame {

    
    public VentanaNombreCliente(Cliente cliente) {
        this.cliente = cliente;
        initComponents();
        Etiqueta1.setForeground(Color.white);
        SolicitudNombre.setForeground(Color.white);
        SolicitudApellidoPaterno.setForeground(Color.white);
        SolicitudApellidoMaterno.setForeground(Color.white);
        BotonSiguiente.setForeground(Color.white);

        this.setTitle("Nombre Completo");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoAzul = new javax.swing.JPanel();
        SolicitudNombre = new javax.swing.JLabel();
        IngresoNombre = new javax.swing.JTextField();
        BotonSiguiente = new javax.swing.JToggleButton();
        SolicitudApellidoPaterno = new javax.swing.JLabel();
        IngresoApellidoPaterno = new javax.swing.JTextField();
        SolicitudApellidoMaterno = new javax.swing.JLabel();
        IngresoApellidoMaterno = new javax.swing.JTextField();
        Etiqueta1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        FondoAzul.setBackground(new java.awt.Color(1, 32, 96));
        FondoAzul.setPreferredSize(new java.awt.Dimension(400, 300));

        SolicitudNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        SolicitudNombre.setText("Nombre(s)");

        IngresoNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        IngresoNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IngresoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoNombreActionPerformed(evt);
            }
        });
        IngresoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IngresoNombreKeyTyped(evt);
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

        SolicitudApellidoPaterno.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        SolicitudApellidoPaterno.setText("Apellido paterno");

        IngresoApellidoPaterno.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        IngresoApellidoPaterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IngresoApellidoPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoApellidoPaternoActionPerformed(evt);
            }
        });

        SolicitudApellidoMaterno.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        SolicitudApellidoMaterno.setText("Apellido materno");

        IngresoApellidoMaterno.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        IngresoApellidoMaterno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IngresoApellidoMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoApellidoMaternoActionPerformed(evt);
            }
        });

        Etiqueta1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        Etiqueta1.setText("Ingresa tu nombre");

        javax.swing.GroupLayout FondoAzulLayout = new javax.swing.GroupLayout(FondoAzul);
        FondoAzul.setLayout(FondoAzulLayout);
        FondoAzulLayout.setHorizontalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoAzulLayout.createSequentialGroup()
                .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoAzulLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(SolicitudApellidoPaterno))
                    .addGroup(FondoAzulLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(SolicitudNombre))
                    .addGroup(FondoAzulLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(BotonSiguiente))
                    .addGroup(FondoAzulLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(SolicitudApellidoMaterno)))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoAzulLayout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(IngresoApellidoMaterno)
                    .addGroup(FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(IngresoApellidoPaterno)
                        .addComponent(IngresoNombre)
                        .addComponent(Etiqueta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );
        FondoAzulLayout.setVerticalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoAzulLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(Etiqueta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SolicitudNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IngresoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SolicitudApellidoPaterno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IngresoApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SolicitudApellidoMaterno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IngresoApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(BotonSiguiente)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoAzul, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoAzul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoNombreActionPerformed
        
    }//GEN-LAST:event_IngresoNombreActionPerformed

    private void BotonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiguienteActionPerformed
       
        if(this.IngresoNombre.getText().equals("")||this.IngresoApellidoPaterno.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Por favor, ingresa datos válidos","Aviso",JOptionPane.INFORMATION_MESSAGE);
            this.IngresoNombre.requestFocus();
        }
        else{
            cliente.setApPaterno(IngresoApellidoPaterno.getText());
        cliente.setApMaterno(IngresoApellidoMaterno.getText());
        cliente.setNombres(IngresoNombre.getText());

        VentanaTelefonoCliente telefono = new VentanaTelefonoCliente(cliente); 

        telefono.setLocationRelativeTo(null);
        telefono.setVisible(true);
        this.dispose();
        }
        

        

    }//GEN-LAST:event_BotonSiguienteActionPerformed

    private void IngresoApellidoPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoApellidoPaternoActionPerformed
        
    }//GEN-LAST:event_IngresoApellidoPaternoActionPerformed

    private void IngresoApellidoMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoApellidoMaternoActionPerformed
       
    }//GEN-LAST:event_IngresoApellidoMaternoActionPerformed

    private void IngresoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IngresoNombreKeyTyped
        
    }//GEN-LAST:event_IngresoNombreKeyTyped

    private Cliente cliente;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BotonSiguiente;
    private javax.swing.JLabel Etiqueta1;
    private javax.swing.JPanel FondoAzul;
    private javax.swing.JTextField IngresoApellidoMaterno;
    private javax.swing.JTextField IngresoApellidoPaterno;
    private javax.swing.JTextField IngresoNombre;
    private javax.swing.JLabel SolicitudApellidoMaterno;
    private javax.swing.JLabel SolicitudApellidoPaterno;
    private javax.swing.JLabel SolicitudNombre;
    // End of variables declaration//GEN-END:variables
}
