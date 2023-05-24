
package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_14_1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int cal;
        System.out.println("Ingrese una calificación");
        cal = leer.nextInt();
        
        switch (cal){
            case 0 :
            case 1 : 
            case 2 :
            case 3 :
            case 4 :
                System.out.println("Insuficiente");
                break;
            case 5 :
                System.out.println("Suficiente");
                break;
            case 6 : 
                System.out.println("Bien");
                break;
            case 7 :
            case 8 :
                System.out.println("Notable");
                break;
            case 9 :
            case 10 : 
                System.out.println("Sobresaliente");
                break;
                
            default: 
                System.out.println("Fuera del rango");
                break;
                
        }
        
    }
    
}
