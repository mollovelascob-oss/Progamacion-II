package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        AlgebraVectorial a = new AlgebraVectorial(3.0, 0.0, 0.0);
        AlgebraVectorial b = new AlgebraVectorial(0.0, 4.0, 0.0);
        AlgebraVectorial c = new AlgebraVectorial(6.0, 0.0, 0.0);

        System.out.println("Vector a: " + a);
        System.out.println("Vector b: " + b);
        System.out.println("Vector c: " + c);

        System.out.println("a) " + a.perpendicular(b));
        System.out.println("b) " + AlgebraVectorial.perpendicular(a, b));
        System.out.println("c) " + a.perpendicular(b, 1e-9));
        System.out.println("d) " + a.perpendicular(b, true));

        System.out.println("e) " + c.paralela(a, 2.0));
        System.out.println("f) " + a.paralela(c));

        System.out.println("g) " + a.proyeccion_de_a_sobre_b(b));
        System.out.println("h) " + a.componente_de_a_en_b(b));
    }
}