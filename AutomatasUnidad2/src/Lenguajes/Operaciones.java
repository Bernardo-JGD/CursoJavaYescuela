package Lenguajes;

import java.util.ArrayList;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Operaciones extends javax.swing.JFrame {

    //voy a editar los botones de las operaciones 
    //U+0394  sfe3r
    //delta  a
    //\u03B5 epsilon , cadena vacia 
    int cantidadLenguajesElegidos = 0;
    String operacion_resultante = "";
    ArrayList<String> A = new ArrayList<String>();
    ArrayList<String> B = new ArrayList<String>();
    ArrayList<String> C = new ArrayList<String>();

    public Operaciones() {
        initComponents();
        setSize(1000, 600);
        setLocationRelativeTo(null);
        cantidadLenguajes.add(cantidad1);
        cantidadLenguajes.add(cantidad2);
        cantidadLenguajes.add(cantidad3);

        cajaA.setEnabled(false);
        cajaB.setEnabled(false);
        cajaC.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        cantidadLenguajes = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cantidad1 = new javax.swing.JRadioButton();
        cantidad2 = new javax.swing.JRadioButton();
        cantidad3 = new javax.swing.JRadioButton();
        lenguaje1 = new javax.swing.JLabel();
        lenguaje2 = new javax.swing.JLabel();
        lenguaje3 = new javax.swing.JLabel();
        cajaA = new javax.swing.JTextField();
        cajaB = new javax.swing.JTextField();
        cajaC = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaResultado = new javax.swing.JTextArea();
        panelBotones = new javax.swing.JPanel();
        agregarA = new javax.swing.JButton();
        agregarB = new javax.swing.JButton();
        agregarC = new javax.swing.JButton();
        union = new javax.swing.JButton();
        interseccion = new javax.swing.JButton();
        diferencia = new javax.swing.JButton();
        simetrica = new javax.swing.JButton();
        complemento = new javax.swing.JButton();
        kleene = new javax.swing.JButton();
        positiva = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();
        etiquetaOperacionResultante = new javax.swing.JLabel();
        etUltimaInstruccion = new javax.swing.JLabel();
        botonCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setPreferredSize(new java.awt.Dimension(800, 700));

        titulo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Operaciones con Lenguajes");

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Escoja la cantidad de Lenguajes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        jPanel1.add(jLabel1, gridBagConstraints);

        cantidad1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cantidad1.setText("1");
        cantidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidad1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 50, 10, 0);
        jPanel1.add(cantidad1, gridBagConstraints);

        cantidad2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cantidad2.setText("2");
        cantidad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidad2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 50, 10, 0);
        jPanel1.add(cantidad2, gridBagConstraints);

        cantidad3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cantidad3.setText("3");
        cantidad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidad3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 50, 10, 0);
        jPanel1.add(cantidad3, gridBagConstraints);

        lenguaje1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lenguaje1.setText("Ingrese el lenguaje A");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel1.add(lenguaje1, gridBagConstraints);

        lenguaje2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lenguaje2.setText("Ingrese el lenguaje B");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel1.add(lenguaje2, gridBagConstraints);

        lenguaje3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lenguaje3.setText("Ingrese el lenguaje C");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel1.add(lenguaje3, gridBagConstraints);

        cajaA.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cajaA.setPreferredSize(new java.awt.Dimension(300, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel1.add(cajaA, gridBagConstraints);

        cajaB.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cajaB.setPreferredSize(new java.awt.Dimension(300, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel1.add(cajaB, gridBagConstraints);

        cajaC.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cajaC.setPreferredSize(new java.awt.Dimension(300, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel1.add(cajaC, gridBagConstraints);

        botonGuardar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        botonGuardar.setText("Guardar Lenguajes");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        jPanel1.add(botonGuardar, gridBagConstraints);

        botonEditar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        botonEditar.setText("Editar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        jPanel1.add(botonEditar, gridBagConstraints);

        areaResultado.setColumns(20);
        areaResultado.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        areaResultado.setRows(5);
        jScrollPane1.setViewportView(areaResultado);

        panelBotones.setLayout(new java.awt.GridBagLayout());

        agregarA.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        agregarA.setForeground(new java.awt.Color(0, 0, 0));
        agregarA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/A.png"))); // NOI18N
        agregarA.setBorder(null);
        agregarA.setEnabled(false);
        agregarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarAActionPerformed(evt);
            }
        });
        panelBotones.add(agregarA, new java.awt.GridBagConstraints());

        agregarB.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        agregarB.setForeground(new java.awt.Color(0, 0, 0));
        agregarB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/B.png"))); // NOI18N
        agregarB.setBorder(null);
        agregarB.setEnabled(false);
        agregarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        panelBotones.add(agregarB, gridBagConstraints);

        agregarC.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        agregarC.setForeground(new java.awt.Color(0, 0, 0));
        agregarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/C.png"))); // NOI18N
        agregarC.setBorder(null);
        agregarC.setEnabled(false);
        agregarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        panelBotones.add(agregarC, gridBagConstraints);

        union.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        union.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Interseccion.png"))); // NOI18N
        union.setBorder(null);
        union.setEnabled(false);
        union.setOpaque(false);
        union.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unionActionPerformed(evt);
            }
        });
        panelBotones.add(union, new java.awt.GridBagConstraints());

        interseccion.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        interseccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Union.png"))); // NOI18N
        interseccion.setBorder(null);
        interseccion.setEnabled(false);
        interseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interseccionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        panelBotones.add(interseccion, gridBagConstraints);

        diferencia.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        diferencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Diferencia.png"))); // NOI18N
        diferencia.setBorder(null);
        diferencia.setEnabled(false);
        diferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diferenciaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        panelBotones.add(diferencia, gridBagConstraints);

        simetrica.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        simetrica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Simetrica.png"))); // NOI18N
        simetrica.setBorder(null);
        simetrica.setEnabled(false);
        simetrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simetricaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        panelBotones.add(simetrica, gridBagConstraints);

        complemento.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        complemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Complemento.png"))); // NOI18N
        complemento.setBorder(null);
        complemento.setEnabled(false);
        complemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complementoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        panelBotones.add(complemento, gridBagConstraints);

        kleene.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        kleene.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/kleene.png"))); // NOI18N
        kleene.setBorder(null);
        kleene.setEnabled(false);
        kleene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kleeneActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        panelBotones.add(kleene, gridBagConstraints);

        positiva.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        positiva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/positiva.png"))); // NOI18N
        positiva.setBorder(null);
        positiva.setEnabled(false);
        positiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positivaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        panelBotones.add(positiva, gridBagConstraints);

        borrar.setFont(new java.awt.Font("Verdana", 1, 22)); // NOI18N
        borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Borrar.png"))); // NOI18N
        borrar.setBorder(null);
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        panelBotones.add(borrar, gridBagConstraints);

        multiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Multiplicacion.png"))); // NOI18N
        multiplicacion.setBorder(null);
        multiplicacion.setEnabled(false);
        multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        panelBotones.add(multiplicacion, gridBagConstraints);

        etiquetaOperacionResultante.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        etUltimaInstruccion.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etUltimaInstruccion.setText("----");

        botonCalcular.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        botonCalcular.setText("Calcular");
        botonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(etiquetaOperacionResultante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                .addComponent(etUltimaInstruccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(botonCalcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(titulo)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etUltimaInstruccion)
                                .addGap(47, 47, 47)
                                .addComponent(etiquetaOperacionResultante, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidad1ActionPerformed
        cajaA.setEnabled(true);
        cajaB.setEnabled(false);
        cajaC.setEnabled(false);
        agregarA.setEnabled(true);
        agregarB.setEnabled(false);
        agregarC.setEnabled(false);
        kleene.setEnabled(true);
        positiva.setEnabled(true);
        multiplicacion.setEnabled(true);
        union.setEnabled(false);
        interseccion.setEnabled(false);
        diferencia.setEnabled(false);
        simetrica.setEnabled(false);
        complemento.setEnabled(false);
        cantidadLenguajesElegidos = 1;
    }//GEN-LAST:event_cantidad1ActionPerformed

    private void cantidad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidad2ActionPerformed
        cajaA.setEnabled(true);
        cajaB.setEnabled(true);
        cajaC.setEnabled(false);
        agregarA.setEnabled(true);
        agregarB.setEnabled(true);
        agregarC.setEnabled(false);
        union.setEnabled(true);
        interseccion.setEnabled(true);
        diferencia.setEnabled(true);
        simetrica.setEnabled(true);
        complemento.setEnabled(true);
        multiplicacion.setEnabled(true);
        kleene.setEnabled(true);
        positiva.setEnabled(true);
        cantidadLenguajesElegidos = 2;
    }//GEN-LAST:event_cantidad2ActionPerformed

    private void cantidad3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidad3ActionPerformed
        cajaA.setEnabled(true);
        cajaB.setEnabled(true);
        cajaC.setEnabled(true);
        agregarA.setEnabled(true);
        agregarB.setEnabled(true);
        agregarC.setEnabled(true);
        union.setEnabled(true);
        interseccion.setEnabled(true);
        diferencia.setEnabled(true);
        simetrica.setEnabled(true);
        complemento.setEnabled(true);
        multiplicacion.setEnabled(true);
        kleene.setEnabled(true);
        positiva.setEnabled(true);
        cantidadLenguajesElegidos = 3;
    }//GEN-LAST:event_cantidad3ActionPerformed

    private void agregarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarAActionPerformed
        if (cantidadLenguajesElegidos > 0) {
            etUltimaInstruccion.setText("Lenguaje A");
            operacion_resultante += "A";
            etiquetaOperacionResultante.setText(operacion_resultante);
        }
    }//GEN-LAST:event_agregarAActionPerformed

    private void agregarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBActionPerformed
        if (cantidadLenguajesElegidos > 1) {
            etUltimaInstruccion.setText("Lenguaje B");
            operacion_resultante += "B";
            etiquetaOperacionResultante.setText(operacion_resultante);
        }
    }//GEN-LAST:event_agregarBActionPerformed

    private void agregarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarCActionPerformed
        if (cantidadLenguajesElegidos > 2) {
            etUltimaInstruccion.setText("Lenguaje C");
            operacion_resultante += "C";
            etiquetaOperacionResultante.setText(operacion_resultante);
        }
    }//GEN-LAST:event_agregarCActionPerformed

    private void unionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unionActionPerformed
        if (cantidadLenguajesElegidos > 1) {
            etUltimaInstruccion.setText("Unión");
            operacion_resultante += "U";
            etiquetaOperacionResultante.setText(operacion_resultante);
        }
    }//GEN-LAST:event_unionActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed

        if (cantidadLenguajesElegidos > 0 && cajaA.toString().length() > 0) {
            char cadenaA[] = cajaA.getText().toCharArray();
            char cadenaB[] = cajaB.getText().toCharArray();
            char cadenaC[] = cajaC.getText().toCharArray();
            A.clear();
            B.clear();
            C.clear();
            crearLenguajes(cadenaA, cadenaB, cadenaC);
            /*Para comprobar que se guardan los elementos en los arreglos
            for (int i = 0; i < A.size(); i++) {
                System.out.println(A.get(i));
            }
            System.out.println("");
             
            for (int i = 0; i < B.size(); i++) {
                System.out.println(B.get(i));
            }
            System.out.println("");

            for (int i = 0; i < C.size(); i++) {
                System.out.println(C.get(i));
            }
            System.out.println("");
             */
            cajaA.setEnabled(false);
            cajaB.setEnabled(false);
            cajaC.setEnabled(false);
        }


    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        cajaA.setText(null);
        cajaB.setText(null);
        cajaC.setText(null);

        if (cantidad1.isSelected()) {
            cajaA.setEnabled(true);
        } else {
            if (cantidad2.isSelected()) {
                cajaA.setEnabled(true);
                cajaB.setEnabled(true);
            } else {
                if (cantidad3.isSelected()) {
                    cajaA.setEnabled(true);
                    cajaB.setEnabled(true);
                    cajaC.setEnabled(true);
                }
            }
        }

        A.clear();
        B.clear();
        C.clear();

    }//GEN-LAST:event_botonEditarActionPerformed

    private void interseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interseccionActionPerformed
        if (cantidadLenguajesElegidos > 1) {
            etUltimaInstruccion.setText("Intersección");
            operacion_resultante += "\u2229";
            etiquetaOperacionResultante.setText(operacion_resultante);
        }
    }//GEN-LAST:event_interseccionActionPerformed

    private void diferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diferenciaActionPerformed
        if (cantidadLenguajesElegidos > 1) {
            etUltimaInstruccion.setText("Diferencia");
            operacion_resultante += "\u002D";
            etiquetaOperacionResultante.setText(operacion_resultante);
        }
    }//GEN-LAST:event_diferenciaActionPerformed

    private void simetricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simetricaActionPerformed
        if (cantidadLenguajesElegidos > 1) {
            etUltimaInstruccion.setText("Dferencia Simétrica");
            operacion_resultante += "\u0394";
            etiquetaOperacionResultante.setText(operacion_resultante);
        }
    }//GEN-LAST:event_simetricaActionPerformed

    private void complementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complementoActionPerformed
        if (cantidadLenguajesElegidos > 1) {
            etUltimaInstruccion.setText("Complemento");
            operacion_resultante += "c";
            etiquetaOperacionResultante.setText(operacion_resultante);
        }
    }//GEN-LAST:event_complementoActionPerformed

    private void multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionActionPerformed
        if (cantidadLenguajesElegidos > 0) {
            etUltimaInstruccion.setText("Multiplicación");
            operacion_resultante += "x";
            etiquetaOperacionResultante.setText(operacion_resultante);
        }
    }//GEN-LAST:event_multiplicacionActionPerformed

    private void kleeneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kleeneActionPerformed
        if (cantidadLenguajesElegidos > 0) {
            etUltimaInstruccion.setText("Kleene");
            operacion_resultante += "*";
            etiquetaOperacionResultante.setText(operacion_resultante);
        }
    }//GEN-LAST:event_kleeneActionPerformed

    private void positivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positivaActionPerformed
        if (cantidadLenguajesElegidos > 0) {
            etUltimaInstruccion.setText("Positiva");
            operacion_resultante += "+";
            etiquetaOperacionResultante.setText(operacion_resultante);
        }
    }//GEN-LAST:event_positivaActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed

        int longitud = etiquetaOperacionResultante.getText().length();

        if (longitud > 0) {
            if (longitud == 1) {
                operacion_resultante = "";
            } else {
                //elimino el último elemento de la cadena
                operacion_resultante = operacion_resultante.substring(0, operacion_resultante.length() - 1);
            }
        }
        etiquetaOperacionResultante.setText(operacion_resultante);
    }//GEN-LAST:event_borrarActionPerformed

    private void botonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularActionPerformed
        if (etiquetaOperacionResultante.getText().length() == 2) {
            //caso: 1 lenguaje y cerradura kleene
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == '*') {
                if (!A.isEmpty()) {
                    //copio el lenguaje al resultante
                    ArrayList k = (ArrayList) A.clone();
                    //lo recorro para agregar cadena vacia en la primera posicion
                    //NOTA: al parecer con solo ingresar en la posicion 0 se recorren
                    //los demas elementos
                    /*for (int i = k.size()-1; i > 0; i--) {
                        k.add(i+1, k.get(i-1));
                        System.out.println(i);
                    }
                     */
                    //agrego en la primera posicion la cadena vacia (solitos se recorren los demas elementos)
                    k.add(0, "\u03B5");

                    int longIncremental = k.size();
                    int inicioNuevo = 1;
                    int incrementoDeInicioNuevo = 0;
                    for (int i = 0; i < A.size(); i++) {
                        String cadenaA = A.get(i);//tomo el elemento de A en la posicion i
                        for (int j = inicioNuevo; j < longIncremental; j++) {
                            String cadenaNueva = cadenaA + k.get(j);
                            k.add(cadenaNueva);
                            incrementoDeInicioNuevo++;
                        }
                        //el problema está aquí
                        //si el lenguaje es de tamaño 2, i == 1, si es de tamaño 3, i == 2
                        //al parecer i == tamaño del arreglo -1 funciona para todos 
                        if (i == A.size() - 1) {
                            i = -1;
                            System.out.println(incrementoDeInicioNuevo);
                            inicioNuevo = inicioNuevo + incrementoDeInicioNuevo - 2;//aqui tambien hay problema//no se porque pero ese 2 es una constante
                            incrementoDeInicioNuevo = 0;
                            longIncremental = k.size();
                            if (longIncremental > 10) {
                                break;
                            }
                        }
                    }
                    String cadenaResultado = "";
                    for (int i = 0; i < k.size(); i++) {
                        //System.out.println(k.get(i));
                        cadenaResultado = cadenaResultado + k.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en el lenguaje");
                }
            }
            //caso: 1 lenguaje y cerradura positiva
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == '+') {
                if (!A.isEmpty()) {
                    ArrayList k = (ArrayList) A.clone();
                    int longIncremental = k.size();
                    int inicioNuevo = 0;
                    int incrementoDeInicioNuevo = 0;
                    for (int i = 0; i < A.size(); i++) {
                        String cadenaA = A.get(i);//tomo el elemento de A en la posicion i
                        for (int j = inicioNuevo; j < longIncremental; j++) {
                            String cadenaNueva = cadenaA + k.get(j);
                            k.add(cadenaNueva);
                            incrementoDeInicioNuevo++;
                        }
                        if (i == A.size() - 1) {
                            i = -1;
                            //System.out.println(incrementoDeInicioNuevo);
                            inicioNuevo = inicioNuevo + incrementoDeInicioNuevo - 2;//aqui tambien hay problema//no se porque pero ese 2 es una constante
                            incrementoDeInicioNuevo = 0;
                            longIncremental = k.size();
                            if (longIncremental > 10) {
                                break;
                            }
                        }
                    }
                    for (int i = 0; i < A.size(); i++) {
                        k.remove(0);
                    }
                    System.out.println("P1 = " + k.get(0));
                    System.out.println("P2 = " + k.get(1));
                    String cadenaResultado = "";
                    for (int i = 0; i < k.size(); i++) {
                        //System.out.println(k.get(i));
                        cadenaResultado = cadenaResultado + k.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);
                } else {
                    etUltimaInstruccion.setText("No hay elementos en el lenguaje");
                }
            }
            //caso: 2 lenguaje y complemento  Ac
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == 'c' && etiquetaOperacionResultante.getText().toCharArray()[0] == 'A') {
                if (!A.isEmpty() && !B.isEmpty()) {
                    ArrayList<String> dif = new ArrayList<String>();
                    int detector = 0;
                    //agregar coincidencias
                    for (int i = 0; i < B.size(); i++) {
                        for (int j = 0; j < A.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (B.get(i).equals(A.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            dif.add(B.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }

                    //System.out.println("Tamaño de union " + dif.size());
                    String cadenaResultado = "";
                    for (int i = 0; i < dif.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + dif.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);
                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }

            }
            //caso: 2 lenguaje y complemento  Bc
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == 'c' && etiquetaOperacionResultante.getText().toCharArray()[0] == 'B') {
                if (!A.isEmpty() && !B.isEmpty()) {
                    ArrayList<String> dif = new ArrayList<String>();
                    int detector = 0;
                    //agregar coincidencias
                    for (int i = 0; i < A.size(); i++) {
                        for (int j = 0; j < B.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (A.get(i).equals(B.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            dif.add(A.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }

                    //System.out.println("Tamaño de union " + dif.size());
                    String cadenaResultado = "";
                    for (int i = 0; i < dif.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + dif.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }

            }
            //System.out.println(etiquetaOperacionResultante.getText().toCharArray()[2]);
        }
        ////caso: 1 lenguaje y multiplicacion AxA
        if (etiquetaOperacionResultante.getText().length() == 3 && cantidad1.isSelected()) {
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == 'x' && etiquetaOperacionResultante.getText().toCharArray()[2] == 'A') {

                if (!A.isEmpty()) {

                    ArrayList<String> multi = new ArrayList<String>();
                    for (int i = 0; i < A.size(); i++) {
                        String cadena = A.get(i);
                        for (int j = 0; j < A.size(); j++) {
                            cadena = cadena + A.get(j);
                            multi.add(cadena);
                            cadena = A.get(i);
                        }
                    }

                    String cadenaResultado = "";
                    for (int i = 0; i < multi.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + multi.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en el lenguaje");
                }

            }
        }
        //caso: 2 lenguajes y multiplicación AxB
        if (etiquetaOperacionResultante.getText().length() == 3 && cantidad2.isSelected()) {
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == 'x' && etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[2] == 'B') {

                if (!A.isEmpty() && !B.isEmpty()) {
                    ArrayList<String> multi = new ArrayList<String>();
                    for (int i = 0; i < A.size(); i++) {
                        String cadena = A.get(i);
                        for (int j = 0; j < B.size(); j++) {
                            cadena = cadena + B.get(j);
                            multi.add(cadena);
                            cadena = A.get(i);
                        }
                    }

                    String cadenaResultado = "";
                    for (int i = 0; i < multi.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + multi.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }

            }
            //caso: 2 lenguajes y multiplicación BxA
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == 'x' && etiquetaOperacionResultante.getText().toCharArray()[0] == 'B' && etiquetaOperacionResultante.getText().toCharArray()[2] == 'A') {

                if (!A.isEmpty() && !B.isEmpty()) {
                    ArrayList<String> multi = new ArrayList<String>();
                    for (int i = 0; i < B.size(); i++) {
                        String cadena = B.get(i);
                        for (int j = 0; j < A.size(); j++) {
                            cadena = cadena + A.get(j);
                            multi.add(cadena);
                            cadena = B.get(i);
                        }
                    }

                    String cadenaResultado = "";
                    for (int i = 0; i < multi.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + multi.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }

            }
            //caso: 2 lenguajes y union AUB
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == 'U' && etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[2] == 'B') {
                if (!A.isEmpty() && !B.isEmpty()) {
                    ArrayList<String> union = new ArrayList<String>();
                    for (int i = 0; i < A.size(); i++) {
                        union.add(A.get(i));
                    }
                    int incioB = 0;
                    for (int i = A.size(); i < A.size() + B.size(); i++) {
                        union.add(B.get(incioB));
                        incioB++;
                    }
                    //eliminar el duplicado
                    for (int i = 0; i < union.size() - 1; i++) {
                        for (int j = 1; j < union.size(); j++) {
                            if (union.get(i).equals(union.get(j)) && j != i) {
                                union.remove(j);
                            }
                        }
                    }
                    //System.out.println("Tamaño de union " + union.size());
                    String cadenaResultado = "";
                    for (int i = 0; i < union.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + union.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }

            }
            //caso: 2 lenguajes union BUA
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == 'U' && etiquetaOperacionResultante.getText().toCharArray()[0] == 'B' && etiquetaOperacionResultante.getText().toCharArray()[2] == 'A') {
                if (!A.isEmpty() && !B.isEmpty()) {
                    ArrayList<String> union = new ArrayList<String>();
                    for (int i = 0; i < B.size(); i++) {
                        union.add(B.get(i));
                    }
                    int incioA = 0;
                    for (int i = B.size(); i < A.size() + B.size(); i++) {
                        union.add(A.get(incioA));
                        incioA++;
                    }
                    //eliminar el duplicado
                    for (int i = 0; i < union.size() - 1; i++) {
                        for (int j = 1; j < union.size(); j++) {
                            if (union.get(i).equals(union.get(j)) && j != i) {
                                union.remove(j);
                            }
                        }
                    }
                    //System.out.println("Tamaño de union " + union.size());
                    String cadenaResultado = "";
                    for (int i = 0; i < union.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + union.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }

            }
            //caso: 2 lenguajes interseccion A\u2229B  
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == "\u2229".toCharArray()[0] && etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[2] == 'B') {
                if (!A.isEmpty() && !B.isEmpty()) {
                    ArrayList<String> inter = new ArrayList<String>();
                    //agregar coincidencias
                    for (int i = 0; i < A.size(); i++) {
                        for (int j = 0; j < B.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (A.get(i).equals(B.get(j))) {
                                inter.add(A.get(i));
                            }
                        }
                    }

                    //System.out.println("Tamaño de union " + inter.size());
                    String cadenaResultado = "";
                    for (int i = 0; i < inter.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + inter.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }

            }
            //caso: 2 lenguajes interseccion B\u2229A  
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == "\u2229".toCharArray()[0] && etiquetaOperacionResultante.getText().toCharArray()[0] == 'B' && etiquetaOperacionResultante.getText().toCharArray()[2] == 'A') {
                if (!A.isEmpty() && !B.isEmpty()) {
                    ArrayList<String> inter = new ArrayList<String>();
                    //agregar coincidencias
                    for (int i = 0; i < B.size(); i++) {
                        for (int j = 0; j < A.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (B.get(i).equals(A.get(j))) {
                                inter.add(B.get(i));
                            }
                        }
                    }

                    //System.out.println("Tamaño de union " + inter.size());
                    String cadenaResultado = "";
                    for (int i = 0; i < inter.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + inter.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }

            }
            //caso: 2 lenguajes diferencia A-B
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == "-".toCharArray()[0] && etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[2] == 'B') {
                if (!A.isEmpty() && !B.isEmpty()) {
                    ArrayList<String> dif = new ArrayList<String>();
                    int detector = 0;
                    //agregar coincidencias
                    for (int i = 0; i < A.size(); i++) {
                        for (int j = 0; j < B.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (A.get(i).equals(B.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            dif.add(A.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }

                    //System.out.println("Tamaño de union " + dif.size());
                    String cadenaResultado = "";
                    for (int i = 0; i < dif.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + dif.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }

            }
            //caso: 2 lenguajes diferencia B-A
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == "-".toCharArray()[0] && etiquetaOperacionResultante.getText().toCharArray()[0] == 'B' && etiquetaOperacionResultante.getText().toCharArray()[2] == 'A') {
                if (!A.isEmpty() && !B.isEmpty()) {
                    ArrayList<String> dif = new ArrayList<String>();
                    int detector = 0;
                    //agregar coincidencias
                    for (int i = 0; i < B.size(); i++) {
                        for (int j = 0; j < A.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (B.get(i).equals(A.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            dif.add(B.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }

                    //System.out.println("Tamaño de union " + dif.size());
                    String cadenaResultado = "";
                    for (int i = 0; i < dif.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + dif.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }

            }
            //caso: 2 lenguajes y simetrica A B 
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == "\u0394".toCharArray()[0] && etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[2] == 'B') {
                if (!A.isEmpty() && !B.isEmpty()) {
                    ArrayList<String> sim = new ArrayList<String>();
                    int detector = 0;
                    //agregar coincidencias
                    for (int i = 0; i < A.size(); i++) {
                        for (int j = 0; j < B.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (A.get(i).equals(B.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            sim.add(A.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }
                    detector = 0;
                    for (int i = 0; i < B.size(); i++) {
                        for (int j = 0; j < A.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (B.get(i).equals(A.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            sim.add(B.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }

                    //System.out.println("Tamaño de union " + dif.size());
                    String cadenaResultado = "";
                    for (int i = 0; i < sim.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + sim.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }

            }

            //caso: 2 lenguajes y simetrica B A 
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == "\u0394".toCharArray()[0] && etiquetaOperacionResultante.getText().toCharArray()[0] == 'B' && etiquetaOperacionResultante.getText().toCharArray()[2] == 'A') {
                if (!A.isEmpty() && !B.isEmpty()) {
                    ArrayList<String> sim = new ArrayList<String>();
                    int detector = 0;
                    //agregar coincidencias

                    for (int i = 0; i < B.size(); i++) {
                        for (int j = 0; j < A.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (B.get(i).equals(A.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            sim.add(B.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }
                    detector = 0;
                    for (int i = 0; i < A.size(); i++) {
                        for (int j = 0; j < B.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (A.get(i).equals(B.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            sim.add(A.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }

                    //System.out.println("Tamaño de union " + dif.size());
                    String cadenaResultado = "";
                    for (int i = 0; i < sim.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + sim.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }

            }

        }

        if (etiquetaOperacionResultante.getText().length() == 4 && cantidad2.isSelected()) {
            //A* U B
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == '*' && etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[2] == 'U' && etiquetaOperacionResultante.getText().toCharArray()[3] == 'B') {
                if (!A.isEmpty() && !B.isEmpty()) {
                    //copio el lenguaje al resultante
                    ArrayList<String> k = (ArrayList) A.clone();
                    //lo recorro para agregar cadena vacia en la primera posicion
                    //NOTA: al parecer con solo ingresar en la posicion 0 se recorren
                    //los demas elementos
                    /*for (int i = k.size()-1; i > 0; i--) {
                        k.add(i+1, k.get(i-1));
                        System.out.println(i);
                    }
                     */
                    //agrego en la primera posicion la cadena vacia (solitos se recorren los demas elementos)
                    k.add(0, "\u03B5");

                    int longIncremental = k.size();
                    int inicioNuevo = 1;
                    int incrementoDeInicioNuevo = 0;
                    for (int i = 0; i < A.size(); i++) {
                        String cadenaA = A.get(i);//tomo el elemento de A en la posicion i
                        for (int j = inicioNuevo; j < longIncremental; j++) {
                            String cadenaNueva = cadenaA + k.get(j);
                            k.add(cadenaNueva);
                            incrementoDeInicioNuevo++;
                        }
                        //el problema está aquí
                        //si el lenguaje es de tamaño 2, i == 1, si es de tamaño 3, i == 2
                        //al parecer i == tamaño del arreglo -1 funciona para todos 
                        if (i == A.size() - 1) {
                            i = -1;
                            System.out.println(incrementoDeInicioNuevo);
                            inicioNuevo = inicioNuevo + incrementoDeInicioNuevo - 2;//aqui tambien hay problema//no se porque pero ese 2 es una constante
                            incrementoDeInicioNuevo = 0;
                            longIncremental = k.size();
                            if (longIncremental > 10) {
                                break;
                            }
                        }
                    }

                    ArrayList<String> union = new ArrayList<String>();
                    for (int i = 0; i < k.size(); i++) {
                        union.add(k.get(i));
                    }
                    int incioB = 0;
                    for (int i = k.size(); i < k.size() + B.size(); i++) {
                        union.add(B.get(incioB));
                        incioB++;
                    }
                    //eliminar el duplicado
                    for (int i = 0; i < union.size() - 1; i++) {
                        for (int j = 1; j < union.size(); j++) {
                            if (union.get(i).equals(union.get(j)) && j != i) {
                                union.remove(j);
                            }
                        }
                    }
                    String cadenaResultado = "";
                    for (int i = 0; i < union.size(); i++) {
                        //System.out.println(k.get(i));
                        cadenaResultado = cadenaResultado + union.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en el lenguaje");
                }
            }

            //caso: AUB*
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == 'U' && etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[2] == 'B' && etiquetaOperacionResultante.getText().toCharArray()[3] == '*') {
                if (!A.isEmpty() && !B.isEmpty()) {
                    //copio el lenguaje al resultante
                    ArrayList<String> k = (ArrayList) B.clone();
                    //lo recorro para agregar cadena vacia en la primera posicion
                    //NOTA: al parecer con solo ingresar en la posicion 0 se recorren
                    //los demas elementos
                    /*for (int i = k.size()-1; i > 0; i--) {
                        k.add(i+1, k.get(i-1));
                        System.out.println(i);
                    }
                     */
                    //agrego en la primera posicion la cadena vacia (solitos se recorren los demas elementos)
                    k.add(0, "\u03B5");

                    int longIncremental = k.size();
                    int inicioNuevo = 1;
                    int incrementoDeInicioNuevo = 0;
                    for (int i = 0; i < B.size(); i++) {
                        String cadenaA = B.get(i);//tomo el elemento de A en la posicion i
                        for (int j = inicioNuevo; j < longIncremental; j++) {
                            String cadenaNueva = cadenaA + k.get(j);
                            k.add(cadenaNueva);
                            incrementoDeInicioNuevo++;
                        }
                        //el problema está aquí
                        //si el lenguaje es de tamaño 2, i == 1, si es de tamaño 3, i == 2
                        //al parecer i == tamaño del arreglo -1 funciona para todos 
                        if (i == B.size() - 1) {
                            i = -1;
                            System.out.println(incrementoDeInicioNuevo);
                            inicioNuevo = inicioNuevo + incrementoDeInicioNuevo - 2;//aqui tambien hay problema//no se porque pero ese 2 es una constante
                            incrementoDeInicioNuevo = 0;
                            longIncremental = k.size();
                            if (longIncremental > 10) {
                                break;
                            }
                        }
                    }

                    ArrayList<String> union = new ArrayList<String>();
                    for (int i = 0; i < k.size(); i++) {
                        union.add(k.get(i));
                    }
                    int incioB = 0;
                    for (int i = k.size(); i < k.size() + A.size(); i++) {
                        union.add(A.get(incioB));
                        incioB++;
                    }
                    //eliminar el duplicado
                    for (int i = 0; i < union.size() - 1; i++) {
                        for (int j = 1; j < union.size(); j++) {
                            if (union.get(i).equals(union.get(j)) && j != i) {
                                union.remove(j);
                            }
                        }
                    }
                    String cadenaResultado = "";
                    for (int i = 0; i < union.size(); i++) {
                        //System.out.println(k.get(i));
                        cadenaResultado = cadenaResultado + union.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en el lenguaje");
                }
            }

            //INTERSECCION A* B
            if (etiquetaOperacionResultante.getText().toCharArray()[2] == "\u2229".toCharArray()[0] && etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[1] == '*' && etiquetaOperacionResultante.getText().toCharArray()[3] == 'B') {
                if (!A.isEmpty() && !B.isEmpty()) {

                    //copio el lenguaje al resultante
                    ArrayList<String> k = (ArrayList) A.clone();
                    //lo recorro para agregar cadena vacia en la primera posicion
                    //NOTA: al parecer con solo ingresar en la posicion 0 se recorren
                    //los demas elementos
                    /*for (int i = k.size()-1; i > 0; i--) {
                        k.add(i+1, k.get(i-1));
                        System.out.println(i);
                    }
                     */
                    //agrego en la primera posicion la cadena vacia (solitos se recorren los demas elementos)
                    k.add(0, "\u03B5");

                    int longIncremental = k.size();
                    int inicioNuevo = 1;
                    int incrementoDeInicioNuevo = 0;
                    for (int i = 0; i < A.size(); i++) {
                        String cadenaA = A.get(i);//tomo el elemento de A en la posicion i
                        for (int j = inicioNuevo; j < longIncremental; j++) {
                            String cadenaNueva = cadenaA + k.get(j);
                            k.add(cadenaNueva);
                            incrementoDeInicioNuevo++;
                        }
                        //el problema está aquí
                        //si el lenguaje es de tamaño 2, i == 1, si es de tamaño 3, i == 2
                        //al parecer i == tamaño del arreglo -1 funciona para todos 
                        if (i == A.size() - 1) {
                            i = -1;
                            System.out.println(incrementoDeInicioNuevo);
                            inicioNuevo = inicioNuevo + incrementoDeInicioNuevo - 2;//aqui tambien hay problema//no se porque pero ese 2 es una constante
                            incrementoDeInicioNuevo = 0;
                            longIncremental = k.size();
                            if (longIncremental > 10) {
                                break;
                            }
                        }
                    }

                    ArrayList<String> inter = new ArrayList<String>();
                    //agregar coincidencias
                    for (int i = 0; i < k.size(); i++) {
                        for (int j = 0; j < B.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (k.get(i).equals(B.get(j))) {
                                inter.add(k.get(i));
                            }
                        }
                    }

                    //System.out.println("Tamaño de union " + inter.size());
                    String cadenaResultado = "";
                    for (int i = 0; i < inter.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + inter.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }

            }
            //INTERSECCION A B*
            if (etiquetaOperacionResultante.getText().toCharArray()[2] == 'B' && etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[1] == "\u2229".toCharArray()[0] && etiquetaOperacionResultante.getText().toCharArray()[3] == '*') {
                if (!A.isEmpty() && !B.isEmpty()) {

                    //copio el lenguaje al resultante
                    ArrayList<String> k = (ArrayList) B.clone();
                    //lo recorro para agregar cadena vacia en la primera posicion
                    //NOTA: al parecer con solo ingresar en la posicion 0 se recorren
                    //los demas elementos
                    /*for (int i = k.size()-1; i > 0; i--) {
                        k.add(i+1, k.get(i-1));
                        System.out.println(i);
                    }
                     */
                    //agrego en la primera posicion la cadena vacia (solitos se recorren los demas elementos)
                    k.add(0, "\u03B5");

                    int longIncremental = k.size();
                    int inicioNuevo = 1;
                    int incrementoDeInicioNuevo = 0;
                    for (int i = 0; i < B.size(); i++) {
                        String cadenaA = B.get(i);//tomo el elemento de A en la posicion i
                        for (int j = inicioNuevo; j < longIncremental; j++) {
                            String cadenaNueva = cadenaA + k.get(j);
                            k.add(cadenaNueva);
                            incrementoDeInicioNuevo++;
                        }
                        //el problema está aquí
                        //si el lenguaje es de tamaño 2, i == 1, si es de tamaño 3, i == 2
                        //al parecer i == tamaño del arreglo -1 funciona para todos 
                        if (i == B.size() - 1) {
                            i = -1;
                            System.out.println(incrementoDeInicioNuevo);
                            inicioNuevo = inicioNuevo + incrementoDeInicioNuevo - 2;//aqui tambien hay problema//no se porque pero ese 2 es una constante
                            incrementoDeInicioNuevo = 0;
                            longIncremental = k.size();
                            if (longIncremental > 10) {
                                break;
                            }
                        }
                    }

                    ArrayList<String> inter = new ArrayList<String>();
                    //agregar coincidencias
                    for (int i = 0; i < k.size(); i++) {
                        for (int j = 0; j < A.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (k.get(i).equals(A.get(j))) {
                                inter.add(k.get(i));
                            }
                        }
                    }

                    //System.out.println("Tamaño de union " + inter.size());
                    String cadenaResultado = "";
                    for (int i = 0; i < inter.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + inter.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }

            }

            //DIFERENCIA A*-B
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == '*' && etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[2] == '-' && etiquetaOperacionResultante.getText().toCharArray()[3] == 'B') {
                if (!A.isEmpty() && !B.isEmpty()) {

                    //copio el lenguaje al resultante
                    ArrayList<String> k = (ArrayList) A.clone();
                    //lo recorro para agregar cadena vacia en la primera posicion
                    //NOTA: al parecer con solo ingresar en la posicion 0 se recorren
                    //los demas elementos
                    /*for (int i = k.size()-1; i > 0; i--) {
                        k.add(i+1, k.get(i-1));
                        System.out.println(i);
                    }
                     */
                    //agrego en la primera posicion la cadena vacia (solitos se recorren los demas elementos)
                    k.add(0, "\u03B5");

                    int longIncremental = k.size();
                    int inicioNuevo = 1;
                    int incrementoDeInicioNuevo = 0;
                    for (int i = 0; i < A.size(); i++) {
                        String cadenaA = A.get(i);//tomo el elemento de A en la posicion i
                        for (int j = inicioNuevo; j < longIncremental; j++) {
                            String cadenaNueva = cadenaA + k.get(j);
                            k.add(cadenaNueva);
                            incrementoDeInicioNuevo++;
                        }
                        //el problema está aquí
                        //si el lenguaje es de tamaño 2, i == 1, si es de tamaño 3, i == 2
                        //al parecer i == tamaño del arreglo -1 funciona para todos 
                        if (i == A.size() - 1) {
                            i = -1;
                            System.out.println(incrementoDeInicioNuevo);
                            inicioNuevo = inicioNuevo + incrementoDeInicioNuevo - 2;//aqui tambien hay problema//no se porque pero ese 2 es una constante
                            incrementoDeInicioNuevo = 0;
                            longIncremental = k.size();
                            if (longIncremental > 10) {
                                break;
                            }
                        }
                    }

                    ArrayList<String> dif = new ArrayList<String>();
                    int detector = 0;
                    //agregar coincidencias
                    for (int i = 0; i < k.size(); i++) {
                        for (int j = 0; j < B.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (k.get(i).equals(B.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            dif.add(k.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }

                    String cadenaResultado = "";
                    for (int i = 0; i < dif.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + dif.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }
            }

            //DIFERENCIA A-B*
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == '-' && etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[2] == 'B' && etiquetaOperacionResultante.getText().toCharArray()[3] == '*') {
                if (!A.isEmpty() && !B.isEmpty()) {

                    //copio el lenguaje al resultante
                    ArrayList<String> k = (ArrayList) B.clone();
                    //lo recorro para agregar cadena vacia en la primera posicion
                    //NOTA: al parecer con solo ingresar en la posicion 0 se recorren
                    //los demas elementos
                    /*for (int i = k.size()-1; i > 0; i--) {
                        k.add(i+1, k.get(i-1));
                        System.out.println(i);
                    }
                     */
                    //agrego en la primera posicion la cadena vacia (solitos se recorren los demas elementos)
                    k.add(0, "\u03B5");

                    int longIncremental = k.size();
                    int inicioNuevo = 1;
                    int incrementoDeInicioNuevo = 0;
                    for (int i = 0; i < B.size(); i++) {
                        String cadenaA = B.get(i);//tomo el elemento de A en la posicion i
                        for (int j = inicioNuevo; j < longIncremental; j++) {
                            String cadenaNueva = cadenaA + k.get(j);
                            k.add(cadenaNueva);
                            incrementoDeInicioNuevo++;
                        }
                        //el problema está aquí
                        //si el lenguaje es de tamaño 2, i == 1, si es de tamaño 3, i == 2
                        //al parecer i == tamaño del arreglo -1 funciona para todos 
                        if (i == B.size() - 1) {
                            i = -1;
                            System.out.println(incrementoDeInicioNuevo);
                            inicioNuevo = inicioNuevo + incrementoDeInicioNuevo - 2;//aqui tambien hay problema//no se porque pero ese 2 es una constante
                            incrementoDeInicioNuevo = 0;
                            longIncremental = k.size();
                            if (longIncremental > 10) {
                                break;
                            }
                        }
                    }

                    ArrayList<String> dif = new ArrayList<String>();
                    int detector = 0;
                    //agregar coincidencias
                    for (int i = 0; i < k.size(); i++) {
                        for (int j = 0; j < A.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (k.get(i).equals(A.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            dif.add(k.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }

                    String cadenaResultado = "";
                    for (int i = 0; i < dif.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + dif.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }
            }
            //MULTIPLICACIÓN A*xB
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == '*' && etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[2] == 'x' && etiquetaOperacionResultante.getText().toCharArray()[3] == 'B') {
                if (!A.isEmpty() && !B.isEmpty()) {

                    //copio el lenguaje al resultante
                    ArrayList<String> k = (ArrayList) A.clone();
                    //lo recorro para agregar cadena vacia en la primera posicion
                    //NOTA: al parecer con solo ingresar en la posicion 0 se recorren
                    //los demas elementos
                    /*for (int i = k.size()-1; i > 0; i--) {
                        k.add(i+1, k.get(i-1));
                        System.out.println(i);
                    }
                     */
                    //agrego en la primera posicion la cadena vacia (solitos se recorren los demas elementos)
                    k.add(0, "\u03B5");

                    int longIncremental = k.size();
                    int inicioNuevo = 1;
                    int incrementoDeInicioNuevo = 0;
                    for (int i = 0; i < A.size(); i++) {
                        String cadenaA = A.get(i);//tomo el elemento de A en la posicion i
                        for (int j = inicioNuevo; j < longIncremental; j++) {
                            String cadenaNueva = cadenaA + k.get(j);
                            k.add(cadenaNueva);
                            incrementoDeInicioNuevo++;
                        }
                        //el problema está aquí
                        //si el lenguaje es de tamaño 2, i == 1, si es de tamaño 3, i == 2
                        //al parecer i == tamaño del arreglo -1 funciona para todos 
                        if (i == A.size() - 1) {
                            i = -1;
                            System.out.println(incrementoDeInicioNuevo);
                            inicioNuevo = inicioNuevo + incrementoDeInicioNuevo - 2;//aqui tambien hay problema//no se porque pero ese 2 es una constante
                            incrementoDeInicioNuevo = 0;
                            longIncremental = k.size();
                            if (longIncremental > 10) {
                                break;
                            }
                        }
                    }

                    ArrayList<String> multi = new ArrayList<String>();
                    for (int i = 1; i < k.size(); i++) {
                        String cadena = k.get(i);
                        for (int j = 0; j < B.size(); j++) {
                            cadena = cadena + B.get(j);
                            multi.add(cadena);
                            cadena = k.get(i);
                        }
                    }
                    String cadenaResultado = "";
                    for (int i = 0; i < multi.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + multi.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }
            }
            //MULTIPLICACION AxB*
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == 'x' && etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[2] == 'B' && etiquetaOperacionResultante.getText().toCharArray()[3] == '*') {
                if (!A.isEmpty() && !B.isEmpty()) {

                    //copio el lenguaje al resultante
                    ArrayList<String> k = (ArrayList) B.clone();
                    //lo recorro para agregar cadena vacia en la primera posicion
                    //NOTA: al parecer con solo ingresar en la posicion 0 se recorren
                    //los demas elementos
                    /*for (int i = k.size()-1; i > 0; i--) {
                        k.add(i+1, k.get(i-1));
                        System.out.println(i);
                    }
                     */
                    //agrego en la primera posicion la cadena vacia (solitos se recorren los demas elementos)
                    k.add(0, "\u03B5");

                    int longIncremental = k.size();
                    int inicioNuevo = 1;
                    int incrementoDeInicioNuevo = 0;
                    for (int i = 0; i < B.size(); i++) {
                        String cadenaA = B.get(i);//tomo el elemento de A en la posicion i
                        for (int j = inicioNuevo; j < longIncremental; j++) {
                            String cadenaNueva = cadenaA + k.get(j);
                            k.add(cadenaNueva);
                            incrementoDeInicioNuevo++;
                        }
                        //el problema está aquí
                        //si el lenguaje es de tamaño 2, i == 1, si es de tamaño 3, i == 2
                        //al parecer i == tamaño del arreglo -1 funciona para todos 
                        if (i == B.size() - 1) {
                            i = -1;
                            System.out.println(incrementoDeInicioNuevo);
                            inicioNuevo = inicioNuevo + incrementoDeInicioNuevo - 2;//aqui tambien hay problema//no se porque pero ese 2 es una constante
                            incrementoDeInicioNuevo = 0;
                            longIncremental = k.size();
                            if (longIncremental > 10) {
                                break;
                            }
                        }
                    }

                    ArrayList<String> multi = new ArrayList<String>();
                    for (int i = 0; i < A.size(); i++) {
                        String cadena = A.get(i);
                        for (int j = 0; j < k.size(); j++) {
                            cadena = cadena + k.get(j);
                            multi.add(cadena);
                            cadena = A.get(i);
                        }
                    }
                    String cadenaResultado = "";
                    for (int i = 0; i < multi.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + multi.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }
            }
            //simétrica A* s B
            if (etiquetaOperacionResultante.getText().toCharArray()[2] == "\u0394".toCharArray()[0] && etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[1] == '*' && etiquetaOperacionResultante.getText().toCharArray()[3] == 'B') {
                if (!A.isEmpty() && !B.isEmpty()) {

                    //copio el lenguaje al resultante
                    ArrayList<String> k = (ArrayList) A.clone();
                    //lo recorro para agregar cadena vacia en la primera posicion
                    //NOTA: al parecer con solo ingresar en la posicion 0 se recorren
                    //los demas elementos
                    /*for (int i = k.size()-1; i > 0; i--) {
                        k.add(i+1, k.get(i-1));
                        System.out.println(i);
                    }
                     */
                    //agrego en la primera posicion la cadena vacia (solitos se recorren los demas elementos)
                    k.add(0, "\u03B5");

                    int longIncremental = k.size();
                    int inicioNuevo = 1;
                    int incrementoDeInicioNuevo = 0;
                    for (int i = 0; i < A.size(); i++) {
                        String cadenaA = A.get(i);//tomo el elemento de A en la posicion i
                        for (int j = inicioNuevo; j < longIncremental; j++) {
                            String cadenaNueva = cadenaA + k.get(j);
                            k.add(cadenaNueva);
                            incrementoDeInicioNuevo++;
                        }
                        //el problema está aquí
                        //si el lenguaje es de tamaño 2, i == 1, si es de tamaño 3, i == 2
                        //al parecer i == tamaño del arreglo -1 funciona para todos 
                        if (i == A.size() - 1) {
                            i = -1;
                            System.out.println(incrementoDeInicioNuevo);
                            inicioNuevo = inicioNuevo + incrementoDeInicioNuevo - 2;//aqui tambien hay problema//no se porque pero ese 2 es una constante
                            incrementoDeInicioNuevo = 0;
                            longIncremental = k.size();
                            if (longIncremental > 10) {
                                break;
                            }
                        }
                    }

                    ArrayList<String> sim = new ArrayList<String>();
                    int detector = 0;
                    //agregar coincidencias
                    for (int i = 0; i < k.size(); i++) {
                        for (int j = 0; j < B.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (k.get(i).equals(B.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            sim.add(k.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }
                    detector = 0;
                    for (int i = 0; i < B.size(); i++) {
                        for (int j = 0; j < k.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (B.get(i).equals(k.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            sim.add(B.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }

                    //System.out.println("Tamaño de union " + dif.size());
                    String cadenaResultado = "";
                    for (int i = 0; i < sim.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + sim.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }

            }
            //simétrica A s B*
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == "\u0394".toCharArray()[0] && etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[3] == '*' && etiquetaOperacionResultante.getText().toCharArray()[2] == 'B') {
                if (!A.isEmpty() && !B.isEmpty()) {

                    //copio el lenguaje al resultante
                    ArrayList<String> k = (ArrayList) B.clone();
                    //lo recorro para agregar cadena vacia en la primera posicion
                    //NOTA: al parecer con solo ingresar en la posicion 0 se recorren
                    //los demas elementos
                    /*for (int i = k.size()-1; i > 0; i--) {
                        k.add(i+1, k.get(i-1));
                        System.out.println(i);
                    }
                     */
                    //agrego en la primera posicion la cadena vacia (solitos se recorren los demas elementos)
                    k.add(0, "\u03B5");

                    int longIncremental = k.size();
                    int inicioNuevo = 1;
                    int incrementoDeInicioNuevo = 0;
                    for (int i = 0; i < B.size(); i++) {
                        String cadenaA = B.get(i);//tomo el elemento de A en la posicion i
                        for (int j = inicioNuevo; j < longIncremental; j++) {
                            String cadenaNueva = cadenaA + k.get(j);
                            k.add(cadenaNueva);
                            incrementoDeInicioNuevo++;
                        }
                        //el problema está aquí
                        //si el lenguaje es de tamaño 2, i == 1, si es de tamaño 3, i == 2
                        //al parecer i == tamaño del arreglo -1 funciona para todos 
                        if (i == B.size() - 1) {
                            i = -1;
                            System.out.println(incrementoDeInicioNuevo);
                            inicioNuevo = inicioNuevo + incrementoDeInicioNuevo - 2;//aqui tambien hay problema//no se porque pero ese 2 es una constante
                            incrementoDeInicioNuevo = 0;
                            longIncremental = k.size();
                            if (longIncremental > 10) {
                                break;
                            }
                        }
                    }

                    ArrayList<String> sim = new ArrayList<String>();
                    int detector = 0;
                    //agregar coincidencias
                    for (int i = 0; i < A.size(); i++) {
                        for (int j = 0; j < k.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (A.get(i).equals(k.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            sim.add(A.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }
                    detector = 0;
                    for (int i = 0; i < k.size(); i++) {
                        for (int j = 0; j < A.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (k.get(i).equals(A.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            sim.add(k.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }

                    //System.out.println("Tamaño de union " + dif.size());
                    String cadenaResultado = "";
                    for (int i = 0; i < sim.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + sim.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }

            }
            //UNION POSITIVA A+UB
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == '+' && etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[2] == 'U' && etiquetaOperacionResultante.getText().toCharArray()[3] == 'B') {
                if (!A.isEmpty() && !B.isEmpty()) {
                    ArrayList<String> k = (ArrayList) A.clone();
                    int longIncremental = k.size();
                    int inicioNuevo = 0;
                    int incrementoDeInicioNuevo = 0;
                    for (int i = 0; i < A.size(); i++) {
                        String cadenaA = A.get(i);//tomo el elemento de A en la posicion i
                        for (int j = inicioNuevo; j < longIncremental; j++) {
                            String cadenaNueva = cadenaA + k.get(j);
                            k.add(cadenaNueva);
                            incrementoDeInicioNuevo++;
                        }
                        if (i == A.size() - 1) {
                            i = -1;
                            //System.out.println(incrementoDeInicioNuevo);
                            inicioNuevo = inicioNuevo + incrementoDeInicioNuevo - 2;//aqui tambien hay problema//no se porque pero ese 2 es una constante
                            incrementoDeInicioNuevo = 0;
                            longIncremental = k.size();
                            if (longIncremental > 10) {
                                break;
                            }
                        }
                    }
                    for (int i = 0; i < A.size(); i++) {
                        k.remove(0);
                    }
                    System.out.println("P1 = " + k.get(0));
                    System.out.println("P2 = " + k.get(1));

                    //comienza la union
                    ArrayList<String> union = new ArrayList<String>();
                    for (int i = 0; i < k.size(); i++) {
                        union.add(k.get(i));
                    }
                    int incioB = 0;
                    for (int i = k.size(); i < k.size() + B.size(); i++) {
                        union.add(B.get(incioB));
                        incioB++;
                    }
                    //eliminar el duplicado
                    for (int i = 0; i < union.size() - 1; i++) {
                        for (int j = 1; j < union.size(); j++) {
                            if (union.get(i).equals(union.get(j)) && j != i) {
                                union.remove(j);
                            }
                        }
                    }
                    //System.out.println("Tamaño de union " + union.size());
                    String cadenaResultado = "";
                    for (int i = 0; i < union.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + union.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en el lenguaje");
                }
            }
            //UNION POSITIVA AUB+
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == 'U' && etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[2] == 'B' && etiquetaOperacionResultante.getText().toCharArray()[3] == '+') {
                if (!A.isEmpty() && !B.isEmpty()) {
                    ArrayList<String> k = (ArrayList) B.clone();
                    int longIncremental = k.size();
                    int inicioNuevo = 0;
                    int incrementoDeInicioNuevo = 0;
                    for (int i = 0; i < B.size(); i++) {
                        String cadenaA = B.get(i);//tomo el elemento de A en la posicion i
                        for (int j = inicioNuevo; j < longIncremental; j++) {
                            String cadenaNueva = cadenaA + k.get(j);
                            k.add(cadenaNueva);
                            incrementoDeInicioNuevo++;
                        }
                        if (i == B.size() - 1) {
                            i = -1;
                            //System.out.println(incrementoDeInicioNuevo);
                            inicioNuevo = inicioNuevo + incrementoDeInicioNuevo - 2;//aqui tambien hay problema//no se porque pero ese 2 es una constante
                            incrementoDeInicioNuevo = 0;
                            longIncremental = k.size();
                            if (longIncremental > 10) {
                                break;
                            }
                        }
                    }
                    for (int i = 0; i < B.size(); i++) {
                        k.remove(0);
                    }
                    System.out.println("P1 = " + k.get(0));
                    System.out.println("P2 = " + k.get(1));

                    //comienza la union
                    ArrayList<String> union = new ArrayList<String>();
                    for (int i = 0; i < A.size(); i++) {
                        union.add(A.get(i));
                    }
                    int incioB = 0;
                    for (int i = A.size(); i < A.size() + k.size(); i++) {
                        union.add(k.get(incioB));
                        incioB++;
                    }
                    //eliminar el duplicado
                    for (int i = 0; i < union.size() - 1; i++) {
                        for (int j = 1; j < union.size(); j++) {
                            if (union.get(i).equals(union.get(j)) && j != i) {
                                union.remove(j);
                            }
                        }
                    }
                    //System.out.println("Tamaño de union " + union.size());
                    String cadenaResultado = "";
                    for (int i = 0; i < union.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + union.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en el lenguaje");
                }
            }
            //INTERSECCION POSITIVA A+iB
            if (etiquetaOperacionResultante.getText().toCharArray()[2] == "\u2229".toCharArray()[0] && etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[1] == '+' && etiquetaOperacionResultante.getText().toCharArray()[3] == 'B') {
                if (!A.isEmpty() && !B.isEmpty()) {
                    ArrayList<String> k = (ArrayList) A.clone();
                    int longIncremental = k.size();
                    int inicioNuevo = 0;
                    int incrementoDeInicioNuevo = 0;
                    for (int i = 0; i < A.size(); i++) {
                        String cadenaA = A.get(i);//tomo el elemento de A en la posicion i
                        for (int j = inicioNuevo; j < longIncremental; j++) {
                            String cadenaNueva = cadenaA + k.get(j);
                            k.add(cadenaNueva);
                            incrementoDeInicioNuevo++;
                        }
                        if (i == A.size() - 1) {
                            i = -1;
                            //System.out.println(incrementoDeInicioNuevo);
                            inicioNuevo = inicioNuevo + incrementoDeInicioNuevo - 2;//aqui tambien hay problema//no se porque pero ese 2 es una constante
                            incrementoDeInicioNuevo = 0;
                            longIncremental = k.size();
                            if (longIncremental > 10) {
                                break;
                            }
                        }
                    }
                    for (int i = 0; i < A.size(); i++) {
                        k.remove(0);
                    }
                    System.out.println("P1 = " + k.get(0));
                    System.out.println("P2 = " + k.get(1));

                    //comienza la interseccion
                    ArrayList<String> inter = new ArrayList<String>();
                    //agregar coincidencias
                    for (int i = 0; i < k.size(); i++) {
                        for (int j = 0; j < B.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (k.get(i).equals(B.get(j))) {
                                inter.add(k.get(i));
                            }
                        }
                    }

                    //System.out.println("Tamaño de union " + inter.size());
                    String cadenaResultado = "";
                    for (int i = 0; i < inter.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + inter.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en el lenguaje");
                }
            }
            //INTERSECCION POSITIVA AiB+
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == "\u2229".toCharArray()[0] && etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[3] == '+' && etiquetaOperacionResultante.getText().toCharArray()[2] == 'B') {
                if (!A.isEmpty() && !B.isEmpty()) {
                    ArrayList<String> k = (ArrayList) B.clone();
                    int longIncremental = k.size();
                    int inicioNuevo = 0;
                    int incrementoDeInicioNuevo = 0;
                    for (int i = 0; i < B.size(); i++) {
                        String cadenaA = B.get(i);//tomo el elemento de A en la posicion i
                        for (int j = inicioNuevo; j < longIncremental; j++) {
                            String cadenaNueva = cadenaA + k.get(j);
                            k.add(cadenaNueva);
                            incrementoDeInicioNuevo++;
                        }
                        if (i == B.size() - 1) {
                            i = -1;
                            //System.out.println(incrementoDeInicioNuevo);
                            inicioNuevo = inicioNuevo + incrementoDeInicioNuevo - 2;//aqui tambien hay problema//no se porque pero ese 2 es una constante
                            incrementoDeInicioNuevo = 0;
                            longIncremental = k.size();
                            if (longIncremental > 10) {
                                break;
                            }
                        }
                    }
                    for (int i = 0; i < B.size(); i++) {
                        k.remove(0);
                    }
                    System.out.println("P1 = " + k.get(0));
                    System.out.println("P2 = " + k.get(1));

                    //comienza la interseccion
                    ArrayList<String> inter = new ArrayList<String>();
                    //agregar coincidencias
                    for (int i = 0; i < A.size(); i++) {
                        for (int j = 0; j < k.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (A.get(i).equals(k.get(j))) {
                                inter.add(A.get(i));
                            }
                        }
                    }

                    //System.out.println("Tamaño de union " + inter.size());
                    String cadenaResultado = "";
                    for (int i = 0; i < inter.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + inter.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en el lenguaje");
                }
            }
            //DIFERENCIA POSITIVA A+-B
            if (etiquetaOperacionResultante.getText().toCharArray()[2] == '-' && etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[1] == '+' && etiquetaOperacionResultante.getText().toCharArray()[3] == 'B') {
                if (!A.isEmpty() && !B.isEmpty()) {
                    ArrayList<String> k = (ArrayList) A.clone();
                    int longIncremental = k.size();
                    int inicioNuevo = 0;
                    int incrementoDeInicioNuevo = 0;
                    for (int i = 0; i < A.size(); i++) {
                        String cadenaA = A.get(i);//tomo el elemento de A en la posicion i
                        for (int j = inicioNuevo; j < longIncremental; j++) {
                            String cadenaNueva = cadenaA + k.get(j);
                            k.add(cadenaNueva);
                            incrementoDeInicioNuevo++;
                        }
                        if (i == A.size() - 1) {
                            i = -1;
                            //System.out.println(incrementoDeInicioNuevo);
                            inicioNuevo = inicioNuevo + incrementoDeInicioNuevo - 2;//aqui tambien hay problema//no se porque pero ese 2 es una constante
                            incrementoDeInicioNuevo = 0;
                            longIncremental = k.size();
                            if (longIncremental > 10) {
                                break;
                            }
                        }
                    }
                    for (int i = 0; i < A.size(); i++) {
                        k.remove(0);
                    }
                    System.out.println("P1 = " + k.get(0));
                    System.out.println("P2 = " + k.get(1));

                    //comienza la diferencia
                    ArrayList<String> dif = new ArrayList<String>();
                    int detector = 0;
                    //agregar coincidencias
                    for (int i = 0; i < k.size(); i++) {
                        for (int j = 0; j < B.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (k.get(i).equals(B.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            dif.add(k.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }

                    //System.out.println("Tamaño de union " + dif.size());
                    String cadenaResultado = "";
                    for (int i = 0; i < dif.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + dif.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en el lenguaje");
                }
            }

            //DIFERENCIA POSITIVA A-B+
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == '-' && etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[3] == '+' && etiquetaOperacionResultante.getText().toCharArray()[2] == 'B') {
                if (!A.isEmpty() && !B.isEmpty()) {
                    ArrayList<String> k = (ArrayList) B.clone();
                    int longIncremental = k.size();
                    int inicioNuevo = 0;
                    int incrementoDeInicioNuevo = 0;
                    for (int i = 0; i < B.size(); i++) {
                        String cadenaA = B.get(i);//tomo el elemento de A en la posicion i
                        for (int j = inicioNuevo; j < longIncremental; j++) {
                            String cadenaNueva = cadenaA + k.get(j);
                            k.add(cadenaNueva);
                            incrementoDeInicioNuevo++;
                        }
                        if (i == B.size() - 1) {
                            i = -1;
                            //System.out.println(incrementoDeInicioNuevo);
                            inicioNuevo = inicioNuevo + incrementoDeInicioNuevo - 2;//aqui tambien hay problema//no se porque pero ese 2 es una constante
                            incrementoDeInicioNuevo = 0;
                            longIncremental = k.size();
                            if (longIncremental > 10) {
                                break;
                            }
                        }
                    }
                    for (int i = 0; i < B.size(); i++) {
                        k.remove(0);
                    }
                    System.out.println("P1 = " + k.get(0));
                    System.out.println("P2 = " + k.get(1));

                    //comienza la diferencia
                    ArrayList<String> dif = new ArrayList<String>();
                    int detector = 0;
                    //agregar coincidencias
                    for (int i = 0; i < A.size(); i++) {
                        for (int j = 0; j < k.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (A.get(i).equals(k.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            dif.add(A.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }

                    //System.out.println("Tamaño de union " + dif.size());
                    String cadenaResultado = "";
                    for (int i = 0; i < dif.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + dif.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en el lenguaje");
                }
            }

            //SIMETRICA POSITIVA A+ s B
            if (etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[1] == '+' && etiquetaOperacionResultante.getText().toCharArray()[2] == "\u0394".toCharArray()[0] && etiquetaOperacionResultante.getText().toCharArray()[3] == 'B') {
                if (!A.isEmpty() && !B.isEmpty()) {
                    ArrayList<String> k = (ArrayList) A.clone();
                    int longIncremental = k.size();
                    int inicioNuevo = 0;
                    int incrementoDeInicioNuevo = 0;
                    for (int i = 0; i < A.size(); i++) {
                        String cadenaA = A.get(i);//tomo el elemento de A en la posicion i
                        for (int j = inicioNuevo; j < longIncremental; j++) {
                            String cadenaNueva = cadenaA + k.get(j);
                            k.add(cadenaNueva);
                            incrementoDeInicioNuevo++;
                        }
                        if (i == A.size() - 1) {
                            i = -1;
                            //System.out.println(incrementoDeInicioNuevo);
                            inicioNuevo = inicioNuevo + incrementoDeInicioNuevo - 2;//aqui tambien hay problema//no se porque pero ese 2 es una constante
                            incrementoDeInicioNuevo = 0;
                            longIncremental = k.size();
                            if (longIncremental > 10) {
                                break;
                            }
                        }
                    }
                    for (int i = 0; i < A.size(); i++) {
                        k.remove(0);
                    }
                    System.out.println("P1 = " + k.get(0));
                    System.out.println("P2 = " + k.get(1));

                    //comienza la simetrica
                    ArrayList<String> sim = new ArrayList<String>();
                    int detector = 0;
                    //agregar coincidencias
                    for (int i = 0; i < k.size(); i++) {
                        for (int j = 0; j < B.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (k.get(i).equals(B.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            sim.add(k.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }
                    detector = 0;
                    for (int i = 0; i < B.size(); i++) {
                        for (int j = 0; j < k.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (B.get(i).equals(k.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            sim.add(B.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }

                    //System.out.println("Tamaño de union " + dif.size());
                    String cadenaResultado = "";
                    for (int i = 0; i < sim.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + sim.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en el lenguaje");
                }
            }
            //SIMETRICA POSITIVA A s B+
            if (etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[1] == "\u0394".toCharArray()[0] && etiquetaOperacionResultante.getText().toCharArray()[2] == 'B' && etiquetaOperacionResultante.getText().toCharArray()[3] == '+') {
                if (!A.isEmpty() && !B.isEmpty()) {
                    ArrayList<String> k = (ArrayList) B.clone();
                    int longIncremental = k.size();
                    int inicioNuevo = 0;
                    int incrementoDeInicioNuevo = 0;
                    for (int i = 0; i < B.size(); i++) {
                        String cadenaA = B.get(i);//tomo el elemento de A en la posicion i
                        for (int j = inicioNuevo; j < longIncremental; j++) {
                            String cadenaNueva = cadenaA + k.get(j);
                            k.add(cadenaNueva);
                            incrementoDeInicioNuevo++;
                        }
                        if (i == B.size() - 1) {
                            i = -1;
                            //System.out.println(incrementoDeInicioNuevo);
                            inicioNuevo = inicioNuevo + incrementoDeInicioNuevo - 2;//aqui tambien hay problema//no se porque pero ese 2 es una constante
                            incrementoDeInicioNuevo = 0;
                            longIncremental = k.size();
                            if (longIncremental > 10) {
                                break;
                            }
                        }
                    }
                    for (int i = 0; i < B.size(); i++) {
                        k.remove(0);
                    }
                    System.out.println("P1 = " + k.get(0));
                    System.out.println("P2 = " + k.get(1));

                    //comienza la simetrica
                    ArrayList<String> sim = new ArrayList<String>();
                    int detector = 0;
                    //agregar coincidencias
                    for (int i = 0; i < A.size(); i++) {
                        for (int j = 0; j < k.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (A.get(i).equals(k.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            sim.add(A.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }
                    detector = 0;
                    for (int i = 0; i < k.size(); i++) {
                        for (int j = 0; j < A.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (k.get(i).equals(A.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            sim.add(k.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }

                    //System.out.println("Tamaño de union " + dif.size());
                    String cadenaResultado = "";
                    for (int i = 0; i < sim.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + sim.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en el lenguaje");
                }
            }

            //MULTIPLICACION POSITVA A+xB
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == '+' && etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[2] == 'x' && etiquetaOperacionResultante.getText().toCharArray()[3] == 'B') {
                if (!A.isEmpty() && !B.isEmpty()) {

                    ArrayList<String> k = (ArrayList) A.clone();
                    int longIncremental = k.size();
                    int inicioNuevo = 0;
                    int incrementoDeInicioNuevo = 0;
                    for (int i = 0; i < A.size(); i++) {
                        String cadenaA = A.get(i);//tomo el elemento de A en la posicion i
                        for (int j = inicioNuevo; j < longIncremental; j++) {
                            String cadenaNueva = cadenaA + k.get(j);
                            k.add(cadenaNueva);
                            incrementoDeInicioNuevo++;
                        }
                        if (i == A.size() - 1) {
                            i = -1;
                            //System.out.println(incrementoDeInicioNuevo);
                            inicioNuevo = inicioNuevo + incrementoDeInicioNuevo - 2;//aqui tambien hay problema//no se porque pero ese 2 es una constante
                            incrementoDeInicioNuevo = 0;
                            longIncremental = k.size();
                            if (longIncremental > 10) {
                                break;
                            }
                        }
                    }
                    for (int i = 0; i < A.size(); i++) {
                        k.remove(0);
                    }
                    System.out.println("P1 = " + k.get(0));
                    System.out.println("P2 = " + k.get(1));

                    ArrayList<String> multi = new ArrayList<String>();
                    for (int i = 0; i < k.size(); i++) {
                        String cadena = k.get(i);
                        for (int j = 0; j < B.size(); j++) {
                            cadena = cadena + B.get(j);
                            multi.add(cadena);
                            cadena = k.get(i);
                        }
                    }
                    String cadenaResultado = "";
                    for (int i = 0; i < multi.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + multi.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }
            }

            //MULTIPLICACION POSITIVA AxB+
            if (etiquetaOperacionResultante.getText().toCharArray()[1] == 'x' && etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[2] == 'B' && etiquetaOperacionResultante.getText().toCharArray()[3] == '+') {
                if (!A.isEmpty() && !B.isEmpty()) {

                    ArrayList<String> k = (ArrayList) B.clone();
                    int longIncremental = k.size();
                    int inicioNuevo = 0;
                    int incrementoDeInicioNuevo = 0;
                    for (int i = 0; i < B.size(); i++) {
                        String cadenaA = B.get(i);//tomo el elemento de A en la posicion i
                        for (int j = inicioNuevo; j < longIncremental; j++) {
                            String cadenaNueva = cadenaA + k.get(j);
                            k.add(cadenaNueva);
                            incrementoDeInicioNuevo++;
                        }
                        if (i == B.size() - 1) {
                            i = -1;
                            //System.out.println(incrementoDeInicioNuevo);
                            inicioNuevo = inicioNuevo + incrementoDeInicioNuevo - 2;//aqui tambien hay problema//no se porque pero ese 2 es una constante
                            incrementoDeInicioNuevo = 0;
                            longIncremental = k.size();
                            if (longIncremental > 10) {
                                break;
                            }
                        }
                    }
                    for (int i = 0; i < B.size(); i++) {
                        k.remove(0);
                    }
                    System.out.println("P1 = " + k.get(0));
                    System.out.println("P2 = " + k.get(1));

                    ArrayList<String> multi = new ArrayList<String>();
                    for (int i = 0; i < A.size(); i++) {
                        String cadena = A.get(i);
                        for (int j = 0; j < k.size(); j++) {
                            cadena = cadena + k.get(j);
                            multi.add(cadena);
                            cadena = A.get(i);
                        }
                    }
                    String cadenaResultado = "";
                    for (int i = 0; i < multi.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + multi.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }
            }

        }

        //COMPLEMENTO DE 3 LENGUAJES
        if (cantidad3.isSelected() && etiquetaOperacionResultante.getText().length() == 2) {

            //Complemento de A con respecto a B y C
            if (etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[1] == 'c') {
                if (!A.isEmpty() && !B.isEmpty() && !C.isEmpty()) {

                    ArrayList<String> dif = new ArrayList<String>();
                    int detector = 0;
                    //agregar coincidencias A B
                    for (int i = 0; i < B.size(); i++) {
                        for (int j = 0; j < A.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (B.get(i).equals(A.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            dif.add(B.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }

                    detector = 0;
                    //agregar coincidencias A
                    for (int i = 0; i < C.size(); i++) {
                        for (int j = 0; j < A.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (C.get(i).equals(A.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            dif.add(C.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }

                    String cadenaResultado = "";
                    for (int i = 0; i < dif.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + dif.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }
            }

            //Complemento de B con respecto a A y C
            if (etiquetaOperacionResultante.getText().toCharArray()[0] == 'B' && etiquetaOperacionResultante.getText().toCharArray()[1] == 'c') {
                if (!A.isEmpty() && !B.isEmpty() && !C.isEmpty()) {

                    ArrayList<String> dif = new ArrayList<String>();
                    int detector = 0;
                    //agregar coincidencias A B
                    for (int i = 0; i < A.size(); i++) {
                        for (int j = 0; j < B.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (A.get(i).equals(B.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            dif.add(A.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }

                    detector = 0;
                    //agregar coincidencias A
                    for (int i = 0; i < C.size(); i++) {
                        for (int j = 0; j < B.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (C.get(i).equals(B.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            dif.add(C.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }

                    String cadenaResultado = "";
                    for (int i = 0; i < dif.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + dif.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }
            }

            //Complemento de C con respecto a A y B
            if (etiquetaOperacionResultante.getText().toCharArray()[0] == 'C' && etiquetaOperacionResultante.getText().toCharArray()[1] == 'c') {
                if (!A.isEmpty() && !B.isEmpty() && !C.isEmpty()) {

                    ArrayList<String> dif = new ArrayList<String>();
                    int detector = 0;
                    //agregar coincidencias A B
                    for (int i = 0; i < B.size(); i++) {
                        for (int j = 0; j < C.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (B.get(i).equals(C.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            dif.add(B.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }

                    detector = 0;
                    //agregar coincidencias A
                    for (int i = 0; i < A.size(); i++) {
                        for (int j = 0; j < C.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (A.get(i).equals(C.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            dif.add(A.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }

                    String cadenaResultado = "";
                    for (int i = 0; i < dif.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + dif.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }
            }
        }

        //OPERACIONES CON 3 LENGUAJES
        //UNION AUBUC
        if (cantidad3.isSelected() && etiquetaOperacionResultante.getText().length() == 5) {

            if (!A.isEmpty() && !B.isEmpty() && !C.isEmpty()) {

                //UNION AUBUC
                if (etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[1] == 'U' && etiquetaOperacionResultante.getText().toCharArray()[2] == 'B' && etiquetaOperacionResultante.getText().toCharArray()[3] == 'U' && etiquetaOperacionResultante.getText().toCharArray()[4] == 'C') {

                    ArrayList<String> union = new ArrayList<String>();
                    for (int i = 0; i < A.size(); i++) {
                        union.add(A.get(i));
                    }
                    int incioB = 0;
                    for (int i = A.size(); i < A.size() + B.size(); i++) {
                        union.add(B.get(incioB));
                        incioB++;
                    }
                    int inicioC = 0;
                    for (int i = A.size() + B.size(); i < A.size() + B.size() + C.size(); i++) {
                        union.add(C.get(inicioC));
                        inicioC++;
                    }
                    //eliminar el duplicado
                    for (int i = 0; i < union.size(); i++) {
                        for (int j = 1; j < union.size(); j++) {
                            if (union.get(i).equals(union.get(j)) && j != i) {
                                union.remove(j);
                            }
                        }
                    }

                    String cadenaResultado = "";
                    for (int i = 0; i < union.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + union.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                }

            } else {
                etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
            }
            //INTERSECCION A i B i C
            if (etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[1] == "\u2229".toCharArray()[0] && etiquetaOperacionResultante.getText().toCharArray()[2] == 'B' && etiquetaOperacionResultante.getText().toCharArray()[3] == "\u2229".toCharArray()[0] && etiquetaOperacionResultante.getText().toCharArray()[4] == 'C') {
                //"\u2229".toCharArray()[0]
                if (!A.isEmpty() && !B.isEmpty() && !C.isEmpty()) {
                    ArrayList<String> inter = new ArrayList<String>();
                    //agregar coincidencias
                    for (int i = 0; i < A.size(); i++) {
                        for (int j = 0; j < B.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (A.get(i).equals(B.get(j))) {
                                inter.add(A.get(i));
                            }
                        }
                    }

                    ArrayList<String> inter2 = new ArrayList<String>();

                    for (int i = 0; i < inter.size(); i++) {
                        for (int j = 0; j < C.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (inter.get(i).equals(C.get(j))) {
                                inter2.add(inter.get(i));
                            }
                        }
                    }

                    //System.out.println("Tamaño de union " + inter.size());
                    String cadenaResultado = "";
                    for (int i = 0; i < inter2.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + inter2.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }

            }
            //diferencia A-B-C
            if (etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[1] == '-' && etiquetaOperacionResultante.getText().toCharArray()[2] == 'B' && etiquetaOperacionResultante.getText().toCharArray()[3] == '-' && etiquetaOperacionResultante.getText().toCharArray()[4] == 'C') {

                if (!A.isEmpty() && !B.isEmpty() && !C.isEmpty()) {
                    ArrayList<String> dif = new ArrayList<String>();
                    int detector = 0;
                    //agregar coincidencias
                    for (int i = 0; i < A.size(); i++) {
                        for (int j = 0; j < B.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (A.get(i).equals(B.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            dif.add(A.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }

                    ArrayList<String> dif2 = new ArrayList<String>();

                    detector = 0;
                    //agregar coincidencias
                    for (int i = 0; i < dif.size(); i++) {
                        for (int j = 0; j < C.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (dif.get(i).equals(C.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            dif2.add(dif.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }

                    //System.out.println("Tamaño de union " + dif.size());
                    String cadenaResultado = "";
                    for (int i = 0; i < dif2.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + dif2.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }

            }

            //diferencia A s B s C
            if (etiquetaOperacionResultante.getText().toCharArray()[0] == 'A' && etiquetaOperacionResultante.getText().toCharArray()[1] == "\u0394".toCharArray()[0] && etiquetaOperacionResultante.getText().toCharArray()[2] == 'B' && etiquetaOperacionResultante.getText().toCharArray()[3] == "\u0394".toCharArray()[0] && etiquetaOperacionResultante.getText().toCharArray()[4] == 'C') {

                if (!A.isEmpty() && !B.isEmpty()  && !C.isEmpty()) {
                    ArrayList<String> sim = new ArrayList<String>();
                    int detector = 0;
                    //agregar coincidencias
                    for (int i = 0; i < A.size(); i++) {
                        for (int j = 0; j < B.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (A.get(i).equals(B.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            sim.add(A.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }
                    detector = 0;
                    for (int i = 0; i < B.size(); i++) {
                        for (int j = 0; j < A.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (B.get(i).equals(A.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            sim.add(B.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }
                    
                    ArrayList<String> sim2 = new ArrayList<String>();

                    //agregar coincidencias
                    for (int i = 0; i < sim.size(); i++) {
                        for (int j = 0; j < C.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (sim.get(i).equals(C.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            sim2.add(sim.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }
                    detector = 0;
                    for (int i = 0; i < C.size(); i++) {
                        for (int j = 0; j < sim.size(); j++) {
                            //EL ERRO ESTAR EN inter aqui
                            if (C.get(i).equals(sim.get(j))) {
                                detector++;
                            }
                        }
                        if (detector == 0) {
                            //si no fue igual el de A a ninguno de B, entonces agregalo
                            sim2.add(C.get(i));
                        } else {
                            //si fue A igual al menos una B, descartalo y reinicia le contador para
                            //el siguiente elemtno de A
                            detector = 0;
                        }
                    }
                    
                    //System.out.println("Tamaño de union " + dif.size());
                    String cadenaResultado = "";
                    for (int i = 0; i < sim2.size(); i++) {
                        //System.out.println(dif.get(i));
                        cadenaResultado = cadenaResultado + sim2.get(i) + ", ";
                    }
                    areaResultado.setText(cadenaResultado);

                } else {
                    etUltimaInstruccion.setText("No hay elementos en algun lenguaje lenguaje");
                }
                
            }
        }


    }//GEN-LAST:event_botonCalcularActionPerformed

    private void crearLenguajes(char a[], char b[], char c[]) {

        if (a.length > 0) {
            String cadena = "";
            for (int i = 0; i < a.length; i++) {
                if (a[i] != ',') {
                    //convierto a string y agrego la letra a la cadena
                    cadena += Character.toString(a[i]);
                } else {
                    A.add(cadena);//agrego la cadena completa antes de la coma
                    cadena = "";
                    i++;//salta el espacio
                }
            }
            A.add(cadena);
        }

        if (b.length > 0) {

            String cadena = "";
            for (int i = 0; i < b.length; i++) {
                if (b[i] != ',') {
                    //convierto a string y agrego la letra a la cadena
                    cadena += Character.toString(b[i]);
                } else {
                    B.add(cadena);//agrego la cadena completa antes de la coma
                    cadena = "";
                    i++;//salta el espacio
                }
            }
            B.add(cadena);
        }

        if (c.length > 0) {
            String cadena = "";
            for (int i = 0; i < c.length; i++) {
                if (c[i] != ',') {
                    //convierto a string y agrego la letra a la cadena
                    cadena += Character.toString(c[i]);
                } else {
                    C.add(cadena);//agrego la cadena completa antes de la coma
                    cadena = "";
                    i++;//salta el espacio
                }
            }
            C.add(cadena);
        }
        /*
        //primer codigo para hacer cadenas
        if (a.length > 0) {
            String cadena = "";
            String arregloTA[] = new String[a.length];

            for (int i = 0; i < a.length; i++) {
                arregloTA[i] = Character.toString(a[i]);
                if (!arregloTA[i].equals(",")) {
                    cadena += arregloTA[i];
                } else {
                    A.add(cadena);
                    cadena = "";
                    i++;
                }
            }
            A.add(cadena);
        }*/

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
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        try {
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.synth.SynthLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.multi.MultiLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");   
            //UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");   
            //UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel"); 
            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinookAndFeel");
            //UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinkAndFeel");
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
                new Operaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarA;
    private javax.swing.JButton agregarB;
    private javax.swing.JButton agregarC;
    private javax.swing.JTextArea areaResultado;
    private javax.swing.JButton borrar;
    private javax.swing.JButton botonCalcular;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField cajaA;
    private javax.swing.JTextField cajaB;
    private javax.swing.JTextField cajaC;
    private javax.swing.JRadioButton cantidad1;
    private javax.swing.JRadioButton cantidad2;
    private javax.swing.JRadioButton cantidad3;
    private javax.swing.ButtonGroup cantidadLenguajes;
    private javax.swing.JButton complemento;
    private javax.swing.JButton diferencia;
    private javax.swing.JLabel etUltimaInstruccion;
    private javax.swing.JLabel etiquetaOperacionResultante;
    private javax.swing.JButton interseccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kleene;
    private javax.swing.JLabel lenguaje1;
    private javax.swing.JLabel lenguaje2;
    private javax.swing.JLabel lenguaje3;
    private javax.swing.JButton multiplicacion;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JButton positiva;
    private javax.swing.JButton simetrica;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton union;
    // End of variables declaration//GEN-END:variables
}