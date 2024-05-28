/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.PC;

/**
 *
 * @author ElPul
 */
public class VentanaPC extends javax.swing.JFrame {

    private PC pc;
    public VentanaPC(PC pc) {
        this.pc = pc;
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

        tabMochila = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        botonCajaAnterior = new javax.swing.JButton();
        botonCajaPosterior = new javax.swing.JButton();
        botonCambiarPosicion = new javax.swing.JButton();
        botonMoverAEquipo = new javax.swing.JButton();
        botonLiberar = new javax.swing.JButton();
        botonQuitarItem = new javax.swing.JButton();
        textoCaja = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        botonCajaAnterior.setText("Caja anterior");
        botonCajaAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCajaAnteriorActionPerformed(evt);
            }
        });

        botonCajaPosterior.setText("Caja posterior");
        botonCajaPosterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCajaPosteriorActionPerformed(evt);
            }
        });

        botonCambiarPosicion.setText("Cambiar posicion");
        botonCambiarPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambiarPosicionActionPerformed(evt);
            }
        });

        botonMoverAEquipo.setText("Mover a equipo");
        botonMoverAEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMoverAEquipoActionPerformed(evt);
            }
        });

        botonLiberar.setText("Liberar");
        botonLiberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLiberarActionPerformed(evt);
            }
        });

        botonQuitarItem.setText("Quitar item");
        botonQuitarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQuitarItemActionPerformed(evt);
            }
        });

        textoCaja.setText("Caja:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonCajaAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textoCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(botonCajaPosterior))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(botonCambiarPosicion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botonMoverAEquipo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botonLiberar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botonQuitarItem))))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCajaPosterior)
                    .addComponent(botonCajaAnterior)
                    .addComponent(textoCaja))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCambiarPosicion)
                    .addComponent(botonMoverAEquipo)
                    .addComponent(botonLiberar)
                    .addComponent(botonQuitarItem))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        tabMochila.addTab("PC", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        tabMochila.addTab("Equipo Pokemon", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        tabMochila.addTab("Mochila", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabMochila)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabMochila)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCajaAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCajaAnteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCajaAnteriorActionPerformed

    private void botonMoverAEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMoverAEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonMoverAEquipoActionPerformed

    private void botonCajaPosteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCajaPosteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCajaPosteriorActionPerformed

    private void botonCambiarPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambiarPosicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCambiarPosicionActionPerformed

    private void botonLiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLiberarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonLiberarActionPerformed

    private void botonQuitarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQuitarItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonQuitarItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCajaAnterior;
    private javax.swing.JButton botonCajaPosterior;
    private javax.swing.JButton botonCambiarPosicion;
    private javax.swing.JButton botonLiberar;
    private javax.swing.JButton botonMoverAEquipo;
    private javax.swing.JButton botonQuitarItem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane tabMochila;
    private javax.swing.JLabel textoCaja;
    // End of variables declaration//GEN-END:variables
}
