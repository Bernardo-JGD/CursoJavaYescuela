
package seccion_16_mvc_ejemplo;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;


public class Seccion_16_MVC_Ejemplo {

   
    public static void main(String[] args) {
        
        Vista vista = new Vista ();
        Modelo modelo = new Modelo ();
        Controlador controlador = new Controlador (vista, modelo);
        
        controlador.iniciar();
        vista.setVisible(true);
        
    }
    
}
