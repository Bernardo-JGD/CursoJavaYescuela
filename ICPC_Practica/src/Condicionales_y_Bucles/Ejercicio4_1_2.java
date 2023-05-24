/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Condicionales_y_Bucles;

import java.util.Scanner;
public class Ejercicio4_1_2 {
    //4. Pedir números hasta que se teclee uno negativo, 
    //y mostrar cuántos números se han introducido.
    //aqui cuento solo los positivos y resto del contador para solo sacar los positivos
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int num, contador = 0;
        do{
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            contador++;
        }while (num>=0);
        System.out.println("Total numeros ingresados (menos el negativo) : " + (contador-1));
        
    }
    
}
