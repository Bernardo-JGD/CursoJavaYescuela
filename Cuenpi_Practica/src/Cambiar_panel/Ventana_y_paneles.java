
package Cambiar_panel;


public class Ventana_y_paneles extends javax.swing.JFrame {

    public Ventana_y_paneles() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_menu_1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panel_personas_categorias = new javax.swing.JPanel();
        boton_personas_regresar = new javax.swing.JButton();
        panel_menu_principal = new javax.swing.JPanel();
        menu_1 = new javax.swing.JButton();
        menu_2 = new javax.swing.JButton();
        Menu_3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1000, 600));

        panel_menu_1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Personas");

        boton_personas_regresar.setText("Regresar");
        boton_personas_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_personas_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_personas_categoriasLayout = new javax.swing.GroupLayout(panel_personas_categorias);
        panel_personas_categorias.setLayout(panel_personas_categoriasLayout);
        panel_personas_categoriasLayout.setHorizontalGroup(
            panel_personas_categoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_personas_categoriasLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(boton_personas_regresar)
                .addGap(24, 24, 24))
        );
        panel_personas_categoriasLayout.setVerticalGroup(
            panel_personas_categoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_personas_categoriasLayout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(boton_personas_regresar)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout panel_menu_1Layout = new javax.swing.GroupLayout(panel_menu_1);
        panel_menu_1.setLayout(panel_menu_1Layout);
        panel_menu_1Layout.setHorizontalGroup(
            panel_menu_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menu_1Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jLabel2)
                .addContainerGap(281, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_menu_1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_personas_categorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_menu_1Layout.setVerticalGroup(
            panel_menu_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menu_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addComponent(panel_personas_categorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        menu_1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        menu_1.setText("Menú 1");
        menu_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_1ActionPerformed(evt);
            }
        });

        menu_2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        menu_2.setText("Menú 2");

        Menu_3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Menu_3.setText("Menú 3");

        jLabel1.setText("Menú principal");

        javax.swing.GroupLayout panel_menu_principalLayout = new javax.swing.GroupLayout(panel_menu_principal);
        panel_menu_principal.setLayout(panel_menu_principalLayout);
        panel_menu_principalLayout.setHorizontalGroup(
            panel_menu_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menu_principalLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(menu_1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_menu_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_menu_principalLayout.createSequentialGroup()
                        .addComponent(menu_2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Menu_3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        panel_menu_principalLayout.setVerticalGroup(
            panel_menu_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menu_principalLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(79, 79, 79)
                .addGroup(panel_menu_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menu_2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu_1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Menu_3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(143, 143, 143))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_menu_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_menu_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_menu_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel_menu_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_1ActionPerformed
        panel_menu_principal.setVisible(false);
        panel_menu_1.setVisible(true);
    }//GEN-LAST:event_menu_1ActionPerformed

    private void boton_personas_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_personas_regresarActionPerformed
        panel_menu_1.setVisible(false);
        panel_menu_principal.setVisible(true);
    }//GEN-LAST:event_boton_personas_regresarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Ventana_y_paneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_y_paneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_y_paneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_y_paneles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_y_paneles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Menu_3;
    private javax.swing.JButton boton_personas_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton menu_1;
    private javax.swing.JButton menu_2;
    private javax.swing.JPanel panel_menu_1;
    private javax.swing.JPanel panel_menu_principal;
    private javax.swing.JPanel panel_personas_categorias;
    // End of variables declaration//GEN-END:variables
}
