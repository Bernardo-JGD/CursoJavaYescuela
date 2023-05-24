
package ClasesYObjetos8_113;

//------------------------------Encapsulamiento y metodos accesores (setters y getters) 

/*
--------------------------------El encapsulamiento se encarga de ocultar nuestros atributos o nuestros metodos 
--------------------------------para que solamente puedan ser accedidos desde la misma clase. 
--------------------------------Esto lo que tiene de bueno es que previene errores cuando se crean programas muy extensos
--------------------------------
--------------------------------
--------------------------------

*/

public class Clase1 {
    
    private int edad;
    private String nombre;
    
    //para que un atributo de acceso private pueda ser usado vamos a utilizar los setters y getters
    //los setters sirven para recibir y los getters para mostrar
    //set es establecer 
    //tipo_de_acceso tipo_de_retorno_void setNombre_con_inicio_en_mayusculas (parametro del tipo del atributo y el mismo nombre)
    
    public void setEdad (int edad){
        //estoy estableciendo la edad que me manda el usuario 
         this.edad = edad;
    }
    //tipo_de_acceso tipo_de_dato getNombre_con_inicio_en_mayusculas (sin parametros){return nombre_del_atributo
    public int getEdad (){
        return edad; 
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    
}
