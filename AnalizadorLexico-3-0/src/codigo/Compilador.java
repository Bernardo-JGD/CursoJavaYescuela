package codigo;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class Compilador extends javax.swing.JFrame {

    NumeroLinea nlinea;
    private ArrayList<ObjetoToken> listaTokens = new ArrayList<ObjetoToken>();
    Vector<ObjetoToken> listaTabla = new Vector<ObjetoToken>();
    int tama;
    private Color colorTexto, colorBack;
    String fuente;

    public Compilador() {

        initComponents();
        setLocationRelativeTo(null);
        nlinea = new NumeroLinea(areaCodigo);
        jScroll.setRowHeaderView(nlinea);
        System.out.println("");
        fuente = comboFuentes.getSelectedItem().toString();
        tama = areaCodigo.getFont().getSize();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScroll = new javax.swing.JScrollPane();
        areaCodigo = new javax.swing.JTextArea();
        btnAnalizarL = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTokens = new javax.swing.JTable();
        plusSize = new javax.swing.JButton();
        lessSize = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        colorCodigo = new javax.swing.JButton();
        btnColorBack = new javax.swing.JButton();
        comboFuentes = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaResultadoS = new javax.swing.JTextArea();
        btnAnalizarS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areaCodigo.setColumns(20);
        areaCodigo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        areaCodigo.setForeground(new java.awt.Color(51, 51, 51));
        areaCodigo.setRows(5);
        jScroll.setViewportView(areaCodigo);

        btnAnalizarL.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btnAnalizarL.setText("Analizar L");
        btnAnalizarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarLActionPerformed(evt);
            }
        });

        tablaTokens.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tablaTokens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Token", "Lexema"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(tablaTokens);

        plusSize.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        plusSize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mas.png"))); // NOI18N
        plusSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusSizeActionPerformed(evt);
            }
        });

        lessSize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menos.png"))); // NOI18N
        lessSize.setBorderPainted(false);
        lessSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessSizeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Analizador Léxico");

        colorCodigo.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        colorCodigo.setText("Color T");
        colorCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorCodigoActionPerformed(evt);
            }
        });

        btnColorBack.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnColorBack.setText("Color B");
        btnColorBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorBackActionPerformed(evt);
            }
        });

        comboFuentes.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        comboFuentes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arial Rounded MT Bold", "Arial", "Tahoma", "Verdana", "Dialog", "Serif", "Comic Sans MS", "Times New Roman" }));
        comboFuentes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboFuentesItemStateChanged(evt);
            }
        });

        areaResultadoS.setColumns(20);
        areaResultadoS.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        areaResultadoS.setRows(5);
        jScrollPane2.setViewportView(areaResultadoS);

        btnAnalizarS.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        btnAnalizarS.setText("Analizar S");
        btnAnalizarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(comboFuentes, 0, 0, Short.MAX_VALUE))
                                    .addComponent(colorCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnColorBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(plusSize)
                                .addGap(18, 18, 18)
                                .addComponent(lessSize))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAnalizarL, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(57, 57, 57)
                        .addComponent(btnAnalizarS)
                        .addGap(198, 198, 198)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAnalizarL, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plusSize, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lessSize, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(colorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnColorBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboFuentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAnalizarS)
                        .addGap(35, 35, 35)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnalizarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarLActionPerformed

        File archivo = new File("archivo.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(areaCodigo.getText());
            //System.out.println(areaCodigo.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Compilador.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Reader lector = new BufferedReader(new FileReader("archivo.txt"));

            Lexer lexer = new Lexer(lector);
            DefaultTableModel modeloTabla = new DefaultTableModel();
            tablaTokens.setModel(modeloTabla);
            modeloTabla.addColumn("Token");
            modeloTabla.addColumn("Lexema");
            String resultado = "";
            while (true) {

                Tokens tokens = lexer.yylex();
                String nombreToken = lexer.lexeme;
                resultado += tokens;
                if (tokens == null) {
                    return;
                }

                switch (tokens) {

                    case Igual:

                        break;

                    case Suma:

                        break;

                    case Resta:

                        break;

                    case Multiplicacion:

                        break;

                    case Division:

                        break;

                    case Identificador:

                        break;

                    case Numero:

                        break;

                    case ERROR:

                        break;

                }
                //listaTokens.add(new ObjetoToken(nombreToken, resultado));
                String fila[] = {nombreToken, resultado};
                modeloTabla.addRow(fila);
                resultado = "";
            }
            //rellenarVector(listaTokens);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Compilador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Compilador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAnalizarLActionPerformed

    private void plusSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusSizeActionPerformed

        if (tama < 30) {
            tama++;
            areaCodigo.setFont(new Font(fuente, Font.PLAIN, tama));
        }

    }//GEN-LAST:event_plusSizeActionPerformed

    private void lessSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessSizeActionPerformed

        if (tama > 12) {
            tama--;
            areaCodigo.setFont(new Font(fuente, Font.PLAIN, tama));
        }


    }//GEN-LAST:event_lessSizeActionPerformed

    private void colorCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorCodigoActionPerformed

        colorTexto = JColorChooser.showDialog(this, "Seleccione un color", colorTexto);
        areaCodigo.setForeground(colorTexto);
    }//GEN-LAST:event_colorCodigoActionPerformed

    private void btnColorBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorBackActionPerformed
        colorBack = JColorChooser.showDialog(this, "Seleccione un color", colorTexto);
        areaCodigo.setBackground(colorBack);
    }//GEN-LAST:event_btnColorBackActionPerformed

    private void comboFuentesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboFuentesItemStateChanged

        fuente = comboFuentes.getSelectedItem().toString();
        areaCodigo.setFont(new Font(fuente, Font.PLAIN, tama));
    }//GEN-LAST:event_comboFuentesItemStateChanged

    private void btnAnalizarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarSActionPerformed
        String textoAAnalizar = areaCodigo.getText();
        Sintax sintaxis = new Sintax(new codigo.LexerCup(new StringReader(textoAAnalizar)));

        try {
            sintaxis.parse();
            areaResultadoS.setText("Análisis Correcto :D!!!");
            areaResultadoS.setForeground(new Color(25, 111, 61));
        } catch (Exception ex) {
            Symbol sym = sintaxis.getS();
            areaResultadoS.setText("Error de sintaxis :c. Linea: " + (sym.right) + " Columna: " + (sym.left) + "--- Texto: \"" + sym.value + "\"");
            areaResultadoS.setForeground(Color.RED);
        }

    }//GEN-LAST:event_btnAnalizarSActionPerformed

    public void rellenarVector(ArrayList<ObjetoToken> array) {

        for (int i = 0; i < array.size(); i++) {
            listaTabla.add(array.get(i));
        }

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
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        try {
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.synth.SynthLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.multi.MultiLookAndFeel");
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");   
            //UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel"); 
            //UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinookAndFeel");
            UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinkAndFeel");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            //Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compilador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaCodigo;
    private javax.swing.JTextArea areaResultadoS;
    private javax.swing.JButton btnAnalizarL;
    private javax.swing.JButton btnAnalizarS;
    private javax.swing.JButton btnColorBack;
    private javax.swing.JButton colorCodigo;
    private javax.swing.JComboBox<String> comboFuentes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScroll;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton lessSize;
    private javax.swing.JButton plusSize;
    private javax.swing.JTable tablaTokens;
    // End of variables declaration//GEN-END:variables
}
