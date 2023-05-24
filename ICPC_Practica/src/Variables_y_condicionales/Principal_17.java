package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_17 {
    //17. Pedir el día, mes y año de una fecha correcta y 
    //    mostrar la fecha del día siguiente. suponer que todos
    //    los meses tienen 30 días.
    // lo que a mi se me ocurrio 

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int dia, mes, year;

        System.out.println("Ingrese el dia");
        dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        mes = leer.nextInt();
        System.out.println("Ingrese el año");
        year = leer.nextInt();

        if (dia >= 1 && dia <30) {
            System.out.println("La fecha ingresada es: " + dia + "/" + mes + "/" + year);
            dia++;
            System.out.println("La fecha del dia siguiente es: " + dia + "/" + mes + "/" + year);
        } else {
            if (dia == 30 && mes <=11) {
                System.out.println("La fecha ingresada es: " + dia + "/" + mes + "/" + year);
                dia=1;
                mes++;
                System.out.println("La fecha del dia siguiente es: " + dia + "/" + mes + "/" + year);
            }else{
                if (dia ==30 && mes == 12) {
                    System.out.println("La fecha ingresada es: " + dia + "/" + mes + "/" + year);
                    dia = 1;
                    mes = 1;
                    year++;
                    System.out.println("La fecha del dia siguiente es: " + dia + "/" + mes + "/" + year );
                }
            }
        }

    }

}
