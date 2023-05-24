package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio15 {

    public static void main(String[] args) {

        System.out.println("Dadas las edades y las alturas de 5 alumnos, mostrar la edad y la estatura media, \n"
                + "la cantidad de alumnos mayores a 18 años y la cantidad de alumnos que miden mas de 1.75 ");

        float edad, altura, edad_suma = 0, altura_suma = 0, mediae = 0, mediaa = 0;
        int m18 = 0, m175 = 0;
        for (int i = 0; i < 5; i++) {

            edad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la edad"));

            altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la atura"));

            edad_suma = edad_suma + edad;
            altura_suma = altura_suma + altura;
            if (edad > 18) {
                m18++;
            }
            if (altura > 1.75) {
                m175++;
            }

        }
        mediae = edad_suma / 5;
        mediaa = altura_suma / 5;

        JOptionPane.showMessageDialog(null, "La media de las edades es----> " + mediae
                + "\nLa media de las alturas es----> " + mediaa
                + "\nLa cantidad de alumnos +18 es----> " + m18
                + "\nLa cantidad de alumnos de +1.75 es----> " + m175);

    }

}
