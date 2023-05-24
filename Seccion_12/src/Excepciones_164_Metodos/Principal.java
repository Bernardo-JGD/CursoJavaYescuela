
package Excepciones_164_Metodos;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Principal {
    
    public void leerArchivo () throws FileNotFoundException{
        //Para agregar la exepcion a un metodo debemos añadir la palabra reservada "throws" despues
        //de los parentesis del metodo. Despues de esa palabra ponemos las excepciones que queramos 
        //capturar, la cantidad que sea, pero separadas por comas ","
        File archivo = new File ("");
        FileReader fr = new FileReader (archivo);
        
    }
    
    public void leerArchivo2 () throws IOException{
        //el problema es que cuando llamamos al metodo de esta manera dentro de otro metodo
        //tambien tenemos que añadir la excepcion para que sea capturada
        leerArchivo ();
    }
    
    
    public static void main(String[] args) {
        
    }
    
}
