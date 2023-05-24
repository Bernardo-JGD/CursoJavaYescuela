
package Ventana_235_BarraDeMenu_236_SubMenu_237_JPopupMenu;

import java.awt.Color;


public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        
        grupoBotones.add(radioBoton1);
        grupoBotones.add(radioBoton2);
        grupoBotones.add(radioBoton3);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        menuDesplegable = new javax.swing.JPopupMenu();
        ventanaMax = new javax.swing.JMenuItem();
        ventanaMin = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        cambiarColor = new javax.swing.JMenu();
        colorRojo = new javax.swing.JMenuItem();
        colorAzul = new javax.swing.JMenuItem();
        panel = new javax.swing.JPanel();
        BarraMenu = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        menuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        subMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        subMenu2 = new javax.swing.JMenu();
        radioBoton1 = new javax.swing.JRadioButtonMenuItem();
        radioBoton2 = new javax.swing.JRadioButtonMenuItem();
        radioBoton3 = new javax.swing.JRadioButtonMenuItem();
        menuItemSalir = new javax.swing.JMenuItem();

        ventanaMax.setText("Ventana más grande");
        ventanaMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventanaMaxActionPerformed(evt);
            }
        });
        menuDesplegable.add(ventanaMax);

        ventanaMin.setText("Ventana más pequeña");
        ventanaMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventanaMinActionPerformed(evt);
            }
        });
        menuDesplegable.add(ventanaMin);
        menuDesplegable.add(jSeparator3);

        cambiarColor.setText("Cambiar color de ventana");

        colorRojo.setText("Rojo");
        colorRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorRojoActionPerformed(evt);
            }
        });
        cambiarColor.add(colorRojo);

        colorAzul.setText("Azul");
        colorAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorAzulActionPerformed(evt);
            }
        });
        cambiarColor.add(colorAzul);

        menuDesplegable.add(cambiarColor);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        menu1.setText("Menú");
        menu1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        menuItem1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        menuItem1.setText("Inicio");
        menuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem1ActionPerformed(evt);
            }
        });
        menu1.add(menuItem1);
        menu1.add(jSeparator1);

        subMenu1.setText("Sub Menú 1");
        subMenu1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Item1");
        subMenu1.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Item2");
        subMenu1.add(jCheckBoxMenuItem2);

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("Item3");
        subMenu1.add(jCheckBoxMenuItem3);

        menu1.add(subMenu1);
        menu1.add(jSeparator2);

        subMenu2.setText("Sub Menu 2");

        radioBoton1.setSelected(true);
        radioBoton1.setText("Item1");
        subMenu2.add(radioBoton1);

        radioBoton2.setSelected(true);
        radioBoton2.setText("Item2");
        subMenu2.add(radioBoton2);

        radioBoton3.setSelected(true);
        radioBoton3.setText("Item3");
        subMenu2.add(radioBoton3);

        menu1.add(subMenu2);

        menuItemSalir.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menu1.add(menuItemSalir);

        BarraMenu.add(menu1);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem1ActionPerformed
        
    }//GEN-LAST:event_menuItem1ActionPerformed

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSalirActionPerformed

    private void panelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseReleased
        if (evt.isPopupTrigger()) {
            menuDesplegable.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_panelMouseReleased

    private void ventanaMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventanaMaxActionPerformed
        this.setSize(500, 500);
    }//GEN-LAST:event_ventanaMaxActionPerformed

    private void ventanaMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventanaMinActionPerformed
        this.setSize(300, 300);
    }//GEN-LAST:event_ventanaMinActionPerformed

    private void colorRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorRojoActionPerformed
        panel.setBackground(Color.RED);
    }//GEN-LAST:event_colorRojoActionPerformed

    private void colorAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorAzulActionPerformed
        panel.setBackground(Color.BLUE);
    }//GEN-LAST:event_colorAzulActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenu cambiarColor;
    private javax.swing.JMenuItem colorAzul;
    private javax.swing.JMenuItem colorRojo;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenu menu1;
    private javax.swing.JPopupMenu menuDesplegable;
    private javax.swing.JMenuItem menuItem1;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JPanel panel;
    private javax.swing.JRadioButtonMenuItem radioBoton1;
    private javax.swing.JRadioButtonMenuItem radioBoton2;
    private javax.swing.JRadioButtonMenuItem radioBoton3;
    private javax.swing.JMenu subMenu1;
    private javax.swing.JMenu subMenu2;
    private javax.swing.JMenuItem ventanaMax;
    private javax.swing.JMenuItem ventanaMin;
    // End of variables declaration//GEN-END:variables
}
