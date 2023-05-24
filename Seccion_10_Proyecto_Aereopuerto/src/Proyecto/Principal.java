/*//-------Diseñar y codificar una aplicación informática para una compañia de gestión aeroportuaria satisfaciendo los 
//---------siguientes requisitos: 
//--------- Para cada aeropuerto es necesario saber:  
//--------- A)Todas las compañias de vuelos que operan en el 
//--------- B)Nombre del aeropuerto, la ciudad donde e ubica y pais al que pertenece 
//---------
//--------- Cada compañia se caracteriza por el nombre y la lista de vuelos que ofrece 
//---------
//--------- Los vuelos estan definidos por su identificador, la ciudad de origen, la ciudad de destino, el precio del viaje,
//--------- la lista de pasajeros, el numero maximo de pasajeros permitidos en el vuelo y el numero de pasajeros que 
//--------- ha reservado asiento en el avion 
//---------
//--------- Los aeropuertos pueden ser privado o publicos
//---------     a) Los aeropuertos privados tienen una serie de empresas que los patrocinan y es necesario saber el nombre de
//---------        cada una de esas empresas. 
//---------     b) Para los aeropuertos publicos se requiere saber la cantidad de dinero correspondiente a la subvencion
//---------        gubernamental 
//---------
//--------- Se necesita gestionar tambien la informacion de los pasajeros 
//---------     *Para cada pasajero se necesita saber el nombre, numero de pasamorte y nacionalidad
//---------
//---------La aplicacion tendra un menu con las siguientes opciones 
//---------
//---------     1)Consultar los aeropuertos gestionados, indicando separadamente los aeropuertos publicos y
//---------       los privados. Para cada uno de ellos debera mostrar su nombre, la ciudad de ubicacion y el pais al que  
//---------       pertenece       
//---------     
//---------     2)Visualizar las empresas que patrocinan un determinado aeropuerto en caso que sea privado, o la cuantia 
//---------       de la subvencion en caso de que se trate de un aeropuerto publico   
//--------- 
//---------     3)Para un determinado aeropuerto se debe de mostrar la lista de compañias que vuelas desde ese aeropuerto 
//---------         
//---------     4)Para una determinada compañia que opera en un aeropuerto concreto listar todos los posibles vuelos que dicha 
//---------       compañia ofrece, mostrando su identificador, la ciudad de origen y destino y el precio del vuelo.   
//---------
//---------     5)Mostrar todos los posibles vuelos (identificador) que parten de una ciudad origen a otra ciudad destino  
//---------       (indicadas por el usuario) y mostrar su precio              
 */
package Proyecto;

import java.util.Scanner;

public class Principal {

    static Scanner leer = new Scanner(System.in);
    final static int num = 4; // Numero de aeropuertos
    static Aeropuerto aeropuertos[] = new Aeropuerto[num];

    public static void main(String[] args) {

        //insertar datos de los aeropuertos 
        insertarDatosAeropuerto(aeropuertos);
        menu();

    }

