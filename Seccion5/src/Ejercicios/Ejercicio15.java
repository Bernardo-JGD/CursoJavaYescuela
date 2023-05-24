
package Ejercicios;

import java.util.Scanner;
public class Ejercicio15 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla. Se debe mostrar la ");
        System.out.println("posicion en la que se encuentra, si no esta, indicarlo con un mensaje");
        
        int arreglo[] = new int [10];
        boolean orden, existe = false;
        int n = 0, posicion = 0;
        
        
        do{
            orden = true;
            System.out.println("Ingrese 10 numeros enteros en orden creciente");
            for (int i = 0; i < 10; i++) {
                arreglo[i] = leer.nextInt();
                if (i>0) {
                    if ( (arreglo[i]<arreglo[i-1]) && orden==true) {
                        orden = false;
                    }
                }
            }
            
        }while (orden == false);
        System.out.println("Arreglo en orden");
        System.out.println("Ingrese el numero que desea buscar en el arreglo");
        n = leer.nextInt();
        for (int i = 0; i < 10; i++) {
            if (n == arreglo[i]) {
                existe = true;
                posicion = i;
            }
        }
        if (existe == true) {
            System.out.println("El numero " + n + " esta en el arreglo en la posicion " + posicion);
        }else{
            System.out.println("No existe ese numero en el arreglo");
        }
        
    }
    
}
