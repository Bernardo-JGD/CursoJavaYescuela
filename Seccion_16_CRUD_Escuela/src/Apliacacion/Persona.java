
package Apliacacion;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Persona extends javax.swing.JFrame {

    public static final String URL = "jdbc:mysql://localhost:3306/escuela";
    public static final String usuario = "root";
    public static final String contra = "1z6_9@bR83tD";
    PreparedStatement ps;
    ResultSet rs;
    
    public Persona() {
        initComponents();
        cajaId.setVisible(false);
        setLocationRelativeTo(null);
    }
    
    public void limpiarCajas (){
        cajaBuscar.setText("");
        cajaClave.setText("");
        cajaNombre.setText("");
        cajaDomicilio.setText("");
        cajaCelular.setText("");
        cajaCorreo.setText("");
        cajaFecha.setText("");
        comboGenero.setSelectedIndex(0);
    }
    
    public Connection getConnection (){
        Connection conexion = null;
        
        try{
            //Viejo: com.mysql.jdbc.Driver
            //Nuevo : com.mysql.cj.jdbc.Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, usuario, contra);
            //JOptionPane.showMessageDialog(null, "Conexión exitosa :D!!!");
        }catch (Exception ex){
            System.err.println("Error: " + ex);
            JOptionPane.showMessageDialog(null, "Conexión Fallida D:!!!");
        }
        return conexion;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPersona = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cajaClave = new javax.swing.JTextField();
        cajaNombre = new javax.swing.JTextField();
        cajaDomicilio = new javax.swing.JTextField();
        cajaCelular = new javax.swing.JTextField();
        cajaCorreo = new javax.swing.JTextField();
        cajaFecha = new javax.swing.JTextField();
        comboGenero = new javax.swing.JComboBox<>();
        cajaBuscar = new javax.swing.JTextField();
        cajaId = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        botonInsertar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPersona.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel1.setText("Clave:");
        panelPersona.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel2.setText("Nombre:");
        panelPersona.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel3.setText("Domicilio:");
        panelPersona.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel4.setText("Celular:");
        panelPersona.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel5.setText("Correo Electrónico:");
        panelPersona.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel6.setText("Fecha de nacimiento:");
        panelPersona.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel7.setText("Género:");
        panelPersona.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        cajaClave.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        panelPersona.add(cajaClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 340, -1));

        cajaNombre.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        panelPersona.add(cajaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 340, -1));

        cajaDomicilio.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        panelPersona.add(cajaDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 340, -1));

        cajaCelular.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        panelPersona.add(cajaCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 340, -1));

        cajaCorreo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        panelPersona.add(cajaCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 250, -1));

        cajaFecha.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        panelPersona.add(cajaFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 230, -1));

        comboGenero.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));
        panelPersona.add(comboGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 160, -1));

        cajaBuscar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        panelPersona.add(cajaBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 130, 30));

        cajaId.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        panelPersona.add(cajaId, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 130, 30));

        botonBuscar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        botonBuscar.setText("Buscar ");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        panelPersona.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 130, 35));

        botonInsertar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        botonInsertar.setText("Insertar ");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });
        panelPersona.add(botonInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 100, 100));

        botonModificar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        panelPersona.add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 100, 100));

        botonEliminar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        panelPersona.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 100, 100));

        botonLimpiar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });
        panelPersona.add(botonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 100, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPersona, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPersona, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        Connection conexion = null;
        
        try{
            
            conexion = getConnection();
            ps = conexion.prepareStatement("INSERT INTO Persona (clave, nombre, domicilio, celular, correo_electronico, fecha_nacimiento, genero) VALUES (?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, cajaClave.getText());
            ps.setString(2, cajaNombre.getText());
            ps.setString(3, cajaDomicilio.getText());
            ps.setString(4, cajaCelular.getText());
            ps.setString(5, cajaCorreo.getText());
            ps.setDate(6, Date.valueOf(cajaFecha.getText()));
            ps.setString(7, comboGenero.getSelectedItem().toString());
            
            int resultado = ps.executeUpdate();//Ejecutamos la insercion
            if (resultado>0) {
                JOptionPane.showMessageDialog(null, "El registro se insertó correctamente");
                limpiarCajas();
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo insertar el registro");
                limpiarCajas();
            }
            
            conexion.close();
            
        }catch (Exception ex){
            System.err.println("Error: " + ex);
        }
        
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        Connection conexion = null;
        
        try{
            
            conexion = getConnection();
            ps = conexion.prepareStatement("SELECT * FROM Persona WHERE clave = ?");
            ps.setString(1, cajaBuscar.getText());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                
                cajaId.setText(String.valueOf(rs.getInt("idPersona")));
                cajaClave.setText(rs.getString("clave"));
                cajaNombre.setText(rs.getString("nombre"));
                cajaDomicilio.setText(rs.getString("domicilio"));
                cajaCelular.setText(rs.getString("celular"));
                cajaCorreo.setText(rs.getString("correo_electronico"));
                cajaFecha.setText(String.valueOf(rs.getDate("fecha_nacimiento")));
                comboGenero.setSelectedItem(rs.getString("genero"));
                               
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro un registro con esa clave");
            }
            
            conexion.close();
            
        }catch (Exception ex){
            System.err.println("Error: " + ex);
        }
        
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        Connection conexion = getConnection();
        
        try{
            
            ps = conexion.prepareStatement("UPDATE PERSONA SET clave=?, nombre=?, domicilio=?, celular=?, correo_electronico=?, fecha_nacimiento=?, genero=? WHERE idPersona=?");
            ps.setString(1, cajaClave.getText());
            ps.setString(2, cajaNombre.getText());
            ps.setString(3, cajaDomicilio.getText());
            ps.setString(4, cajaCelular.getText());
            ps.setString(5, cajaCorreo.getText());
            ps.setDate(6, Date.valueOf(cajaFecha.getText()));
            ps.setString(7, comboGenero.getSelectedItem().toString());
            ps.setInt(8, Integer.parseInt(cajaId.getText()));
            
            int resultado = ps.executeUpdate();//ejecutamos la modificacion
            
            if (resultado>0) {
                JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
                limpiarCajas();
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo modificar el registro");
                limpiarCajas();
            }
            
            conexion.close();
            
        }catch (Exception ex){
            System.err.println("Erro: " + ex);
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        
        Connection conexion = getConnection();
        
        try{
            
            ps = conexion.prepareStatement("DELETE FROM Persona WHERE idPersona=?");
            ps.setInt(1, Integer.parseInt(cajaId.getText()));
            
            int resultado = ps.executeUpdate();//ejecutamos la eliminacion
            
            if (rootPaneCheckingEnabled) {
                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
                limpiarCajas();
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro");
                limpiarCajas();
            }
            
            conexion.close();
            
        }catch (Exception ex){
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
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Persona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField cajaBuscar;
    private javax.swing.JTextField cajaCelular;
    private javax.swing.JTextField cajaClave;
    private javax.swing.JTextField cajaCorreo;
    private javax.swing.JTextField cajaDomicilio;
    private javax.swing.JTextField cajaFecha;
    private javax.swing.JTextField cajaId;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JComboBox<String> comboGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel panelPersona;
    // End of variables declaration//GEN-END:variables
}
