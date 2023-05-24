
package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_11 {
        //11. Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
    public static void main (String args[]){
        
        Scanner leer = new Scanner (System.in);
        int n;
        System.out.println("Ingrese un numero entre 0 y 9999");
        n = leer.nextInt();
        if ( (n>=0 && n<10) || ( n<=0 && n>-10) ) {
            System.out.println("Tiene 1 cifra");
        }else{
            if ( (n>=10 && n<=99) || (n<=-10 && n>=-99)) {
                System.out.println("Tiene 2 cifras");
            }else{
                if ( (n>=100 && n<=999) || (n<=-100 && n>=-999) ) {
                    System.out.println("Tiene 3 cifras");
                }else{
                    if ( (n>=1000 && n<=9999) || (n<=-1000 && n>=-9999) ) {
                        System.out.println("Tiene 4 cifras");
                    }else{
                        System.out.println("Tiene más de 4 cifras");
                    }
                }
            }
        }
    }
    
}
