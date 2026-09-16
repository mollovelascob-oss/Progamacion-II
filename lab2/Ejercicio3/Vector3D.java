package Ejercicio3;

public class Vector3D {
    private double a1;
    private double a2;
    private double a3;

    public Vector3D() {
        this(0.0, 0.0, 0.0);
    }

    public Vector3D(double a1, double a2, double a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public Vector3D(Vector3D v) {
        this(v.a1, v.a2, v.a3);
    }

    public double getA1() {
        return a1;
    }

    public double getA2() {
        return a2;
    }

    public double getA3() {
        return a3;
    }

    public Vector3D sumar(Vector3D b) {
        return new Vector3D(this.a1 + b.a1, this.a2 + b.a2, this.a3 + b.a3);
    }

    public Vector3D multiplicar(double r) {
        return new Vector3D(r * this.a1, r * this.a2, r * this.a3);
    }

    public double longitud() {
        return Math.sqrt(a1 * a1 + a2 * a2 + a3 * a3);
    }

    public Vector3D normal() {
        double len = longitud();
        if (len == 0) {
            throw new ArithmeticException("No se puede normalizar un vector nulo.");
        }
        return new Vector3D(a1 / len, a2 / len, a3 / len);
    }

    public double productoEscalar(Vector3D b) {
        return this.a1 * b.a1 + this.a2 * b.a2 + this.a3 * b.a3;
    }

    public Vector3D productoVectorial(Vector3D b) {
        return new Vector3D(
            this.a2 * b.a3 - this.a3 * b.a2,
            this.a3 * b.a1 - this.a1 * b.a3,
            this.a1 * b.a2 - this.a2 * b.a1
        );
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", a1, a2, a3);
    }
}