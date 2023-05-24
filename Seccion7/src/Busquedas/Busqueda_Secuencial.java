
package Busquedas;

import javax.swing.JOptionPane;
public class Busqueda_Secuencial {
    
    public static void main (String[] args){
        
        
        
        //------------------------------ ESTE ES EL DEL VIDEO
        
        int arreglo[] = {4, 1, 5, 2, 3};
        int dato;
        int i = 0;
        
        boolean bandera = false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a buscar"));
        
        while ((i<arreglo.length)&&(bandera==false)){
         
            if (arreglo[i] == dato) {
                bandera = true;
            }
            i++;
        }
        if (bandera == false) {
            JOptionPane.showMessageDialog(null, "El numero no se encuentra en el arreglo");
        }else{
            JOptionPane.showMessageDialog(null, "El numero si se encuentra en el arreglo en la posicion " + (i-1));
        }
        
    }
    
}
