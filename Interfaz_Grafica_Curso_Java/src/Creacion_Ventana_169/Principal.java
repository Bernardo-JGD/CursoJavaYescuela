
package Creacion_Ventana_169;

public class Principal {
    
    public static void main(String[] args) {
        
        //creo un objeto del tipo de mi clase ventana 
        Ventana ven = new Ventana ();
        //con el objeto mando a llamar este metodo que sirve para poder
        //hacer visible la ventana recibiendo un parametro de tipo boolean
        //true= se ve 
        //false = no se ve 
        ven.setVisible(true);
    }
    
}
