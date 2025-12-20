/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package agencia.layouts.main;

import agencia.controller.NavigationController;
import agencia.layouts.components.InicioPanel;

/**
 *
 * @author felix
 */
public class MainDashBoard extends javax.swing.JFrame {

    public MainDashBoard() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarPanel(new InicioPanel());
        
        // 2. Encender el controlador para que los botones funcionen
        new NavigationController(this);
    }

    public void mostrarPanel(javax.swing.JPanel p) {
        //ajustar tamanos en para panel vacio
        p.setSize(content.getWidth(), content.getHeight());
        p.setLocation(0, 0);
        //intercambio entre el contendio que se va extraer
        content.removeAll();
        content.add(p, java.awt.BorderLayout.CENTER);
        // notificar al compilador cambios 
        content.revalidate();
        content.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraLateralPanel2 = new agencia.layouts.components.BarraLateralPanel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(barraLateralPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 642));

        content.setPreferredSize(new java.awt.Dimension(940, 640));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 970, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainDashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public agencia.layouts.components.BarraLateralPanel barraLateralPanel2;
    public javax.swing.JPanel content;
    // End of variables declaration//GEN-END:variables
}
