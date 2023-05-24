package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_13 {

    //13. Pedir un número entre 0 y 99999, decir si es capicúa.
    public static void main(String args[]) {
        
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese un numero entero entre 0 y 99999");
        n = leer.nextInt();
        if ((n >= 0 && n <= 9) || (n <= 0 && n >= -9)) {
            System.out.println("Tiene una cifra, no se puede evaluar, pero si es capicua");
        } else {
            if ((n >= 10 && n <= 99) || (n <= -10 && n >= -99)) {
                if ((n / 10) == (n % 10)) {
                    System.out.println(n + " Es un numero capicua");
                } else {
                    System.out.println(n + " No es un numero capicua");
                }
            } else {
                if ((n >= 100 && n <= 999) || (n <= -100 && n >= -999)) {
                    if ((n / 100) == (n % 10)) {
                        System.out.println(n + " Es un numero capicua");
                    } else {
                        System.out.println(n + " No es un numero capicua");
                    }
                } else {
                    if ((n >= 1000 && n <= 9999) || (n <= -1000 && n >= -9999)) {
                        if (((n / 1000) == (n % 10)) && (((n / 100) % 10) == ((n / 10) % 10))) {
                            System.out.println(n + " Es un numero capicua");
                        } else {
                            System.out.println(n + " No es un numero capicua");
                        }
                    } else {
                        if ((n >= 10000 && n <= 99999) || (n <= -10000 && n >= -99999)) {
                            if ((((n / 10000) == (n % 10)) && (((n / 1000) % 10) == ((n / 10) % 10)))) {
                                System.out.println(n + " Es un numero capicua");
                            }else{
                                System.out.println(n + " No es un numero capicua");
                            }
                        } else {
                            System.out.println("Tiene más de 5 cifras ");
                        }
                    }
                }
            }
        }
        
    }
    
}
