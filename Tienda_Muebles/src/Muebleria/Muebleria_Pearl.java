package Muebleria;

import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
--------------------------------------agregar una opcion donde vea la relacion empleado cliente
--------------------------------------solo almacenar los id de ambos y la fecha de atencion en que 
--------------------------------------el cliente fue atendido por el empleado 
--------------------------------------esto se llenara cada vez que se realice una compra,con la 
--------------------------------------id_cliente, id_empleado, fecha_compra
 */
public class Muebleria_Pearl extends JFrame implements ActionListener {

    public static final String URL1 = "jdbc:mysql://localhost:3306/muebleria_pearl?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contraseña = "BBdD124artnoc@zep1";

    PreparedStatement ps, ps2, ps3, ps4;
    ResultSet rs, rs4;

    // private id_Producto, id_Empleado, id_Cliente, id_Producto,   Fecha_Compra Total_compra, Fecha_Compra_leer, Total_compra_leer
    //registrar_compra, modificar_compra, eliminar_compra, limpiar_compra, buscar_compra, leer_b_compras;
    private JPanel panel_inicio, panel_empleados, panel_clientes, panel_productos, panel_compras;
    private JLabel nombre, direccion, telefono, correo, id_Cliente, Fecha_nac, id_Empleado, NSS;
    private JLabel grado_Estudios, id_Producto, Precio_Producto, Cantidad_Producto, Fecha_Compra, Total_compra;
    private JTextField nombre_leer_c, nombre_leer_p, direccion_leer, telefono_leer, correo_leer, fecha_nac_leer, NSS_leer, leer_id_pro, leer_id_emp, leer_id_cli;
    private JTextField grado_estudios_leer, Precio_Producto_leer, Cantidad_Producto_leer, Fecha_Compra_leer, Total_compra_leer;
    private JTextField nombre_leer_e, direccion_leer_e, telefono_leer_e, correo_leer_e;
    /*
    
     */
    private JButton empleados, clientes, productos, compras;
    //private JButton buscar, insertar, modificar, eliminar, limpiar;
    private JButton registrar_empleado, modificar_empleado, eliminar_empleado, limpiar_campos_empleado;
    private JButton registrar_clientes, modificar_clientes, eliminar_clientes, limpiar_campos_clientes;
    private JButton registrar_productos, modificar_productos, eliminar_productos, limpiar_campos_productos;
    private JButton registrar_compra, modificar_compra, eliminar_compra, limpiar_compra;
    private JButton buscar_empleado, buscar_cliente, buscar_productos, buscar_compra;
    private JTextField leer_b_empleado, leer_b_clientes, leer_b_productos, leer_b_compras;
    //private JLabel empleados_t, clientes_t, productos_t, compras_t;
    private JLabel Titulo_Tienda, Titulo_Empleados, Titulo_Clientes, Titulo_Productos, Titulo_Compras, Menu_prin;
    private JLabel titulo_b1, titulo_b2, titulo_b3, titulo_b4;
    private JButton regresar_empleados, regresar_clientes, regresar_productos, regresar_compras;
    //cantidad_p, leer_cantidad_compra
    private JLabel cantidad_p;
    private JTextField leer_cantidad_compra;

    private ImageIcon agregar1, modificar1, eliminar1, limpiar1, regresar1;
    private ImageIcon im_empleados, im_clientes, im_productos, im_compras;

