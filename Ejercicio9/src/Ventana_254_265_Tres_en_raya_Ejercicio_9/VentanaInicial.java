
package Ventana_254_265_Tres_en_raya_Ejercicio_9;


public class VentanaInicial extends javax.swing.JFrame {

   
    private String usuario1;
    private String usuario2;
    
    public VentanaInicial() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        etiquetatTitulo = new javax.swing.JLabel();
        etiquetNombre1 = new javax.swing.JLabel();
        etiquetaNombre2 = new javax.swing.JLabel();
        cajaNombre1 = new javax.swing.JTextField();
        cajaNombre2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        etiquetaMuestra1 = new javax.swing.JLabel();
        etiquetaMuestra2 = new javax.swing.JLabel();
        botonComenzarJuego = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetatTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        etiquetatTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetatTitulo.setText("Tres en raya");
        panel.add(etiquetatTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 33, 644, -1));

        etiquetNombre1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etiquetNombre1.setText("Digite el nombre del usuario 1: ");
        panel.add(etiquetNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 94, -1, -1));

        etiquetaNombre2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etiquetaNombre2.setText("Digite el nombre del usuario 2: ");
        panel.add(etiquetaNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 137, -1, -1));

        cajaNombre1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel.add(cajaNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 94, 325, -1));

        cajaNombre2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel.add(cajaNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 137, 325, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesTres/Tresnr gif.gif"))); // NOI18N
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 203, -1, -1));

        botonGuardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        panel.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 180, -1, -1));

        etiquetaMuestra1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        panel.add(etiquetaMuestra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        etiquetaMuestra2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        panel.add(etiquetaMuestra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        botonComenzarJuego.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonComenzarJuego.setText("ComenzarJuego");
        botonComenzarJuego.setVisible(false);
        botonComenzarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComenzarJuegoActionPerformed(evt);
            }
        });
        panel.add(botonComenzarJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 324, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        usuario1 = cajaNombre1.getText();
        usuario2 = cajaNombre2.getText();
        
        botonGuardar.setVisible(false);
        
        etiquetaMuestra1.setText(usuario1 + " jugará primero, su ficha es: X");
        etiquetaMuestra2.setText(usuario2 + " su ficha es: O");
        
        botonComenzarJuego.setVisible(true);
        
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonComenzarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComenzarJuegoActionPerformed
        VentanaPrincipal ventanaP = new VentanaPrincipal(usuario1, usuario2);
        ventanaP.setVisible(true);
        
        dispose ();
    }//GEN-LAST:event_botonComenzarJuegoActionPerformed

    
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
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonComenzarJuego;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField cajaNombre1;
    private javax.swing.JTextField cajaNombre2;
    private javax.swing.JLabel etiquetNombre1;
    private javax.swing.JLabel etiquetaMuestra1;
    private javax.swing.JLabel etiquetaMuestra2;
    private javax.swing.JLabel etiquetaNombre2;
    private javax.swing.JLabel etiquetatTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
