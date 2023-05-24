package Ejercicio8;

import java.util.Scanner;
//Una empresa de envio de paquetes teine varias sucursales
//en todo el pais. Cada sucursal esta definida por su numero de
//sucursal, direccion y ciudad. Para calcular el precio que cuesta 
//enviar cada paquete, las sucursales tienen en cuenta el precio del paquete 
//y la prioridad, sabiendo que se cobra un dolar por kilo, 10 dolares mas 
//si la prioridad es alta y 20 si es express. Cada paquete enviado tendra un 
//numero de referencia y el DNI de la persona que lo envia 

public class Principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int numero_paquete, prioridad, numero_de_sucursal;
        String dni, direccion, ciudad;
        double peso, precio_paquete;

        int opcion, contador_sucursales = 0, contador_paquete = 0 , indice_sucursal, indice_paquete;

        Paquete pa[] = new Paquete[100];
        Sucursal suc[] = new Sucursal[50];

        do {
            System.out.println("1.Crear una nueva sucursal");
            System.out.println("2.Enviar paquete");
            System.out.println("3.Cosultar sucursal");
            System.out.println("4.Consultar paquete");
            System.out.println("5.Mostrar todas las sucursales");
            System.out.println("6.Mostrar todos los paquetes");
            System.out.println("7.Salir");
            System.out.println("Digite la opcion del menu");

            opcion = leer.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println("Ingrese el numero de sucursal ");
                    numero_de_sucursal = leer.nextInt();
                    leer.nextLine();
                    System.out.println("Ingrese la direccion de la sucursal ");
                    direccion = leer.nextLine();
                    System.out.println("Ingrese la ciudad de la sucursal");
                    ciudad = leer.nextLine();
                    suc[contador_sucursales] = new Sucursal(numero_de_sucursal, direccion, ciudad);
                    contador_sucursales++;

                    break;

                case 2:
                    System.out.println("Digiete el numero de sucursal");
                    numero_de_sucursal = leer.nextInt();
                    indice_sucursal = buscar_sucursal (suc, numero_de_sucursal, contador_sucursales);
                    if (indice_sucursal == -1) {
                        System.out.println("La sucursal no existe :c ");
                    }else{
                        System.out.println("Ingrese el numero del paquete");
                        numero_paquete = leer.nextInt();
                        leer.nextLine();
                        System.out.println("Ingrese el DNI de la persona");
                        dni = leer.nextLine();
                        System.out.println("Ingrese el peso del paquete");
                        peso = leer.nextDouble ();
                        System.out.println("Ingrese la prioridad 0=normal, 1 = alta, 2 = expres");
                        prioridad = leer.nextInt();
                        
                        pa[contador_paquete] = new Paquete (numero_paquete, dni, peso, prioridad);
                        
                        precio_paquete = suc [indice_sucursal].calcular_precio(pa[contador_paquete]);
                        System.out.println("El precio del paquete es: $" + precio_paquete);
                        
                        contador_paquete++;
                        
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el numero de sucursal ");
                    numero_de_sucursal = leer.nextInt();
                    indice_sucursal = buscar_sucursal (suc, numero_de_sucursal, contador_sucursales);
                    
                    if (indice_sucursal == -1) {
                        System.out.println("La sucursal no existe :c ");
                    }else{
                        System.out.println(suc[indice_sucursal].mostrarDatos());
                    }
                    
                    break;

                case 4:
                    System.out.println("Ingrese el numero de paquete ");
                    numero_paquete = leer.nextInt();
                    
                    indice_paquete = buscar_paquete(pa, numero_paquete, contador_paquete);
                    
                    if (indice_paquete == -1) {
                        System.out.println("El paquete no existe :c ");
                    }else{
                        System.out.println(pa[indice_paquete].mostrarDatos());
                    }
                    
                    break;

                case 5:
                    for (int i = 0; i < contador_sucursales; i++) {
                        System.out.println("Los datos de la sucursal " + (i+1));
                        System.out.println("");
                        System.out.println(suc[i].mostrarDatos());
                    }
                    break;

                case 6:
                    for (int i = 0; i < contador_paquete; i++) {
                        System.out.println("\nLos datos del paquete " + (i+1));
                        System.out.println("");
                        System.out.println(pa[i].mostrarDatos());
                    }
                    break;

                case 7:
                    break;
                default :
                    System.out.println("No existe esa opcion");
                    break;

            }

        } while (opcion != 7);
    }

    public static int buscar_sucursal(Sucursal suc[], int num_suc, int contador_sucursales) {
        int indice = 0;
        boolean encontrado = false;
        
        for (int i = 0; i < contador_sucursales; i++) {
            if (suc[i].getNumeroSucursal() == num_suc) {
                encontrado = true;
                indice = i;
            }
        }
        if (encontrado == false) {
            indice = -1;
        }
        return indice;
    }
    public static int buscar_paquete(Paquete pa[], int num_pa, int contador_paquete) {
        int indice = 0;
        boolean encontrado = false;
        
        for (int i = 0; i < contador_paquete; i++) {
            if (pa[i].getNumeroPaquete() == num_pa) {
                encontrado = true;
                indice = i;
            }
        }
        if (encontrado == false) {
            indice = -1;
        }
        return indice;
    }
    

}
