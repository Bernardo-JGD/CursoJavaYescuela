
package Vista;


public class VistaPersona extends javax.swing.JFrame {

    
    public VistaPersona() {
        initComponents();
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

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel1.setText("Clave:");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel3.setText("Domicilio:");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel4.setText("Celular:");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel5.setText("Correo Electrónico:");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel6.setText("Fecha de nacimiento:");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel7.setText("Género:");

        cajaClave.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        cajaNombre.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        cajaDomicilio.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        cajaCelular.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        cajaCorreo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        cajaFecha.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        comboGenero.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));

        cajaBuscar.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        cajaId.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        botonBuscar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        botonBuscar.setText("Buscar");

        botonInsertar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        botonInsertar.setText("Insertar");

        botonModificar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        botonModificar.setText("Modificar");

        botonEliminar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        botonEliminar.setText("Eliminar");

        botonLimpiar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        botonLimpiar.setText("Limpiar");

        javax.swing.GroupLayout panelPersonaLayout = new javax.swing.GroupLayout(panelPersona);
        panelPersona.setLayout(panelPersonaLayout);
        panelPersonaLayout.setHorizontalGroup(
            panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonaLayout.createSequentialGroup()
                .addContainerGap(354, Short.MAX_VALUE)
                .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
            .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelPersonaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelPersonaLayout.createSequentialGroup()
                            .addGap(170, 170, 170)
                            .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelPersonaLayout.createSequentialGroup()
                            .addGap(310, 310, 310)
                            .addComponent(cajaId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelPersonaLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(55, 55, 55)
                            .addComponent(cajaClave, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelPersonaLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(32, 32, 32)
                            .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelPersonaLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(19, 19, 19)
                            .addComponent(cajaDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelPersonaLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(39, 39, 39)
                            .addComponent(cajaCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelPersonaLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(15, 15, 15)
                            .addComponent(cajaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelPersonaLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(13, 13, 13)
                            .addComponent(cajaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelPersonaLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(47, 47, 47)
                            .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 117, Short.MAX_VALUE)))
        );
        panelPersonaLayout.setVerticalGroup(
            panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPersonaLayout.createSequentialGroup()
                        .addComponent(botonInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonBuscar))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelPersonaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(cajaId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(cajaClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(23, 23, 23)
                    .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(23, 23, 23)
                    .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(cajaDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(23, 23, 23)
                    .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(cajaCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(23, 23, 23)
                    .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(cajaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(23, 23, 23)
                    .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(cajaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(23, 23, 23)
                    .addGroup(panelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(VistaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botonBuscar;
    public javax.swing.JButton botonEliminar;
    public javax.swing.JButton botonInsertar;
    public javax.swing.JButton botonLimpiar;
    public javax.swing.JButton botonModificar;
    public javax.swing.JTextField cajaBuscar;
    public javax.swing.JTextField cajaCelular;
    public javax.swing.JTextField cajaClave;
    public javax.swing.JTextField cajaCorreo;
    public javax.swing.JTextField cajaDomicilio;
    public javax.swing.JTextField cajaFecha;
    public javax.swing.JTextField cajaId;
    public javax.swing.JTextField cajaNombre;
    public javax.swing.JComboBox<String> comboGenero;
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
