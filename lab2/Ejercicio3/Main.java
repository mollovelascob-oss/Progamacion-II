package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Vector3D a = new Vector3D(1.0, 2.0, 3.0);
        Vector3D b = new Vector3D(4.0, 5.0, 6.0);

        System.out.println("Vector a: " + a);
        System.out.println("Vector b: " + b);

        System.out.println("a) Suma: " + a.sumar(b));
        System.out.println("b) Escalar: " + a.multiplicar(2.0));
        System.out.println("c) Longitud: " + a.longitud());
        System.out.println("d) Normal: " + a.normal());
        System.out.println("e) Producto escalar: " + a.productoEscalar(b));
        System.out.println("f) Producto vectorial: " + a.productoVectorial(b));
    }
}