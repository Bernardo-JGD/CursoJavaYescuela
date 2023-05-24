package AFD;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class Interfaz extends javax.swing.JFrame {

    private JTextField elementos[];
    private Automata auto[];
    private Filas filasRetorno[];
    private String alfa[];

    public Interfaz() {
        initComponents();
        setSize(950, 600);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoEstados = new javax.swing.JTextField();
        campoAlfabeto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnAplicar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        campoInicial = new javax.swing.JTextField();
        campoFinal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaTransiciones = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        campoCadena = new javax.swing.JTextField();
        etiquetaResultado = new javax.swing.JLabel();
        btnEvaluar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 600));

        jPanel1.setPreferredSize(new java.awt.Dimension(950, 600));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Autómata Finito Determinista");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("Ingrese los estados: ");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("Ingrese los elementos del alfabeto:");

        campoEstados.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N

        campoAlfabeto.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Ingresar los estados y \nelementos separados por comas.\nEjemplo:\nA, B, C, D, F\nNO dar espacio al ingresar \nel último dato. \nEl alfabeto no admite cadenas\nsolo elementos individuales\nseparados por comas\nEjemplo: \na, b\n0, 1\nLa cadena se ingresa entera.\nEjemplo:\nabab\nbaba\n0110");
        jScrollPane2.setViewportView(jTextArea1);

        btnAplicar.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        btnAplicar.setText("Aplicar");
        btnAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setText("Estado Inicial");

        campoInicial.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N

        campoFinal.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setText("Estado Final");

        tablaTransiciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Q"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaTransiciones);

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Ingrese una cadena");

        campoCadena.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N

        etiquetaResultado.setBackground(new java.awt.Color(102, 102, 102));
        etiquetaResultado.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        etiquetaResultado.setText("La cadena es:");

        btnEvaluar.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        btnEvaluar.setText("Evaluar");
        btnEvaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvaluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(campoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoAlfabeto)
                                    .addComponent(campoEstados)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(campoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAplicar, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(campoCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEvaluar)
                                .addGap(173, 173, 173))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(etiquetaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(campoEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(campoAlfabeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(campoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(btnAplicar)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(campoCadena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEvaluar)
                        .addGap(12, 12, 12)
                        .addComponent(etiquetaResultado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarActionPerformed

        String estados[] = extraerEstados();
        //creo un arreglo de objetos de mi clase Automatas para guardar los datos de cada transicion
        auto = new Automata[estados.length];

        //inicializo las transiciones del arreglo como vacias pero no null, para enviarlo de parametro
        //inicial al objeto en el arreglo
        //en otro método se agregaran las transiciones extraidas de la tabla
        extraerAlfabeto();

        //Esto podría ir en un método, pero ya no supe como :c
        String inicializarTranscion[] = new String[alfa.length];
        for (int i = 0; i < inicializarTranscion.length; i++) {
            inicializarTranscion[i] = "";
        }
        for (int i = 0; i < auto.length; i++) {
            //me marcaba error, pero recorde que primero debo crear el objeto y enviar parametros
            //al constructor, y luego ya puedo utilizar sus metodos get y set, de lo contrario
            //con esos metodos estoy apuntando a un objeto que no he creado o inicializado
            auto[i] = new Automata(estados[i], "", inicializarTranscion);
            //indico si el estado es inicial
            if (campoInicial.getText().equals(auto[i].getEstado_nombre())) {
                auto[i].setInicial_o_final("I");
            } else {
                if (campoFinal.getText().equals(auto[i].getEstado_nombre())) {
                    auto[i].setInicial_o_final("F");
                } else {
                    auto[i].setInicial_o_final("N");
                }

            }
            //indico si el estado es final

        }

        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaTransiciones.setModel(modeloTabla);
        //agrego primero la columna de los estados
        modeloTabla.addColumn("Q");
        //agrego las columnas con los nombres de los elementos del alfabeto
        for (int i = 0; i < alfa.length; i++) {
            modeloTabla.addColumn(alfa[i]);
        }

        //creo un método para agregar un arreglo que en la primera posición tenga el nombre del 
        //del estado y el resto esté vacio
        retornarFilas(estados);

        //agrego los estados
        for (int i = 0; i < estados.length; i++) {
            modeloTabla.addRow(filasRetorno[i].getFilasEstados());
        }

    }//GEN-LAST:event_btnAplicarActionPerformed

    private void btnEvaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvaluarActionPerformed
        tablaTransiciones.getColumnName(WIDTH);
        agregarTransiciones();
        char cadenaC[] = campoCadena.getText().toCharArray();
        String arregloTransiciones[];
        String auxiliarChar = "";
        String nombreEstadoSiguiente = "";
        for (int i = 0; i < cadenaC.length; i++) {
            auxiliarChar = String.valueOf(cadenaC[i]);

            if (i == 0) {
                for (int j = 0; j < auto.length; j++) {
                    //busco el estado inicial
                    if (auto[j].getInicial_o_final().equals("I")) {
                        //vacio sus transiciones
                        arregloTransiciones = auto[j].getTransiciones();
                        for (int k = 1; k < tablaTransiciones.getColumnCount(); k++) {
                            //encuentro el estado al que me lleva
                            if (tablaTransiciones.getColumnName(k).toString().equals(auxiliarChar)) {
                                System.out.println(nombreEstadoSiguiente);
                                System.out.println(auxiliarChar);
                                nombreEstadoSiguiente = arregloTransiciones[k - 1];
                                System.out.println(nombreEstadoSiguiente);
                                System.out.println("i= " + i);
                                System.out.println("");
                            }
                        }
                    }
                }
            } else {
                if (i > 0) {
                    for (int j = 0; j < auto.length; j++) {
                        //busco el nombre del estado siguiente
                        if (auto[j].getEstado_nombre().equals(nombreEstadoSiguiente)) {
                            //vacio las transiciones en un arreglo auxiliar
                            arregloTransiciones = auto[j].getTransiciones();
                            //recorro las columas de la tabla 
                            for (int k = 1; k < tablaTransiciones.getColumnCount(); k++) {
                                //encuentro el estado al que me lleva el elemento de la cadena
                                if (tablaTransiciones.getColumnName(k).toString().equals(auxiliarChar)) {
                                    //nombreEstadoSiguiente = arregloTransiciones[k - 1];
                                    System.out.println(nombreEstadoSiguiente);
                                    System.out.println(auxiliarChar);
                                    nombreEstadoSiguiente = tablaTransiciones.getValueAt(j, k).toString();
                                    System.out.println(nombreEstadoSiguiente);
                                    System.out.println("i= " + i);
                                    System.out.println("");
                                    j = auto.length;
                                }
                            }
                        }
                    }
                }
            }

        }
        String mensaje = "La cadena es: ";

        if (nombreEstadoSiguiente.equals(campoFinal.getText())) {
            mensaje += " ACEPTADA";
            etiquetaResultado.setText(mensaje);
            etiquetaResultado.setForeground(Color.GREEN);
        } else {
            mensaje += " RECHAZADA";
            etiquetaResultado.setText(mensaje);
            etiquetaResultado.setForeground(Color.RED);
        }
    }//GEN-LAST:event_btnEvaluarActionPerformed

    public void agregarTransiciones() {
        String recolectarTransiciones[];
        int columna = 1;
        for (int i = 0; i < auto.length; i++) {
            recolectarTransiciones = new String[auto[i].getTransiciones().length];
            //aqui trabajo con el arreglo de Strings que guarda el objeto como atributo
            for (int j = 0; j < auto[i].getTransiciones().length; j++) {
                //recorde que recibe un arreglo de Strings ya rellenado, así que lo debo de declarar
                //y rellenar primero, y leugo enviarselo
                recolectarTransiciones[j] = tablaTransiciones.getValueAt(i, columna).toString();
                columna++;
            }
            auto[i].setTransiciones(recolectarTransiciones);
            columna = 1;
        }

        /*for (int j = 0; j < auto.length; j++) {
            System.out.println(auto[j].getEstado_nombre());
            System.out.println(auto[j].getInicial_o_final());
            String aux[] = auto[j].getTransiciones();
            for (int i = 0; i < aux.length; i++) {
                System.out.println(aux[i] + " - ");
            }
            System.out.println("");
        }*/
    }

    public String[] extraerEstados() {

        char campo[] = campoEstados.getText().toCharArray();
        String cadena = "";
        ArrayList<String> estados = new ArrayList<String>();
        for (int i = 0; i < campo.length; i++) {
            //esta linea la comento porque aquí lo que me hace es duplicar los caracteres
            //cadena += String.valueOf(campo[i]);

            if (campo[i] != ',') {
                //convierto a string y agrego la letra a la cadena
                cadena += Character.toString(campo[i]);
            } else {
                estados.add(cadena);//agrego la cadena completa antes de la coma
                cadena = "";
                i++;//salta el espacio
            }

        }
        //aquí se agregar el ultimo elemento de la cadena, ya que antes no lo hacia 
        estados.add(cadena);
        System.out.println(estados.size());
        String arregloRetorno[] = new String[estados.size()];
        for (int i = 0; i < estados.size(); i++) {
            arregloRetorno[i] = estados.get(i);
        }

        return arregloRetorno;

    }

    public void extraerAlfabeto() {

        char campo[] = campoAlfabeto.getText().toCharArray();
        String cadena = "";
        ArrayList<String> elementos = new ArrayList<String>();
        for (int i = 0; i < campo.length; i++) {

            //esta linea la comento porque aquí lo que me hace es duplicar los caracteres
            //cadena += String.valueOf(campo[i]);
            if (campo[i] != ',') {
                //convierto a string y agrego la letra a la cadena
                cadena += Character.toString(campo[i]);
            } else {
                elementos.add(cadena);//agrego la cadena completa antes de la coma
                cadena = "";
                i++;//salta el espacio
            }

        }
        //aquí se agregar el ultimo elemento de la cadena, ya que antes no lo hacia 
        elementos.add(cadena);
        alfa = new String[elementos.size()];
        for (int i = 0; i < alfa.length; i++) {
            alfa[i] = elementos.get(i);
        }

    }

    public void retornarFilas(String estados[]) {
        filasRetorno = new Filas[estados.length];
        String f[];
        for (int i = 0; i < estados.length; i++) {
            f = new String[alfa.length];
            for (int j = 0; j < f.length; j++) {
                if (j == 0) {
                    f[j] = estados[i];
                } else {
                    f[j] = "";
                }

            }
            filasRetorno[i] = new Filas();
            filasRetorno[i].setFilasEstados(f);
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicar;
    private javax.swing.JButton btnEvaluar;
    private javax.swing.JTextField campoAlfabeto;
    private javax.swing.JTextField campoCadena;
    private javax.swing.JTextField campoEstados;
    private javax.swing.JTextField campoFinal;
    private javax.swing.JTextField campoInicial;
    private javax.swing.JLabel etiquetaResultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tablaTransiciones;
    // End of variables declaration//GEN-END:variables
}
