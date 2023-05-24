
package AFD;


public class Automata {
    
    private String estado_nombre;
    private String inicial_o_final;
    private String transiciones[];
    
    public Automata (String estado_nombre, String inicial_o_final, String transiciones[]){
        
        this.estado_nombre = estado_nombre;
        this.inicial_o_final = inicial_o_final;
        this.transiciones = transiciones;
        
    }

    public String getEstado_nombre() {
        return estado_nombre;
    }

    public void setEstado_nombre(String estado_nombre) {
        this.estado_nombre = estado_nombre;
    }

    public String getInicial_o_final() {
        return inicial_o_final;
    }

    public void setInicial_o_final(String inicial_o_final) {
        this.inicial_o_final = inicial_o_final;
    }

    public String[] getTransiciones() {
        return transiciones;
    }

    public void setTransiciones(String[] transiciones) {
        this.transiciones = transiciones;
    }
    
    public void mostrarTransiciones (){
        for (int i = 0; i < transiciones.length; i++) {
            String t = transiciones[i];
            
        }
    }
   
    
    
    
}
