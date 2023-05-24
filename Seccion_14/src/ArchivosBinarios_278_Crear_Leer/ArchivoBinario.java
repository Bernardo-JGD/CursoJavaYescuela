package ArchivosBinarios_278_Crear_Leer;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArchivoBinario {

    private void escrirbirBinario() {
        try {

            FileOutputStream archivo = new FileOutputStream("personas.bin");

            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            
            Persona persona1 = new Persona ("Rojo", 120);
            Persona persona2 = new Persona ("Azul", 130);
            Persona persona3 = new Persona ("Verde", 140);
            
            //Escribimos objetos sobre el archivo binario
            escritura.writeObject(persona1);
            escritura.writeObject(persona2);
            escritura.writeObject(persona3);
            
            escritura.close();//cerramos el archivo binario
            
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex);
        } catch (IOException ex) {
            System.err.println("Error: " + ex);
        }
    }
    
    private void addBinario() {
        try {

            FileOutputStream archivo = new FileOutputStream("personas.bin", true);

            AddContenido escritura = new AddContenido(archivo);
            
            Persona persona1 = new Persona ("Rosa", 120);
            Persona persona2 = new Persona ("Naranja", 130);
            Persona persona3 = new Persona ("Morado", 140);
            
            //Escribimos objetos sobre el archivo binario
            escritura.writeObject(persona1);
            escritura.writeObject(persona2);
            escritura.writeObject(persona3);
            
            escritura.close();//cerramos el archivo binario
            
        } catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex);
        } catch (IOException ex) {
            System.err.println("Error: " + ex);
        }
    }
    
    private void leerBinario (){
        
        Persona objetoPersona;
        
        try {
            
            FileInputStream archivo = new FileInputStream ("personas.bin");
            ObjectInputStream lectura = new ObjectInputStream (archivo);
            
            while(true){
                objetoPersona = (Persona) lectura.readObject();
                objetoPersona.mostrarDatos();
            }
            
        }catch (EOFException ex){
            return;//Finalizo de leer todo el archivo binario
        }catch (FileNotFoundException ex) {
            System.err.println("Error: " + ex);
        } catch (IOException ex) {
            System.err.println("Error: " + ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("Error: " + ex);
        }
        
    }

    public static void main(String[] args) {

        ArchivoBinario ab = new ArchivoBinario ();
        //ab.escrirbirBinario();
        ab.addBinario();
        ab.leerBinario();
        
    }

}
