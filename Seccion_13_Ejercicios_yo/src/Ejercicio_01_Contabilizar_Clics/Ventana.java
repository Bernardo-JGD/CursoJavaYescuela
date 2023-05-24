package Ejercicio_01_Contabilizar_Clics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

    private JPanel panel;
    private JButton boton;
    private JLabel etiqueta;
    private int contador_clics = 0;

    public Ventana() {

        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        iniciarComponentes();

    }

    private void iniciarComponentes() {

        colocarPaneles();
        colocarEtiqueta();
        colocarBoton();
    }

    private void colocarPaneles() {

        panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);

    }

    private void colocarEtiqueta() {

        etiqueta = new JLabel("Van " + contador_clics + " clics :D ");
        etiqueta.setBounds(180, 50, 200, 30);
        etiqueta.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(etiqueta);

    }

    private void colocarBoton() {

        boton = new JButton("¡Presioname :D!");
        boton.setBounds(150, 150, 200, 40);
        boton.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        panel.add(boton);

        ActionListener clic = new ActionListener() {
            
            @Override
            public void actionPerformed (ActionEvent ae){
                contador_clics++;
                etiqueta.setText("Van " + contador_clics + " clics :D ");
            }

        };
        boton.addActionListener (clic);

    }

}
