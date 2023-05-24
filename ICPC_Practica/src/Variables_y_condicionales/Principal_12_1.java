package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_12_1 {

    //12. Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
    public static void main(String args[]) {

        Scanner leer = new Scanner(System.in);
        
        int num;
        int dm, um, c, d, u;
        
        //9  9  9 9 9  a cada guarismo lo llamaremos:
        //dm um c d u:  (decenas de millar), um:(unidades de millar)
        //              c:(centenas), d:(decenas), u:(unidades)
        
        System.out.println("Introduzca un numero entre 0 y 99999");
        num = leer.nextInt();
        
        //unidad
        u = num%10;
        num = num/10;
        System.out.println("u = " + u + " num = " + num);
        
        //decenas 
        d = num%10;
        num = num/10;
        System.out.println("d = " + d + " num = " + num);
        //centenas
        c = num%10;
        num = num/10;
        System.out.println("c = " + c + " num = " + num);
        // unidades de millar
        um = num%10;
        num = num/10;
        System.out.println("um = " + um + " num = " + num);
        // decenas de millar
        dm = num;
        System.out.println("  dm = " +  dm);
        
        //lo imprimimos al reves
        System.out.println(u + "" + d + "" + c + "" + um + "" + dm);
        
        //otra forma de hacerlo es
        num = (10000*u) + (1000*d) + (100*c) + (10*dm) + (dm);
        System.out.println(num);
        
    }

}
