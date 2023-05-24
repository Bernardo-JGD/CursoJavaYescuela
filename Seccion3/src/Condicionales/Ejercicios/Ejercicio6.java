package Condicionales.Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio6 {

    public static void main(String[] args) {

        System.out.println("Hacer un programa que tome dos numeros y diga si ambos son pares o impares");

        double num1, num2;
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El numero " + num1 + " es par" + "\n"
                    + "El numero " + num2 + " es par " + "\nAmbos son pares");
        } else {
            if (num1 % 2 != 0 && num2 % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El numero " + num1 + " es impar" + "\n"
                        + "El numero " + num2 + " es par ");
            } else {
                if (num1 % 2 == 0 && num2 % 2 != 0) {
                    JOptionPane.showMessageDialog(null, "El numero " + num1 + " es par" + "\n"
                            + "El numero " + num2 + " es impar ");
                } else {
                    if (num1 % 2 != 0 && num2 % 2 != 0) {
                        JOptionPane.showMessageDialog(null, "El numero " + num1 + " es impar" + "\n"
                                + "El numero " + num2 + " es impar " + "\nAmbos son impares");
                    }
                }
            }
        }

    }

}
