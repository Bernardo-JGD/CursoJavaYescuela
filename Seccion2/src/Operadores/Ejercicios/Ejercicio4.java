
package Operadores.Ejercicios;

import java.util.Scanner;
public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Una compañia de venta de carros usados, paga a su personal de ventas un salario de $1000 mensuales");
        System.out.println("Mas una comision de $150 por cada carro vendido mas el 5% del valor de la venta por carro. ");
        System.out.println("Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes");
        System.out.println("Hacer un programa que calcule e imprima el salario mensual de un vendedor dado");
        
        double cantidad_autos, valorventas,comision, porcentaje, salario_total;
        System.out.println("Ingrese la cantidad de autos vendidos");
        cantidad_autos = leer.nextDouble ();
        System.out.println("Ingrese el valor todal de las ventas de autos");
        valorventas = leer.nextDouble ();
        comision = cantidad_autos*150;
        porcentaje = (valorventas*0.05)*cantidad_autos;
        salario_total = 1000 + comision + porcentaje; 
        System.out.println("Salario total: " + salario_total);
    }
    
}
