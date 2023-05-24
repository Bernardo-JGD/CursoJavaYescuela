
package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_21 {
    //21. Pedir una nota numérica entera entre 0 y 10, 
    //y mostrar dicha nota de la forma: cero, uno, dos, tres...
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        int num;
        System.out.println("Ingrese una calificacion entera");
        num = leer.nextInt();
        
        switch (num){
            
            case 1 :
                System.out.println("UNO");
                break;
                
            case 2 :
                System.out.println("DOS");
                break;
                
            case 3 :
                System.out.println("TRES");
                break;
                
            case 4 : 
                System.out.println("CUATRO");
                break;
                
            case 5 :
                System.out.println("CINCO");
                break;
                
            case 6 : 
                System.out.println("SEIS");
                break;
                
            case 7 : 
                System.out.println("SIETE");
                break;
                
            case 8 :
                System.out.println("OCHO");
                break;
                
            case 9 :
                System.out.println("NUEVE");
                break;
                
            case 10 :
                System.out.println("DIEZ");
                break;
                
            default :
                System.out.println("Numero fuera del rango :v ");
                break;
        }
        
    }
    
}
