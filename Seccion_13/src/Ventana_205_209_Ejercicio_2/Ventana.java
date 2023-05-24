
package Ventana_205_209_Ejercicio_2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;


public class Ventana extends JFrame{
    
    private JPanel panel;
    private JLabel etiqueta, imagen;
    private JRadioButton rb1, rb2, rb3, rb4;
    
    public Ventana (){
        
        setSize(700, 400);
        setTitle("Ejercicio 2");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        iniciarComponentes ();
        
    }
    
    private void iniciarComponentes (){
        
        colocarPanel ();
        colocarEtiqueta ();
        colocarRadioBotones ();
        
    }
    
    private void colocarPanel (){
        
        panel = new JPanel ();
        panel.setLayout(null);
        getContentPane().add(panel);
        
    }
    
    private void colocarEtiqueta (){
        
        etiqueta = new JLabel("Escoja su deporte favorito");
        etiqueta.setBounds(20, 10, 250, 40);
        etiqueta.setFont(new Font("Arial", 0, 18));
        panel.add(etiqueta);
        
    }
    
    private void colocarRadioBotones (){
        
        rb1 = new JRadioButton ("Fútbol");
        rb1.setBounds(20, 80, 100, 40);
        rb1.setFont(new Font("arial rounded mt bold", 0, 18));
        panel.add(rb1);
        
        rb2 = new JRadioButton ("Baloncesto");
        rb2.setBounds(20, 140, 150, 40);
        rb2.setFont(new Font("arial rounded mt bold", 0, 18));
        panel.add(rb2);
        
        rb3 = new JRadioButton ("Tenis");
        rb3.setBounds(20, 200, 100, 40);
        rb3.setFont(new Font("arial rounded mt bold", 0, 18));
        panel.add(rb3);
        
        rb4 = new JRadioButton ("Natacion");
        rb4.setBounds(20, 260, 150, 40);
        rb4.setFont(new Font("arial rounded mt bold", 0, 18));
        panel.add(rb4);
        
        ButtonGroup grupo = new ButtonGroup ();
        
        grupo.add(rb1);
        grupo.add(rb2);
        grupo.add(rb3);
        grupo.add(rb4);
        
        eventoDeAccion ();
        
    }
    
    private void eventoDeAccion (){
        
        imagen = new JLabel ();
        imagen.setBounds(200, 80, 400, 220);
        panel.add(imagen);
        
        //segun el video debe ser tipo final, pero aqui no me genera conflicto
        //tendre que tomarlo en cuenta por si surge un problema, para ponerle final al ImageIcon 
        ImageIcon imagenFutbol = new ImageIcon (getClass().getResource("/Ventana_205_209_imagenes/FutP.jpg"));
        ImageIcon imagenBaloncesto = new ImageIcon (getClass().getResource("/Ventana_205_209_imagenes/BasketP.png"));
        ImageIcon imagenTenis = new ImageIcon (getClass().getResource("/Ventana_205_209_imagenes/TenisP.jpg"));
        ImageIcon imagenNatacion = new ImageIcon(getClass().getResource("/Ventana_205_209_imagenes/NadarP.jpg"));
        
        ActionListener eventoAccion1 = new ActionListener (){
        
            @Override
            public void actionPerformed (ActionEvent ae){
                
                imagen.setIcon(new ImageIcon (imagenFutbol.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
                
            }
            
        };
        
        rb1.addActionListener (eventoAccion1);
        
        ActionListener eventoAccion2 = new ActionListener (){
        
            @Override 
            public void actionPerformed (ActionEvent ae){
                imagen.setIcon (new ImageIcon (imagenBaloncesto.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        
        };
        
        rb2.addActionListener (eventoAccion2);
        
        ActionListener eventoAccion3 = new ActionListener (){
        
            @Override 
            public void actionPerformed (ActionEvent ae){
                imagen.setIcon(new ImageIcon (imagenTenis.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        
        };
        
        rb3.addActionListener (eventoAccion3);
        
        ActionListener eventoAccion4 = new ActionListener (){
        
            @Override 
            public void actionPerformed (ActionEvent ae){
                imagen.setIcon(new ImageIcon (imagenNatacion.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        
        };
        
        rb4.addActionListener (eventoAccion4);
  
    }
    
}
