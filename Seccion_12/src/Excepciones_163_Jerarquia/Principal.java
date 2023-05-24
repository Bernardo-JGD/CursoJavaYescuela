
package Excepciones_163_Jerarquia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Principal {
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        //Ecepciones verificadas 
            //Lectura de una archivo de texto
       /* BufferedReader bf = new BufferedReader (new FileReader(""));
        String linea;
        while ((linea = bf.readLine()) !=null){
            System.out.println(linea);
        }*/
       
       //Excepciones no verificadas RuntimeExcpetion
       //Division entre cero
       
       int num1=5, num2=0, resultado;
       resultado = num1/num2;
       
        System.out.println(resultado);
       
    }
    
}
