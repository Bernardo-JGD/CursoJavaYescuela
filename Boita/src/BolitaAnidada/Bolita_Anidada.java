/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BolitaAnidada;

/**
 *
 * @author TOSHIBA
 */
import java.util.Scanner;

public class Bolita_Anidada {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double valorcompra;
        double descuento;
        double valorfinal = 0;
        String bolita = "";
        int numerorandom = 5;

        System.out.println("Ingrese el valor de la compra");
        valorcompra = leer.nextDouble();
        if (numerorandom == 1) {
            bolita = "blanco";
            descuento = valorcompra * 0;
            valorfinal = valorcompra-descuento;
            System.out.println("color bolita: " + bolita);
            System.out.println("valor final de compra: " + valorfinal);
        } else {
            if (numerorandom == 2) {
                bolita = "verde";
                descuento = valorcompra * 0.1;
                valorfinal = valorcompra-descuento;
                System.out.println("color bolita: " + bolita);
                System.out.println("valor final de compra: " + valorfinal);
            } else {
                if (numerorandom == 3) {
                    bolita = "amarillo";
                    descuento = valorcompra * 0.25;
                    valorfinal = valorcompra-descuento;
                    System.out.println("color bolita: " + bolita);
                    System.out.println("valor final de compra: " + valorfinal);
                } else {
                    if (numerorandom == 4) {
                        bolita = "azul";
                        descuento = valorcompra * 0.50;
                        valorfinal = valorcompra-descuento;
                        System.out.println("color bolita: " + bolita);
                        System.out.println("valor final de compra: " + valorfinal);
                    } else {
                        if (numerorandom == 5) {
                            bolita = "rojo";
                            descuento = valorcompra*1;
                            valorfinal = valorcompra-descuento;
                            System.out.println("color bolita: " + bolita);
                            System.out.println("valor final de compra: " + valorfinal);
                        } else {
                            System.out.println("no tomo bolita");
                            System.out.println("valor final de compra" + valorcompra);
                        }
                    }
                }
            }
        }

    }
}
