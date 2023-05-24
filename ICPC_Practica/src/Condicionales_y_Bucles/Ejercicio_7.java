
package Condicionales_y_Bucles;

import java.util.Scanner;

public class Ejercicio_7 {
    //7. Pedir números hasta que se introduzca uno negativo, y calcular la media.
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int num=0, cantidad = 0, suma = 0;
        float media;
        
        do{
            
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
           
            //el problema no lo indica pero solo sumare los positivos
            //y de ahí sacaré la media también
            if (num>=0) {
                suma = suma + num;
                cantidad++;
            }
            
        }while (num>=0);
        
        if (cantidad == 0) {
            System.out.println("No se ingresaron numeros positivos" + "\nNo es posible calcular la media");
        }else{
            System.out.println(cantidad);
            media = (float)(suma/cantidad);
            System.out.println("La media de los datos ingresados es: " + media);
        }
        
    }
    
}
