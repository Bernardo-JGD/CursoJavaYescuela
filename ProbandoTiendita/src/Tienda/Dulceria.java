package Tienda;

public class Dulceria {

    String NombreDulce;
    int CantidadDulce=0;
    double Precio=0;
    double Ganancia=0;
    
    
    public Dulceria (){
        NombreDulce = null;
        CantidadDulce = 0;
        Precio = 0;
        Ganancia = 0;
    }

    public Dulceria(String NombreDulce, int CantidadDulce, double Precio, double Ganancia) {
        setNombreDulce (NombreDulce);
        setCantidadDulce (CantidadDulce);
        setPrecio (Precio);
        setGanancia (Ganancia);
        
    }

    
    
    

    public String getNombreDulce() {
        return NombreDulce;
    }

    public void setNombreDulce(String NombreDulce) {
        this.NombreDulce = NombreDulce;
    }

    public int getCantidaDulce() {
        return CantidadDulce;
    }

    public void setCantidadDulce(int CantidadDulce) {
        this.CantidadDulce = CantidadDulce;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public double getGanancia() {
        return Ganancia;
    }

    public void setGanancia(double Ganancia) {
        this.Ganancia = Ganancia;
    }
    
    

}
