
package Ejercicio_02_DeporteFav;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Ventana extends JFrame {
    
    private JPanel panel;
    private JLabel texto;
    private JRadioButton rb1, rb2, rb3, rb4;
    private JLabel deporte;
    private ImageIcon fut, bal, ten, nat;
    
    public Ventana (){
        
        setSize(700, 380);
        setLocationRelativeTo (null);
        setTitle("Deporte favorito :D");
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        setResizable(false);
        
        iniciarComponentes ();
        
    }
    
    private void iniciarComponentes (){
        
        colocarPanel ();
        colocarRadioBotones ();
        colocarTexto ();
        iniciarImagenes ();
        cambioDeImagen ();
        
    }
    
    private void colocarPanel (){
        
        panel = new JPanel ();
        panel.setLayout(null);
        getContentPane().add(panel);
        
    }
    
    private void colocarTexto (){
        
        texto = new JLabel ();
        texto.setBounds(20, 30, 300, 30);
        texto.setText("Escoja su deporte favorito :D");
        texto.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(texto);
        
        deporte = new JLabel ();
        deporte.setBounds(220, 100, 400, 220);
        //deporte.setOpaque(true);
        //deporte.setBackground(Color.WHITE);
        panel.add(deporte);
        
    }
    
    private void colocarRadioBotones (){
        
        Font fuente = new Font ("Times New Roman", Font.ITALIC, 20);
        
        rb1 = new JRadioButton ();
        rb1.setBounds(20, 100, 150, 30);
        rb1.setText("Fubtbol");
        rb1.setFont(fuente);
        panel.add(rb1);
        
        rb2 = new JRadioButton ();
        rb2.setBounds(20, 160, 150, 30);
        rb2.setText("Baloncesto");
        rb2.setFont(fuente);
        panel.add(rb2);
        
        rb3 = new JRadioButton ();
        rb3.setBounds(20, 220, 150, 30);
        rb3.setText("Tenis");
        rb3.setFont(fuente);
        panel.add(rb3);
        
        rb4 = new JRadioButton ();
        rb4.setBounds(20, 280, 150, 30);
        rb4.setText("Natacion");
        rb4.setFont(fuente);
        panel.add(rb4);
        
        ButtonGroup grupitobotones = new ButtonGroup ();
        grupitobotones.add(rb1);
        grupitobotones.add(rb2);
        grupitobotones.add(rb3);
        grupitobotones.add(rb4);
    }
    
    private void iniciarImagenes (){
        
        //fut, bal, ten, nat;
        fut = new ImageIcon ("FutP.jpg");
        bal = new ImageIcon ("BasketP.png");
        ten = new ImageIcon ("TenisP.jpg");
        nat = new ImageIcon ("NadarP.png");
        
    }
    
    private void cambioDeImagen (){
        
        ActionListener cambio = new ActionListener (){
        
            @Override
            public void actionPerformed (ActionEvent ae){
                
                if (ae.getSource() == rb1) {
                    deporte.setIcon(new ImageIcon (fut.getImage().getScaledInstance(deporte.getWidth(), deporte.getHeight(), Image.SCALE_SMOOTH)));
                }
                if (ae.getSource() == rb2) {
                    deporte.setIcon(new ImageIcon (bal.getImage().getScaledInstance(deporte.getWidth(), deporte.getHeight(), Image.SCALE_SMOOTH)));
                }
                if (ae.getSource() == rb3) {
                    deporte.setIcon(new ImageIcon (ten.getImage().getScaledInstance(deporte.getWidth(), deporte.getHeight(), Image.SCALE_SMOOTH)));
                }
                if (ae.getSource() == rb4) {
                    deporte.setIcon (new ImageIcon (nat.getImage().getScaledInstance(deporte.getWidth(), deporte.getHeight(), Image.SCALE_SMOOTH)));
                }
            }
        
        };
        
        rb1.addActionListener (cambio);
        rb2.addActionListener (cambio);
        rb3.addActionListener (cambio);
        rb4.addActionListener (cambio);
        
    }
    
}
