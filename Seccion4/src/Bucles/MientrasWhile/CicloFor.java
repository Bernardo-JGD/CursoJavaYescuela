
package Bucles.MientrasWhile;

import java.util.Scanner;
public class CicloFor {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        for (int i = 1; i <=10; i++) {
            System.out.println(i);
        }
        
        for (int i =10; i >= 1; i--) {
            System.out.println(i);
        }
        int num;
        System.out.println("Ingrese la cantidad de terminos");
        num = leer.nextInt();
        
        for (int i = 1; i <=num; i++) {
            System.out.println(i);
        }
        System.out.println("De 2 en 2");
        for (int i = 2; i <=num; i+=2) {
            System.out.println(i);
        }
        
    }
    
}
