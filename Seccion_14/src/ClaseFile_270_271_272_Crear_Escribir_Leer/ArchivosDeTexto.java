package ClaseFile_270_271_272_Crear_Escribir_Leer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArchivosDeTexto {

    File archivo;

    private void crearArcivo() {
        //con ruta relativa
        archivo = new File("prueba.txt");

        try {
            if (archivo.createNewFile()) {
                System.out.println("El archivo se ha creado correctamente");
            }
        } catch (IOException ex) {
            System.out.println("No se pudo crear el archivo");
        }

    }

    //con ruta absoluta
    private void crearArchivoAbs() {
        archivo = new File("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\Seccion_14\\prueba2.txt");
        try {
            if (archivo.createNewFile()) {
                System.out.println("El archivo se ha creado correctamente");
            }
        } catch (IOException ex) {
            //para mostrar la exepcion 
            System.out.println("No se pudo crear el archivo: " + ex);
        }
    }

    private void crearDirectorio() {
        archivo = new File("carpetaPrueba");

        if (archivo.mkdir()) {
            System.out.println("Se ha creado el directorio correctamente");
        } else {
            System.out.println("Error, no se ha podido crear el directorio");
        }
    }

    private void escribirTexto() {
        try {
            FileWriter escribir = new FileWriter(archivo);

            escribir.write("Hola que tal?");
            //esta "\r" es un retorno de "carro". Se regresa a principio y despues salta con "\n"
            escribir.write("\r\nMas texto");
            escribir.close();

        } catch (IOException ex) {
            System.err.println("Error, no se pudo escrbir sobre el archivo");
        }
    }
    //añadir texto

    private void addTexto() {
        try {
            //para poder agregar texto sin que se borre lo anterior es con un true en los parametros
            //del constructor despues del objeto del archivo
            FileWriter escribir = new FileWriter(archivo, true);

            escribir.write("\r\nMucho más texto");
            //esta "\r" es un retorno de "carro". Se regresa a principio y despues salta con "\n"
            escribir.write("\r\nMas ");
            escribir.close();

        } catch (IOException ex) {
            System.err.println("Error, no se pudo escrbir sobre el archivo");
        }
    }

    private void leerTexto() {

        String cadena;

        try {

            FileReader lector = new FileReader(archivo);
            BufferedReader lectura = new BufferedReader(lector);

            cadena = lectura.readLine();
            while (cadena != null){
                System.out.println(cadena);
                cadena = lectura.readLine();
            }
            
        } catch (FileNotFoundException ex) {
            System.err.println("Error, " + ex);
        } catch (IOException ex) {
            System.err.println("Error, " + ex);
        }

    }

    public static void main(String[] args) {

        ArchivosDeTexto archivos = new ArchivosDeTexto();
        archivos.crearArcivo();
        archivos.leerTexto();
        //archivos.escribirTexto();
        //archivos.addTexto();
        //archivos.crearDirectorio();
        //archivos.crearArchivoAbs();
        
        
        
    }

}
