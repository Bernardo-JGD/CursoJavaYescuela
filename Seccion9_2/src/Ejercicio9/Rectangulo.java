package Ejercicio9;

public class Rectangulo extends Poligono {

    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    @Override
    public String mostrarDatos() {
        //El "super.mostrarDatos()" sirve para mandar a llamar el metodo de la superclase y todo lo que hace este.
        //En este caso como estoy sobreescribiendo un metodo de la clase padre, y ambos tienen datos diferentes, muestro
        //en este mismo metodo los datos de esta clase y con esa funcion muestro tambiento los datos de la clase padre
        return "Rectangulo\n" + super.mostrarDatos() + "\nEl lado 1 es: " + lado1
                + "\nEl lado 2 es: " + lado2;
    }

    @Override
    public double area() {
        return lado1 * lado2;
    }

}