    public Muebleria_Pearl() {

        //-------------------------------------------------------declaracion de las imagenes 
        agregar1 = new ImageIcon("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\Tienda_Muebles\\Add3.jpg");
        modificar1 = new ImageIcon("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\Tienda_Muebles\\Modificar.png");
        limpiar1 = new ImageIcon("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\Tienda_Muebles\\Limpiar1.png");
        eliminar1 = new ImageIcon("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\Tienda_Muebles\\Eliminar2.jpg");
        regresar1 = new ImageIcon("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\Tienda_Muebles\\Regresar2.png");
        im_empleados = new ImageIcon("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\Tienda_Muebles\\Empleado2.png");
        im_clientes = new ImageIcon("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\Tienda_Muebles\\Cliente.jpg");
        im_productos = new ImageIcon("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\Tienda_Muebles\\Muebles.jpg");
        im_compras = new ImageIcon("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\Tienda_Muebles\\Compras.jpg");

//----------------------------------------------------------------------------------
        setLayout(null);

        Titulo_Tienda = new JLabel("Muebleria Pearl");
        Titulo_Tienda.setBounds(275, 0, 200, 30);
        Titulo_Tienda.setForeground(Color.yellow);
        //Titulo_Tienda.setOpaque(true);
        Titulo_Tienda.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        add(Titulo_Tienda);

        panel_inicio = new JPanel();
        panel_inicio.setLayout(null);
        panel_inicio.setBounds(50, 50, 600, 400);
        panel_inicio.setBackground(Color.GRAY);
        getContentPane().add(panel_inicio);

        Menu_prin = new JLabel("Menú Principal");
        Menu_prin.setBounds(225, 0, 200, 30);
        Menu_prin.setForeground(Color.WHITE);
        //Titulo_Tienda.setOpaque(true);
        Menu_prin.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        panel_inicio.add(Menu_prin);
        //------------------------------------------------------------------------------

        //----------------------------------------------------------botonnes de incio 
        //private JButton empleados, clientes, productos, compras;
        empleados = new JButton();
        empleados.setBounds(24, 150, 120, 150);
        empleados.setIcon(new ImageIcon(im_empleados.getImage().getScaledInstance(empleados.getWidth(), empleados.getHeight(), Image.SCALE_SMOOTH)));
        empleados.addActionListener(this);
        panel_inicio.add(empleados);

        titulo_b1 = new JLabel("Empleados");
        titulo_b1.setBounds(24, 110, 120, 30);
        titulo_b1.setForeground(Color.GREEN);
        //Titulo_Tienda.setOpaque(true);
        titulo_b1.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        panel_inicio.add(titulo_b1);

        clientes = new JButton();
        clientes.setBounds(168, 150, 120, 150);
        clientes.setIcon(new ImageIcon(im_clientes.getImage().getScaledInstance(clientes.getWidth(), clientes.getHeight(), Image.SCALE_SMOOTH)));
        clientes.addActionListener(this);
        panel_inicio.add(clientes);

        titulo_b2 = new JLabel("Clientes");
        titulo_b2.setBounds(185, 110, 120, 30);
        titulo_b2.setForeground(Color.CYAN);
        //Titulo_Tienda.setOpaque(true);
        titulo_b2.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        panel_inicio.add(titulo_b2);

        productos = new JButton();
        productos.setBounds(312, 150, 120, 150);
        productos.setIcon(new ImageIcon(im_productos.getImage().getScaledInstance(productos.getWidth(), productos.getHeight(), Image.SCALE_SMOOTH)));
        productos.addActionListener(this);
        panel_inicio.add(productos);

        titulo_b3 = new JLabel("Productos");
        titulo_b3.setBounds(320, 110, 120, 30);
        titulo_b3.setForeground(Color.PINK);
        //Titulo_Tienda.setOpaque(true);
        titulo_b3.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        panel_inicio.add(titulo_b3);

        compras = new JButton();
        compras.setBounds(456, 150, 120, 150);
        compras.setIcon(new ImageIcon(im_compras.getImage().getScaledInstance(compras.getWidth(), compras.getHeight(), Image.SCALE_SMOOTH)));
        compras.addActionListener(this);
        panel_inicio.add(compras);

        titulo_b4 = new JLabel("Compras");
        titulo_b4.setBounds(470, 110, 120, 30);
        titulo_b4.setForeground(Color.BLUE);
        //Titulo_Tienda.setOpaque(true);
        titulo_b4.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        panel_inicio.add(titulo_b4);

        //--------------------------------------------------panel de empleados
        panel_empleados = new JPanel();
        panel_empleados.setLayout(null);
        panel_empleados.setBounds(50, 50, 600, 400);
        panel_empleados.setBackground(Color.GRAY);
        getContentPane().add(panel_empleados);
        panel_empleados.setVisible(false);

        Titulo_Empleados = new JLabel("Empleados");
        Titulo_Empleados.setBounds(250, 0, 200, 30);
        Titulo_Empleados.setForeground(Color.GREEN);
        //Titulo_Tienda.setOpaque(true);
        Titulo_Empleados.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        panel_empleados.add(Titulo_Empleados);

        nombre = new JLabel("Nombre");
        nombre.setBounds(20, 50, 80, 25);
        nombre.setForeground(Color.BLACK);
        nombre.setFont(new Font("Arial", Font.BOLD, 15));
        panel_empleados.add(nombre);

        nombre_leer_e = new JTextField();
        nombre_leer_e.setBounds(100, 50, 200, 20);
        panel_empleados.add(nombre_leer_e);

        NSS = new JLabel("NSS");
        NSS.setBounds(20, 80, 50, 25);
        NSS.setForeground(Color.BLACK);
        NSS.setFont(new Font("Arial", Font.BOLD, 15));
        panel_empleados.add(NSS);

        NSS_leer = new JTextField();
        NSS_leer.setBounds(100, 80, 200, 20);
        panel_empleados.add(NSS_leer);

        direccion = new JLabel("Direccion");
        direccion.setBounds(20, 110, 80, 25);
        direccion.setForeground(Color.BLACK);
        direccion.setFont(new Font("Arial", Font.BOLD, 15));
        panel_empleados.add(direccion);

        direccion_leer_e = new JTextField();
        direccion_leer_e.setBounds(100, 110, 200, 20);
        panel_empleados.add(direccion_leer_e);

        correo = new JLabel("Correo");
        correo.setBounds(20, 140, 80, 25);
        correo.setForeground(Color.BLACK);
        correo.setFont(new Font("Arial", Font.BOLD, 15));
        panel_empleados.add(correo);

        correo_leer_e = new JTextField();
        correo_leer_e.setBounds(100, 140, 200, 20);
        panel_empleados.add(correo_leer_e);

        telefono = new JLabel("Telefono");
        telefono.setBounds(20, 170, 80, 25);
        telefono.setForeground(Color.BLACK);
        telefono.setFont(new Font("Arial", Font.BOLD, 15));
        panel_empleados.add(telefono);

        telefono_leer_e = new JTextField();
        telefono_leer_e.setBounds(100, 170, 200, 20);
        panel_empleados.add(telefono_leer_e);

        grado_Estudios = new JLabel("Estudios");
        grado_Estudios.setBounds(20, 200, 80, 25);
        grado_Estudios.setForeground(Color.BLACK);
        grado_Estudios.setFont(new Font("Arial", Font.BOLD, 15));
        panel_empleados.add(grado_Estudios);

        grado_estudios_leer = new JTextField();
        grado_estudios_leer.setBounds(100, 200, 200, 20);
        panel_empleados.add(grado_estudios_leer);

        buscar_empleado = new JButton("Buscar");
        buscar_empleado.setBounds(320, 50, 100, 25);
        buscar_empleado.setFont(new Font("Tahoma", Font.BOLD, 15));
        buscar_empleado.addActionListener(this);
        panel_empleados.add(buscar_empleado);

        leer_b_empleado = new JTextField();
        leer_b_empleado.setBounds(425, 50, 155, 20);
        panel_empleados.add(leer_b_empleado);

        registrar_empleado = new JButton();
        registrar_empleado.setBounds(320, 100, 120, 120);
        registrar_empleado.setIcon(new ImageIcon(agregar1.getImage().getScaledInstance(registrar_empleado.getWidth(), registrar_empleado.getHeight(), Image.SCALE_SMOOTH)));
        registrar_empleado.addActionListener(this);
        panel_empleados.add(registrar_empleado);

        modificar_empleado = new JButton();
        modificar_empleado.setBounds(320, 240, 120, 120);
        modificar_empleado.setIcon(new ImageIcon(modificar1.getImage().getScaledInstance(modificar_empleado.getWidth(), modificar_empleado.getHeight(), Image.SCALE_SMOOTH)));
        modificar_empleado.addActionListener(this);
        panel_empleados.add(modificar_empleado);

        limpiar_campos_empleado = new JButton();
        limpiar_campos_empleado.setBounds(460, 100, 120, 120);
        limpiar_campos_empleado.setIcon(new ImageIcon(limpiar1.getImage().getScaledInstance(limpiar_campos_empleado.getWidth(), limpiar_campos_empleado.getHeight(), Image.SCALE_SMOOTH)));
        limpiar_campos_empleado.addActionListener(this);
        panel_empleados.add(limpiar_campos_empleado);

        eliminar_empleado = new JButton();
        eliminar_empleado.setBounds(460, 240, 120, 120);
        eliminar_empleado.setIcon(new ImageIcon(eliminar1.getImage().getScaledInstance(eliminar_empleado.getWidth(), eliminar_empleado.getHeight(), Image.SCALE_SMOOTH)));
        eliminar_empleado.addActionListener(this);
        panel_empleados.add(eliminar_empleado);

        regresar_empleados = new JButton();
        regresar_empleados.setBounds(130, 240, 120, 120);
        regresar_empleados.setOpaque(true);
        regresar_empleados.setIcon(new ImageIcon(regresar1.getImage().getScaledInstance(regresar_empleados.getWidth(), regresar_empleados.getHeight(), Image.SCALE_SMOOTH)));
        regresar_empleados.addActionListener(this);
        panel_empleados.add(regresar_empleados);

// private JButton registrar_empleado, modificar_empleado, eliminar_empleado, limpiar_campos_empleado;
        /*
         private JLabel nombre, direccion, telefono, correo, id_Cliente, Fecha_nac, id_Empleado, NSS;
         private JLabel grado_Estudios, id_Producto, Precio_Producto, Cantidad_Producto, Fecha_Compra, Total_compra;
    
         */
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        //--------------------------------------------------panel de clientes
        panel_clientes = new JPanel();
        panel_clientes.setLayout(null);
        panel_clientes.setBounds(50, 50, 600, 400);
        panel_clientes.setBackground(Color.GRAY);
        getContentPane().add(panel_clientes);
        panel_clientes.setVisible(false);

        Titulo_Clientes = new JLabel("Clientes");
        Titulo_Clientes.setBounds(250, 0, 200, 30);
        Titulo_Clientes.setForeground(Color.CYAN);
        //Titulo_Tienda.setOpaque(true);
        Titulo_Clientes.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        panel_clientes.add(Titulo_Clientes);

        nombre = new JLabel("Nombre");
        nombre.setBounds(20, 50, 80, 25);
        nombre.setForeground(Color.BLACK);
        nombre.setFont(new Font("Arial", Font.BOLD, 15));
        panel_clientes.add(nombre);

        nombre_leer_c = new JTextField();
        nombre_leer_c.setBounds(100, 50, 200, 20);
        panel_clientes.add(nombre_leer_c);

        Fecha_nac = new JLabel("Cumple");
        Fecha_nac.setBounds(20, 80, 80, 25);
        Fecha_nac.setForeground(Color.BLACK);
        Fecha_nac.setFont(new Font("Arial", Font.BOLD, 15));
        panel_clientes.add(Fecha_nac);

        fecha_nac_leer = new JTextField();
        fecha_nac_leer.setBounds(100, 80, 200, 20);
        panel_clientes.add(fecha_nac_leer);

        direccion = new JLabel("Direccion");
        direccion.setBounds(20, 110, 80, 25);
        direccion.setForeground(Color.BLACK);
        direccion.setFont(new Font("Arial", Font.BOLD, 15));
        panel_clientes.add(direccion);

        direccion_leer = new JTextField();
        direccion_leer.setBounds(100, 110, 200, 20);
        panel_clientes.add(direccion_leer);

        correo = new JLabel("Correo");
        correo.setBounds(20, 140, 80, 25);
        correo.setForeground(Color.BLACK);
        correo.setFont(new Font("Arial", Font.BOLD, 15));
        panel_clientes.add(correo);

        correo_leer = new JTextField();
        correo_leer.setBounds(100, 140, 200, 20);
        panel_clientes.add(correo_leer);

        telefono = new JLabel("Telefono");
        telefono.setBounds(20, 170, 80, 25);
        telefono.setForeground(Color.BLACK);
        telefono.setFont(new Font("Arial", Font.BOLD, 15));
        panel_clientes.add(telefono);

        telefono_leer = new JTextField();
        telefono_leer.setBounds(100, 170, 200, 20);
        panel_clientes.add(telefono_leer);

        buscar_cliente = new JButton("Buscar");
        buscar_cliente.setBounds(320, 50, 100, 25);
        buscar_cliente.setFont(new Font("Tahoma", Font.BOLD, 15));
        buscar_cliente.addActionListener(this);
        panel_clientes.add(buscar_cliente);

        leer_b_clientes = new JTextField();
        leer_b_clientes.setBounds(425, 50, 150, 20);
        panel_clientes.add(leer_b_clientes);

        registrar_clientes = new JButton();
        registrar_clientes.setBounds(320, 100, 120, 120);
        registrar_clientes.setIcon(new ImageIcon(agregar1.getImage().getScaledInstance(registrar_empleado.getWidth(), registrar_empleado.getHeight(), Image.SCALE_SMOOTH)));
        registrar_clientes.addActionListener(this);
        panel_clientes.add(registrar_clientes);

        modificar_clientes = new JButton();
        modificar_clientes.setBounds(320, 240, 120, 120);
        modificar_clientes.setIcon(new ImageIcon(modificar1.getImage().getScaledInstance(modificar_clientes.getWidth(), modificar_clientes.getHeight(), Image.SCALE_SMOOTH)));
        modificar_clientes.addActionListener(this);
        panel_clientes.add(modificar_clientes);

        limpiar_campos_clientes = new JButton();
        limpiar_campos_clientes.setBounds(460, 100, 120, 120);
        limpiar_campos_clientes.setIcon(new ImageIcon(limpiar1.getImage().getScaledInstance(limpiar_campos_clientes.getWidth(), limpiar_campos_clientes.getHeight(), Image.SCALE_SMOOTH)));
        limpiar_campos_clientes.addActionListener(this);
        panel_clientes.add(limpiar_campos_clientes);

        eliminar_clientes = new JButton();
        eliminar_clientes.setBounds(460, 240, 120, 120);
        eliminar_clientes.setIcon(new ImageIcon(eliminar1.getImage().getScaledInstance(eliminar_clientes.getWidth(), eliminar_clientes.getHeight(), Image.SCALE_SMOOTH)));
        eliminar_clientes.addActionListener(this);
        panel_clientes.add(eliminar_clientes);

        regresar_clientes = new JButton("Regresar");
        regresar_clientes.setBounds(130, 240, 120, 120);
        regresar_clientes.setIcon(new ImageIcon(regresar1.getImage().getScaledInstance(regresar_clientes.getWidth(), regresar_clientes.getHeight(), Image.SCALE_SMOOTH)));
        regresar_clientes.addActionListener(this);
        panel_clientes.add(regresar_clientes);
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        //--------------------------------------------------panel de productos
        panel_productos = new JPanel();
        panel_productos.setLayout(null);
        panel_productos.setBounds(50, 50, 600, 400);
        panel_productos.setBackground(Color.GRAY);
        getContentPane().add(panel_productos);
        panel_productos.setVisible(false);

        Titulo_Productos = new JLabel("Productos");
        Titulo_Productos.setBounds(250, 0, 200, 30);
        Titulo_Productos.setForeground(Color.PINK);
        //Titulo_Tienda.setOpaque(true);
        Titulo_Productos.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        panel_productos.add(Titulo_Productos);

        nombre = new JLabel("Nombre");
        nombre.setBounds(20, 50, 80, 25);
        nombre.setForeground(Color.BLACK);
        nombre.setFont(new Font("Arial", Font.BOLD, 15));
        panel_productos.add(nombre);

        nombre_leer_p = new JTextField();
        nombre_leer_p.setBounds(100, 50, 200, 20);
        panel_productos.add(nombre_leer_p);

        Precio_Producto = new JLabel("Precio");
        Precio_Producto.setBounds(20, 80, 80, 25);
        Precio_Producto.setForeground(Color.BLACK);
        Precio_Producto.setFont(new Font("Arial", Font.BOLD, 15));
        panel_productos.add(Precio_Producto);

        Precio_Producto_leer = new JTextField();
        Precio_Producto_leer.setBounds(100, 80, 200, 20);
        panel_productos.add(Precio_Producto_leer);
        //Precio_Producto_leer, Cantidad_Producto_leer, buscar_productos, leer_b_productos
        Cantidad_Producto = new JLabel("Cantidad");
        Cantidad_Producto.setBounds(20, 110, 80, 25);
        Cantidad_Producto.setForeground(Color.BLACK);
        Cantidad_Producto.setFont(new Font("Arial", Font.BOLD, 15));
        panel_productos.add(Cantidad_Producto);

        Cantidad_Producto_leer = new JTextField();
        Cantidad_Producto_leer.setBounds(100, 110, 200, 20);
        panel_productos.add(Cantidad_Producto_leer);

        buscar_productos = new JButton("Buscar");
        buscar_productos.setBounds(320, 50, 100, 25);
        buscar_productos.setFont(new Font("Tahoma", Font.BOLD, 15));
        buscar_productos.addActionListener(this);
        panel_productos.add(buscar_productos);

        leer_b_productos = new JTextField();
        leer_b_productos.setBounds(425, 50, 150, 20);
        panel_productos.add(leer_b_productos);

        registrar_productos = new JButton();
        registrar_productos.setBounds(320, 100, 120, 120);
        registrar_productos.setIcon(new ImageIcon(agregar1.getImage().getScaledInstance(registrar_productos.getWidth(), registrar_productos.getHeight(), Image.SCALE_SMOOTH)));
        registrar_productos.addActionListener(this);
        panel_productos.add(registrar_productos);

        modificar_productos = new JButton();
        modificar_productos.setBounds(320, 240, 120, 120);
        modificar_productos.setIcon(new ImageIcon(modificar1.getImage().getScaledInstance(modificar_productos.getWidth(), modificar_productos.getHeight(), Image.SCALE_SMOOTH)));
        modificar_productos.addActionListener(this);
        panel_productos.add(modificar_productos);

        /*
        registrar_empleado.setBounds(320, 100, 120, 120);
        modificar_empleado.setBounds(320, 240, 120, 120);
        limpiar_campos_empleado.setBounds(460, 100, 120, 120);
        eliminar_empleado.setBounds(460, 240, 120, 120);
        regresar_empleados.setBounds(130, 240, 120, 120);
        
        /*
        registrar_empleado.setIcon(new ImageIcon(agregar1.getImage().getScaledInstance(registrar_empleado.getWidth(), registrar_empleado.getHeight(), Image.SCALE_SMOOTH)));
        modificar_empleado.setIcon(new ImageIcon(modificar1.getImage().getScaledInstance(modificar_empleado.getWidth(), modificar_empleado.getHeight(), Image.SCALE_SMOOTH)));
        limpiar_campos_empleado.setIcon(new ImageIcon(limpiar1.getImage().getScaledInstance(limpiar_campos_empleado.getWidth(), limpiar_campos_empleado.getHeight(), Image.SCALE_SMOOTH)));
        eliminar_empleado.setIcon(new ImageIcon(eliminar1.getImage().getScaledInstance(eliminar_empleado.getWidth(), eliminar_empleado.getHeight(), Image.SCALE_SMOOTH)));
        regresar_empleados.setIcon(new ImageIcon(regresar1.getImage().getScaledInstance(regresar_empleados.getWidth(), regresar_empleados.getHeight(), Image.SCALE_SMOOTH)));        
        
        
        
         */
        limpiar_campos_productos = new JButton();
        limpiar_campos_productos.setBounds(460, 100, 120, 120);
        limpiar_campos_productos.setIcon(new ImageIcon(limpiar1.getImage().getScaledInstance(limpiar_campos_productos.getWidth(), limpiar_campos_productos.getHeight(), Image.SCALE_SMOOTH)));
        limpiar_campos_productos.addActionListener(this);
        panel_productos.add(limpiar_campos_productos);

        eliminar_productos = new JButton();
        eliminar_productos.setBounds(460, 240, 120, 120);
        eliminar_productos.setIcon(new ImageIcon(eliminar1.getImage().getScaledInstance(eliminar_productos.getWidth(), eliminar_productos.getHeight(), Image.SCALE_SMOOTH)));
        eliminar_productos.addActionListener(this);
        panel_productos.add(eliminar_productos);

        regresar_productos = new JButton();
        regresar_productos.setBounds(130, 240, 120, 120);
        regresar_productos.setIcon(new ImageIcon(regresar1.getImage().getScaledInstance(regresar_productos.getWidth(), regresar_productos.getHeight(), Image.SCALE_SMOOTH)));
        regresar_productos.addActionListener(this);
        panel_productos.add(regresar_productos);
        /*
         private JLabel nombre, direccion, telefono, correo, id_Cliente, Fecha_nac, id_Empleado, NSS;
         private JLabel grado_Estudios, id_Producto, Precio_Producto, Cantidad_Producto, Fecha_Compra, Total_compra;
    
         */
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        //--------------------------------------------------panel de compras
        panel_compras = new JPanel();
        panel_compras.setLayout(null);
        panel_compras.setBounds(50, 50, 600, 400);
        panel_compras.setBackground(Color.GRAY);
        getContentPane().add(panel_compras);
        panel_compras.setVisible(false);

        Titulo_Compras = new JLabel("Compras");
        Titulo_Compras.setBounds(250, 0, 200, 30);
        Titulo_Compras.setForeground(Color.BLUE);
        //Titulo_Tienda.setOpaque(true);
        Titulo_Compras.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        panel_compras.add(Titulo_Compras);

        buscar_compra = new JButton("Buscar");
        buscar_compra.setBounds(340, 50, 100, 25);
        buscar_compra.setFont(new Font("Tahoma", Font.BOLD, 15));
        buscar_compra.addActionListener(this);
        panel_compras.add(buscar_compra);

        leer_b_compras = new JTextField();
        leer_b_compras.setBounds(445, 50, 150, 20);
        panel_compras.add(leer_b_compras);

        id_Producto = new JLabel("Id Producto");
        id_Producto.setBounds(20, 50, 100, 25);
        id_Producto.setForeground(Color.BLACK);
        id_Producto.setFont(new Font("Arial", Font.BOLD, 15));
        panel_compras.add(id_Producto);

        leer_id_pro = new JTextField();
        leer_id_pro.setBounds(120, 50, 200, 20);
        panel_compras.add(leer_id_pro);

        id_Empleado = new JLabel("Id Empleado");
        id_Empleado.setBounds(20, 80, 100, 25);
        id_Empleado.setForeground(Color.BLACK);
        id_Empleado.setFont(new Font("Arial", Font.BOLD, 15));
        panel_compras.add(id_Empleado);

        leer_id_emp = new JTextField();
        leer_id_emp.setBounds(120, 80, 200, 20);
        panel_compras.add(leer_id_emp);

        id_Cliente = new JLabel("id Cliente");
        id_Cliente.setBounds(20, 110, 100, 25);
        id_Cliente.setForeground(Color.BLACK);
        id_Cliente.setFont(new Font("Arial", Font.BOLD, 15));
        panel_compras.add(id_Cliente);

        leer_id_cli = new JTextField();
        leer_id_cli.setBounds(120, 110, 200, 20);
        panel_compras.add(leer_id_cli);

        Fecha_Compra = new JLabel("Fecha");
        Fecha_Compra.setBounds(20, 140, 100, 25);
        Fecha_Compra.setForeground(Color.BLACK);
        Fecha_Compra.setFont(new Font("Arial", Font.BOLD, 15));
        panel_compras.add(Fecha_Compra);

        Fecha_Compra_leer = new JTextField();
        Fecha_Compra_leer.setBounds(120, 140, 200, 20);
        panel_compras.add(Fecha_Compra_leer);

        //cantidad_p, leer_cantidad_compra
        cantidad_p = new JLabel("Cantidad");
        cantidad_p.setBounds(20, 170, 100, 25);
        cantidad_p.setForeground(Color.BLACK);
        cantidad_p.setFont(new Font("Arial", Font.BOLD, 15));
        panel_compras.add(cantidad_p);

        leer_cantidad_compra = new JTextField();
        leer_cantidad_compra.setBounds(120, 170, 200, 20);
        panel_compras.add(leer_cantidad_compra);

        Total_compra = new JLabel("Total");
        Total_compra.setBounds(20, 200, 100, 25);
        Total_compra.setForeground(Color.BLACK);
        Total_compra.setFont(new Font("Arial", Font.BOLD, 15));
        panel_compras.add(Total_compra);

        Total_compra_leer = new JTextField();
        Total_compra_leer.setBounds(120, 200, 200, 20);
        panel_compras.add(Total_compra_leer);

        // private id_Producto, id_Empleado, id_Cliente, id_Producto,   Fecha_Compra Total_compra, Fecha_Compra_leer, Total_compra_leer
        //registrar_compra, modificar_compra, eliminar_compra, limpiar_compra, buscar_compra, leer_b_compras;
        //leer_id_pro, leer_id_emp, leer_id_cli 
        registrar_compra = new JButton();
        registrar_compra.setBounds(340, 100, 120, 120);
        registrar_compra.setIcon(new ImageIcon(agregar1.getImage().getScaledInstance(registrar_compra.getWidth(), registrar_compra.getHeight(), Image.SCALE_SMOOTH)));
        registrar_compra.addActionListener(this);
        panel_compras.add(registrar_compra);

        modificar_compra = new JButton();
        modificar_compra.setBounds(340, 240, 120, 120);
        modificar_compra.setIcon(new ImageIcon(modificar1.getImage().getScaledInstance(modificar_compra.getWidth(), modificar_compra.getHeight(), Image.SCALE_SMOOTH)));
        modificar_compra.addActionListener(this);
        modificar_compra.setVisible(false);
        
        panel_compras.add(modificar_compra);

        limpiar_compra = new JButton();
        limpiar_compra.setBounds(480, 100, 120, 120);
        limpiar_compra.setIcon(new ImageIcon(limpiar1.getImage().getScaledInstance(limpiar_compra.getWidth(), limpiar_compra.getHeight(), Image.SCALE_SMOOTH)));
        limpiar_compra.addActionListener(this);
        
        panel_compras.add(limpiar_compra);

        eliminar_compra = new JButton();
        eliminar_compra.setBounds(480, 240, 120, 120);
        eliminar_compra.setIcon(new ImageIcon(eliminar1.getImage().getScaledInstance(eliminar_compra.getWidth(), eliminar_compra.getHeight(), Image.SCALE_SMOOTH)));
        eliminar_compra.addActionListener(this);
        panel_compras.add(eliminar_compra);
        eliminar_compra.setVisible(false);

        regresar_compras = new JButton();
        regresar_compras.setBounds(130, 240, 120, 120);
        regresar_compras.setOpaque(true);
        regresar_compras.setIcon(new ImageIcon(regresar1.getImage().getScaledInstance(regresar_compras.getWidth(), regresar_compras.getHeight(), Image.SCALE_SMOOTH)));
        regresar_compras.addActionListener(this);
        panel_compras.add(regresar_compras);

        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        //---------------------------------------------------------------------
        setSize(700, 500);
        getContentPane().setBackground(Color.BLACK);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        Muebleria_Pearl mp = new Muebleria_Pearl();

        mp.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        ////private JButton empleados, clientes, productos, compras;
        if (ae.getSource() == empleados) {
            panel_inicio.setVisible(false);
            panel_empleados.setVisible(true);
        }
        if (ae.getSource() == regresar_empleados) {
            panel_empleados.setVisible(false);
            panel_inicio.setVisible(true);
        }
        if (ae.getSource() == clientes) {
            panel_inicio.setVisible(false);
            panel_clientes.setVisible(true);
        }
        if (ae.getSource() == regresar_clientes) {
            panel_clientes.setVisible(false);
            panel_inicio.setVisible(true);
        }
        if (ae.getSource() == productos) {
            panel_inicio.setVisible(false);
            panel_productos.setVisible(true);
        }
        if (ae.getSource() == regresar_productos) {
            panel_productos.setVisible(false);
            panel_inicio.setVisible(true);
        }
        if (ae.getSource() == compras) {
            panel_inicio.setVisible(false);
            panel_compras.setVisible(true);
        }
        if (ae.getSource() == regresar_compras) {
            panel_compras.setVisible(false);
            panel_inicio.setVisible(true);
        }
        //--------------------------------------------botones de empleado
        if (ae.getSource() == buscar_empleado) {
            Connection conexion = null;

            try {
                conexion = getConnection1();

                ps = conexion.prepareStatement("select * from empleado where idEmpleado=?");
                ps.setString(1, leer_b_empleado.getText());
                rs = ps.executeQuery();

                if (rs.next()) {
                    leer_b_empleado.setText(String.valueOf(rs.getInt("idEmpleado")));
                    nombre_leer_e.setText(rs.getString("Nombre_e"));
                    NSS_leer.setText(rs.getString("NSS"));
                    direccion_leer_e.setText(rs.getString("Direccion_e"));
                    correo_leer_e.setText(rs.getString("Correo_e"));
                    telefono_leer_e.setText(String.valueOf(rs.getInt("Telefono_e")));
                    grado_estudios_leer.setText(rs.getString("Estudios_e"));
                    // parafdn.setText(String.valueOf(rs.getDate("fecha_nacimiento")));
                } else {
                    JOptionPane.showMessageDialog(null, "No existe persona con esa clave");
                }

            } catch (Exception ex) {
                System.out.println("Error: " + ex);
            }
        }
        if (ae.getSource() == registrar_empleado) {

            Connection conexion = null;

            try {

                conexion = getConnection1();
                ps = conexion.prepareStatement("insert into empleado(Nombre_e, NSS, Direccion_e, Correo_e, Telefono_e, Estudios_e) values (?, ?, ?, ?, ?, ?)");
                ps.setString(1, nombre_leer_e.getText());
                ps.setString(2, NSS_leer.getText());
                ps.setString(3, direccion_leer_e.getText());
                ps.setString(4, correo_leer_e.getText());
                ps.setInt(5, Integer.parseInt(telefono_leer_e.getText()));
                ps.setString(6, grado_estudios_leer.getText());

                // se ejecuta la insercion dentro de la base de datos 
                int resultado = ps.executeUpdate();

                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
                    // limpiarcajas();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al insertar el registro");
                }
                conexion.close();

            } catch (Exception ex) {
                System.out.println("erro: " + ex);
            }

        }
        if (ae.getSource() == modificar_empleado) {

            Connection conexion = null;

            try {

                conexion = getConnection1();
                ps = conexion.prepareStatement("update empleado set Nombre_e=?, NSS=?, Direccion_e=?, Correo_e=?, Telefono_e=?, Estudios_e=? where idEmpleado=?");
                ps.setString(1, nombre_leer_e.getText());
                ps.setString(2, NSS_leer.getText());
                ps.setString(3, direccion_leer_e.getText());
                ps.setString(4, correo_leer_e.getText());
                ps.setInt(5, Integer.parseInt(telefono_leer_e.getText()));
                ps.setString(6, grado_estudios_leer.getText());
                ps.setInt(7, Integer.parseInt(leer_b_empleado.getText()));
                //ps.setDate(3, Date.valueOf(parafdn.getText()));
                // ps.setInt(4, Integer.parseInt(extra_id.getText()));

                // se ejecuta la modificacion dentro de la base de datos 
                int resultado = ps.executeUpdate();

                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
                    //limpiarcajas();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al modifcar el registro");
                }
                conexion.close();

            } catch (Exception ex) {
                System.out.println("erro: " + ex);
            }

        }
        if (ae.getSource() == eliminar_empleado) {

            Connection conexion = null;

            try {

                conexion = getConnection1();
                ps = conexion.prepareStatement("delete from empleado where idEmpleado=?");

                ps.setInt(1, Integer.parseInt(leer_b_empleado.getText()));

                // se ejecuta la eliminacion dentro de la base de datos 
                int resultado = ps.executeUpdate();

                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
                    //limpiarcajas();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
                    //limpiarcajas();
                }
                conexion.close();

            } catch (Exception ex) {
                System.out.println("erro: " + ex);
            }

        }

        if (ae.getSource() == limpiar_campos_empleado) {
            //nombre_leer, direccion_leer, telefono_leer, correo_leer, fecha_nac_leer, leer_b_empleado
            nombre_leer_e.setText(null);
            direccion_leer_e.setText(null);
            telefono_leer_e.setText(null);
            correo_leer_e.setText(null);
            NSS_leer.setText(null);
            grado_estudios_leer.setText(null);
            leer_b_empleado.setText(null);
        }

        //----------------------------------------------------------------
        /*
        private JButton registrar_empleado, modificar_empleado, eliminar_empleado, limpiar_campos_empleado;
        private JButton registrar_clientes, modificar_clientes, eliminar_clientes, limpiar_campos_clientes;
        private JButton registrar_productos, modificar_productos, eliminar_productos, limpiar_campos_productos;
        private JButton registrar_compra, modificar_compra, eliminar_compra, limpiar_compra;
        private JButton buscar_empleado, buscar_cliente, buscar_productos, buscar_compra;
         */
        //----------------------------------------------------botones de cliente 
        if (ae.getSource() == buscar_cliente) {
            Connection conexion = null;

            try {
                conexion = getConnection1();

                ps = conexion.prepareStatement("select * from cliente where idCliente=?");
                ps.setString(1, leer_b_clientes.getText());
                rs = ps.executeQuery();

                if (rs.next()) {
                    leer_b_clientes.setText(String.valueOf(rs.getInt("idCliente")));
                    nombre_leer_c.setText(rs.getString("Nombre_c"));
                    fecha_nac_leer.setText(String.valueOf(rs.getDate("Fecha_Nacimiento")));
                    direccion_leer.setText(rs.getString("Direccion_c"));
                    correo_leer.setText(rs.getString("Correo_c"));
                    telefono_leer.setText(String.valueOf(rs.getInt("Telefono_c")));

                    // parafdn.setText(String.valueOf(rs.getDate("fecha_nacimiento")));
                } else {
                    JOptionPane.showMessageDialog(null, "No existe persona con esa clave");
                }

            } catch (Exception ex) {
                System.out.println("Error: " + ex);
            }
        }
        if (ae.getSource() == registrar_clientes) {

            Connection conexion = null;

            try {

                conexion = getConnection1();
                ps = conexion.prepareStatement("insert into cliente(Nombre_c, Fecha_Nacimiento, Direccion_c, Correo_c, Telefono_c) values (?, ?, ?, ?, ?)");
                ps.setString(1, nombre_leer_c.getText());
                ps.setDate(2, Date.valueOf(fecha_nac_leer.getText()));
                ps.setString(3, direccion_leer.getText());
                ps.setString(4, correo_leer.getText());
                ps.setInt(5, Integer.parseInt(telefono_leer.getText()));

                // se ejecuta la insercion dentro de la base de datos 
                int resultado = ps.executeUpdate();

                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
                    // limpiarcajas();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al insertar el registro");
                }
                conexion.close();

            } catch (Exception ex) {
                System.out.println("erro: " + ex);
            }

        }
        if (ae.getSource() == modificar_clientes) {

            Connection conexion = null;

            try {

                conexion = getConnection1();
                ps = conexion.prepareStatement("update cliente set Nombre_c=?, Fecha_Nacimiento=?, Direccion_c=?, Correo_c=?, Telefono_c=? where idCliente=?");
                ps.setString(1, nombre_leer_c.getText());
                ps.setDate(2, Date.valueOf(fecha_nac_leer.getText()));
                ps.setString(3, direccion_leer.getText());
                ps.setString(4, correo_leer.getText());
                ps.setInt(5, Integer.parseInt(telefono_leer.getText()));
                ps.setInt(6, Integer.parseInt(leer_b_clientes.getText()));
                //ps.setDate(3, Date.valueOf(parafdn.getText()));
                // ps.setInt(4, Integer.parseInt(extra_id.getText()));

                // se ejecuta la modificacion dentro de la base de datos 
                int resultado = ps.executeUpdate();

                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
                    //limpiarcajas();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al modifcar el registro");
                }
                conexion.close();

            } catch (Exception ex) {
                System.out.println("erro: " + ex);
            }

        }
        if (ae.getSource() == eliminar_clientes) {

            Connection conexion = null;

            try {

                conexion = getConnection1();
                ps = conexion.prepareStatement("delete from cliente where idCliente=?");

                ps.setInt(1, Integer.parseInt(leer_b_clientes.getText()));

                // se ejecuta la eliminacion dentro de la base de datos 
                int resultado = ps.executeUpdate();

                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
                    //limpiarcajas();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
                    //limpiarcajas();
                }
                conexion.close();

            } catch (Exception ex) {
                System.out.println("erro: " + ex);
            }

        }

        if (ae.getSource() == limpiar_campos_clientes) {
            //nombre_leer, direccion_leer, telefono_leer, correo_leer, fecha_nac_leer, leer_b_empleado
            nombre_leer_c.setText(null);
            direccion_leer.setText(null);
            telefono_leer.setText(null);
            correo_leer.setText(null);
            fecha_nac_leer.setText(null);
            leer_b_clientes.setText(null);
        }

        //-----------------------------------------------------------------------
        //--------------------------------------------------------botones de productos 
        if (ae.getSource() == buscar_productos) {
            Connection conexion = null;

            try {
                conexion = getConnection1();

                ps = conexion.prepareStatement("select * from producto where idProducto=?");
                ps.setString(1, leer_b_productos.getText());
                rs = ps.executeQuery();

                if (rs.next()) {
                    leer_b_productos.setText(String.valueOf(rs.getInt("idProducto")));
                    nombre_leer_p.setText(rs.getString("Nombre"));
                    Cantidad_Producto_leer.setText(rs.getString("Cantidad"));
                    Precio_Producto_leer.setText(String.valueOf(rs.getInt("Precio")));

                    // parafdn.setText(String.valueOf(rs.getDate("fecha_nacimiento")));
                } else {
                    JOptionPane.showMessageDialog(null, "No existe persona con esa clave");
                }

            } catch (Exception ex) {
                System.out.println("Error: " + ex);
            }
        }

        if (ae.getSource() == registrar_productos) {

            Connection conexion = null;

            try {

                conexion = getConnection1();
                ps = conexion.prepareStatement("insert into producto(Precio, Cantidad, Nombre) values (?, ?, ?)");
                ps.setInt(1, Integer.parseInt(Precio_Producto_leer.getText()));
                ps.setInt(2, Integer.parseInt(Cantidad_Producto_leer.getText()));
                ps.setString(3, nombre_leer_p.getText());

                // se ejecuta la insercion dentro de la base de datos 
                int resultado = ps.executeUpdate();

                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
                    // limpiarcajas();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al insertar el registro");
                }
                conexion.close();

            } catch (Exception ex) {
                System.out.println("erro: " + ex);
            }

        }
        if (ae.getSource() == modificar_productos) {

            Connection conexion = null;

            try {

                conexion = getConnection1();
                ps = conexion.prepareStatement("update producto set Precio=?, Cantidad=?, Nombre=? where idProducto=?");
                ps.setInt(1, Integer.parseInt(Precio_Producto_leer.getText()));
                ps.setInt(2, Integer.parseInt(Cantidad_Producto_leer.getText()));
                ps.setString(3, nombre_leer_p.getText());
                ps.setInt(4, Integer.parseInt(leer_b_productos.getText()));
                //ps.setDate(3, Date.valueOf(parafdn.getText()));
                // ps.setInt(4, Integer.parseInt(extra_id.getText()));

                // se ejecuta la modificacion dentro de la base de datos 
                int resultado = ps.executeUpdate();

                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
                    //limpiarcajas();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al modifcar el registro");
                }
                conexion.close();

            } catch (Exception ex) {
                System.out.println("erro: " + ex);
            }

        }
        if (ae.getSource() == eliminar_productos) {

            Connection conexion = null;

            try {

                conexion = getConnection1();
                ps = conexion.prepareStatement("delete from producto where idProducto=?");

                ps.setInt(1, Integer.parseInt(leer_b_productos.getText()));

                // se ejecuta la eliminacion dentro de la base de datos 
                int resultado = ps.executeUpdate();

                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
                    //limpiarcajas();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el registro");
                    //limpiarcajas();
                }
                conexion.close();

            } catch (Exception ex) {
                System.out.println("erro: " + ex);
            }

        }

        if (ae.getSource() == limpiar_campos_productos) {
            //Precio_Producto_leer, Cantidad_Producto_leer, buscar_productos, leer_b_productos
            nombre_leer_p.setText(null);
            Precio_Producto_leer.setText(null);
            Cantidad_Producto_leer.setText(null);
            //buscar_productos.setText(null);
            leer_b_productos.setText(null);
        }
        //----------------------------------------------------------------------------

        //------------------------------------------------------botones compra
        if (ae.getSource() == buscar_compra) {
            Connection conexion = null;

            try {
                conexion = getConnection1();

                ps = conexion.prepareStatement("select * from compra where idCompra=?");
                ps.setString(1, leer_b_compras.getText());
                rs = ps.executeQuery();
                //  //idCliente, idProducto, idEmpleado, Fecha_c, Cantidad_p, Total_c
                if (rs.next()) {
                    leer_b_compras.setText(String.valueOf(rs.getInt("idCompra")));
                    leer_id_cli.setText(String.valueOf(rs.getInt("idCliente")));
                    leer_id_pro.setText(String.valueOf(rs.getInt("idProducto")));
                    leer_id_emp.setText(String.valueOf(rs.getInt("idEmpleado")));
                    Fecha_Compra_leer.setText(String.valueOf(rs.getDate("Fecha_c")));
                    leer_cantidad_compra.setText(String.valueOf(rs.getInt("Cantidad_p")));
                    Total_compra_leer.setText(String.valueOf(rs.getInt("Total_c")));

                    // parafdn.setText(String.valueOf(rs.getDate("fecha_nacimiento")));
                } else {
                    JOptionPane.showMessageDialog(null, "No existe persona con esa clave");
                }

            } catch (Exception ex) {
                System.out.println("Error: " + ex);
            }
        }
        
        
        if (ae.getSource() == registrar_compra) {

            Connection conexion = null;

            try {

                conexion = getConnection1();
                ps = conexion.prepareStatement("insert into compra(idCliente, idProducto, idEmpleado, Fecha_c, Cantidad_p, Total_c) values (?, ?, ?, ?, ?, ?)");
                ps.setInt(1, Integer.parseInt(leer_id_cli.getText()));
                ps.setInt(2, Integer.parseInt(leer_id_pro.getText()));
                ps.setInt(3, Integer.parseInt(leer_id_emp.getText()));
                ps.setDate(4, Date.valueOf(Fecha_Compra_leer.getText()));
                ps.setInt(5, Integer.parseInt(leer_cantidad_compra.getText()));
                ps.setInt(6, Integer.parseInt(Total_compra_leer.getText()));

                ps2 = conexion.prepareStatement("insert into atencion(idCliente, idEmpleado, Fecha_a) values (?, ?, ?)");
                ps2.setInt(1, Integer.parseInt(leer_id_cli.getText()));
                ps2.setInt(2, Integer.parseInt(leer_id_emp.getText()));
                ps2.setDate(3, Date.valueOf(Fecha_Compra_leer.getText()));

                ps4 = conexion.prepareStatement("select * from producto where idProducto=?");
                ps4.setString(1, leer_id_pro.getText());
                rs4 = ps4.executeQuery();
                ps3 = conexion.prepareStatement("update producto set  Cantidad=? where idProducto=?");
                if (rs4.next()) {
                    ps3.setInt(1, (rs4.getInt("Cantidad") - Integer.parseInt(leer_cantidad_compra.getText())));
                    ps3.setInt(2, Integer.parseInt(leer_id_pro.getText()));
                }

                /*
                 Connection conexion = null;
              
              
              try{
                  conexion = getConnection1();
                  
                  ps = conexion.prepareStatement("select * from producto where idProducto=?");
                  ps.setString(1, leer_b_productos.getText());
                  rs = ps.executeQuery();
                  
                  if (rs.next()) {
                      leer_b_productos.setText(String.valueOf(rs.getInt("idProducto")));
                      nombre_leer_p.setText(rs.getString("Nombre"));
                      Cantidad_Producto_leer.setText(rs.getString("Cantidad"));
                      Precio_Producto_leer.setText(String.valueOf(rs.getInt("Precio")));
                      
                     // parafdn.setText(String.valueOf(rs.getDate("fecha_nacimiento")));
                  }else{
                      JOptionPane.showMessageDialog(null, "No existe persona con esa clave");
                  }
                
                conexion = getConnection1();
                ps = conexion.prepareStatement("update producto set Precio=?, Cantidad=?, Nombre=? where idProducto=?");
                ps.setInt(1, Integer.parseInt(Precio_Producto_leer.getText()));
                ps.setInt(2, Integer.parseInt(Cantidad_Producto_leer.getText()));
                ps.setString(3, nombre_leer_p.getText());
                ps.setInt(4, Integer.parseInt(leer_b_productos.getText()));
                
                 */
                // se ejecuta la insercion dentro de la base de datos 
                int resultado = ps.executeUpdate();
                int resultad2 = ps2.executeUpdate();
                int resultado3 = ps3.executeUpdate();
                if (resultado > 0 && resultad2 > 0 && resultado3 > 0) {
                    JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
                    // limpiarcajas();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al insertar el registro");
                }
                conexion.close();

            } catch (Exception ex) {
                System.out.println("erro: " + ex);
            }

        }
        if (ae.getSource() == modificar_compra) {
            Connection conexion = null;
            try {
                                                   //idCliente, idProducto, idEmpleado, Fecha_c, Cantidad_p, Total_c
                conexion = getConnection1();
                ps = conexion.prepareStatement("update compra set idCliente=?, idProducto=?, idEmpleado=?, Fecha_c=?,Cantidad_p=?, Total_c=?  where idProducto=?");
                ps.setInt(1, Integer.parseInt(leer_id_cli.getText()));
                ps.setInt(2, Integer.parseInt(leer_id_pro.getText()));
                ps.setInt(3, Integer.parseInt(leer_id_emp.getText()));//
                ps.setDate(4, Date.valueOf(Fecha_Compra_leer.getText()));
                ps.setInt(5, Integer.parseInt(leer_cantidad_compra.getText()));
                ps.setInt(6, Integer.parseInt(Total_compra_leer.getText()));
                ps.setInt(7, Integer.parseInt(leer_b_compras.getText()));
                
              /*  ps2 = conexion.prepareStatement("update  atencion set idCliente=?, idEmpleado=?, Fecha_a=? values (?, ?, ?)");
                ps2.setInt(1, Integer.parseInt(leer_id_cli.getText()));
                ps2.setInt(2, Integer.parseInt(leer_id_emp.getText()));
                ps2.setDate(3, Date.valueOf(Fecha_Compra_leer.getText()));
             */

                // se ejecuta la modificacion dentro de la base de datos 
                int resultado = ps.executeUpdate();

                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
                    //limpiarcajas();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al modifcar el registro");
                }
                conexion.close();

            } catch (Exception ex) {
                System.out.println("erro: " + ex);
            }

        }
        if (ae.getSource() == eliminar_compra) {

        }

        if (ae.getSource() == limpiar_compra) {
            // private id_Producto, id_Empleado, id_Cliente, id_Producto,   Fecha_Compra Total_compra, Fecha_Compra_leer, Total_compra_leer
            //registrar_compra, modificar_compra, eliminar_compra, limpiar_compra, buscar_compra, leer_b_compras;
            //leer_id_pro, leer_id_emp, leer_id_cli 
            leer_id_pro.setText(null);
            leer_id_emp.setText(null);
            leer_id_cli.setText(null);
            leer_b_compras.setText(null);
            Fecha_Compra_leer.setText(null);
            leer_cantidad_compra.setText(null);
            Total_compra_leer.setText(null);

        }

        //--------------------------------------------------------------------------
    }

    public void limpiarcampos() {
        //nombre_leer.setText(null);
        direccion_leer.setText(null);
        telefono_leer.setText(null);
        correo_leer.setText(null);
    }

    public Connection getConnection1() {
        Connection conexion = null;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL1, usuario, contraseña);
            //  JOptionPane.showMessageDialog(this, "Conexion exitosa ");
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
        return conexion;
    }

}

/*
Alcachofa
asdsdf
Sandia
qwer@rewq
83123
Tecnico


Aladeen 
boom
Guadiya 
alu@akbar
83166
Dicta





 */
