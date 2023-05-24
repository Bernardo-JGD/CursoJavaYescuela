
package Ventana_170_JFrame;

import javax.swing.JFrame;

public class Ventana extends JFrame{
    
    public Ventana (){
        //establecemos el tamaño de la ventana
        setSize (500, 500);
        //este metodo es para que se termine la ejecucion del programa al cerrarlo en la tachita roja
        //el parametro que recibe es para hacer algo despues de cerrar, en este caso, terminar la ejecion del programa
        setDefaultCloseOperation (EXIT_ON_CLOSE);
        //establecemos el titulo de la ventana 
        setTitle ("El mejor Titulo :D");
    }
    
}
