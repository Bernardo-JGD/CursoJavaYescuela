
package ClaseFile_269;

import java.io.File;
public class ClaseFile {
    
    public static void main(String[] args) {
        //ruta absoluta 
        File archivo = new File ("C:\\Users\\TOSHIBA\\Documents\\NetBeansProjects\\Seccion_14\\pruebaA.txt");
        
        if (archivo.exists()) {//si el archivo existe
            System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
            System.out.println("El archivo si existe");
            System.out.println("¿Es un archivo?: " + archivo.isFile());
            System.out.println("¿Se puede leer?: " + archivo.canRead());
            
        }else{
            System.out.println("El archivo no existe");
        }
        
        //ruta Relativa
        archivo = new File("pruebaR.txt");
        
        if (archivo.exists()) {//si el archivo existe
            System.out.println("Ruta relativa");
            System.out.println("El archivo si esxiste");
        }else{
            System.out.println("El archivo no existe");
        }
        File directorio = new File ("carpetaPrueba");
        if (archivo.exists()) {//si el archivo existe
            System.out.println("Ruta absoluta: " + directorio.getAbsolutePath());
            System.out.println("El archivo si existe");
            System.out.println("¿Es un archivo?: " + directorio.isFile());
            System.out.println("¿Es un directorio?: " + directorio.isDirectory());
            System.out.println("¿Se puede leer?: " + directorio.canRead());
            
        }else{
            System.out.println("El archivo no existe");
        }
    }
    
}
