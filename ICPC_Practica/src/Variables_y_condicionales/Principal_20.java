package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_20 {
    //20. Pedir una hora de la forma hora, minutos y segundos, 
    //y mostrar la hora en el segundo siguiente.

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int h, m, s;

        System.out.println("Ingrese la hora");
        h = leer.nextInt();
        System.out.println("Ingrese los minutos");
        m = leer.nextInt();
        System.out.println("Ingrese elo segundos");
        s = leer.nextInt();
        System.out.println("Hora actual: " + h + ":" + m + ":" + s);
        s++;

        if (s == 60) {
            s = 0;
            m++;
            if (m == 60) {
                m = 0;
                h++;
                if (h == 24) {
                    h = 0;
                }
            }
        }
        System.out.println("Hora siguiente: " + h + ":" + m + ":" + s);
        /*if (h == 23 && m == 59 && s == 59) {
            System.out.println("Hora actual: " + h + ":" + m + ":" + s);
            h = 0;
            m = 0;
            s = 0;
            System.out.println("Hora siguiente: " + h + ":" + m + ":" + s);
        } else {
            if (m == 59 && s == 59) {
                System.out.println("Hora actual: " + h + ":" + m + ":" + s);
                h++;
                m = 0;
                s = 0;
                System.out.println("Hora siguiente: " + h + ":" + m + ":" + s);
            } else {
                if (s == 59) {
                    System.out.println("Hora actual: " + h + ":" + m + ":" + s);
                    m++;
                    s = 0;
                    System.out.println("Hora siguiente: " + h + ":" + m + ":" + s);
                }

            }
        }*/

    }

}
