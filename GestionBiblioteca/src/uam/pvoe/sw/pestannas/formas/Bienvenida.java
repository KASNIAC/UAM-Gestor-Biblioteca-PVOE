/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.sw.pestannas.formas;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


/**
 *
 * @author ALEXISGARCIA
 */
public class Bienvenida extends javax.swing.JPanel {

    /**
     * Creates new form Bienvenida
     */
    public Bienvenida() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMensaje1 = new javax.swing.JLabel();
        lblImagen1 = new javax.swing.JLabel();
        lblMensaje2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        lblMensaje1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMensaje1.setText("Bienvenido al Sistema de Control de Material Audio Viusal :D");

        lblImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uam/pvoe/sw/pestannas/formas/imagen1.png"))); // NOI18N

        lblMensaje2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMensaje2.setText("Elige una opcion para Continuar");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitulo.setText("Menú Principal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(lblMensaje2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(lblImagen1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lblMensaje1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblTitulo)
                .addGap(41, 41, 41)
                .addComponent(lblMensaje1)
                .addGap(34, 34, 34)
                .addComponent(lblMensaje2)
                .addGap(36, 36, 36)
                .addComponent(lblImagen1)
                .addGap(36, 36, 36)
                .addComponent(btnSalir)
                .addContainerGap(100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this); // Cierro el frame desde el panel
        frame.dispose();
        
        FrmLogin salir = new FrmLogin();
        salir.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblImagen1;
    private javax.swing.JLabel lblMensaje1;
    private javax.swing.JLabel lblMensaje2;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