    public static void insertarDatosAeropuerto(Aeropuerto aero[]) {
        aero[0] = new AeropuertoPublico("Jorge Chavez", "Lima", "Peru", 80000000);
        aero[0].InsertarCompania(new Compania("AeroPeru"));
        aero[0].InsertarCompania(new Compania("LATAM"));
        aero[0].getCompania("AeroPeru").insertarVuelo(new Vuelo("IB20", "Lima", "Mexico", 150.90, 150));
        aero[0].getCompania("AeroPeru").insertarVuelo(new Vuelo("IB21", "Lima", "Buenos Aires", 180.99, 120));
        aero[0].getCompania("LATAM").insertarVuelo(new Vuelo("FC12", "Lima", "Londres", 500.90, 180));
        aero[0].getCompania("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Alejandro", "123321JB", "Mexicano"));
        aero[0].getCompania("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Maria", "64AME", "Mexicana"));
        aero[0].getCompania("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Raul", "JKL24", "Peruana"));

        aero[1] = new AeropuertoPrivado("Central Ciudad Real", "Ciudad Real", "España");
        aero[1].InsertarCompania(new Compania("AirEuropa"));
        String empresas[] = {"Cobresol", "Anguila34"};
        ((AeropuertoPrivado) aero[1]).insertarEmpresas(empresas);
        aero[1].getCompania("AirEuropa").insertarVuelo(new Vuelo("AE095", "Madrid", "Buenos Aires", 350.5, 80));
        aero[1].getCompania("AirEuropa").getVuelo("AE095").insertarPasajero(new Pasajero("Pandita", "BlandoBlack", "BALL"));

        aero[2] = new AeropuertoPublico("Aeropuerto Bogota", "Bogota", "Colombia", 20000000);
        aero[2].InsertarCompania(new Compania("AirAmerica"));
        aero[2].InsertarCompania(new Compania("VuelaBogota"));
        aero[2].getCompania("AirAmerica").insertarVuelo(new Vuelo("AE030", "Bogota", "Lima", 200.80, 80));
        aero[2].getCompania("AirAmerica").insertarVuelo(new Vuelo("AE031", "Bogota", "Lima", 210.80, 50));
        aero[2].getCompania("AirAmerica").getVuelo("AE030").insertarPasajero(new Pasajero("Limon", "Verde", "CITRICO"));
        aero[2].getCompania("AirAmerica").getVuelo("AE030").insertarPasajero(new Pasajero("Limon", "Verde", "CITRICO"));
        aero[2].getCompania("AirAmerica").getVuelo("AE030").insertarPasajero(new Pasajero("Naranja", "Rosa", "LECHUGA"));

        aero[3] = new AeropuertoPublico("Aeropuerto Mexico", "Mexico", "Mexico", 100000000);
        aero[3].InsertarCompania(new Compania("AeroMexico"));
        aero[3].getCompania("AeroMexico").insertarVuelo(new Vuelo("IB2040", "Mexico", "Nueva Zelanda", 300.40, 100));
        aero[3].getCompania("AeroMexico").insertarVuelo(new Vuelo("IB2042", "Mexico", "Lima", 150.20, 80));
        aero[3].getCompania("AeroMexico").getVuelo("IB2042").insertarPasajero(new Pasajero("Optimus", "Autobot", "CIBERTRON"));

    }

    public static void menu() {
        int opcion;
        String nombre_aeropuerto, nombre_compania, origen, destino;
        Aeropuerto aeropuerto;
        Compania compania;
        do {
            System.out.println("\t MENU");
            System.out.println("1.Ver aeropuertos gestionados");
            System.out.println("2.Ver empresas (privado) o subvencion (publico)");
            System.out.println("3.Lista de compañias de un Aeropuerto");
            System.out.println("4.Lista de vuelos por compañias");
            System.out.println("5.Listar posibles vuelos de origen a destino");
            System.out.println("6.Salir");
            System.out.print("Opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1://1.Ver aeropuertos gestionados
                    mostrarDatosAeropuertos(aeropuertos);
                    break;

                case 2: //Ver empresas (privado) o subvencion (publico)
                    mostrarPatrocinio(aeropuertos);
                    break;

                case 3://Lista de compañias de un Aeropuerto
                    leer.nextLine();
                    System.out.println("Ingrese el nombre del aerupuerto");
                    nombre_aeropuerto = leer.nextLine();
                    aeropuerto = buscarAeropuerto(nombre_aeropuerto, aeropuertos);
                    if (aeropuerto == null) {
                        System.out.println("Ese Aeropuerto no existe");
                    } else {
                        mostrarCompanias(aeropuerto);
                    }

                    break;

                case 4://Lista de vuelos por compañias
                    leer.nextLine();
                    System.out.println("Ingrese el nombre del aeropuerto");
                    nombre_aeropuerto = leer.nextLine();
                    aeropuerto = buscarAeropuerto(nombre_aeropuerto, aeropuertos);
                    if (aeropuerto == null) {
                        System.out.println("El aeropuerto no existe");
                    } else {
                        System.out.println("Ingrese el nombre de la compania");
                        nombre_compania = leer.nextLine();
                        compania = aeropuerto.getCompania(nombre_compania);
                        if (compania == null) {
                            System.out.println("La compania no existe");
                        } else {
                            mostrar_vuelos(compania);
                        }
                    }
                    break;

                case 5://Listar posibles vuelos de origen a destino
                    leer.nextLine();
                    System.out.println("Ingrese la ciudad de origen");
                    origen = leer.nextLine();
                    System.out.println("Ingrese la ciudad de destine");
                    destino = leer.nextLine();
                    vuelosOD(origen, destino, aeropuertos);
                    
                    break;

                case 6:
                    
                    break;

                default:
                    System.out.println("No existe esa opcion");
                    break;
            }

        } while (opcion != 6);
    }

    public static void mostrarDatosAeropuertos(Aeropuerto aeropuertos[]) {
        for (int i = 0; i < aeropuertos.length; i++) {
            //la palabra reservada "instanceof" me sirve en este caso dentro de un if para preguntar lo siguiente:
            //si el arreglo (de objetos) de aeropuertos "aeropuertos" en la posicion "i" es del tipo de la subclase
            //"AeropuertoPrivado" realiza lo siguiente:
            if (aeropuertos[i] instanceof AeropuertoPrivado) {
                System.out.println("Aeropuerto Privado");
                System.out.println("Nombre: " + aeropuertos[i].getNombre());
                System.out.println("Ciudad: " + aeropuertos[i].getCiudad());
                System.out.println("Pais: " + aeropuertos[i].getPais());
            } else {
                System.out.println("Aeropuerto Publico");
                System.out.println("Nombre: " + aeropuertos[i].getNombre());
                System.out.println("Ciudad: " + aeropuertos[i].getCiudad());
                System.out.println("Pais: " + aeropuertos[i].getPais());
            }
            System.out.println("");
        }
    }

    public static void mostrarPatrocinio(Aeropuerto aeropuertos[]) {
        String empresas[];
        for (int i = 0; i < aeropuertos.length; i++) {
            if (aeropuertos[i] instanceof AeropuertoPrivado) {
                System.out.println("Aeropuerto privado");
                System.out.println("Nombre: " + aeropuertos[i].getNombre());
                empresas = ((AeropuertoPrivado) aeropuertos[i]).getListaEmpresas();
                System.out.println("Empresas");
                for (int j = 0; j < empresas.length; j++) {
                    System.out.println("[" + empresas[j] + "]");
                }
            } else {
                System.out.println("Aeropuerto publico");
                System.out.println("Nombre: " + aeropuertos[i].getNombre());
                System.out.println("Subvencion: " + ((AeropuertoPublico) aeropuertos[i]).getSubvencion());
            }
            System.out.println("");
        }
    }

    public static Aeropuerto buscarAeropuerto(String nombre, Aeropuerto aeropuertos[]) {
        Aeropuerto a = null;
        for (int i = 0; i < aeropuertos.length; i++) {
            if (aeropuertos[i].getNombre().equals(nombre)) {
                a = aeropuertos[i];
            }
        }
        return a;
    }

    public static void mostrarCompanias(Aeropuerto aero) {
        System.out.println("Las companias del aeropuerto " + aero.getNombre() + " son las siguientes: ");
        for (int i = 0; i < aero.getNumCompania(); i++) {
            System.out.println(aero.getCompania(i).getNombre());
        }
    }

    public static void mostrar_vuelos(Compania compania) {
        Vuelo vuelo;
        System.out.println("Los vuelos de la compania " + compania.getNombre() + " son los siguientes: ");
        for (int i = 0; i < compania.getNumVuelo(); i++) {
            vuelo = compania.getVuelo(i);
            System.out.println("Identificador: " + vuelo.getIdentificador());
            System.out.println("Ciudad de origen: " + vuelo.getCiudadOrigen());
            System.out.println("Ciudad de destino: " + vuelo.getCiudadDestino());
            System.out.println("Precio: " + vuelo.getPrecio());
        }
    }

    public static Vuelo[] buscarvuelosOrigenDestino(String origen, String destino, Aeropuerto aeropuertos[]) {
        Vuelo vuelo;
        int contador = 0;
        Vuelo listaDeVuelos[];

        for (int i = 0; i < aeropuertos.length; i++) {//recorremos los aeropuertos
            for (int j = 0; j < aeropuertos[i].getNumCompania(); j++) {//recorremos las companias 
                for (int k = 0; k < aeropuertos[i].getCompania(j).getNumVuelo(); k++) {//recorremos los vuelos 
                    vuelo = aeropuertos[i].getCompania(j).getVuelo(k);
                    if (origen.equals(vuelo.getCiudadOrigen()) && destino.equals(vuelo.getCiudadDestino())) {
                        contador++;
                    }
                }
            }
        }
        listaDeVuelos = new Vuelo[contador];
        int q = 0;
        for (int i = 0; i < aeropuertos.length; i++) {
            for (int j = 0; j < aeropuertos[i].getNumCompania(); j++) {
                for (int k = 0; k < aeropuertos[i].getCompania(j).getNumVuelo(); k++) {
                    vuelo = aeropuertos[i].getCompania(j).getVuelo(k);
                    if (origen.equals(vuelo.getCiudadOrigen()) && destino.equals(vuelo.getCiudadDestino())) {
                        listaDeVuelos[q] = vuelo;
                        q++;
                    }
                }
            }
        }
        return listaDeVuelos;

    }

    public static void vuelosOD(String origen, String destino, Aeropuerto aeropuertos[]) {
        Vuelo vuelos[];
        vuelos = buscarvuelosOrigenDestino(origen, destino, aeropuertos);
        if (vuelos.length == 0) {
            System.out.println("No hay vuelos de ese origen y destino");
            
        }else{
            System.out.println("Vuelos encontrados");
            for (int i = 0; i < vuelos.length; i++) {
                System.out.println("Id vuelo: " + vuelos[i].getIdentificador());
                System.out.println("Ciudad origen: " + vuelos[i].getCiudadOrigen());
                System.out.println("Ciudad detino: " + vuelos[i].getCiudadDestino());
                System.out.println("Precio: " + vuelos[i].getPrecio());
                System.out.println("");
            }
        }
    }
}
