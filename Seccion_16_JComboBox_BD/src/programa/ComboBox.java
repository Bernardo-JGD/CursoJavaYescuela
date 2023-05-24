package programa;

import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Pais;

public class ComboBox extends javax.swing.JFrame {

    public ComboBox() {
        initComponents();
        setLocationRelativeTo(null);

        Pais pais = new Pais();
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel(pais.mostrarPaises());
        comboPaises.setModel(modeloCombo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboPaises = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Paises");

        comboPaises.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        comboPaises.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboPaisesItemStateChanged(evt);
            }
        });

        tablaEstados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Estado", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaEstados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(comboPaises, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPaises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboPaisesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboPaisesItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Pais pais = (Pais) comboPaises.getSelectedItem();

            DefaultTableModel modeloTabla = new DefaultTableModel();
            tablaEstados.setModel(modeloTabla);

            PreparedStatement ps = null;
            ResultSet rs = null;

            try {
                Conexion con = new Conexion();
                Connection conexion = con.getConnection();

                ps = conexion.prepareStatement("SELECT idEstado, nombre FROM Estado WHERE idPais = " + pais.getIdPais());
                rs = ps.executeQuery();

                modeloTabla.addColumn("ID Estado");
                modeloTabla.addColumn("Nombre");

                ResultSetMetaData rsMD = rs.getMetaData();
                int cantidadColumnas = rsMD.getColumnCount();

                int anchos[] = {30, 150};

                for (int i = 0; i < cantidadColumnas; i++) {

                    tablaEstados.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);

                }

                while (rs.next()) {
                    Object fila[] = new Object[cantidadColumnas];
                    for (int i = 0; i < cantidadColumnas; i++) {
                        fila[i] = rs.getObject(i + 1);
                    }
                    modeloTabla.addRow(fila);
                }

            } catch (Exception ex) {
                System.err.println("Error: " + ex);
            }

        }
    }//GEN-LAST:event_comboPaisesItemStateChanged

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComboBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboPaises;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEstados;
    // End of variables declaration//GEN-END:variables
}
