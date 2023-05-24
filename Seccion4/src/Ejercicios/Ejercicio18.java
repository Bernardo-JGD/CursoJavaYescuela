package Ejercicios;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Hacer unas modificaciones al ejercicio anterior suponiendo que no se introduce el precion por");
        System.out.println("litro. Solo existen tres productos con precios: ");
        System.out.println("0.6 litro");
        System.out.println("3 litro");
        System.out.println("1.25 litro");

        int codigo, fact600 = 0;
        double factura, factura_global = 0, cantidad_litros, canti1= 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Introduzca el codigo del articulo " + i);
            codigo = leer.nextInt();
            System.out.println("Introduzca la cantidad de litros");
            cantidad_litros = leer.nextDouble();

            if (codigo == 1) {
                factura = cantidad_litros * 0.6;
                factura_global += factura;
                canti1 += cantidad_litros;
                
                if (factura > 600) {
                    fact600++;
                }
            }
            if (codigo == 2) {
                factura = cantidad_litros * 3;
                factura_global += factura;
                
                if (factura > 600) {
                    fact600++;
                }
            }
            if (codigo == 3) {
                factura = cantidad_litros * 1.25;
                factura_global += factura;
                
                if (factura > 600) {
                    fact600++;
                }
            }

        }
        System.out.println("Factura global: " + factura_global);

        System.out.println("Litros del articulo 1: " + canti1);
        System.out.println("Facturas de mas de 600---" + fact600);

    }

}
