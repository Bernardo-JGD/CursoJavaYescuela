
package Tabla;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Tabla extends javax.swing.JFrame {

    public Tabla() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        botonCargar = new javax.swing.JButton();
        cajaBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cajaCodigo = new javax.swing.JTextField();
        cajaNombre = new javax.swing.JTextField();
        cajaPrecio = new javax.swing.JTextField();
        cajaCantidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonInsertar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Precio", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProducto);

        botonCargar.setText("Cargar Tabla");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Código ");

        cajaCodigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        cajaNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        cajaPrecio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        cajaCantidad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Código");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Precio");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Cantidad");

        botonInsertar.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        botonModificar.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonEliminar.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cajaPrecio)
                                    .addComponent(cajaCantidad)
                                    .addComponent(cajaNombre)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(cajaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botonInsertar)
                                .addGap(18, 18, 18)
                                .addComponent(botonModificar)
                                .addGap(18, 18, 18)
                                .addComponent(botonEliminar)
                                .addGap(10, 10, 10))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCargar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCargar)
                    .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajaCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonInsertar)
                            .addComponent(botonModificar)
                            .addComponent(botonEliminar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
        
        DefaultTableModel modeloTabla = new DefaultTableModel ();
        tablaProducto.setModel(modeloTabla);
        
        String campo = cajaBuscar.getText();
        String where = "";
        
        if (!"".equals(campo)) {
            where = "where codigo ='" + campo + "'";
        }
        
        PreparedStatement ps = null;
        ResultSet rs = null;             
        
        try {
             Conexion con = new Conexion ();
             Connection conexion = con.getConnection();
             
             ps = conexion.prepareStatement("SELECT codigo, nombre, precio, cantidad FROM Producto " + where);
             rs = ps.executeQuery();
             
             modeloTabla.addColumn("Código");
             modeloTabla.addColumn("Nombre");
             modeloTabla.addColumn("Precio");
             modeloTabla.addColumn("Cantidad");
             
             ResultSetMetaData rsMD = rs.getMetaData();
             int cantidadColumnas = rsMD.getColumnCount();
             
             int anchos[] = {30, 150, 50, 70};
             
             for(int i = 0; i<cantidadColumnas; i++){
                 
                 tablaProducto.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
                 
             }
             
             while(rs.next()){
               Object fila[] = new Object[cantidadColumnas];  
                 for (int i = 0; i < cantidadColumnas; i++) {
                     fila[i] = rs.getObject(i+1);
                 }
                 modeloTabla.addRow(fila);
             }
             
        }catch (Exception ex){
            System.err.println("Error: " + ex);
        }
        
    }//GEN-LAST:event_botonCargarActionPerformed

    private void tablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductoMouseClicked
        
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            int fila = tablaProducto.getSelectedRow();
            String codigo = tablaProducto.getValueAt(fila, 0).toString();
            
            ps = conexion.prepareStatement("SELECT codigo, nombre, precio, cantidad FROM Producto WHERE codigo = ?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            
            while (rs.next()){
                cajaCodigo.setText(rs.getString("codigo"));
                cajaNombre.setText(rs.getString("nombre"));
                cajaPrecio.setText(String.valueOf(rs.getDouble("precio")));
                cajaCantidad.setText(String.valueOf(rs.getInt("cantidad")));
            }
            
        }catch (Exception ex){
            System.err.println("Error: " + ex);
        }
        
    }//GEN-LAST:event_tablaProductoMouseClicked

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        PreparedStatement ps = null;
        
        try{
            
            Conexion con = new Conexion ();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("INSERT INTO Producto (codigo, nombre, precio, cantidad) VALUES (?, ?, ?, ?)");
            ps.setString(1, cajaCodigo.getText());
            ps.setString(2, cajaNombre.getText());
            ps.setDouble(3, Double.parseDouble(cajaPrecio.getText()));
            ps.setInt(4, Integer.parseInt(cajaCantidad.getText()));
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
            
            
        }catch (Exception ex){
            System.err.println("Error: " + ex);
        }
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        PreparedStatement ps = null;
        
        try{
            
            Conexion con = new Conexion ();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("UPDATE Producto SET codigo=?, nombre=?, precio=?, cantidad=? WHERE codigo=?");
            ps.setString(1, cajaCodigo.getText());
            ps.setString(2, cajaNombre.getText());
            ps.setDouble(3, Double.parseDouble(cajaPrecio.getText()));
            ps.setInt(4, Integer.parseInt(cajaCantidad.getText()));
            ps.setString(5, cajaCodigo.getText());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
            
        }catch (Exception ex){
            System.err.println("Error: " + ex);
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        PreparedStatement ps = null;
        
        try{
            
            Conexion con = new Conexion ();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("DELETE FROM Producto WHERE codigo = ?");
            ps.setString(1, cajaCodigo.getText());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
            
        }catch(Exception ex){
            System.err.println("Error: " + ex);
        }
        
    }//GEN-LAST:event_botonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField cajaBuscar;
    private javax.swing.JTextField cajaCantidad;
    private javax.swing.JTextField cajaCodigo;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProducto;
    // End of variables declaration//GEN-END:variables
}
