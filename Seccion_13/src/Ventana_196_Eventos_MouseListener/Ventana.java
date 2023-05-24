package Ventana_196_Eventos_MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ventana extends JFrame {

    private JPanel panel;
    private JButton boton;
    private JTextArea areaTexto;

    public Ventana() {

        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        iniciarComponentes();

    }

    private void iniciarComponentes() {

        colocarPaneles();
        colocarBoton();
        colocarAreaDeTexto();

    }

    private void colocarPaneles() {

        panel = new JPanel();
        panel.setLayout(null);
        getContentPane().add(panel);

    }

    private void colocarAreaDeTexto() {

        areaTexto = new JTextArea();
        areaTexto.setBounds(20, 20, 200, 300);
        panel.add(areaTexto);

    }

    private void colocarBoton() {

        boton = new JButton("¡Pulsa aqui!");
        boton.setBounds(150, 350, 150, 40);
        boton.setFont(new Font("arial", 0, 15));
        panel.add(boton);

        //eventoOyenteDeAccion ();
        eventoOyenteDeRaton();

    }

    private void eventoOyenteDeAccion() {

        //agregando evento de tipo ActionListener
        ActionListener oyenteDeAccion = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

            }

        };

        boton.addActionListener(oyenteDeAccion);

    }

    private void eventoOyenteDeRaton() {

        //Agregando oyente de Raton 
        MouseListener oyenteDeRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                
                areaTexto.append("mouseClicked\n");
                
            }

            @Override
            public void mousePressed(MouseEvent me) {
                areaTexto.append("mousePressed\n");
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                areaTexto.append("mouseReleased\n");
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                areaTexto.append("mouseEntered\n");
            }

            @Override
            public void mouseExited(MouseEvent me) {
                areaTexto.append("mouseExited\n");
            }

        };

        boton.addMouseListener(oyenteDeRaton);

    }

}
