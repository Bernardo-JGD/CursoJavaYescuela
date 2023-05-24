package Condicionales.Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio11 {

    public static void main(String[] args) {

        System.out.println("Construir un programa que simile el funcionamiento de una calculadora que puede realizar \n"
                + " las 4 operaciones aritmeticas basicas con valores numericos enteros");
        System.out.println("S o s suma  R o r resta  P o p producto D o d division");

        int num1, num2, suma, resta, multi, divi;
        char operacion;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Inserte el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Inserte el segundo numero"));

        operacion = JOptionPane.showInputDialog("Ingrese la operacion que desea realizar \n "
                + "S/s --- Suma\n "
                + "R/r --- Resta\n "
                + "P/p --- Multiplicacion\n "
                + "D/d --- Division ").charAt(0);

        switch (operacion) {

            case 'S':
            case 's':

                suma = num1 + num2;
                JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + suma);

                break;

            case 'R':
            case 'r':

                resta = num1 - num2;
                JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + resta);
                break;

            case 'P':
            case 'p':

                multi = num1 * num2;
                JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + multi);
                break;

            case 'D':
            case 'd':

                divi = num1 / num2;
                JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + divi);
                break;

            default:

                JOptionPane.showMessageDialog(null, "No existe esa opcion");

                break;

        }

    }

}
