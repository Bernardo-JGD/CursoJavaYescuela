package Variables_y_condicionales;

import java.util.Scanner;

public class Principal_15_1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int dia, mes, year;
        System.out.println("Ingrese una fecha");
        System.out.println("Ingrese el día");
        dia = leer.nextInt();
        if (dia >= 1 && dia<=30) {
            System.out.println("Ingrese el mes");
            mes = leer.nextInt();
            if (mes >=1 && mes<=12 ) {
                System.out.println("Ingrese el año");
                year = leer.nextInt();
                if (year != 0) {
                    System.out.println("Fecha " + dia + "/" + mes + "/" + year + " correcta ");
                }else{
                    System.out.println("Año incorrecto");
                }
            }else{
                System.out.println("Mes incorrecto");
            }
        }else{
            System.out.println("Dia incorrecto");
        }
    }

}
