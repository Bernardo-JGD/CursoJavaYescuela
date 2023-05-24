
package Excepciones_167_Personalizadas;

import java.util.Scanner;

public class Principal {
    
    private int numero;
    private Scanner leer;
    
    public void introducirNumeros () throws ExcepcionCero{
        leer = new Scanner(System.in);
        
        do{
            
            System.out.println("Digite un numero");
            numero = leer.nextInt();
            
            if (numero == 0) {//quiero que se produzca una excepcion personalizada
                throw new ExcepcionCero();
            }
            
        }while (numero!=0 && numero!=1);
    }
    
    public static void main(String[] args) {
        
        Principal p = new Principal ();
        try{
        p.introducirNumeros();
        }catch (ExcepcionCero ec){
            System.out.println(ec);
        }
        
        System.out.println("Programa terminado");
    }
    
}
