package Ejercicio1;

public class Cuadrilatero {

    private float lado1;
    private float lado2;
    private float lado3;
    private float lado4;

    public Cuadrilatero(float lado1) {
        this.lado1 = lado1;
    }

    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Cuadrilatero(float lado1, float lado2, float lado3, float lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    public float area(int opcion) {
        float area = 0;
        switch (opcion) {

            case 1:
                area = lado1 * lado1;
                return area;

            case 2:
                area = lado1 * lado2;
                return area;

            default:
                System.out.println("No existe es aopcion");
                break;

        }
        return area;

    }

    public float perimetro(int opcion) {
        float perimetro = 0;

        switch (opcion) {

            case 1:

                perimetro = lado1 * 4;
                return perimetro;

            case 2:

                perimetro = 2 * (lado1 + lado2);
                return perimetro;

            case 3:

                perimetro = lado1 + lado2 + lado3 + lado4;
                return perimetro;

            default:
                System.out.println("No existe esa opcion");

        }

        return perimetro;
    }

}
