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
import modelo.Estado;
import modelo.Ciudad;

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();
        comboCiudad = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaInformacion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("País");

        comboPaises.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        comboPaises.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboPaisesItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Estado");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Ciudad");

        comboEstado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        comboEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboEstadoItemStateChanged(evt);
            }
        });

        comboCiudad.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        comboCiudad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCiudadItemStateChanged(evt);
            }
        });

        areaInformacion.setColumns(20);
        areaInformacion.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        areaInformacion.setRows(5);
        jScrollPane1.setViewportView(areaInformacion);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Información");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboPaises, 0, 262, Short.MAX_VALUE)
                            .addComponent(comboEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboCiudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPaises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboPaisesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboPaisesItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Pais pais = (Pais) comboPaises.getSelectedItem();

            Estado estado = new Estado();
            DefaultComboBoxModel modeloComboEstado = new DefaultComboBoxModel(estado.mostrarEstados(pais.getIdPais()));
            comboEstado.setModel(modeloComboEstado);
            comboCiudad.removeAllItems();
        }
    }//GEN-LAST:event_comboPaisesItemStateChanged

    private void comboEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboEstadoItemStateChanged
         if (evt.getStateChange() == ItemEvent.SELECTED) {
            Estado estado = (Estado) comboEstado.getSelectedItem();

            Ciudad ciudad = new Ciudad();
            DefaultComboBoxModel modeloComboCiudad = new DefaultComboBoxModel(ciudad.mostrarCiudad(estado.getIdEstado()));
            comboCiudad.setModel(modeloComboCiudad);
            
        }
    }//GEN-LAST:event_comboEstadoItemStateChanged

    private void comboCiudadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCiudadItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            
            Pais pais = (Pais) comboPaises.getSelectedItem();
            Estado estado = (Estado) comboEstado.getSelectedItem();
            Ciudad ciudad = (Ciudad) comboCiudad.getSelectedItem();
            
            areaInformacion.setText("Pais: " + pais.getNombre() + 
                                    "\nEstado: " + estado.getNombre() + 
                                    "\nCiudad: " + ciudad.getNombre());
            
        }
    }//GEN-LAST:event_comboCiudadItemStateChanged

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComboBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaInformacion;
    private javax.swing.JComboBox<String> comboCiudad;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JComboBox<String> comboPaises;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
