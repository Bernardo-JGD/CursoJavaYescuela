
package Metodos_de_ordenamiento;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Metodo_de_insercion {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int arreglo[], n, pos, aux;
        n = Integer.parseInt(JOptionPane.showInputDialog ("Ingrese el tamaño del arreglo"));
        arreglo = new int[n];
        System.out.println("Ingrese los elementos del arreglo");
        for (int i = 0; i < 10; i++) {
            arreglo[i] = leer.nextInt();
        }
        // ordenamiento por insercion
        for(int i = 0; i<n; i++){
            pos = i;
            aux = arreglo[i];
            //1
            while ((pos>0) && (arreglo[pos-1]>aux)){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            //0
            arreglo[pos] = aux;
        }
        
        for(int i = 0; i<n; i++){
            pos = i;
            aux = arreglo[i];
            
            while ((pos>0) && (arreglo[pos-1]>aux)){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux;
            
        }
        System.out.println("Orden ascendente del arreglo");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
        for(int i = 0; i<n; i++){
            pos = i;
            aux = arreglo[i];
            
            while ((pos>0) && (arreglo[pos-1]<aux)){
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux;
            
        }
        
        System.out.println("Orden descendente del arreglo");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
    }
    
}
