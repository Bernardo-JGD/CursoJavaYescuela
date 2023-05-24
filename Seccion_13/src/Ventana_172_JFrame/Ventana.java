
package Ventana_172_JFrame;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Dimension;

public class Ventana extends JFrame{
    
    public Ventana (){
        setSize (500, 500);
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        setLocationRelativeTo (null);
        
        //es para permitir o no el cambio de tamaño de ventana por el usuario
        //si recibe true: el usuario puede cambiar el tamaño
        //si recibe false: el usuario NO puede cambiar 
        //setResizable (false);
        
        //establecemos el tamaño minimo que la ventana puede tener 
        setMinimumSize (new Dimension (200, 200));
        
        getContentPane().setBackground(Color.BLUE);
        
        
    }
    
}
