
package Ejercicio2;

public class Tablero {
    
    private int x;
    private int y;
    
    public Tablero (int x, int y){
        this.x = x;
        this.y = y;
    }
    public void mover_arriba (int incremento){
        y += incremento; 
    }
    public void mover_abajo (int incremento){
        y -= incremento;
    }
    public void mover_derecha (int incremento){
        x += incremento;
    }
    public void mover_izquierda (int incremento){
        x -= incremento;
    }
    public int getX (){
        return x;
    }
    public int getY (){
        return y;
    }
    
    
}
