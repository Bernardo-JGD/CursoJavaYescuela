/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registro;

import com.mysql.jdbc.Connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.*;
// ----------------------------------------------------------------------
//---------------------------------------------------ENCIENDE EL XAMPP D:
//-----------------------------------------------------------------------
 
public class Persona extends JFrame implements ActionListener {

    public static final String URL = "jdbc:mysql://localhost:3306/escuela?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contraseña = "BBdD124artnoc@zep1";

    PreparedStatement ps;
    ResultSet rs;

    private JLabel clave, nombre, fecha_nacimiento;
    private JButton buscar, insertar, modificar, eliminar, limpiar;
    private JTextField parabuscar, paraclave, paranombre, parafdn, extra_id;

    public Persona() {

        setLayout(null);

        clave = new JLabel("Clave");
        clave.setBounds(10, 70, 50, 20);
        add(clave);

        paraclave = new JTextField();
        paraclave.setBounds(70, 72, 200, 20);
        add(paraclave);

        nombre = new JLabel("Nombre");
        nombre.setBounds(10, 110, 50, 20);
        add(nombre);

        paranombre = new JTextField();
        paranombre.setBounds(70, 112, 200, 20);
        add(paranombre);

        fecha_nacimiento = new JLabel("Fecha Nacimiento");
        fecha_nacimiento.setBounds(10, 150, 120, 20);
        add(fecha_nacimiento);

        insertar = new JButton("Insertar");
        insertar.setBounds(10, 190, 80, 22);
        insertar.addActionListener(this);
        add(insertar);

        modificar = new JButton("Modificar");
        modificar.setBounds(100, 190, 80, 22);
        modificar.addActionListener(this);
        add(modificar);

        eliminar = new JButton("Eliminar");
        eliminar.setBounds(190, 190, 80, 22);
        eliminar.addActionListener(this);
        add(eliminar);

        limpiar = new JButton("Limpiar");
        limpiar.setBounds(280, 190, 80, 22);
        limpiar.addActionListener(this);
        add(limpiar);

        parafdn = new JTextField();
        parafdn.setBounds(130, 152, 140, 20);
        add(parafdn);

        buscar = new JButton("Buscar");
        buscar.setBounds(280, 10, 80, 22);
        buscar.addActionListener(this);
        add(buscar);

        extra_id = new JTextField();
        extra_id.setBounds(280, 37, 80, 20);
        add(extra_id);

        parabuscar = new JTextField();
        parabuscar.setBounds(170, 10, 100, 22);
        add(parabuscar);

        this.setLocationRelativeTo(null);
        this.setSize(400, 270);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

    }

    public Connection getConnection() {
        Connection conexion = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, usuario, contraseña);
            //  JOptionPane.showMessageDialog(this, "Conexion exitosa ");
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
        return conexion;
    }

    public static void main(String[] args) {
        Persona per = new Persona();

        per.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
//--------------------------------------------------BUSCAR-----------------------------------------
        if (ae.getSource() == buscar) {
              Connection conexion = null;
              
              
              try{
                  conexion = getConnection();
                  
                  ps = conexion.prepareStatement("select * from persona where clave=?");
                  ps.setString(1, extra_id.getText());
                  rs = ps.executeQuery();
                  
                  if (rs.next()) {
                      extra_id.setText(String.valueOf(rs.getInt("idPersona")));
                      paraclave.setText(rs.getString("clave"));
                      paranombre.setText(rs.getString("nombre"));
                      parafdn.setText(String.valueOf(rs.getDate("fecha_nacimiento")));
                  }else{
                      JOptionPane.showMessageDialog(null, "No existe persona con esa clave");
                  }
                  
              }catch (Exception ex){
                  System.out.println("Error: " + ex);
              }
        }
        
//--------------------------------------------------INSERTAR-----------------------------------------         
        
        if (ae.getSource() == insertar) {
            Connection conexion = null;

            try {

                conexion = getConnection();
                ps = conexion.prepareStatement("insert into persona(clave, nombre, fecha_nacimiento) values (?, ?, ?)");
                ps.setString(1, paraclave.getText());
                ps.setString(2, paranombre.getText());
                ps.setDate(3, Date.valueOf(parafdn.getText()));

                // se ejecuta la insercion dentro de la base de datos 
                int resultado = ps.executeUpdate();

                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
                    limpiarcajas();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al insertar el registro");
                }
                conexion.close();

            } catch (Exception ex) {
                System.out.println("erro: " + ex);
            }
        }
        
 //--------------------------------------------------MODIFICAR-----------------------------------------       
        
        if (ae.getSource() == modificar) {
            
            Connection conexion = null;

            try {

                conexion = getConnection();
                ps = conexion.prepareStatement("update persona set clave=?, nombre=?, fecha_nacimiento=? where idPersona=?");
                ps.setString(1, paraclave.getText());
                ps.setString(2, paranombre.getText());
                ps.setDate(3, Date.valueOf(parafdn.getText()));
                ps.setInt(4, Integer.parseInt(extra_id.getText()));

                // se ejecuta la modificacion dentro de la base de datos 
                int resultado = ps.executeUpdate();

                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
                    limpiarcajas();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al modifcar el registro");
                }
                conexion.close();

            } catch (Exception ex) {
                System.out.println("erro: " + ex);
            }
            
        }
        
//--------------------------------------------------ELIMINAR-----------------------------------------     
        
        if (ae.getSource() == eliminar) {

            Connection conexion = null;

            try {

                conexion = getConnection();
                ps = conexion.prepareStatement("delete from persona where idPersona=?");
                
                ps.setInt(1, Integer.parseInt(extra_id.getText()));

                // se ejecuta la eliminacion dentro de la base de datos 
                int resultado = ps.executeUpdate();

                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
                    limpiarcajas();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
                    limpiarcajas();
                }
                conexion.close();

            } catch (Exception ex) {
                System.out.println("erro: " + ex);
            }
            
        }
        if (ae.getSource() == limpiar) {
           limpiarcajas();
        }

    }
    //parabuscar, paraclave, paranombre, parafdn, extra_id;
    public void limpiarcajas (){
        parabuscar.setText(null);
        paraclave.setText(null);
        paranombre.setText(null);
        parafdn.setText(null);
        extra_id.setText(null);
    }
}


    /*

001
Elizabeth
1964-11-10

002
Kota 
1998-08-09

003
nyu
1998-09-07

*/
