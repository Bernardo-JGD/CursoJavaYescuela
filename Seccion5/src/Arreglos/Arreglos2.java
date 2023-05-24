
package Arreglos;

import javax.swing.JOptionPane;

import java.util.Scanner;
public class Arreglos2 {
    
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int nElementos;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));
        
        char letras[] = new char [nElementos];
        
        for(int i=0; i<nElementos; i++){
            System.out.println((i+1) + "-.Digite un caracter");
            letras [i] = leer.next().charAt(0);
        }
        System.out.println("\nLos caracteres del arreglo son");
        
        for (int i = 0; i < nElementos; i++) {
            System.out.print(letras[i] + " ");
        }
    }
}
