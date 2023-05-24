package Zapateria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Principal extends javax.swing.JFrame {

    private int proveedor = 1;
    private int idProductoguardar;

    public Principal() {
       
        setLocation(200, 100);
        initComponents();
        cargarTabla();

        grupoTemporada.add(rbPrimavera);
        grupoTemporada.add(rbVerano);
        grupoTemporada.add(rbOtoño);
        grupoTemporada.add(rbInvierno);
        cjId.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoTemporada = new javax.swing.ButtonGroup();
        panelComponentes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCalzado = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cjId = new javax.swing.JTextField();
        cjTipo = new javax.swing.JTextField();
        cjColor = new javax.swing.JTextField();
        rbPrimavera = new javax.swing.JRadioButton();
        rbVerano = new javax.swing.JRadioButton();
        rbOtoño = new javax.swing.JRadioButton();
        rbInvierno = new javax.swing.JRadioButton();
        cjPrecio = new javax.swing.JTextField();
        cjMarca = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Calzado");

        tblCalzado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tipo", "Color", "Temporada", "Precio", "Marca"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCalzado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCalzadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCalzado);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setText("idProducto:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setText("Tipo: ");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setText("Color: ");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel5.setText("Temporada: ");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel6.setText("Precio: ");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel7.setText("Marca: ");

        cjId.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        cjTipo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        cjColor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        rbPrimavera.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        rbPrimavera.setText("P");

        rbVerano.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        rbVerano.setText("V");

        rbOtoño.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        rbOtoño.setText("O");

        rbInvierno.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        rbInvierno.setText("I");

        cjPrecio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        cjMarca.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelComponentesLayout = new javax.swing.GroupLayout(panelComponentes);
        panelComponentes.setLayout(panelComponentesLayout);
        panelComponentesLayout.setHorizontalGroup(
            panelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComponentesLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cjTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelComponentesLayout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(62, 62, 62)
                            .addGroup(panelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelComponentesLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cjId, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelComponentesLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbPrimavera)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbVerano)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rbOtoño)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbInvierno))
                                    .addComponent(jLabel3)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelComponentesLayout.createSequentialGroup()
                                        .addGroup(panelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelComponentesLayout.createSequentialGroup()
                                                .addGroup(panelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel7))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelComponentesLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnGuardar)))
                                        .addGap(18, 18, 18)
                                        .addGroup(panelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelComponentesLayout.createSequentialGroup()
                                                .addComponent(btnModificar)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnEliminar)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnLimpiar))
                                            .addGroup(panelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cjPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cjMarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(panelComponentesLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(cjColor, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        panelComponentesLayout.setVerticalGroup(
            panelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComponentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelComponentesLayout.createSequentialGroup()
                        .addGroup(panelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cjId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(cjTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(cjColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rbPrimavera)
                            .addComponent(rbVerano)
                            .addComponent(rbOtoño)
                            .addComponent(rbInvierno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cjPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cjMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(panelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelComponentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelComponentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblCalzadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCalzadoMouseClicked

        try {

            int fila = tblCalzado.getSelectedRow();
            int id = Integer.parseInt(tblCalzado.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;

            Connection con = Conexion.getConnection();
            ps = con.prepareStatement("SELECT Producto.idProducto, Calzado.tipo, Calzado.color, Calzado.temporada, Producto.precio, Marca.nombre AS marca\n"
                    + "FROM ((Producto \n"
                    + "INNER JOIN Calzado\n"
                    + "ON Producto.idProducto = Calzado.idProducto)\n"
                    + "INNER JOIN Marca\n"
                    + "ON Producto.idMarca = Marca.idMarca)\n"
                    + "WHERE Producto.idProducto = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {

                cjId.setText(String.valueOf(id));
                cjTipo.setText(rs.getString("tipo"));
                cjColor.setText(rs.getString("color"));
                if (rs.getString("temporada").equals("Primavera")) {
                    rbPrimavera.setSelected(true);
                } else {
                    if (rs.getString("temporada").equals("Verano")) {
                        rbVerano.setSelected(true);
                    } else {
                        if (rs.getString("temporada").equals("Otoño")) {
                            rbOtoño.setSelected(true);
                        } else {
                            if (rs.getString("temporada").equals("Invierno")) {
                                rbInvierno.setSelected(true);
                            } else {
                                if (rs.getString("temporada").equals("")) {
                                    grupoTemporada.clearSelection();
                                }
                            }
                        }
                    }
                }
                cjPrecio.setText(rs.getString("precio"));
                cjMarca.setText(rs.getString("marca"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_tblCalzadoMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String tipo = cjTipo.getText();
        String color = cjColor.getText();
        String temporada;
        if (rbPrimavera.isSelected() == true) {
            temporada = "Primavera";
        } else {
            if (rbVerano.isSelected() == true) {
                temporada = "Verano";
            } else {
                if (rbOtoño.isSelected() == true) {
                    temporada = "Otoño";
                } else {
                    if (rbInvierno.isSelected() == true) {
                        temporada = "Invierno";
                    } else {
                        temporada = "";
                    }
                }
            }
        }
        BigDecimal precio = new BigDecimal(cjPrecio.getText());
        int marca = Integer.parseInt(cjMarca.getText());

        try {

            Connection con1 = Conexion.getConnection();
            PreparedStatement ps1;

            ps1 = con1.prepareStatement("INSERT INTO Producto (idProveedor, precio, idMarca, idPromocion) VALUES (?, ?, ?, ?)");
            ps1.setInt(1, proveedor);
            ps1.setBigDecimal(2, precio);
            ps1.setInt(3, marca);
            ps1.setInt(4, 1);
            ps1.executeUpdate();

            Connection con2 = Conexion.getConnection();
            PreparedStatement ps2;
            ResultSet rs1;
            ps2 = con2.prepareStatement("SELECT MAX(idProducto) FROM Producto");
            rs1 = ps2.executeQuery();
            if (rs1.next()) {
                idProductoguardar = Integer.parseInt(rs1.getString(1));
            }

            Connection con3 = Conexion.getConnection();
            PreparedStatement ps3;
            ps3 = con3.prepareStatement("INSERT INTO Calzado (idProducto, tipo, temporada, color) VALUES (?, ?, ?, ?)");
            ps3.setInt(1, idProductoguardar);
            ps3.setString(2, tipo);
            ps3.setString(3, temporada);
            ps3.setString(4, color);
            ps3.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro guardado");
            limpiarCampos();
            cargarTabla();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        proveedor++;
        if (proveedor > 4) {
            proveedor = 1;
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int id = Integer.parseInt(cjId.getText());
        String tipo = cjTipo.getText();
        String color = cjColor.getText();
        String temporada;
        if (rbPrimavera.isSelected() == true) {
            temporada = "Primavera";
        } else {
            if (rbVerano.isSelected() == true) {
                temporada = "Verano";
            } else {
                if (rbOtoño.isSelected() == true) {
                    temporada = "Otoño";
                } else {
                    if (rbInvierno.isSelected() == true) {
                        temporada = "Invierno";
                    } else {
                        temporada = "";
                    }
                }
            }
        }
        BigDecimal precio = new BigDecimal(cjPrecio.getText());
        int marca = Integer.parseInt(cjMarca.getText());
        try {
            Connection con1 = Conexion.getConnection();
            PreparedStatement ps1;

            ps1 = con1.prepareStatement("UPDATE Producto SET precio=?, idMarca=?, idPromocion=? WHERE idProducto=?");
            ps1.setBigDecimal(1, precio);
            ps1.setInt(2, marca);
            ps1.setInt(3, 1);
            ps1.setInt(4, id);
            ps1.executeUpdate();

            Connection con2 = Conexion.getConnection();
            PreparedStatement ps2;

            ps2 = con2.prepareStatement("UPDATE Calzado SET tipo=?, temporada=?, color=? WHERE idProducto=?");
            ps2.setString(1, tipo);
            ps2.setString(2, temporada);
            ps2.setString(3, color);
            ps2.setInt(4, id);
            ps2.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro modificado");
            limpiarCampos();
            cargarTabla();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int id = Integer.parseInt(cjId.getText());

        try {
            Connection con1 = Conexion.getConnection();
            PreparedStatement ps1 = con1.prepareStatement("DELETE FROM Calzado WHERE idProducto=?");
            ps1.setInt(1, id);
            ps1.executeUpdate();

            Connection con2 = Conexion.getConnection();
            PreparedStatement ps2;
            ps2 = con2.prepareStatement("DELETE FROM Producto WHERE idProducto=?");
            ps2.setInt(1, id);
            ps2.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro eliminado");
            limpiarCampos();
            cargarTabla();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cargarTabla() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tblCalzado.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        int anchos[] = {30, 120, 120, 120, 120, 120};
        for (int i = 0; i < tblCalzado.getColumnCount(); i++) {
            tblCalzado.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

        try {

            Connection con = Conexion.getConnection();
            ps = con.prepareStatement("SELECT Producto.idProducto, Calzado.tipo, Calzado.color, Calzado.temporada, Producto.precio, Marca.nombre AS marca\n"
                    + "FROM ((Producto \n"
                    + "INNER JOIN Calzado\n"
                    + "ON Producto.idProducto = Calzado.idProducto)\n"
                    + "INNER JOIN Marca\n"
                    + "ON Producto.idMarca = Marca.idMarca)");
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object fila[] = new Object[columnas];
                for (int indice = 0; indice < columnas; indice++) {
                    fila[indice] = rs.getObject(indice + 1);
                }
                modeloTabla.addRow(fila);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
            System.out.println("Fallo");
        }

    }

    private void limpiarCampos() {

        cjId.setText("");
        cjTipo.setText("");
        cjColor.setText("");
        grupoTemporada.clearSelection();
        cjPrecio.setText("");
        cjMarca.setText("");

    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            //UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
        
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextField cjColor;
    private javax.swing.JTextField cjId;
    private javax.swing.JTextField cjMarca;
    private javax.swing.JTextField cjPrecio;
    private javax.swing.JTextField cjTipo;
    private javax.swing.ButtonGroup grupoTemporada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelComponentes;
    private javax.swing.JRadioButton rbInvierno;
    private javax.swing.JRadioButton rbOtoño;
    private javax.swing.JRadioButton rbPrimavera;
    private javax.swing.JRadioButton rbVerano;
    private javax.swing.JTable tblCalzado;
    // End of variables declaration//GEN-END:variables
}
