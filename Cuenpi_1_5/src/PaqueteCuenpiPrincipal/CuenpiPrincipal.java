package PaqueteCuenpiPrincipal;

public class CuenpiPrincipal extends javax.swing.JFrame {


    public CuenpiPrincipal() {
        initComponents();
        setSize(1366, 700);
        //this.getContentPane().add(panelPersonasRegistrar);
        panelPersonasRegistrar.setVisible(false);
        panelProductosRegistrar.setVisible(false);
        setLocationRelativeTo (null);
        
        grupoRegistrarPrecioProducto.add(radioBotonRegistroPrecioAutomatico);
        grupoRegistrarPrecioProducto.add(radioBotonRegistroPrecioManual);
        grupoActivarPanelesRegistroPersonas.add(radioBotonActivarRegistroClientes);
        grupoActivarPanelesRegistroPersonas.add(radioBotonActivarRegistroProveedores);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        grupoRegistrarPrecioProducto = new javax.swing.ButtonGroup();
        grupoActivarPanelesRegistroPersonas = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        panelMenuPrincipal = new javax.swing.JPanel();
        etiquetaTituloMenuPrincipal = new javax.swing.JLabel();
        panelBotonesPrincipales = new javax.swing.JPanel();
        botonPersonasPrincipal = new javax.swing.JButton();
        botonProductosPrincipal = new javax.swing.JButton();
        botonMovimientosPrincipal = new javax.swing.JButton();
        etiquetaPersonasPrincipal = new javax.swing.JLabel();
        etiquetaProductosPrincipal = new javax.swing.JLabel();
        etiquetaMovimientosPrincipal = new javax.swing.JLabel();
        etiquetaColorFondoMenuPrincipal = new javax.swing.JLabel();
        panelPersonasRegistrar = new javax.swing.JPanel();
        radioBotonActivarRegistroClientes = new javax.swing.JRadioButton();
        radioBotonActivarRegistroProveedores = new javax.swing.JRadioButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        etiquetaPersonasRegistrar = new javax.swing.JLabel();
        etiquetaDatosClientes = new javax.swing.JLabel();
        panelRegistrarDatosCliente = new javax.swing.JPanel();
        etiquetaRegistrarNombreCliente = new javax.swing.JLabel();
        etiquetaRegistrarAliasCliente = new javax.swing.JLabel();
        etiquetaRegistrarTelefonoCliente = new javax.swing.JLabel();
        etiquetaRegistrarDirecciónCliente = new javax.swing.JLabel();
        cajaRegistrarNombreCliente = new javax.swing.JTextField();
        cajaRegistrarAliasCliente = new javax.swing.JTextField();
        cajaRegistrarTelefonoCliente = new javax.swing.JTextField();
        cajaRegistrarDirecciónCliente = new javax.swing.JTextField();
        panelBotonesRegistrarClientes = new javax.swing.JPanel();
        botonLimpiarDatosCliente = new javax.swing.JButton();
        botonAgregarDatosCliente = new javax.swing.JButton();
        etiquetaDatosProveedores = new javax.swing.JLabel();
        panelRegistrarDatosProveedor = new javax.swing.JPanel();
        etiquetaRegistrarDatosProveedor = new javax.swing.JLabel();
        etiquetaRegistrarTelefonoProveedor = new javax.swing.JLabel();
        etiquetaRegistrarAliasProveedor = new javax.swing.JLabel();
        cajaRegistrarNombreProveedor = new javax.swing.JTextField();
        cajaRegistrarTelefonoProveedor = new javax.swing.JTextField();
        cajaRegistrarAliasProveedor = new javax.swing.JTextField();
        panelBotonesRegistrarProveedor = new javax.swing.JPanel();
        botonLimpiarDatosProveedor = new javax.swing.JButton();
        botonRegistrarDatosProveedor = new javax.swing.JButton();
        botonRegresarPersonas = new javax.swing.JButton();
        etiquetaColorFondoMenuRegistrarPersonas = new javax.swing.JLabel();
        panelProductosRegistrar = new javax.swing.JPanel();
        etiquetaProductosRegistrar = new javax.swing.JLabel();
        panelRegistrarDatosProductos = new javax.swing.JPanel();
        etiquetaRegistrarCodigoProducto = new javax.swing.JLabel();
        etiquetaRegistrarCantidadProducto = new javax.swing.JLabel();
        etiquetaRegistrarPrecioC = new javax.swing.JLabel();
        etiquetaRegistrarPrecioV = new javax.swing.JLabel();
        cajaRegistrarCodigoProducto = new javax.swing.JTextField();
        cajaRegistrarCantidadProducto = new javax.swing.JTextField();
        cajaRegistrarPrecioC = new javax.swing.JTextField();
        cajaRegistrarPrecioV = new javax.swing.JTextField();
        etiquetaRegistrarMarcaProducto = new javax.swing.JLabel();
        etiquetaRegistrarTallaProducto = new javax.swing.JLabel();
        etiquetaRegistrarProveedorProducto = new javax.swing.JLabel();
        etiquetaRegistrarColorProducto = new javax.swing.JLabel();
        cajaRegistrarMarcaProducto = new javax.swing.JTextField();
        cajaRegistrarTallaProducto = new javax.swing.JTextField();
        cajaRegistrarColorProducto = new javax.swing.JTextField();
        comboRegistrarProveedorProducto = new javax.swing.JComboBox<>();
        etiquetaRegistrarObservacionesProducto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTextoRegistrarObservacionesProducto = new javax.swing.JTextArea();
        radioBotonRegistroPrecioAutomatico = new javax.swing.JRadioButton();
        radioBotonRegistroPrecioManual = new javax.swing.JRadioButton();
        cajaRegistrarCambioPrecioVentaProducto = new javax.swing.JTextField();
        botonRegistroAplicarPrecio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMenuPrincipal.setPreferredSize(new java.awt.Dimension(1366, 700));
        panelMenuPrincipal.setLayout(new java.awt.GridBagLayout());

        etiquetaTituloMenuPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTituloMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Titulo_Nombre_Recortada_sin_fondo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelMenuPrincipal.add(etiquetaTituloMenuPrincipal, gridBagConstraints);

        panelBotonesPrincipales.setOpaque(false);
        panelBotonesPrincipales.setLayout(new java.awt.GridBagLayout());

        botonPersonasPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Personas_Sin_Fondo.png"))); // NOI18N
        botonPersonasPrincipal.setOpaque(false);
        botonPersonasPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPersonasPrincipalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelBotonesPrincipales.add(botonPersonasPrincipal, gridBagConstraints);

        botonProductosPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Productos_sin_fondo.png"))); // NOI18N
        botonProductosPrincipal.setOpaque(false);
        botonProductosPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProductosPrincipalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelBotonesPrincipales.add(botonProductosPrincipal, gridBagConstraints);

        botonMovimientosPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Movimientos_sin_fondo.png"))); // NOI18N
        botonMovimientosPrincipal.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelBotonesPrincipales.add(botonMovimientosPrincipal, gridBagConstraints);

        etiquetaPersonasPrincipal.setFont(new java.awt.Font("Edwardian Script ITC", 0, 70)); // NOI18N
        etiquetaPersonasPrincipal.setForeground(new java.awt.Color(0, 204, 0));
        etiquetaPersonasPrincipal.setText("Personas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelBotonesPrincipales.add(etiquetaPersonasPrincipal, gridBagConstraints);

        etiquetaProductosPrincipal.setFont(new java.awt.Font("Edwardian Script ITC", 0, 70)); // NOI18N
        etiquetaProductosPrincipal.setForeground(new java.awt.Color(255, 51, 153));
        etiquetaProductosPrincipal.setText("Productos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelBotonesPrincipales.add(etiquetaProductosPrincipal, gridBagConstraints);

        etiquetaMovimientosPrincipal.setFont(new java.awt.Font("Edwardian Script ITC", 0, 70)); // NOI18N
        etiquetaMovimientosPrincipal.setForeground(new java.awt.Color(204, 204, 0));
        etiquetaMovimientosPrincipal.setText("Movimientos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelBotonesPrincipales.add(etiquetaMovimientosPrincipal, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelMenuPrincipal.add(panelBotonesPrincipales, gridBagConstraints);

        etiquetaColorFondoMenuPrincipal.setForeground(new java.awt.Color(60, 63, 65));
        etiquetaColorFondoMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoMenuPrincipal_2.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        panelMenuPrincipal.add(etiquetaColorFondoMenuPrincipal, gridBagConstraints);

        panelPersonasRegistrar.setMinimumSize(new java.awt.Dimension(1366, 720));
        panelPersonasRegistrar.setPreferredSize(new java.awt.Dimension(1366, 700));
        panelPersonasRegistrar.setLayout(new java.awt.GridBagLayout());

        radioBotonActivarRegistroClientes.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        radioBotonActivarRegistroClientes.setSelected(true);
        radioBotonActivarRegistroClientes.setText("Activado ");
        radioBotonActivarRegistroClientes.setOpaque(false);
        radioBotonActivarRegistroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBotonActivarRegistroClientesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        panelPersonasRegistrar.add(radioBotonActivarRegistroClientes, gridBagConstraints);

        radioBotonActivarRegistroProveedores.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        radioBotonActivarRegistroProveedores.setText("Desactivado");
        radioBotonActivarRegistroProveedores.setOpaque(false);
        radioBotonActivarRegistroProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBotonActivarRegistroProveedoresActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        panelPersonasRegistrar.add(radioBotonActivarRegistroProveedores, gridBagConstraints);

        jToggleButton1.setText("jToggleButton1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        panelPersonasRegistrar.add(jToggleButton1, gridBagConstraints);

        jToggleButton2.setText("jToggleButton2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        panelPersonasRegistrar.add(jToggleButton2, gridBagConstraints);

        etiquetaPersonasRegistrar.setFont(new java.awt.Font("Edwardian Script ITC", 1, 55)); // NOI18N
        etiquetaPersonasRegistrar.setForeground(new java.awt.Color(118, 255, 3));
        etiquetaPersonasRegistrar.setText("Personas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        panelPersonasRegistrar.add(etiquetaPersonasRegistrar, gridBagConstraints);

        etiquetaDatosClientes.setFont(new java.awt.Font("Times New Roman", 2, 42)); // NOI18N
        etiquetaDatosClientes.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaDatosClientes.setText("Clientes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        panelPersonasRegistrar.add(etiquetaDatosClientes, gridBagConstraints);

        panelRegistrarDatosCliente.setOpaque(false);
        panelRegistrarDatosCliente.setLayout(new java.awt.GridBagLayout());

        etiquetaRegistrarNombreCliente.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaRegistrarNombreCliente.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosCliente.add(etiquetaRegistrarNombreCliente, gridBagConstraints);

        etiquetaRegistrarAliasCliente.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaRegistrarAliasCliente.setText("Alias");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosCliente.add(etiquetaRegistrarAliasCliente, gridBagConstraints);

        etiquetaRegistrarTelefonoCliente.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaRegistrarTelefonoCliente.setText("Teléfono");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosCliente.add(etiquetaRegistrarTelefonoCliente, gridBagConstraints);

        etiquetaRegistrarDirecciónCliente.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaRegistrarDirecciónCliente.setText("Dirección");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosCliente.add(etiquetaRegistrarDirecciónCliente, gridBagConstraints);

        cajaRegistrarNombreCliente.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cajaRegistrarNombreCliente.setToolTipText("");
        cajaRegistrarNombreCliente.setPreferredSize(new java.awt.Dimension(315, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosCliente.add(cajaRegistrarNombreCliente, gridBagConstraints);

        cajaRegistrarAliasCliente.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cajaRegistrarAliasCliente.setPreferredSize(new java.awt.Dimension(315, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosCliente.add(cajaRegistrarAliasCliente, gridBagConstraints);

        cajaRegistrarTelefonoCliente.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cajaRegistrarTelefonoCliente.setPreferredSize(new java.awt.Dimension(315, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosCliente.add(cajaRegistrarTelefonoCliente, gridBagConstraints);

        cajaRegistrarDirecciónCliente.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cajaRegistrarDirecciónCliente.setToolTipText("");
        cajaRegistrarDirecciónCliente.setPreferredSize(new java.awt.Dimension(315, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosCliente.add(cajaRegistrarDirecciónCliente, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        panelPersonasRegistrar.add(panelRegistrarDatosCliente, gridBagConstraints);

        panelBotonesRegistrarClientes.setOpaque(false);
        panelBotonesRegistrarClientes.setLayout(new java.awt.GridBagLayout());

        botonLimpiarDatosCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonLimpiar_1.png"))); // NOI18N
        botonLimpiarDatosCliente.setPreferredSize(new java.awt.Dimension(130, 130));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panelBotonesRegistrarClientes.add(botonLimpiarDatosCliente, gridBagConstraints);

        botonAgregarDatosCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonAgregarClientes.png"))); // NOI18N
        botonAgregarDatosCliente.setPreferredSize(new java.awt.Dimension(130, 130));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panelBotonesRegistrarClientes.add(botonAgregarDatosCliente, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 600, 5, 10);
        panelPersonasRegistrar.add(panelBotonesRegistrarClientes, gridBagConstraints);

        etiquetaDatosProveedores.setFont(new java.awt.Font("Times New Roman", 2, 42)); // NOI18N
        etiquetaDatosProveedores.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaDatosProveedores.setText("Proveedores");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 0);
        panelPersonasRegistrar.add(etiquetaDatosProveedores, gridBagConstraints);

        panelRegistrarDatosProveedor.setOpaque(false);
        panelRegistrarDatosProveedor.setEnabled(false);
        panelRegistrarDatosProveedor.setLayout(new java.awt.GridBagLayout());

        etiquetaRegistrarDatosProveedor.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaRegistrarDatosProveedor.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProveedor.add(etiquetaRegistrarDatosProveedor, gridBagConstraints);

        etiquetaRegistrarTelefonoProveedor.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaRegistrarTelefonoProveedor.setText("Teléfono");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProveedor.add(etiquetaRegistrarTelefonoProveedor, gridBagConstraints);

        etiquetaRegistrarAliasProveedor.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaRegistrarAliasProveedor.setText("Alias");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProveedor.add(etiquetaRegistrarAliasProveedor, gridBagConstraints);

        cajaRegistrarNombreProveedor.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cajaRegistrarNombreProveedor.setEnabled(false);
        cajaRegistrarNombreProveedor.setPreferredSize(new java.awt.Dimension(315, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProveedor.add(cajaRegistrarNombreProveedor, gridBagConstraints);

        cajaRegistrarTelefonoProveedor.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cajaRegistrarTelefonoProveedor.setEnabled(false);
        cajaRegistrarTelefonoProveedor.setPreferredSize(new java.awt.Dimension(315, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProveedor.add(cajaRegistrarTelefonoProveedor, gridBagConstraints);

        cajaRegistrarAliasProveedor.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cajaRegistrarAliasProveedor.setEnabled(false);
        cajaRegistrarAliasProveedor.setPreferredSize(new java.awt.Dimension(315, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProveedor.add(cajaRegistrarAliasProveedor, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        panelPersonasRegistrar.add(panelRegistrarDatosProveedor, gridBagConstraints);

        panelBotonesRegistrarProveedor.setOpaque(false);
        panelBotonesRegistrarProveedor.setLayout(new java.awt.GridBagLayout());

        botonLimpiarDatosProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonLimpiar_1.png"))); // NOI18N
        botonLimpiarDatosProveedor.setEnabled(false);
        botonLimpiarDatosProveedor.setPreferredSize(new java.awt.Dimension(130, 130));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panelBotonesRegistrarProveedor.add(botonLimpiarDatosProveedor, gridBagConstraints);

        botonRegistrarDatosProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonAgregarClientes.png"))); // NOI18N
        botonRegistrarDatosProveedor.setEnabled(false);
        botonRegistrarDatosProveedor.setPreferredSize(new java.awt.Dimension(130, 130));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelBotonesRegistrarProveedor.add(botonRegistrarDatosProveedor, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 600, 15, 10);
        panelPersonasRegistrar.add(panelBotonesRegistrarProveedor, gridBagConstraints);

        botonRegresarPersonas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonRegresar_1.png"))); // NOI18N
        botonRegresarPersonas.setPreferredSize(new java.awt.Dimension(130, 130));
        botonRegresarPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarPersonasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 15, 0);
        panelPersonasRegistrar.add(botonRegresarPersonas, gridBagConstraints);

        etiquetaColorFondoMenuRegistrarPersonas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaColorFondoMenuRegistrarPersonas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoMenuRegistrarPersonas_1.png"))); // NOI18N
        etiquetaColorFondoMenuRegistrarPersonas.setMaximumSize(new java.awt.Dimension(1366, 720));
        etiquetaColorFondoMenuRegistrarPersonas.setMinimumSize(new java.awt.Dimension(1366, 720));
        etiquetaColorFondoMenuRegistrarPersonas.setPreferredSize(new java.awt.Dimension(1366, 720));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 7;
        panelPersonasRegistrar.add(etiquetaColorFondoMenuRegistrarPersonas, gridBagConstraints);

        panelProductosRegistrar.setMinimumSize(new java.awt.Dimension(1320, 500));
        panelProductosRegistrar.setPreferredSize(new java.awt.Dimension(1366, 725));
        panelProductosRegistrar.setLayout(new java.awt.GridBagLayout());

        etiquetaProductosRegistrar.setFont(new java.awt.Font("Edwardian Script ITC", 0, 55)); // NOI18N
        etiquetaProductosRegistrar.setText("Productos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        panelProductosRegistrar.add(etiquetaProductosRegistrar, gridBagConstraints);

        panelRegistrarDatosProductos.setLayout(new java.awt.GridBagLayout());

        etiquetaRegistrarCodigoProducto.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaRegistrarCodigoProducto.setText("Código");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProductos.add(etiquetaRegistrarCodigoProducto, gridBagConstraints);

        etiquetaRegistrarCantidadProducto.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaRegistrarCantidadProducto.setText("Cantidad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 35, 5, 5);
        panelRegistrarDatosProductos.add(etiquetaRegistrarCantidadProducto, gridBagConstraints);

        etiquetaRegistrarPrecioC.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaRegistrarPrecioC.setText("Precio de compra");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProductos.add(etiquetaRegistrarPrecioC, gridBagConstraints);

        etiquetaRegistrarPrecioV.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaRegistrarPrecioV.setText("Precio de venta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProductos.add(etiquetaRegistrarPrecioV, gridBagConstraints);

        cajaRegistrarCodigoProducto.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cajaRegistrarCodigoProducto.setPreferredSize(new java.awt.Dimension(210, 51));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProductos.add(cajaRegistrarCodigoProducto, gridBagConstraints);

        cajaRegistrarCantidadProducto.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cajaRegistrarCantidadProducto.setPreferredSize(new java.awt.Dimension(210, 51));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProductos.add(cajaRegistrarCantidadProducto, gridBagConstraints);

        cajaRegistrarPrecioC.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cajaRegistrarPrecioC.setPreferredSize(new java.awt.Dimension(250, 51));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProductos.add(cajaRegistrarPrecioC, gridBagConstraints);

        cajaRegistrarPrecioV.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cajaRegistrarPrecioV.setEnabled(false);
        cajaRegistrarPrecioV.setPreferredSize(new java.awt.Dimension(250, 51));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProductos.add(cajaRegistrarPrecioV, gridBagConstraints);

        etiquetaRegistrarMarcaProducto.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaRegistrarMarcaProducto.setText("Marca");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProductos.add(etiquetaRegistrarMarcaProducto, gridBagConstraints);

        etiquetaRegistrarTallaProducto.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaRegistrarTallaProducto.setText("Talla");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 35, 5, 5);
        panelRegistrarDatosProductos.add(etiquetaRegistrarTallaProducto, gridBagConstraints);

        etiquetaRegistrarProveedorProducto.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaRegistrarProveedorProducto.setText("Proveedor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProductos.add(etiquetaRegistrarProveedorProducto, gridBagConstraints);

        etiquetaRegistrarColorProducto.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaRegistrarColorProducto.setText("Color");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProductos.add(etiquetaRegistrarColorProducto, gridBagConstraints);

        cajaRegistrarMarcaProducto.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cajaRegistrarMarcaProducto.setPreferredSize(new java.awt.Dimension(210, 51));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProductos.add(cajaRegistrarMarcaProducto, gridBagConstraints);

        cajaRegistrarTallaProducto.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cajaRegistrarTallaProducto.setPreferredSize(new java.awt.Dimension(210, 51));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProductos.add(cajaRegistrarTallaProducto, gridBagConstraints);

        cajaRegistrarColorProducto.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cajaRegistrarColorProducto.setPreferredSize(new java.awt.Dimension(210, 51));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProductos.add(cajaRegistrarColorProducto, gridBagConstraints);

        comboRegistrarProveedorProducto.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        comboRegistrarProveedorProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboRegistrarProveedorProducto.setPreferredSize(new java.awt.Dimension(210, 51));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProductos.add(comboRegistrarProveedorProducto, gridBagConstraints);

        etiquetaRegistrarObservacionesProducto.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaRegistrarObservacionesProducto.setText("Observaciones");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProductos.add(etiquetaRegistrarObservacionesProducto, gridBagConstraints);

        areaTextoRegistrarObservacionesProducto.setColumns(20);
        areaTextoRegistrarObservacionesProducto.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        areaTextoRegistrarObservacionesProducto.setRows(5);
        jScrollPane1.setViewportView(areaTextoRegistrarObservacionesProducto);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProductos.add(jScrollPane1, gridBagConstraints);

        radioBotonRegistroPrecioAutomatico.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        radioBotonRegistroPrecioAutomatico.setSelected(true);
        radioBotonRegistroPrecioAutomatico.setText("Automático");
        radioBotonRegistroPrecioAutomatico.setPreferredSize(new java.awt.Dimension(200, 44));
        radioBotonRegistroPrecioAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBotonRegistroPrecioAutomaticoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProductos.add(radioBotonRegistroPrecioAutomatico, gridBagConstraints);

        radioBotonRegistroPrecioManual.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        radioBotonRegistroPrecioManual.setText("Manual");
        radioBotonRegistroPrecioManual.setPreferredSize(new java.awt.Dimension(200, 44));
        radioBotonRegistroPrecioManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBotonRegistroPrecioManualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProductos.add(radioBotonRegistroPrecioManual, gridBagConstraints);

        cajaRegistrarCambioPrecioVentaProducto.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cajaRegistrarCambioPrecioVentaProducto.setPreferredSize(new java.awt.Dimension(200, 51));
        cajaRegistrarCambioPrecioVentaProducto.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProductos.add(cajaRegistrarCambioPrecioVentaProducto, gridBagConstraints);

        botonRegistroAplicarPrecio.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        botonRegistroAplicarPrecio.setText("Aplicar");
        botonRegistroAplicarPrecio.setPreferredSize(new java.awt.Dimension(180, 58));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        panelRegistrarDatosProductos.add(botonRegistroAplicarPrecio, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 10);
        panelProductosRegistrar.add(panelRegistrarDatosProductos, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenuPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1320, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelPersonasRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelProductosRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenuPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelPersonasRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelProductosRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPersonasPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPersonasPrincipalActionPerformed
        panelMenuPrincipal.setVisible(false);
        panelProductosRegistrar.setVisible(false);
        panelPersonasRegistrar.setVisible(true);
    }//GEN-LAST:event_botonPersonasPrincipalActionPerformed

    private void botonRegresarPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarPersonasActionPerformed
        panelPersonasRegistrar.setVisible(false);
        panelMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_botonRegresarPersonasActionPerformed

    private void botonProductosPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProductosPrincipalActionPerformed
        panelPersonasRegistrar.setVisible(false);
        panelMenuPrincipal.setVisible(false);
        panelProductosRegistrar.setVisible(true);
    }//GEN-LAST:event_botonProductosPrincipalActionPerformed

    private void radioBotonRegistroPrecioManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBotonRegistroPrecioManualActionPerformed
        cajaRegistrarCambioPrecioVentaProducto.setEnabled(true);
    }//GEN-LAST:event_radioBotonRegistroPrecioManualActionPerformed

    private void radioBotonRegistroPrecioAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBotonRegistroPrecioAutomaticoActionPerformed
        cajaRegistrarCambioPrecioVentaProducto.setEnabled(false);
    }//GEN-LAST:event_radioBotonRegistroPrecioAutomaticoActionPerformed

    private void radioBotonActivarRegistroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBotonActivarRegistroClientesActionPerformed
        cajaRegistrarNombreCliente.setEnabled(true);
        cajaRegistrarAliasCliente.setEnabled(true);
        cajaRegistrarTelefonoCliente.setEnabled(true);
        cajaRegistrarDirecciónCliente.setEnabled(true);
        botonLimpiarDatosCliente.setEnabled(true);
        botonAgregarDatosCliente.setEnabled(true);
        
        cajaRegistrarNombreProveedor.setEnabled(false);
        cajaRegistrarTelefonoProveedor.setEnabled(false);
        cajaRegistrarAliasProveedor.setEnabled(false);
        botonLimpiarDatosProveedor.setEnabled(false);
        botonRegistrarDatosProveedor.setEnabled(false);
    }//GEN-LAST:event_radioBotonActivarRegistroClientesActionPerformed

    private void radioBotonActivarRegistroProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBotonActivarRegistroProveedoresActionPerformed
        cajaRegistrarNombreProveedor.setEnabled(true);
        cajaRegistrarTelefonoProveedor.setEnabled(true);
        cajaRegistrarAliasProveedor.setEnabled(true);
        botonLimpiarDatosProveedor.setEnabled(true);
        botonRegistrarDatosProveedor.setEnabled(true);
        
        cajaRegistrarNombreCliente.setEnabled(false);
        cajaRegistrarAliasCliente.setEnabled(false);
        cajaRegistrarTelefonoCliente.setEnabled(false);
        cajaRegistrarDirecciónCliente.setEnabled(false);
        botonLimpiarDatosCliente.setEnabled(false);
        botonAgregarDatosCliente.setEnabled(false);
    }//GEN-LAST:event_radioBotonActivarRegistroProveedoresActionPerformed

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
            java.util.logging.Logger.getLogger(CuenpiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuenpiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuenpiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuenpiPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuenpiPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTextoRegistrarObservacionesProducto;
    private javax.swing.JButton botonAgregarDatosCliente;
    private javax.swing.JButton botonLimpiarDatosCliente;
    private javax.swing.JButton botonLimpiarDatosProveedor;
    private javax.swing.JButton botonMovimientosPrincipal;
    private javax.swing.JButton botonPersonasPrincipal;
    private javax.swing.JButton botonProductosPrincipal;
    private javax.swing.JButton botonRegistrarDatosProveedor;
    private javax.swing.JButton botonRegistroAplicarPrecio;
    private javax.swing.JButton botonRegresarPersonas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cajaRegistrarAliasCliente;
    private javax.swing.JTextField cajaRegistrarAliasProveedor;
    private javax.swing.JTextField cajaRegistrarCambioPrecioVentaProducto;
    private javax.swing.JTextField cajaRegistrarCantidadProducto;
    private javax.swing.JTextField cajaRegistrarCodigoProducto;
    private javax.swing.JTextField cajaRegistrarColorProducto;
    private javax.swing.JTextField cajaRegistrarDirecciónCliente;
    private javax.swing.JTextField cajaRegistrarMarcaProducto;
    private javax.swing.JTextField cajaRegistrarNombreCliente;
    private javax.swing.JTextField cajaRegistrarNombreProveedor;
    private javax.swing.JTextField cajaRegistrarPrecioC;
    private javax.swing.JTextField cajaRegistrarPrecioV;
    private javax.swing.JTextField cajaRegistrarTallaProducto;
    private javax.swing.JTextField cajaRegistrarTelefonoCliente;
    private javax.swing.JTextField cajaRegistrarTelefonoProveedor;
    private javax.swing.JComboBox<String> comboRegistrarProveedorProducto;
    private javax.swing.JLabel etiquetaColorFondoMenuPrincipal;
    private javax.swing.JLabel etiquetaColorFondoMenuRegistrarPersonas;
    private javax.swing.JLabel etiquetaDatosClientes;
    private javax.swing.JLabel etiquetaDatosProveedores;
    private javax.swing.JLabel etiquetaMovimientosPrincipal;
    private javax.swing.JLabel etiquetaPersonasPrincipal;
    private javax.swing.JLabel etiquetaPersonasRegistrar;
    private javax.swing.JLabel etiquetaProductosPrincipal;
    private javax.swing.JLabel etiquetaProductosRegistrar;
    private javax.swing.JLabel etiquetaRegistrarAliasCliente;
    private javax.swing.JLabel etiquetaRegistrarAliasProveedor;
    private javax.swing.JLabel etiquetaRegistrarCantidadProducto;
    private javax.swing.JLabel etiquetaRegistrarCodigoProducto;
    private javax.swing.JLabel etiquetaRegistrarColorProducto;
    private javax.swing.JLabel etiquetaRegistrarDatosProveedor;
    private javax.swing.JLabel etiquetaRegistrarDirecciónCliente;
    private javax.swing.JLabel etiquetaRegistrarMarcaProducto;
    private javax.swing.JLabel etiquetaRegistrarNombreCliente;
    private javax.swing.JLabel etiquetaRegistrarObservacionesProducto;
    private javax.swing.JLabel etiquetaRegistrarPrecioC;
    private javax.swing.JLabel etiquetaRegistrarPrecioV;
    private javax.swing.JLabel etiquetaRegistrarProveedorProducto;
    private javax.swing.JLabel etiquetaRegistrarTallaProducto;
    private javax.swing.JLabel etiquetaRegistrarTelefonoCliente;
    private javax.swing.JLabel etiquetaRegistrarTelefonoProveedor;
    private javax.swing.JLabel etiquetaTituloMenuPrincipal;
    private javax.swing.ButtonGroup grupoActivarPanelesRegistroPersonas;
    private javax.swing.ButtonGroup grupoRegistrarPrecioProducto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JPanel panelBotonesPrincipales;
    private javax.swing.JPanel panelBotonesRegistrarClientes;
    private javax.swing.JPanel panelBotonesRegistrarProveedor;
    private javax.swing.JPanel panelMenuPrincipal;
    private javax.swing.JPanel panelPersonasRegistrar;
    private javax.swing.JPanel panelProductosRegistrar;
    private javax.swing.JPanel panelRegistrarDatosCliente;
    private javax.swing.JPanel panelRegistrarDatosProductos;
    private javax.swing.JPanel panelRegistrarDatosProveedor;
    private javax.swing.JRadioButton radioBotonActivarRegistroClientes;
    private javax.swing.JRadioButton radioBotonActivarRegistroProveedores;
    private javax.swing.JRadioButton radioBotonRegistroPrecioAutomatico;
    private javax.swing.JRadioButton radioBotonRegistroPrecioManual;
    // End of variables declaration//GEN-END:variables
}
