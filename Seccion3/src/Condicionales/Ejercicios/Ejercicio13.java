package Condicionales.Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio13 {

    public static void main(String[] args) {

        System.out.println("Hacer un programa que simule un cajero automatico con un saldo inicial de 1000 dolares");
        System.out.println("Con el siguiente menu de opciones: ");
        System.out.println("1.Ingresar Dinero a la cuenta");
        System.out.println("2.Retirar dinero de la cuenta");
        System.out.println("3.Salir");

        int opcion;
        double cantidad_inicial = 1000;
        double cantidad_retirar = 0, cantidad_ingresar=0;
        double saldo_final;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la opcion que desee\n"
                + "1.Ingresar Dinero a la cuenta\n"
                + "2.Retirar dinero de la cuenta\n"
                + "3.Salir"));

        switch (opcion) {

            case 1:

                cantidad_ingresar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo"));
                saldo_final = cantidad_inicial + cantidad_ingresar;
                
                JOptionPane.showMessageDialog(null, "Operacion realizada con exito\n"
                            + "Su saldo inicial era de $" + cantidad_inicial
                            + "\n"
                            + "E ingreso $" + cantidad_ingresar 
                            + "\n" 
                            + "Ahora su saldo actual es de: $" + saldo_final);

                break;

            case 2:

                cantidad_retirar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a retirar"));

                if (cantidad_retirar <= cantidad_inicial) {
                    saldo_final = cantidad_inicial - cantidad_retirar;
                    JOptionPane.showMessageDialog(null, "Operacion realizada con exito\n"
                            + "Su saldo inicial era de $" + cantidad_inicial
                            + "\n"
                            + "Y retiro $ " + cantidad_retirar 
                            + "\n" 
                            + "Ahora su saldo actual es de: $" + saldo_final);
                }else{
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente\n" 
                    + "El cajero solo cuenta con $" + cantidad_inicial 
                    + "\n" 
                    + "Y usted pide $" + cantidad_retirar);
                }
                
                break;

            case 3:

                JOptionPane.showMessageDialog(null, "Usted ha salido :v");
                
                break;

            default:

                JOptionPane.showMessageDialog(null, "No existe esa opcion");

                break;

        }

    }

}
