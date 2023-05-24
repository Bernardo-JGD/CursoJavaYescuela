package Ventana_210_213_Ejercicio_03;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

    private JPanel panel;
    private JLabel etiqueta;
    private JButton botonRojo, botonVerde, botonAzul;
    private int pulsado = 0;
    private int rojo = 0, verde = 0, azul = 0;

    public Ventana() {

        setSize(600, 400);
        setTitle("Ejercio 3");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

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
        getContentPane().add(panel);

        eventoDeRuedaDeRaton();

    }

    private void colocarEtiqueta() {

        etiqueta = new JLabel();
        etiqueta.setBounds(100, 30, 400, 50);
        etiqueta.setText("Color (rojo, verde, azul)");
        etiqueta.setFont(new Font("Arial", 0, 20));
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(etiqueta);

    }

    private void colocarBotones() {

        /*
            pulsado = 1 ---> rojo
            pulsado = 2 ---> verde
            pulsado = 3 ---> azul
         */
        botonRojo = new JButton("Rojo");
        botonRojo.setBounds(50, 230, 130, 50);
        botonRojo.setForeground(Color.RED);
        botonRojo.setFont(new Font("arial rounded mt bold", 0, 20));
        panel.add(botonRojo);

        botonRojo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                pulsado = 1;

            }

        });

        botonVerde = new JButton("Verde");
        botonVerde.setBounds(230, 230, 130, 50);
        botonVerde.setForeground(Color.GREEN);
        botonVerde.setFont(new Font("arial rounded mt bold", 0, 20));
        panel.add(botonVerde);

        botonVerde.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                pulsado = 2;
            }

        });

        botonAzul = new JButton("Azul");
        botonAzul.setBounds(410, 230, 130, 50);
        botonAzul.setForeground(Color.BLUE);
        botonAzul.setFont(new Font("arial rounded mt bold", 0, 20));
        panel.add(botonAzul);

        botonAzul.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                pulsado = 3;

            }

        });

    }

    private void eventoDeRuedaDeRaton() {

        MouseWheelListener eventoRueda = new MouseWheelListener() {

            @Override
            public void mouseWheelMoved(MouseWheelEvent mwe) {

                if (pulsado != 0) {//se ha pulsado algun boton

                    if (pulsado == 1) {//se ha pulsado el boton rojo

                        rojo += mwe.getWheelRotation();
                        if (rojo < 0) {
                            rojo = 0;
                        }
                        if (rojo > 255) {
                            rojo = 255;
                        }

                    } else {
                        if (pulsado == 2) {//se ha pulsado el boton verde

                            verde += mwe.getWheelRotation();
                            if (verde < 0) {
                                verde = 0;
                            }
                            if (verde > 255) {
                                verde = 255;
                            }

                        } else {// ha pulsado el boton azul
                            
                            azul += mwe.getWheelRotation();
                            if (azul < 0) {
                                azul = 0;
                            }
                            if (azul > 255) {
                                azul = 255;
                            }
                            
                        }
                    }

                }
                etiqueta.setText("Color (Rojo = " + rojo + " Verde = " + verde + " Azul " + azul + ")");
                panel.setBackground(new Color(rojo, verde, azul));
            }

        };

        panel.addMouseWheelListener(eventoRueda);

    }

}
