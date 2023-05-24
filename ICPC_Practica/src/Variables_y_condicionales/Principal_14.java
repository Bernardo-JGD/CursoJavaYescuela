
package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_14 {
    //14. Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
    public static void main(String[] args) {
        //
        Scanner leer = new Scanner (System.in);
        int cal;
        System.out.println("Ingrese una calificación");
        cal = leer.nextInt();
        
        if (cal >=0 && cal <5) {
            System.out.println("Insuficiente");
        }else{
            if (cal == 5 ) {
                System.out.println("Suficiente");
            }else{
                if (cal == 6 ) {
                    System.out.println("Bien");
                }else{
                    if (cal>=7 && cal<=8) {
                        System.out.println("Notable");
                    }else{
                        if (cal >= 9 && cal <=10) {
                            System.out.println("Sobresaliente");
                        }else{
                            System.out.println("Fuera del rango");
                        }
                        
                    }
                }
            }
        }
        
        
    }
    
}
