
package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_10 {
    
    //10. Pedir tres números y mostrarlos ordenados de mayor a menor.
    
    public static void main (String args[]){
        
        Scanner leer = new Scanner (System.in);
        int n1, n2, n3;
        System.out.println("Ingrese el primer numero");
        n1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        n2 = leer.nextInt();
        System.out.println("Ingrese el tercer numero");
        n3 = leer.nextInt();
        
        if ( (n1>n2) && (n2>n3) && (n3<n1)) {
            System.out.println(n1 + ", " + n2 + ", " + n3);
        }else{
            if ( (n1<n2) && (n2>n3) && (n3<n1) ) {
                System.out.println(n2 + ", " + n1 + ", " + n3);
            }else{
                if ( (n1<n2) && (n2<n3) && (n3>n1) ) {
                    System.out.println(n3 + ", " + n2 + ", " + n1);
                }else{
                    if ( (n1>n2) && (n2<n3) && (n3>n1) ) {
                        System.out.println(n3 + ", " + n1 + ", " + n2);
                    }else{
                        if ( (n1<n2) && (n2>n3) && (n3>n1) ) {
                            System.out.println(n2 + ", " + n3 + ", " + n1);
                        }else{
                            if ( (n1>n2) && (n2<n3) && (n3<n1) ) {
                                System.out.println(n1 + ", " + n3 + ", " + n2);
                            }else{
                                System.out.println("Debe haber dos iguales");
                            }
                        }
                    }
                }
            }
        }
        
    }
            
    
}
