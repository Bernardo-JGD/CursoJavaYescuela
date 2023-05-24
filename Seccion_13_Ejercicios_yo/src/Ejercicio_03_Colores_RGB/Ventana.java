package Ejercicio_03_Colores_RGB;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;

public class Ventana extends JFrame {

    private JPanel panel;
    private JLabel etiqueta;
    private int rojo = 0, verde = 0, azul = 0;
    private Color color_panel;
    private JToggleButton boton_rojo, boton_verde, boton_azul;
    private boolean pulsar_rojo = false, pulsar_verde = false, pulsar_azul = false;
    //private ButtonGroup grupito;

    public Ventana() {

        setSize(600, 400);
        setLocationRelativeTo(null);
        setTitle("Ejercicio 3");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        iniciarComponentes();

    }

    private void iniciarComponentes() {

        colocarPanel();
        colocarEtiqueta();
        colocarBotones();

    }

    private void colocarPanel() {

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(rojo, verde, azul));
        getContentPane().add(panel);
        
        accionColorPanel ();

    }

    private void colocarEtiqueta() {

        etiqueta = new JLabel("Rojo = " + rojo + "   Verde = " + verde + "   Azul = " + azul);
        etiqueta.setBounds(0, 50, 600, 30);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(etiqueta);

    }

    private void colocarBotones() {

        Font fuente_botones = new Font("Arial", Font.BOLD, 20);

        boton_rojo = new JToggleButton("Rojo");
        boton_rojo.setBounds(50, 300, 150, 50);
        boton_rojo.setFont(fuente_botones);
        boton_rojo.setForeground(Color.RED);
        
        panel.add(boton_rojo);

        boton_verde = new JToggleButton("Verde");
        boton_verde.setBounds(225, 300, 150, 50);
        boton_verde.setFont(fuente_botones);
        boton_verde.setForeground(Color.GREEN);
        panel.add(boton_verde);

        boton_azul = new JToggleButton("Azul");
        boton_azul.setBounds(400, 300, 150, 50);
        boton_azul.setFont(fuente_botones);
        boton_azul.setForeground(Color.BLUE);
        panel.add(boton_azul);

        ButtonGroup grupito = new ButtonGroup();

        grupito.add(boton_rojo);
        grupito.add(boton_verde);
        grupito.add(boton_azul);

        colocarAccionBoton();

    }

    private void colocarAccionBoton() {
        
        ActionListener accion = new ActionListener (){
        
            @Override 
            public void actionPerformed (ActionEvent ae){
                
                if (ae.getSource() == boton_rojo) {
                    pulsar_rojo = true;
                    pulsar_verde = false;
                    pulsar_azul = false;

                }
                if (ae.getSource() == boton_verde) {
                    pulsar_rojo = false;
                    pulsar_verde = true;
                    pulsar_azul = false;

                }
                if (ae.getSource() == boton_azul) {
                    pulsar_rojo = false;
                    pulsar_verde = false;
                    pulsar_azul = true;

                }
                
            }
        
        };
        boton_rojo.addActionListener(accion);
        boton_verde.addActionListener(accion);
        boton_azul.addActionListener(accion);
        
    }
    
    public void accionColorPanel (){
        
        MouseWheelListener ruedita_accion = new MouseWheelListener (){
        
            @Override
            public void mouseWheelMoved (MouseWheelEvent mwe){
                
                if (pulsar_rojo == true) {
                    if (mwe.getWheelRotation() == -1) {
                        rojo++;
                        if (rojo > 255) {
                            rojo = 255;
                        }
                        
                    }else{
                        if (mwe.getWheelRotation() == 1) {
                            rojo--;
                            if (rojo <0) {
                                rojo = 0;
                            }
                        }
                    }
                }
                
                if (pulsar_verde == true) {
                    if (mwe.getWheelRotation() == -1) {
                        verde++;
                        if (verde > 255) {
                            verde = 255;
                        }
                        
                    }else{
                        if (mwe.getWheelRotation() == 1) {
                            verde--;
                            if (verde <0) {
                                verde = 0;
                            }
                        }
                    }
                }
                if (pulsar_verde == true) {
                    if (mwe.getWheelRotation() == -1) {
                        verde++;
                        if (verde > 255) {
                            verde = 255;
                        }
                        
                    }else{
                        if (mwe.getWheelRotation() == 1) {
                            verde--;
                            if (verde <0) {
                                verde = 0;
                            }
                        }
                    }
                }
                
                if (pulsar_azul == true) {
                    if (mwe.getWheelRotation() == -1) {
                        azul++;
                        if (azul > 255) {
                            azul = 255;
                        }
                        
                    }else{
                        if (mwe.getWheelRotation() == 1) {
                            azul--;
                            if (azul <0) {
                                azul = 0;
                            }
                        }
                    }
                }
                
                etiqueta.setText("Rojo = " + rojo + "   Verde = " + verde + "   Azul = " + azul );
                panel.setBackground(new Color (rojo, verde, azul));
                
            }
        
        };
        panel.addMouseWheelListener(ruedita_accion);
        
    }

}
