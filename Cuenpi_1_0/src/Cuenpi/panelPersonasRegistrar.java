package Cuenpi;

import javax.swing.JPanel;

public class panelPersonasRegistrar extends javax.swing.JPanel {

    CuenpiPrincipal CP;
    panelPersonasConsultar ppc;
    public JPanel pr; 
    public panelPersonasRegistrar() {
        initComponents();
        setSize(1366, 700);

        grupoBotonesPersonas.add(botonMenuRegistrarPersonas);
        grupoBotonesPersonas.add(botonMenuConsultarPersonas);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        grupoBotonesPersonas = new javax.swing.ButtonGroup();
        panelRegistrarDatosCliente = new javax.swing.JPanel();
        etiquetaRegistrarNombreCliente = new javax.swing.JLabel();
        etiquetaRegistrarAliasCliente = new javax.swing.JLabel();
        etiquetaRegistrarTelefonoCliente = new javax.swing.JLabel();
        etiquetaRegistrarDireccionCliente = new javax.swing.JLabel();
        cajaRegistrarNombreCliente = new javax.swing.JTextField();
        cajaRegistrarAliasCliente = new javax.swing.JTextField();
        cajaRegistrarTelefonoCliente = new javax.swing.JTextField();
        cajaRegistrarDireccionCliente = new javax.swing.JTextField();
        etiquetaPanelRegistrarPersonas = new javax.swing.JLabel();
        etiquetaDatosClientes = new javax.swing.JLabel();
        etiquetaDatosProveedores = new javax.swing.JLabel();
        panelRegistrarDatosProveedores = new javax.swing.JPanel();
        etiquetaRegistrarNombreProveedor = new javax.swing.JLabel();
        etiquetaRegistrarTelefonoProveedor = new javax.swing.JLabel();
        etiquetaRegistrarAliasProveedor = new javax.swing.JLabel();
        cajaRegistrarNombreProveedor = new javax.swing.JTextField();
        cajaRegistrarTelefonoProveedor = new javax.swing.JTextField();
        cajaRegistrarAliasProveedor = new javax.swing.JTextField();
        panelBotonesClientes = new javax.swing.JPanel();
        botonRegisttrarClientes = new javax.swing.JButton();
        botonLimpiarCamposClientes = new javax.swing.JButton();
        panelBotonesProveedores = new javax.swing.JPanel();
        botonRegistrarProveedores = new javax.swing.JButton();
        botonLimpiarCamposProveedores = new javax.swing.JButton();
        botonMenuRegistrarPersonas = new javax.swing.JToggleButton();
        botonMenuConsultarPersonas = new javax.swing.JToggleButton();
        botonSalirRegistrarPersonas = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1370, 725));
        setPreferredSize(new java.awt.Dimension(1370, 725));
        setLayout(new java.awt.GridBagLayout());

        panelRegistrarDatosCliente.setLayout(new java.awt.GridBagLayout());

        etiquetaRegistrarNombreCliente.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaRegistrarNombreCliente.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        panelRegistrarDatosCliente.add(etiquetaRegistrarNombreCliente, gridBagConstraints);

        etiquetaRegistrarAliasCliente.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaRegistrarAliasCliente.setText("Alias");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        panelRegistrarDatosCliente.add(etiquetaRegistrarAliasCliente, gridBagConstraints);

        etiquetaRegistrarTelefonoCliente.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaRegistrarTelefonoCliente.setText("Teléfono");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        panelRegistrarDatosCliente.add(etiquetaRegistrarTelefonoCliente, gridBagConstraints);

        etiquetaRegistrarDireccionCliente.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaRegistrarDireccionCliente.setText("Dirección");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        panelRegistrarDatosCliente.add(etiquetaRegistrarDireccionCliente, gridBagConstraints);

        cajaRegistrarNombreCliente.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cajaRegistrarNombreCliente.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        panelRegistrarDatosCliente.add(cajaRegistrarNombreCliente, gridBagConstraints);

        cajaRegistrarAliasCliente.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cajaRegistrarAliasCliente.setText("Alias");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        panelRegistrarDatosCliente.add(cajaRegistrarAliasCliente, gridBagConstraints);

        cajaRegistrarTelefonoCliente.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cajaRegistrarTelefonoCliente.setText("Teléfono");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        panelRegistrarDatosCliente.add(cajaRegistrarTelefonoCliente, gridBagConstraints);

        cajaRegistrarDireccionCliente.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cajaRegistrarDireccionCliente.setText("Direccion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        panelRegistrarDatosCliente.add(cajaRegistrarDireccionCliente, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 5, 10);
        add(panelRegistrarDatosCliente, gridBagConstraints);

        etiquetaPanelRegistrarPersonas.setFont(new java.awt.Font("Edwardian Script ITC", 1, 55)); // NOI18N
        etiquetaPanelRegistrarPersonas.setText("Personas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        add(etiquetaPanelRegistrarPersonas, gridBagConstraints);

        etiquetaDatosClientes.setFont(new java.awt.Font("Times New Roman", 2, 42)); // NOI18N
        etiquetaDatosClientes.setText("Clientes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(etiquetaDatosClientes, gridBagConstraints);

        etiquetaDatosProveedores.setFont(new java.awt.Font("Times New Roman", 2, 42)); // NOI18N
        etiquetaDatosProveedores.setText("Proveedores");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(etiquetaDatosProveedores, gridBagConstraints);

        panelRegistrarDatosProveedores.setLayout(new java.awt.GridBagLayout());

        etiquetaRegistrarNombreProveedor.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaRegistrarNombreProveedor.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        panelRegistrarDatosProveedores.add(etiquetaRegistrarNombreProveedor, gridBagConstraints);

        etiquetaRegistrarTelefonoProveedor.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaRegistrarTelefonoProveedor.setText("Teléfono");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        panelRegistrarDatosProveedores.add(etiquetaRegistrarTelefonoProveedor, gridBagConstraints);

        etiquetaRegistrarAliasProveedor.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        etiquetaRegistrarAliasProveedor.setText("Alias");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        panelRegistrarDatosProveedores.add(etiquetaRegistrarAliasProveedor, gridBagConstraints);

        cajaRegistrarNombreProveedor.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cajaRegistrarNombreProveedor.setText("Nombre");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        panelRegistrarDatosProveedores.add(cajaRegistrarNombreProveedor, gridBagConstraints);

        cajaRegistrarTelefonoProveedor.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cajaRegistrarTelefonoProveedor.setText("Teléfono");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        panelRegistrarDatosProveedores.add(cajaRegistrarTelefonoProveedor, gridBagConstraints);

        cajaRegistrarAliasProveedor.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        cajaRegistrarAliasProveedor.setText("Alias");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        panelRegistrarDatosProveedores.add(cajaRegistrarAliasProveedor, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 5, 10);
        add(panelRegistrarDatosProveedores, gridBagConstraints);

        panelBotonesClientes.setLayout(new java.awt.GridBagLayout());

        botonRegisttrarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesBotonesIconos/BotonAgregarClientes.png"))); // NOI18N
        panelBotonesClientes.add(botonRegisttrarClientes, new java.awt.GridBagConstraints());

        botonLimpiarCamposClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesBotonesIconos/BotonLimpiar_1.png"))); // NOI18N
        panelBotonesClientes.add(botonLimpiarCamposClientes, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 15);
        add(panelBotonesClientes, gridBagConstraints);

        panelBotonesProveedores.setLayout(new java.awt.GridBagLayout());

        botonRegistrarProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesBotonesIconos/BotonAgregarClientes.png"))); // NOI18N
        panelBotonesProveedores.add(botonRegistrarProveedores, new java.awt.GridBagConstraints());

        botonLimpiarCamposProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesBotonesIconos/BotonLimpiar_1.png"))); // NOI18N
        panelBotonesProveedores.add(botonLimpiarCamposProveedores, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 15);
        add(panelBotonesProveedores, gridBagConstraints);

        botonMenuRegistrarPersonas.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        botonMenuRegistrarPersonas.setText("Registrar");
        botonMenuRegistrarPersonas.setSelected(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        add(botonMenuRegistrarPersonas, gridBagConstraints);

        botonMenuConsultarPersonas.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        botonMenuConsultarPersonas.setText("Consultar");
        botonMenuConsultarPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuConsultarPersonasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(botonMenuConsultarPersonas, gridBagConstraints);

        botonSalirRegistrarPersonas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesBotonesIconos/BotonRegresar_1.png"))); // NOI18N
        botonSalirRegistrarPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirRegistrarPersonasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 5, 0);
        add(botonSalirRegistrarPersonas, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirRegistrarPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirRegistrarPersonasActionPerformed
        CP = new CuenpiPrincipal();
        System.out.println("CerrarPanelRegistrar");
        CP.panelMenuPrincipal.setVisible(true);
        System.out.println("CerrarPanelRegistrar");
        this.setVisible(false);
        System.out.println("CerrarPanelRegistrar");
    }//GEN-LAST:event_botonSalirRegistrarPersonasActionPerformed

    private void botonMenuConsultarPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuConsultarPersonasActionPerformed
        this.setVisible(false);
        ppc.setVisible(true);
    }//GEN-LAST:event_botonMenuConsultarPersonasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonLimpiarCamposClientes;
    private javax.swing.JButton botonLimpiarCamposProveedores;
    private javax.swing.JToggleButton botonMenuConsultarPersonas;
    private javax.swing.JToggleButton botonMenuRegistrarPersonas;
    private javax.swing.JButton botonRegistrarProveedores;
    private javax.swing.JButton botonRegisttrarClientes;
    private javax.swing.JButton botonSalirRegistrarPersonas;
    private javax.swing.JTextField cajaRegistrarAliasCliente;
    private javax.swing.JTextField cajaRegistrarAliasProveedor;
    private javax.swing.JTextField cajaRegistrarDireccionCliente;
    private javax.swing.JTextField cajaRegistrarNombreCliente;
    private javax.swing.JTextField cajaRegistrarNombreProveedor;
    private javax.swing.JTextField cajaRegistrarTelefonoCliente;
    private javax.swing.JTextField cajaRegistrarTelefonoProveedor;
    private javax.swing.JLabel etiquetaDatosClientes;
    private javax.swing.JLabel etiquetaDatosProveedores;
    private javax.swing.JLabel etiquetaPanelRegistrarPersonas;
    private javax.swing.JLabel etiquetaRegistrarAliasCliente;
    private javax.swing.JLabel etiquetaRegistrarAliasProveedor;
    private javax.swing.JLabel etiquetaRegistrarDireccionCliente;
    private javax.swing.JLabel etiquetaRegistrarNombreCliente;
    private javax.swing.JLabel etiquetaRegistrarNombreProveedor;
    private javax.swing.JLabel etiquetaRegistrarTelefonoCliente;
    private javax.swing.JLabel etiquetaRegistrarTelefonoProveedor;
    private javax.swing.ButtonGroup grupoBotonesPersonas;
    private javax.swing.JPanel panelBotonesClientes;
    private javax.swing.JPanel panelBotonesProveedores;
    private javax.swing.JPanel panelRegistrarDatosCliente;
    private javax.swing.JPanel panelRegistrarDatosProveedores;
    // End of variables declaration//GEN-END:variables
}
