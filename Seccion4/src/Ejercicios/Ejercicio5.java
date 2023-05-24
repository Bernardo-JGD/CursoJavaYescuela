package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio5 {

    public static void main(String[] args) {

        System.out.println("Realizar un juego para adivinar un numero. ");
        System.out.println("Para ello generar un numero aleatorio entre el 0 y el 100 y luego ir pidieno numero indicando ");
        System.out.println("es mayor o es menor ");
        System.out.println("segun sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta");
        System.out.println("Y mostrar el numero de intentos");

        int num_aleatorio = (int) (Math.random() * 100);
        int numero_ingresado, intentos = 0;

        System.out.println(num_aleatorio);

        do {

            numero_ingresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

            if (numero_ingresado > num_aleatorio) {
                JOptionPane.showMessageDialog(null, "El numero que ingreso---" + numero_ingresado + "---es mayor que el numero a encontrar");
            } else {
                if (numero_ingresado < num_aleatorio) {
                    JOptionPane.showMessageDialog(null, "El numero que ingreso---" + numero_ingresado + "---es menor que el numero a encontrar");
                }
            }
            intentos++;
        } while (numero_ingresado != num_aleatorio);
            
            JOptionPane.showMessageDialog(null, "El numero que ingreso " + numero_ingresado + " es igual que el numero a encontrar\n" + "Numero de intentos: " + intentos + "\nFin del juego");
        //  do{
        // }while ();
    }

}
