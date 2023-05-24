
package Excepciones_165_TryCatch_Verificadas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
public class Principal {
    
    public void leerArchivo () throws FileNotFoundException, IOException{
        File archivo = new File("");
        FileReader fr = new FileReader (archivo);
        BufferedReader bf = new BufferedReader (fr);
        String linea;
        while ((linea = bf.readLine()) !=null){
            System.out.println(linea);
        }
        
    }
    
    public void leerArchivo2 (){
        
        try{
        leerArchivo ();
        }catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo, verifique la ruta");
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido una excepcion verificada");
        }finally {
            //el "finally" puede ser opcional el cual se va a ejecutar siempre, ya sea si encuentra
            //o no encuentra una excepcion 
        }
        
        System.out.println("Programa terminado");
        
    }
    
    public static void main(String[] args) {
     
        Principal p = new Principal();
        p.leerArchivo2();
        
    }
    
}
