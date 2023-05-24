
package Cuenpi;

import java.awt.Color;

public class CuenpiPrincipal extends javax.swing.JFrame {

    panelPersonasRegistrar panelPR;
    public CuenpiPrincipal() {
        initComponents();
        setSize(1366, 725);
        setLocationRelativeTo(null);
        
        
        panelPR = new panelPersonasRegistrar ();
        getContentPane().add(panelPR);
        panelPR.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelMenuPrincipal = new javax.swing.JPanel();
        etiquetaTitutloMenuPrincipal = new javax.swing.JLabel();
        panelBotonesMenuPrincipal = new javax.swing.JPanel();
        botonPersonasPrincipal = new javax.swing.JButton();
        botonProductosPrincipal = new javax.swing.JButton();
        botonmMovimientosPrincipal = new javax.swing.JButton();
        etiquetaPersonasPrincipal = new javax.swing.JLabel();
        etiquetaProductosPrincipal = new javax.swing.JLabel();
        etiquetaMovimientosPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMenuPrincipal.setLayout(new java.awt.GridBagLayout());

        etiquetaTitutloMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesBotonesIconos/Titulo_Nombre_Recortada_sin_fondo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(50, 50, 50, 50);
        panelMenuPrincipal.add(etiquetaTitutloMenuPrincipal, gridBagConstraints);

        panelBotonesMenuPrincipal.setOpaque(false);
        panelBotonesMenuPrincipal.setLayout(new java.awt.GridBagLayout());

        botonPersonasPrincipal.setBackground(new java.awt.Color(102, 102, 102));
        botonPersonasPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesBotonesIconos/Personas_Sin_Fondo.png"))); // NOI18N
        botonPersonasPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPersonasPrincipalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelBotonesMenuPrincipal.add(botonPersonasPrincipal, gridBagConstraints);

        botonProductosPrincipal.setBackground(new java.awt.Color(102, 102, 102));
        botonProductosPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesBotonesIconos/Productos_sin_fondo.png"))); // NOI18N
        botonProductosPrincipal.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelBotonesMenuPrincipal.add(botonProductosPrincipal, gridBagConstraints);

        botonmMovimientosPrincipal.setBackground(new java.awt.Color(102, 102, 102));
        botonmMovimientosPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesBotonesIconos/Movimientos_sin_fondo.png"))); // NOI18N
        botonmMovimientosPrincipal.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelBotonesMenuPrincipal.add(botonmMovimientosPrincipal, gridBagConstraints);

        etiquetaPersonasPrincipal.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaPersonasPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaPersonasPrincipal.setText("Personas");
        etiquetaPersonasPrincipal.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelBotonesMenuPrincipal.add(etiquetaPersonasPrincipal, gridBagConstraints);

        etiquetaProductosPrincipal.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaProductosPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaProductosPrincipal.setText("Productos");
        etiquetaProductosPrincipal.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelBotonesMenuPrincipal.add(etiquetaProductosPrincipal, gridBagConstraints);

        etiquetaMovimientosPrincipal.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaMovimientosPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaMovimientosPrincipal.setText("Movimientos");
        etiquetaMovimientosPrincipal.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panelBotonesMenuPrincipal.add(etiquetaMovimientosPrincipal, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(50, 50, 50, 50);
        panelMenuPrincipal.add(panelBotonesMenuPrincipal, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPersonasPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPersonasPrincipalActionPerformed
        panelMenuPrincipal.setVisible(false);
        panelPR.setVisible(true);
        System.out.println("Cerrar Panel Principal");
    }//GEN-LAST:event_botonPersonasPrincipalActionPerformed
   

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CuenpiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuenpiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuenpiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuenpiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuenpiPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonPersonasPrincipal;
    private javax.swing.JButton botonProductosPrincipal;
    private javax.swing.JButton botonmMovimientosPrincipal;
    private javax.swing.JLabel etiquetaMovimientosPrincipal;
    private javax.swing.JLabel etiquetaPersonasPrincipal;
    private javax.swing.JLabel etiquetaProductosPrincipal;
    private javax.swing.JLabel etiquetaTitutloMenuPrincipal;
    private javax.swing.JPanel panelBotonesMenuPrincipal;
    public javax.swing.JPanel panelMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
