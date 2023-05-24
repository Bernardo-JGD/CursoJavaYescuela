
package Pruebas_codigo;

import java.util.Scanner;

public class Probando2 {
    
     static Scanner leer = new Scanner (System.in);
    
    public static void main(String[] args) {
        
        double r = 0.428571428;
        double aux_r = 0 ;
        char aux[] = new char [6];
        String aux_char;
        char ar[] = String.valueOf(r).toCharArray();
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
        }
        System.out.println("");
        
        aux[0] = 0;
        aux[1] = '.';
        aux[2] = ar[2];
        aux[3] = ar[3];
        aux[4] = ar[4];
        aux[5] = ar[5];
        aux_char = String.valueOf(aux);
        aux_r = Double.parseDouble(aux_char);
        System.out.println("");
        System.out.println(aux_r);
        
        /*
        //modulo
        
        double mod[] = new double[9];
        double a;
        for (int i = 0; i < 9; i++) {
            System.out.println("Ingrese a");
            a = leer.nextDouble ();
            mod[i] = a%8;
        }
        for (int i = 0; i < 9; i++) {
            System.out.println("x" + (i+1) + "----> " + mod[i]);
        }
        */
        
        
        /*
        double m, g=3;
        m = Math.pow(2, g);
        System.out.println("m" + m);
        */
        
        
    }
    
}
