
package Ventana_252_253_JTree_EventosJTree;

import javax.swing.ImageIcon;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Ventana extends javax.swing.JFrame {

    DefaultMutableTreeNode raiz = new DefaultMutableTreeNode ("Raiz");
    DefaultTreeModel modeloTree = new DefaultTreeModel (raiz);
    
    public Ventana() {
        
        cargarDatosModeloTree();
        initComponents();
    }
    
    private void cargarDatosModeloTree (){
        
        DefaultMutableTreeNode colores = new DefaultMutableTreeNode ("Colores");
        
        DefaultMutableTreeNode colorRojo = new DefaultMutableTreeNode ("Rojo");
        DefaultMutableTreeNode colorAzul = new DefaultMutableTreeNode ("Azul");
        
        colores.add(colorRojo);
        colores.add(colorAzul);
        
        DefaultMutableTreeNode deportes = new DefaultMutableTreeNode ("Deportes");
        
        DefaultMutableTreeNode futbol = new DefaultMutableTreeNode ("Futbol");
        
        DefaultMutableTreeNode futsal = new DefaultMutableTreeNode("Futsal");
        DefaultMutableTreeNode futbolCompleto = new DefaultMutableTreeNode ("Futbol Completo");
        
        futbol.add(futsal);
        futbol.add(futbolCompleto);
        
        DefaultMutableTreeNode baloncesto = new DefaultMutableTreeNode("Baloncesto");
        
        deportes.add(futbol);
        deportes.add(baloncesto);
        
        raiz.add(colores);
        raiz.add(deportes);
    }
    
    private void eventosNodoSeleccionado (DefaultMutableTreeNode nodoSeleccionado){
        if (nodoSeleccionado.toString().equals("Rojo")) {
            etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/imagenesArbol/colorRojo.jpg")));
        }else{
            if (nodoSeleccionado.toString().equals("Azul")) {
                etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/imagenesArbol/colorAzul.jpg")));
            }else{
                if (nodoSeleccionado.toString().equals("Futsal")) {
                    etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/imagenesArbol/futsal.jpg")));
                }else{
                    if (nodoSeleccionado.toString().equals("Futbol Completo")) {
                        etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/imagenesArbol/futbolCompleto.jpg")));
                    }
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        arbol = new javax.swing.JTree();
        etiquetaImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        arbol.setModel(modeloTree);
        TreeSelectionListener oyenteTree = new TreeSelectionListener (){

            @Override
            public void valueChanged (TreeSelectionEvent e){
                DefaultMutableTreeNode nodoSeleccionado = (DefaultMutableTreeNode)arbol.getLastSelectedPathComponent();

                eventosNodoSeleccionado(nodoSeleccionado);
            }

        };

        arbol.getSelectionModel().addTreeSelectionListener(oyenteTree);
        jScrollPane1.setViewportView(arbol);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiquetaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(etiquetaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
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
    private javax.swing.JTree arbol;
    private javax.swing.JLabel etiquetaImagen;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
