package Condicionales.Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio14 {

    public static void main(String[] args) {

        System.out.println("Hacer un programa que pase kg a otra unidad de medida de masa");
        System.out.println("Mostrar en pantalla un menu con las opcioes posibles");

        double masakg;

        masakg = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la masa en kg"));

        int op;
        op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la opcion\n"
                + "1.Hectogramos\n"
                + "2.Decagramos\n"
                + "3.Gramos\n"
                + "4.Decigramos\n"
                + "5.Centigramos\n"
                + "6.Miligramos"));

        switch (op) {

            case 1:
                
                masakg *=10; 
                
                JOptionPane.showMessageDialog(null, "El resultado de la conversion de kg a Hectogramos es: " + masakg);

                break;

            case 2:
                
                masakg *=100; 
                
                JOptionPane.showMessageDialog(null, "El resultado de la conversion de kg a Decagramos es: " + masakg);

                break;

            case 3:
                
                masakg *=1000; 
                
                JOptionPane.showMessageDialog(null, "El resultado de la conversion de kg a gramos es: " + masakg);

                break;

            case 4:
                
                masakg *=10000; 
                
                JOptionPane.showMessageDialog(null, "El resultado de la conversion de kg a Decigramos es: " + masakg);

                break;

            case 5:
                
                masakg *=100000; 
                
                JOptionPane.showMessageDialog(null, "El resultado de la conversion de kg a Centigramos es: " + masakg);

                break;

            case 6:
                
                masakg *=1000000; 
                
                JOptionPane.showMessageDialog(null, "El resultado de la conversion de kg a Miligramos es: " + masakg);

                break;
                
            default: 
                
                JOptionPane.showMessageDialog(null, "No existe esa opcion");
                
                break;

        }

    }

}
