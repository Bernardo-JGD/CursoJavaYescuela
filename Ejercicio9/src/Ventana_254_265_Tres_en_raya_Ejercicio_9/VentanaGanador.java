
package Ventana_254_265_Tres_en_raya_Ejercicio_9;


public class VentanaGanador extends javax.swing.JDialog {

    private String usuario;
    
    public VentanaGanador(java.awt.Frame parent, boolean modal, String usuario) {
        super(parent, modal);
        this.usuario = usuario;
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonComenzarDeNuevo = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        etiquetaNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonComenzarDeNuevo.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        botonComenzarDeNuevo.setText("Juegar de nuevo ");
        botonComenzarDeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComenzarDeNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(botonComenzarDeNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        botonSalir.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        botonSalir.setText("Salir ");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

        etiquetaNombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        etiquetaNombre.setText("Felicitaciones " + usuario);
        jPanel1.add(etiquetaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        jLabel2.setText("Ganaste!!!!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTres/bob king.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonComenzarDeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComenzarDeNuevoActionPerformed
        dispose();
    }//GEN-LAST:event_botonComenzarDeNuevoActionPerformed


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
            java.util.logging.Logger.getLogger(VentanaGanador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaGanador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaGanador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaGanador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaGanador dialog = new VentanaGanador(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonComenzarDeNuevo;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
