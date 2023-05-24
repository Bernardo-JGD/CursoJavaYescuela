package Ejercicio2_1;

public class Tablero {

    private int x;
    private int y;

    public Tablero(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void arriba(int incremento_posicion) {
        y = y + incremento_posicion;    
    }
    public void abajo (int incremento_posicion){
        y = y - incremento_posicion;
    }
    public void derecha (int incremento_posicion){
        x = x + incremento_posicion;
    }
    public void izquierda (int incremento_posicion){
        x = x - incremento_posicion;
    }
    
    public int getX (){
        return x;
    }
    public int getY (){
        return y;
    }

}
