
package Condicionales.Ejercicios;

import javax.swing.JOptionPane;

import java.util.Scanner;
public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Hacer un programa que lea un numero entero y muestre si el numero es multiplo de 10");
        //primera forma
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        JOptionPane.showMessageDialog(null, numero%10==0 ? "El nuero es multiplo de 10" : "El numero no es multiplo de 10");
        
        
        System.out.println("Ingrese un numero");
        numero = leer.nextInt();
        
        if (numero%10 == 0) {
            System.out.println("El numero es multiplo de 10");
        }else{
            System.out.println("El numero NO es multiplo de 10");
        }
        
    }
    
}
