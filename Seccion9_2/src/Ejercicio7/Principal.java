package Ejercicio7;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String nombre, apellido, dni;
        int numero_cuenta, n_cuentas, indice_cuenta;
        double saldo, cantidad;

        int opcion;

        Cuenta cuentas[];
        Cliente cliente;
        
        System.out.println("Digite el nombre del cliente");
        nombre = leer.nextLine();
        System.out.println("Ingrese el apellido del cliente");
        apellido = leer.nextLine();
        System.out.println("Ingrese el DNI del cliente");
        dni = leer.nextLine();
        System.out.println("¿Cuantas cuentas tiene en el banco");
        n_cuentas = leer.nextInt();

        cuentas = new Cuenta[n_cuentas];

        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("Ingrese los datos para la cuenta " + (i + 1));
            System.out.println("Digite el numero de cuenta");
            numero_cuenta = leer.nextInt();
            System.out.println("Digite el saldo de la cuenta");
            saldo = leer.nextDouble();

            cuentas[i] = new Cuenta(numero_cuenta, saldo);

        }

        cliente = new Cliente(nombre, apellido, dni, cuentas);

        do {

            System.out.println("1.Ingresar dinero en la cuenta");
            System.out.println("2.Retirar dinero de la cuenta");
            System.out.println("3.Consultar saldo de la cuenta");
            System.out.println("4.Salir");
            System.out.println("Digite la opcion de menu");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println("Digite el numero de cuenta");
                    numero_cuenta = leer.nextInt();

                    indice_cuenta = numero_de_cuenta(cuentas, numero_cuenta);

                    if (indice_cuenta == -1) {
                        System.out.println("El numero de cuenta no existe");
                    } else {
                        System.out.println("Digite la cantidad de dinero a ingresar en la cuenta");
                        cantidad = leer.nextDouble();
                        cliente.Ingresar_dinero(indice_cuenta, cantidad);
                        System.out.println("Ingreso realizado correctamente");
                        System.out.println("Saldo disponible: " + cliente.Consultar_saldo(indice_cuenta));
                    }

                    break;

                case 2:

                    System.out.println("Digite el numero de cuenta");
                    numero_cuenta = leer.nextInt();

                    indice_cuenta = numero_de_cuenta(cuentas, numero_cuenta);

                    if (indice_cuenta == -1) {
                        System.out.println("El numero de cuenta no existe");
                    } else {
                        System.out.println("Digite la cantidad de dinero a retirar en la cuenta");
                        cantidad = leer.nextDouble();

                        if (cantidad > cliente.Consultar_saldo(indice_cuenta)) {
                            System.out.println("Saldo insuficiente");
                        } else {
                            cliente.Retirar_dinero(indice_cuenta, cantidad);
                            System.out.println("Retiro realizador correctamente");
                            System.out.println("Saldo disponible: " + cliente.Consultar_saldo(indice_cuenta));
                        }

                    }

                    break;

                case 3:
                    System.out.println("Digite el numero de cuenta");
                    numero_cuenta = leer.nextInt();

                    indice_cuenta = numero_de_cuenta(cuentas, numero_cuenta);

                    if (indice_cuenta == -1) {
                        System.out.println("El numero de cuenta no existe");
                    } else {
                        System.out.println("Saldo disponible: " + cliente.Consultar_saldo(indice_cuenta));
                    }
                    break;

                case 4:
                    break;

                default:
                    System.out.println("No existe esa opcion");
                    break;

            }

        } while (opcion != 4);

    }

    public static int numero_de_cuenta(Cuenta cuentas[], int n) {

        int i = 0, indice = 0;
        boolean encontrado = false;

        //busqueda secuencial 
        while ((i < cuentas.length) && (encontrado == false)) {
            if (cuentas[i].getNumero_cuenta() == n) {
                encontrado = true;
                indice = i;
            }
            i++;
        }
        if (encontrado == false) {
            indice = -1;
        }
        return indice;
    }

}
