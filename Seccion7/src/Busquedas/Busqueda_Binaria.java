
package Busquedas;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Busqueda_Binaria {
    
    public static void main (String args[]){
        //------------------------------------------------ESTE ES EL DEL VIDEO
        Scanner leer = new Scanner (System.in);
        
        int arreglo [] = {1, 2, 3, 4, 5};
        int dato;
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a buscar"));
        
        //para esta busqueda vamos a necesitar unas variables extras
        int inferior = 0, superior = arreglo.length, mitad = ((inferior + superior)/2);
        int i = 0;
        boolean bandera = false;
        while ( (inferior <= superior) && (i<arreglo.length)){
            
            if (arreglo[mitad] == dato) {
                bandera = true;
                break;
            }
            if (arreglo[mitad]>dato) {
                superior = mitad;
                mitad = (inferior + superior)/2;
            }
            if (arreglo[mitad]<dato) {
                inferior = mitad;
                mitad = (inferior + superior)/2;
            }
            i++;
        }
        if (bandera == true) {
            JOptionPane.showMessageDialog(null, "El numero ha sido encontrado en la posicion---" + mitad);
        }else{
            JOptionPane.showMessageDialog(null, "No se encontro el numero en el arreglo");
        }
        
        
        
        
    }
    
}
