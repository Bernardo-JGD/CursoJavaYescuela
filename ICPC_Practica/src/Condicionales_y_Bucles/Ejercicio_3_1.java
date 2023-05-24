
package Condicionales_y_Bucles;

import java.util.Scanner;

public class Ejercicio_3_1 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int num;
        System.out.print("Introduzca un numero: ");
        num = leer.nextInt();
        
        while (num != 0){
            if (num%2 == 0) {
                //si el resto de dividir entre dos es cero: 
                //esto indica que es par
                System.out.println("Par");
            }else{
                //en caso contrario: impar
                System.out.println("Impar");
            }
            //repetimos el proceso y volvemos a leer num
            System.out.print("Introduzca otro numero");
            num = leer.nextInt();
        }// al salir del mientras tenemos la certeza que num es 0
    }
    
}
