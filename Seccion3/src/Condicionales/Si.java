package Condicionales;

import javax.swing.JOptionPane;

public class Si {

    public static void main(String[] args) {

        int numero, dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero"));

        //operador de igualdad
        /*
        if (numero == dato) {
            JOptionPane.showMessageDialog(null, "El numero es igual a 5 ");
        }else{
            JOptionPane.showMessageDialog(null, "El numero es diferente de 5");
        }
         */
        //operador de "diferente de" o "no es igual"
        /*
        if (numero != dato) {
            JOptionPane.showMessageDialog(null, "El no es igual a 5 ");
        }else{
            JOptionPane.showMessageDialog(null, "El numero es igual 5");
        }
         */
        //operadores de desigualdad
        // >mayor que 
        // <menor que
        // >=mayor o igual
        // <=menor o igual 
        if (numero > dato) {

            JOptionPane.showMessageDialog(null, "El numero es mayor a 5");

        } else {
            JOptionPane.showMessageDialog(null, "El numero es menor a 5 o 5");
        }

    }

}
