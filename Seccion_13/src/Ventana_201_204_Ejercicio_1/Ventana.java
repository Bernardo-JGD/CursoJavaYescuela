
package Ventana_201_204_Ejercicio_1;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Ventana extends JFrame {
    
    private JPanel panel;
    private JLabel etiqueta;
    private JButton boton;
    private int contador = 0;
    
    public Ventana (){
        
        setSize(400, 400);
        setTitle("Ejercicio 1");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        iniciarComponentes ();
        
    }
    
    private void iniciarComponentes (){
        
        colocarPanel ();
        colocarEtiqueta ();
        colocarBoton ();
        
    }
    
    private void colocarPanel (){
        
        panel = new JPanel ();
        panel.setLayout(null);
        //panel.setBackground(Color.yellow);
        add(panel);
        
    }
    
    private void colocarEtiqueta (){
        
        etiqueta = new JLabel ();
        etiqueta.setBounds (0, 50, 400, 40);
        etiqueta.setText("Pulsa el boton");
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setFont (new Font ("Arial", Font.PLAIN, 20));
        panel.add(etiqueta);
        
        
    }
    
    private void colocarBoton (){
        
        boton = new JButton ();
        boton.setBounds(90, 250, 200, 50);
        boton.setText("Pulsa aqui");
        boton.setFont(new Font("cooper black", 0, 20));
        panel.add(boton);
        
        eventoDeAccion ();
        
    }
    
    private void eventoDeAccion (){
        
        ActionListener eventoAccion = new ActionListener (){
        
            @Override
            public void actionPerformed (ActionEvent ae){
                
                contador++;
                if (contador == 1 ) {
                    etiqueta.setText("Haz presionador el boton 1 vez" );
                }else{
                    etiqueta.setText("Haz presionado el boton " + contador + " veces");
                }
                
            }
        
        };
        
        boton.addActionListener (eventoAccion);
        
    }
    
    
}
