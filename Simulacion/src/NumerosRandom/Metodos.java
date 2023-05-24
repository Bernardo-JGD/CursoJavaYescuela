package NumerosRandom;

import java.util.Scanner;

public class Metodos {

    static Scanner leer = new Scanner(System.in);
    static double cm[];
    static int cm_semillas[];

    static double pm[];
    static int pms[];

    static double mc[];
    static int mcs[];

    static double rlineal[];
    static int xlineal[];

    static double rmulti[];
    static int xmulti[];

    static double radi[];
    static int xadi[];

    public static void main(String[] args) {

        menu();

    }

    public static void menu() {

        int opcion, cantidad, opcion2, regresar;
        double semilla, x0, x1, constante, c, k, g, m, a = 0, N;
        boolean cierto_falso = false;

        int ri, cantidad_inicial;

        do {
            System.out.println("1.Cuadrados medios");
            System.out.println("2.Productos medios");
            System.out.println("3.Multiplicador constante");
            System.out.println("4.Algoritmo lineal");
            System.out.println("5.Algoritmo congruencial multiplicativo");
            System.out.println("6.Algoritmo congruencial aditivo");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    do {
                        System.out.println("Ingrese la semilla");
                        semilla = leer.nextDouble();
                        if (semilla < 1000) {
                            System.out.println("La semilla tiene que ser de 4 digitos minimo");
                            cierto_falso = false;
                        } else {
                            cierto_falso = true;
                        }
                    } while (cierto_falso == false);
                    System.out.println("Ingrese la cantidad de numeros random que desea");
                    cantidad = leer.nextInt();
                    cmIteraciones(semilla, cantidad);
                    mostrar(opcion);
                    break;

                case 2:
                    do {
                        System.out.println("Ingrese la semilla x0");
                        x0 = leer.nextDouble();

                        if (x0 < 1000) {
                            System.out.println("La semilla x0 tiene que ser de 4 digitos minimo");
                            cierto_falso = false;
                        } else {
                            cierto_falso = true;
                        }

                    } while (cierto_falso == false);
                    do {
                        System.out.println("Ingrese la semilla x1");
                        x1 = leer.nextDouble();
                        if (x1 < 1000) {
                            System.out.println("La semilla x1 tiene que ser de 4 digitos minimo");
                            cierto_falso = false;
                        } else {
                            cierto_falso = true;
                        }

                    } while (cierto_falso == false);
                    System.out.println("Ingrese la cantidad de numeros random que desea");
                    cantidad = leer.nextInt();
                    pmIteraciones(cantidad, x0, x1);
                    mostrar(opcion);

                    break;

                case 3:
                    do {
                        System.out.println("Ingrese la semilla x0");
                        semilla = leer.nextDouble();

                        if (semilla < 1000) {
                            System.out.println("La semilla x0 tiene que ser de 4 digitos minimo");
                            cierto_falso = false;
                        } else {
                            cierto_falso = true;
                        }

                    } while (cierto_falso == false);
                    do {
                        System.out.println("Ingrese la constante");
                        constante = leer.nextDouble();

                        if (constante < 1000) {
                            System.out.println("La constante tiene que de 4 digitos minimo ");
                            cierto_falso = false;
                        } else {
                            cierto_falso = true;
                        }

                    } while (cierto_falso == false);
                    System.out.println("Ingrese la cantidad de numeros random que desea");
                    cantidad = leer.nextInt();
                    mcIteraciones(cantidad, semilla, constante);
                    mostrar(opcion);
                    break;

                case 4:

                    do {
                        System.out.println("Ingrese la semilla x0");
                        x0 = leer.nextDouble();

                        if (x0 > 0) {                           
                            cierto_falso = true;
                        } else {
                            System.out.println("La semilla x0 tiene que ser mayor que 0");
                            cierto_falso = false;
                        }

                    } while (cierto_falso == false);
                    do {
                        System.out.println("Ingrese la constante aditiva c");
                        c = leer.nextDouble();

                        if (c > 0) {
                            cierto_falso = true;
                        } else {
                            System.out.println("La constante c tiene que ser mayor que 0");
                            cierto_falso = false;
                        }

                    } while (cierto_falso == false);
                    do {
                        System.out.println("Ingrese k");
                        k = leer.nextDouble();

                        if (k % 1 == 0) {
                            cierto_falso = true;
                        } else {
                            System.out.println("k tiene que ser numero entero");
                            cierto_falso = false;
                        }

                    } while (cierto_falso == false);
                    do {
                        System.out.println("Ingrese g");
                        g = leer.nextDouble();

                        if (g % 1 == 0) {
                            cierto_falso = true;
                        } else {
                            System.out.println("g tiene que ser numero entero");
                            cierto_falso = false;
                        }

                    } while (cierto_falso == false);
                    m = Math.pow(2, g);
                    a = 1 + (4 * k);
                    linealIteraciones(m, x0, c, a);
                    mostrar(opcion);
                    break;

                case 5:
                    do {
                        System.out.println("Ingrese la semilla X0");
                        x0 = leer.nextDouble();

                        if (x0 % 2 == 0) {
                            System.out.println("x0 tiene que ser impar");
                            cierto_falso = false;
                        } else {
                            cierto_falso = true;
                        }

                    } while (cierto_falso == false);
                    do {
                        System.out.println("Ingrese g");
                        g = leer.nextDouble();

                        if (g % 1 == 0) {
                            cierto_falso = true;
                        } else {
                            System.out.println("g tiene que ser numero entero");
                            cierto_falso = false;
                        }

                    } while (cierto_falso == false);
                    do {
                        System.out.println("Ingrese k");
                        k = leer.nextDouble();

                        if (k % 1 == 0) {
                            cierto_falso = true;
                        } else {
                            System.out.println("k tiene que ser numero entero");
                            cierto_falso = false;
                        }

                    } while (cierto_falso == false);
                    System.out.println("1--->a = 3+8k " + "\n" + "2--->a = 5+8k?");
                    opcion2 = leer.nextInt();
                    if (opcion2 == 1) {
                        a = 3 + (8 * k);
                    } else {
                        if (opcion2 == 2) {
                            a = 5 + (8 * k);
                        }
                    }
                    m = Math.pow(2, g);
                    N = m / 4;

                    multiplicativo(x0, a, N, m);
                    mostrar(opcion);

                    break;

                case 6:

                    System.out.println("Ingrese la cantidad de semillas iniciales");
                    cantidad_inicial = leer.nextInt();
                    double semillas_iniciales[] = new double[cantidad_inicial];
                    System.out.println("Ingrese la cantidad numeros ri");
                    ri = leer.nextInt();
                    System.out.println("Ingrese las semillas iniciales");
                    for (int i = 0; i < cantidad_inicial; i++) {
                        System.out.print("Ingrese X" + (i + 1));
                        semillas_iniciales[i] = leer.nextDouble();
                    }
                    System.out.println("Ingrese m");
                    m = leer.nextDouble();
                    aditivo(semillas_iniciales, cantidad_inicial, ri, (int)m);
                    mostrar (opcion);
                    break;

            }
            System.out.println("¿Desea regrear al menu principal?");
            System.out.println("1.Si        2.No");
            regresar = leer.nextInt();
        } while (regresar != 2);

    }

    public static void cmIteraciones(double semilla, int cantidad) {
        cm = new double[cantidad];
        cm_semillas = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            cm_semillas[i] = (int) semilla;
            semilla = Math.pow(semilla, 2);
            int entero = (int) semilla;
            char ar[] = String.valueOf(entero).toCharArray();
            semilla = nuevaSemilla(ar);
            cm[i] = nuevaSemilla(ar) * 0.0001;
            //calcular_r()
            cm_semillas[i] = (int) nuevaSemilla(ar);
        }

    }

    public static double nuevaSemilla(char ar[]) {
        double nueva_semilla = 0;

        nueva_semilla = Double.parseDouble(Character.toString(ar[(ar.length / 2) - 2])) * 1000;
        nueva_semilla = nueva_semilla + (Double.parseDouble(Character.toString(ar[(ar.length / 2) - 1])) * 100);
        nueva_semilla = nueva_semilla + (Double.parseDouble(Character.toString(ar[(ar.length / 2)])) * 10);
        nueva_semilla = nueva_semilla + Double.parseDouble(Character.toString(ar[(ar.length / 2) + 1]));

        return nueva_semilla;
    }

    public static void mostrar(int opcion) {

        switch (opcion) {
            case 1:
                for (int i = 0; i < cm_semillas.length; i++) {
                    System.out.println("Semilla " + (i + 1) + "----> " + cm_semillas[i]);
                    System.out.println("R" + (i + 1) + "----> " + cm[i]);
                }
                break;

            case 2:
                for (int i = 0; i < pms.length; i++) {
                    System.out.println("Semilla x" + (i + 2) + "----> " + pms[i]);
                    System.out.println("R" + (i + 1) + "----> " + pm[i]);
                }
                break;

            case 3:
                for (int i = 0; i < mcs.length; i++) {
                    System.out.println("Semilla x" + (i + 1) + "----> " + mcs[i]);
                    System.out.println("R" + (i + 1) + "----> " + mc[i]);
                }
                break;
            case 4:
                for (int i = 0; i < xlineal.length; i++) {
                    System.out.println("X" + (i + 1) + "----> " + xlineal[i]);
                    System.out.println("r" + (i + 1) + "----> " + rlineal[i]);
                }
                break;

            case 5:
                for (int i = 0; i < xmulti.length; i++) {
                    System.out.println("X" + (i + 1) + "----> " + xmulti[i]);
                    System.out.println("r" + (i + 1) + "----> " + rmulti[i]);
                }
                break;
                
            case 6 :
                for (int i = 0; i <radi.length; i++) {
                    System.out.println("r" + (i+1) + "----> " + radi[i]);
                }
                for (int i = 0; i < xadi.length; i++) {
                    System.out.println("X" + (i+1) + "---->" + xadi[i]);
                }
                break;
        }

    }

    public static void pmIteraciones(int cantidad, double x0, double x1) {
        pm = new double[cantidad];
        pms = new int[cantidad];
        double s_nueva;
        int entero;
        char ar[];
        for (int i = 0; i < cantidad; i++) {

            s_nueva = x0 * x1;
            entero = (int) s_nueva;
            ar = String.valueOf(entero).toCharArray();
            x0 = x1;
            x1 = nuevaSemilla(ar);
            pm[i] = nuevaSemilla(ar) * 0.0001;
            pms[i] = (int) x1;

        }

    }

    public static void mcIteraciones(int cantidad, double semilla, double constante) {
        mc = new double[cantidad];
        mcs = new int[cantidad];

        double multi;
        int entero;
        char ar[];

        for (int i = 0; i < cantidad; i++) {
            multi = semilla * constante;
            entero = (int) multi;
            ar = String.valueOf(entero).toCharArray();
            semilla = nuevaSemilla(ar);
            mc[i] = nuevaSemilla(ar) * 0.0001;
            mcs[i] = (int) semilla;

        }

    }

    public static void linealIteraciones(double m, double x0, double c, double a) {
        rlineal = new double[((int) m) + 1];
        xlineal = new int[((int) m) + 1];
        double r;

        for (int i = 0; i < m + 1; i++) {
            x0 = ((a * x0) + c) % m;
            xlineal[i] = (int) x0;
            r = x0 / (m - 1);
            rlineal[i] = calcular_r(r);
        }

    }

    public static double calcular_r(double r) {
        double auxiliar_r;
        char aux[] = new char[6];
        char arreglo[] = String.valueOf(r).toCharArray();

        if (arreglo.length > 6) {
            aux[0] = 0;
            aux[1] = '.';
            aux[2] = arreglo[2];
            aux[3] = arreglo[3];
            aux[4] = arreglo[4];
            aux[5] = arreglo[5];
            auxiliar_r = Double.parseDouble(String.valueOf(aux));
        } else {
            auxiliar_r = r;
        }

        return auxiliar_r;
    }

    public static void multiplicativo(double x0, double a, double N, double m) {
        rmulti = new double[((int) N) + 1];
        xmulti = new int[((int) N) + 1];
        double r;
        for (int i = 0; i < N + 1; i++) {
            x0 = (a * x0) % m;
            xmulti[i] = (int) x0;
            r = x0 / (m - 1);
            rmulti[i] = calcular_r(r);
        }
    }

    public static void aditivo(double semillas_iniciales[], int cantidad_inicial, int ri, int m) {
        double r,  raux;
        int aux = 0, aux2 =  ri-3, aux3 = ri-2;
        radi = new double [ri];
        xadi = new int [cantidad_inicial+ri];
        
        for (int i = 0; i < cantidad_inicial; i++) {
            xadi[i] = (int)semillas_iniciales[i];
        }
        for (int i = 0; i <ri; i++) {
            xadi[aux3] = ((xadi[aux2]+xadi[aux]))% m;
            raux = xadi[aux3];
            r = raux/(m-1);
            radi[i] = calcular_r(r);
            aux++;
            aux2++;
            aux3++;
        }
        
    }
    /*
    static double radi[];
    static int xadi[];
     */

}
