package Metodos_de_ordenamiento;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Metodo_Burbuja {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo"));

        double arreglo[] = new double[n];
        double aux;

        System.out.println("Ingrese los elementos del arreglo de enteros");
        for (int i = 0; i < n; i++) {
            arreglo[i] = leer.nextDouble();
        }
        //---------------------------------------------------METODO BURBUJA
        for(int i = 0; i<n-1; i++){
            for (int j = 0; j < n-1; j++) {
                if (arreglo[j]>arreglo[j+1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        System.out.println("orden ascendente");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        System.out.println("");
        System.out.println("Orden descendente");
        for(int i = 0; i<n-1; i++){
            for (int j = 0; j < n-1; j++) {
                if (arreglo[j]<arreglo[j+1]) {
                    aux = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }

    }

}
