package Ejercicio4;

import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {

        Scanner leer = new Scanner(System.in);

        String nombre;
        int numero;
        float tiempo;
        int sino;
        int op;

        Atleta a[] = new Atleta[20];
        int cantidad_de_atletas = 0;

        do {

            System.out.println("1.Ingresar nuevo atleta---2.Mostrar todos los atletas---3.Mostrar al ganador");
            op = leer.nextInt();

            switch (op) {

                case 1:

                    System.out.println("1.Registro");
                    do {

                        System.out.println("Ingrese el numero de atleta");
                        numero = leer.nextInt();
                        leer.nextLine();
                        System.out.println("Ingrese el nombre del atleta");
                        nombre = leer.nextLine();
                        System.out.println("Ingrese el tiempo que hizo en la carrera");
                        tiempo = leer.nextFloat();

                        a[cantidad_de_atletas] = new Atleta(numero, nombre, tiempo);
                        cantidad_de_atletas++;
                        
                        System.out.println("¿Desea registrar otro atleta?");
                        System.out.println("1.Si    2.No");
                        sino = leer.nextInt();
                    } while (sino != 2);

                    break;

                case 2:
                    System.out.println("Atletas registrados");
                    for (int i = 0; i < cantidad_de_atletas; i++) {
                        System.out.println(a[i].mostrar());
                    }

                    break;

                case 3:
                    System.out.println("Atleta ganador");
                    System.out.println(a[ganador(a, cantidad_de_atletas)].mostrar());
                    break;

                default:System.out.println("Esa opcion no existe");break;
                    

            }

            System.out.println("¿Desea regresar al menu principal?");
            System.out.println("1.Si    2.No");
            sino = leer.nextInt();
        } while (sino != 2);

    }

    public static int ganador(Atleta a[], int cantidad_de_atletas) {
        int posicion_ganador = 0;
        float tiempo = a[0].getTiempo();

        for (int i = 1; i < cantidad_de_atletas; i++) {
            if (a[i].getTiempo() < tiempo) {
                tiempo = a[i].getTiempo();
                posicion_ganador = i;
            }
        }

        return posicion_ganador;
    }

}
