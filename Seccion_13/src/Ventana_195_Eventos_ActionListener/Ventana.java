
package Ventana_195_Eventos_ActionListener;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame{
    
    private JPanel panel;
    private JLabel saludo;
    private JTextField cajaTexto;
    private JButton boton;
    
    public Ventana (){
        
        setSize(500, 500);
        setLocationRelativeTo (null);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        setResizable (false);
        
        iniciarComponentes ();
        
    }
    
    private void iniciarComponentes (){
        
        colocarPaneles ();
        colocarEtiqueta ();
        colocarCajaDeTexto ();
        colocarBoton ();
        
    }
    
    private void colocarPaneles (){
        
        panel = new JPanel ();
        panel.setLayout (null);
        getContentPane().add(panel);
        
    }
    
    private void colocarEtiqueta (){
        
        JLabel etiqueta = new JLabel ("Ingrese su nombre");
        etiqueta.setBounds(30, 10, 200, 30);
        etiqueta.setFont(new Font ("cooper black", Font.BOLD, 18));
        panel.add(etiqueta);
        
    }
    
    private void colocarCajaDeTexto (){
        
        cajaTexto = new JTextField ();
        cajaTexto.setBounds (30, 50, 300, 30);
        panel.add(cajaTexto);
        
    }
    
    private void colocarBoton (){
        
        boton = new JButton ("¡Pulsa aqui!");
        boton.setBounds(150, 100, 150, 40);
        boton.setFont(new Font ("Arial", Font.PLAIN, 15));
        panel.add(boton);
        
        saludo = new JLabel ();
        saludo.setBounds (50, 200, 300, 40);
        saludo.setFont (new Font ("Arial", 1, 20));
        panel.add(saludo);
        
        //Agregando Evento de tipo ActionListener
        ActionListener oyenteDeAccion = new ActionListener (){
            
            @Override
            public void actionPerformed (ActionEvent ae){
                saludo.setText("Hola " + cajaTexto.getText());
            }
            
        };
        boton.addActionListener (oyenteDeAccion);
        
    }
}
