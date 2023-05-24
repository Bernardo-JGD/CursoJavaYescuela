package Ejercicio5;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double lado, base, perimetro, area;
        int sino, op, contador_t = 0;
        
        Triangulo_I t[] = new Triangulo_I [20];

        do {
            System.out.println("1.Registrar triangulos----2.Mostrar todos los triangulos----3.Mostrar el de mayor superficie");
            op = leer.nextInt();

            switch (op) {

                case 1:

                    do {
                        System.out.println("Ingrese el lado");
                        lado = leer.nextDouble();
                        System.out.println("Ingrese la base");
                        base = leer.nextDouble();
                        
                        t[contador_t] = new Triangulo_I(lado, base, perimetro(lado, base), area(lado, base));
                        contador_t++;
                        
                        System.out.println("¿Desea registrar otro triangulo?");
                        System.out.println("1.Si    2.No");
                        sino = leer.nextInt();
                    } while (sino != 2);

                    break;

                case 2:
                    System.out.println("Lista de triangulos");
                    mostrar (t, contador_t);

                    break;

                case 3:
                    
                    System.out.println("El triangulo con mayor area es");
                    System.out.println(t[mas_superficie(t, contador_t)].mostrar());

                    break;

                default:
                    System.out.println("Esa opcion no existe");
                    break;

            }

            System.out.println("¿Desea regresar al menu principal?");
            System.out.println("1.Si    2.No");
            sino = leer.nextInt();
        } while (sino != 2);

    }

    public static double perimetro (double lado, double base) {

        double perimetro = (lado * 2) + base;

        return perimetro;
    }
    public static double area (double lado, double base){
        
        double area = (base * (Math.sqrt((lado*lado) - ((base*base)/4))))/2;
        
        return area;
        
    }
    public static void mostrar (Triangulo_I t[], int contador){
        for (int i = 0; i < contador; i++) {
            System.out.println(t[i].mostrar());
        }
    }
    public static int mas_superficie (Triangulo_I t[], int contador ){
        int posicion_mas_superficie = 0;
        double area = t[posicion_mas_superficie].getArea();
        for (int i = 1; i < contador; i++) {
            if (t[i].getArea()>area) {
                area = t[i].getArea();
                posicion_mas_superficie = i;
            }
        }
        return posicion_mas_superficie;
    }
    

}
