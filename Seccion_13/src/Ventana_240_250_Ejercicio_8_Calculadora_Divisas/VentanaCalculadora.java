/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana_240_250_Ejercicio_8_Calculadora_Divisas;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class VentanaCalculadora extends javax.swing.JFrame {

    private String cadenaNumeros = "";
    private double numero1, resultado;
    private String operacion = "nula";
    private boolean activado = true;
    private boolean punto = true;

    public VentanaCalculadora() {
        initComponents();

        setSize(300, 450);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel = new javax.swing.JPanel();
        etiquetaMuestra = new javax.swing.JLabel();
        etiquetaNumeros = new javax.swing.JLabel();
        botonC = new javax.swing.JButton();
        botonRaizCuadrada = new javax.swing.JButton();
        botonDivision = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        botonMulti = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        botonRestar = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        botonSuma = new javax.swing.JButton();
        botonMasMenos = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        calculadoraEstandar = new javax.swing.JMenuItem();
        conversorDivisas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setPreferredSize(new java.awt.Dimension(603, 450));

        panel.setLayout(new java.awt.GridBagLayout());

        etiquetaMuestra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etiquetaMuestra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panel.add(etiquetaMuestra, gridBagConstraints);

        etiquetaNumeros.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        etiquetaNumeros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaNumeros.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        panel.add(etiquetaNumeros, gridBagConstraints);

        botonC.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonC.setText("C");
        botonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonC, gridBagConstraints);

        botonRaizCuadrada.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonRaizCuadrada.setText("RC");
        botonRaizCuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRaizCuadradaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonRaizCuadrada, gridBagConstraints);

        botonDivision.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonDivision.setText("/");
        botonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDivisionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonDivision, gridBagConstraints);

        botonBorrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonBorrar.setText("Borrar");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonBorrar, gridBagConstraints);

        boton7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton7.setText("7");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton7, gridBagConstraints);

        boton8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton8, gridBagConstraints);

        boton9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton9, gridBagConstraints);

        botonMulti.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonMulti.setText("X");
        botonMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonMulti, gridBagConstraints);

        boton4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton4, gridBagConstraints);

        boton5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton5, gridBagConstraints);

        boton6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton6, gridBagConstraints);

        botonRestar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonRestar.setText("-");
        botonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonRestar, gridBagConstraints);

        boton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton1, gridBagConstraints);

        boton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton2, gridBagConstraints);

        boton3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton3, gridBagConstraints);

        botonSuma.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonSuma.setText("+");
        botonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonSuma, gridBagConstraints);

        botonMasMenos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonMasMenos.setText("+-");
        botonMasMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMasMenosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonMasMenos, gridBagConstraints);

        boton0.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton0.setText("0");
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(boton0, gridBagConstraints);

        botonPunto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonPunto.setText(".");
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonPunto, gridBagConstraints);

        botonIgual.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonIgual.setText("=");
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        panel.add(botonIgual, gridBagConstraints);

        menu.setText("Usos");
        menu.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        calculadoraEstandar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        calculadoraEstandar.setText("Calculadora Estándar");
        menu.add(calculadoraEstandar);

        conversorDivisas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        conversorDivisas.setText("Conversor de Divisas");
        conversorDivisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conversorDivisasActionPerformed(evt);
            }
        });
        menu.add(conversorDivisas);
        menu.add(jSeparator1);

        salir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        salir.setText("Salir ");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menu.add(salir);

        barraMenu.add(menu);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void conversorDivisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conversorDivisasActionPerformed

        VentanaDivisas conversor = new VentanaDivisas();
        conversor.setVisible(true);

        dispose();

    }//GEN-LAST:event_conversorDivisasActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed

        if (etiquetaNumeros.getText() == "0") {
            cadenaNumeros = "1";
        } else {
            cadenaNumeros += "1";
        }

        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed

        if (etiquetaNumeros.getText() == "0") {
            cadenaNumeros = "2";
        } else {
            cadenaNumeros += "2";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed

        if (etiquetaNumeros.getText() == "0") {
            cadenaNumeros = "3";
        } else {
            cadenaNumeros += "3";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed

        if (etiquetaNumeros.getText() == "0") {
            cadenaNumeros = "4";
        } else {
            cadenaNumeros += "4";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed

        if (etiquetaNumeros.getText() == "0") {
            cadenaNumeros = "5";
        } else {
            cadenaNumeros += "5";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed

        if (etiquetaNumeros.getText() == "0") {
            cadenaNumeros = "6";
        } else {
            cadenaNumeros += "6";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed

        if (etiquetaNumeros.getText() == "0") {
            cadenaNumeros = "7";
        } else {
            cadenaNumeros += "7";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed

        if (etiquetaNumeros.getText() == "0") {
            cadenaNumeros = "8";
        } else {
            cadenaNumeros += "8";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed

        if (etiquetaNumeros.getText() == "0") {
            cadenaNumeros = "9";
        } else {
            cadenaNumeros += "9";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed

        if (cadenaNumeros != "") {
            if (etiquetaNumeros.getText() == "0") {
                cadenaNumeros = "0";
            } else {
                cadenaNumeros += "0";
            }
            etiquetaNumeros.setText(cadenaNumeros);
            activado = true;
        }

    }//GEN-LAST:event_boton0ActionPerformed

    private void botonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumaActionPerformed

        if (activado == true) {
            numero1 = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + "+");
            cadenaNumeros = "";

            operacion = "sumar";

            activado = false;
            punto = true;
        }


    }//GEN-LAST:event_botonSumaActionPerformed

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIgualActionPerformed
        double numero2;
        if (operacion.equals("nula")) {
            etiquetaNumeros.setText(cadenaNumeros);
        } else {
            if (operacion.equals("sumar")) {
                numero2 = Double.parseDouble(cadenaNumeros);
                resultado = numero1 + numero2;
                etiquetaNumeros.setText(String.format("%.2f", resultado));
                cadenaNumeros = String.valueOf(resultado);
                operacion = "nula";
            } else {
                if (operacion.equals("restar")) {
                    numero2 = Double.parseDouble(cadenaNumeros);
                    resultado = numero1 - numero2;
                    etiquetaNumeros.setText(String.format("%.2f", resultado));
                    cadenaNumeros = String.valueOf(resultado);
                    operacion = "nula";
                } else {
                    if (operacion.equals("multiplicar")) {
                        numero2 = Double.parseDouble(cadenaNumeros);
                        resultado = numero1 * numero2;
                        etiquetaNumeros.setText(String.format("%.2f", resultado));
                        cadenaNumeros = String.valueOf(resultado);
                        operacion = "nula";
                    } else {
                        if (operacion.equals("dividir")) {
                            numero2 = Double.parseDouble(cadenaNumeros);
                            resultado = numero1 / numero2;
                            etiquetaNumeros.setText(String.format("%.2f", resultado));
                            cadenaNumeros = String.valueOf(resultado);
                            operacion = "Nula";
                        }
                    }
                }
            }
        }

        etiquetaMuestra.setText("");
        activado = true;
    }//GEN-LAST:event_botonIgualActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed

        if (punto == true) {
            if (cadenaNumeros == "") {
                cadenaNumeros = "0.";
            } else {
                cadenaNumeros += ".";
            }
            etiquetaNumeros.setText(cadenaNumeros);
            punto = false;
        }


    }//GEN-LAST:event_botonPuntoActionPerformed

    private void botonMasMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMasMenosActionPerformed
        if (cadenaNumeros.charAt(0) != '-') {
            cadenaNumeros = "-" + cadenaNumeros;
        } else {
            cadenaNumeros = cadenaNumeros.substring(1, cadenaNumeros.length());
        }
        etiquetaNumeros.setText(cadenaNumeros);
    }//GEN-LAST:event_botonMasMenosActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        int tamano = cadenaNumeros.length();
        if (tamano > 0) {

            if (tamano == 1) {
                cadenaNumeros = "0";
            } else {
                cadenaNumeros = cadenaNumeros.substring(0, cadenaNumeros.length() - 1);
            }
        }
        etiquetaNumeros.setText(cadenaNumeros);
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestarActionPerformed
        if (activado == true) {
            numero1 = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + "-");
            cadenaNumeros = "";

            operacion = "restar";

            activado = false;
            punto = true;
        }
    }//GEN-LAST:event_botonRestarActionPerformed

    private void botonMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultiActionPerformed
        if (activado == true) {
            numero1 = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + "x");
            cadenaNumeros = "";

            operacion = "multiplicar";

            activado = false;
            punto = true;
        }
    }//GEN-LAST:event_botonMultiActionPerformed

    private void botonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDivisionActionPerformed
        if (activado == true) {
            numero1 = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + "/");
            cadenaNumeros = "";

            operacion = "dividir";

            activado = false;
            punto = true;
        }
    }//GEN-LAST:event_botonDivisionActionPerformed

    private void botonRaizCuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRaizCuadradaActionPerformed

        numero1 = Double.parseDouble(cadenaNumeros);
        etiquetaMuestra.setText("sqrt(" + cadenaNumeros + ")");
        resultado = Math.sqrt(numero1);
        etiquetaNumeros.setText(String.format("%.2f", resultado));
        cadenaNumeros = String.valueOf(resultado);
        punto = true;

    }//GEN-LAST:event_botonRaizCuadradaActionPerformed

    private void botonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCActionPerformed
        etiquetaMuestra.setText("");
        etiquetaNumeros.setText("0");
        cadenaNumeros = "";
        operacion = "nula";
        activado = true;
        punto = true;
    }//GEN-LAST:event_botonCActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        try {
            //</editor-fold>
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaCalculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(VentanaCalculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(VentanaCalculadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(VentanaCalculadora.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonC;
    private javax.swing.JButton botonDivision;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonMasMenos;
    private javax.swing.JButton botonMulti;
    private javax.swing.JButton botonPunto;
    private javax.swing.JButton botonRaizCuadrada;
    private javax.swing.JButton botonRestar;
    private javax.swing.JButton botonSuma;
    private javax.swing.JMenuItem calculadoraEstandar;
    private javax.swing.JMenuItem conversorDivisas;
    private javax.swing.JLabel etiquetaMuestra;
    private javax.swing.JLabel etiquetaNumeros;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menu;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
