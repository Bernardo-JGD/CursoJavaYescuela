
package Ventana_171_JFrame;

import javax.swing.JFrame;

public class Ventana extends JFrame{
    
    public Ventana (){
        //establecemos el tamaño de la ventana
        //        x    y
        setSize (500, 500);
        //este metodo es para que se termine la ejecucion del programa al cerrarlo en la tachita roja
        //el parametro que recibe es para hacer algo despues de cerrar, en este caso, terminar la ejecion del programa       
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        //establecemos el titulo de la ventana 
        setTitle ("El mejor Titulo :D");
        //establecemos la posicion inicial de la ventana en la pantalla
        //setLocation(500, 500);
        //engloba a setSize y setLocation
        //setBounds (100, 200, 500, 500);
        setLocationRelativeTo (null);
    }
    
}
