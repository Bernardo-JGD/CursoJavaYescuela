package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_12 {

    //12. Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n;
        int a, b, c, d;
        System.out.println("Ingrese un numero entero entre 0 y 9999");
        n = leer.nextInt();

        if ((n >= 0 && n < 10) || (n <= 0 && n > -10)) {
            System.out.println("Tiene una cifra");
            System.out.println("No se puede escribir al reves");
        } else {
            if ((n >= 10 && n <= 99) || (n <= -10 && n >= -99)) {
                a = (n / 10);
                b = (n % 10) * 10;
                n = a + b;
                System.out.println(n);
            } else {
                if ((n >= 100 && n <= 999) || (n <= -100 && n >= -999)) {
                    a = (n % 10) * 100;
                    b = ((n / 10) % 10) * 10;
                    c = (n / 100);
                    n = a + b + c;
                    System.out.println(n);
                } else {
                    if ((n >= 1000 && n <= 9999) || (n <= -1000 && n >= -9999)) {
                        a = (n % 10) * 1000;
                        b = ((n / 10) % 10) * 100;
                        c = ((n / 100) % 10) * 10;
                        d = (n / 1000);
                        n = a + b + c + d;
                        System.out.println(n);
                    }
                }
            }
        }

    }

}
