package boita;

import java.util.Scanner;

public class Boita {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double valorcompra;
        double descuento;
        double valorfinal=0;
        int numero_aleatorio = 5;
        String bolita = "";

        System.out.println("Ingrese el valor de la compra");
        valorcompra = leer.nextDouble();
        switch (numero_aleatorio) {

            case 1:
                bolita = "blanco";
                valorfinal = valorcompra*1;
                System.out.println("color bolita: " + bolita);
                System.out.println("valor final de compra: " + valorcompra);
                break;

            case 2:
                bolita = "verde";
                descuento = valorcompra * 0.1;
                valorfinal = valorcompra - descuento;
                
            
                break;

            case 3:
                bolita = "amarillo";
                descuento = valorcompra * 0.25;
                valorfinal = valorcompra - descuento;
                
                break;

            case 4:
                bolita = "azul";
                descuento = valorcompra * 0.5;
                valorfinal = valorcompra - descuento;

                break;

            case 5:
                bolita = "rojo";
                valorfinal = valorcompra - valorcompra;
                
                break;

        }
        System.out.println("color bolita: " + bolita);
        System.out.println("valor final de compra: " + valorfinal);

    }

}
