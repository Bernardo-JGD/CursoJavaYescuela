package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Leer los datos correspondientes a dos tablas de 12 elementos numericos y mezclarlos de la forma");
        System.out.println("3 de la tabla A, 3 de la tabla B, otros 3 de A, otros 3 de B...");

        int ar1[] = new int[12];
        int ar2[] = new int[12];
        int ar3[] = new int[24];
        
        int i, j;
        
        System.out.println("Ingrese los valores del arreglo 1");
        for ( i = 0; i < 12; i++) {
            
            ar1[i] = leer.nextInt();
            

        }
        System.out.println("Ingrese los valores del arreglo 2");
        for ( i = 0; i < 12; i++) {
            
            ar2[i] = leer.nextInt();

        }
        
        
        // Ahora vamos a mezclar los arreglos 
        // el iterador i sera para los arreglos 1 y 2
        // y el iterador j para el arreglo 3
        i = 0;
        j = 0;
        while (i<12){
            
            // copiar los 3 elementos del arreglo 1
            for (int  k = 0; k < 3; k++) {
                ar3[j] = ar1[i+k];                
                j++;
            }
            // Ahora compiamos 3 elementos del arreglo 2
            for (int k = 0; k < 3; k++) {
               ar3[j] = ar2[i+k];             
               j++;
            }
            i+=3;
        }
        for ( i = 0; i < 24; i++) {
            System.out.print("-" + ar3[i] + "-");
        }

    }
    /*
1
2
3
7
8
9
13
14
15
19
20
21
    
4
5
6
10
11
12
16
17
18
22
23
24
    */

}
