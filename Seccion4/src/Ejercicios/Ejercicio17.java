package Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las ");
        System.out.println("facturas. En cada factura figura: el codigo del articulo, la cantidad vendida en litros");
        System.out.println(", y el precio por litro. Se pide de 5 facturas introducidas: facturacion total, cantidad de litros");
        System.out.println("vendidos del articulo 1 y cuantas facturas se emitieron de mas de $600");

        int cod1, cod2, cod3, cod4, cod5, codleer, mas600 = 0;
        double cantidadleer, precio, ftotal1, ftotal2, ftotal3, ftotal4, ftotal5, factura, factura_global = 0, litros_global = 0;
        double canti1 = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Introduzca el codigo del articulo " + i);
            codleer = leer.nextInt();
            System.out.println("Introduzca la cantidad vendida en litros");
            cantidadleer = leer.nextDouble();
            System.out.println("Introduzca el precio por litro");
            precio = leer.nextDouble();

            factura = cantidadleer * precio;

            factura_global += factura;
            litros_global = litros_global + cantidadleer;
            if (codleer == 1) {
                canti1 += cantidadleer;
            }
            if (factura>600) {
                mas600++;
            }
            

        }
        System.out.println("Factura global: " + factura_global);
        System.out.println("Litros global: " + litros_global);
        System.out.println("Litros del articulo 1: " + canti1);
        System.out.println("Facturas de mas de 600---" + mas600 );

    }

}
