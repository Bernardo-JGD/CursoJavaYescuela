package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio6 {

    public static void main(String[] args) {

        int numero = 0, suma = 0;

        do {

            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero"));
            suma = suma + numero;

        } while (numero != 0);
        JOptionPane.showMessageDialog(null, "Fin del ciclo. \n" + "La suma de los numeros que ingreso es: " + suma);

    }

}
