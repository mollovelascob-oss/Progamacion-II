package Ejercicio2;

public class AlgebraVectorial {
    private double x;
    private double y;
    private double z;

    public AlgebraVectorial() {
        this(0.0, 0.0, 0.0);
    }

    public AlgebraVectorial(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public AlgebraVectorial(AlgebraVectorial v) {
        this(v.x, v.y, v.z);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double magnitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public AlgebraVectorial sumar(AlgebraVectorial b) {
        return new AlgebraVectorial(this.x + b.x, this.y + b.y, this.z + b.z);
    }

    public AlgebraVectorial restar(AlgebraVectorial b) {
        return new AlgebraVectorial(this.x - b.x, this.y - b.y, this.z - b.z);
    }

    public AlgebraVectorial multiplicar(double r) {
        return new AlgebraVectorial(this.x * r, this.y * r, this.z * r);
    }

    public double productoEscalar(AlgebraVectorial b) {
        return this.x * b.x + this.y * b.y + this.z * b.z;
    }

    public AlgebraVectorial productoVectorial(AlgebraVectorial b) {
        return new AlgebraVectorial(
            this.y * b.z - this.z * b.y,
            this.z * b.x - this.x * b.z,
            this.x * b.y - this.y * b.x
        );
    }

    public boolean perpendicular(AlgebraVectorial b) {
        return Math.abs(this.sumar(b).magnitud() - this.restar(b).magnitud()) < 1e-9;
    }

    public static boolean perpendicular(AlgebraVectorial a, AlgebraVectorial b) {
        return Math.abs(a.restar(b).magnitud() - b.restar(a).magnitud()) < 1e-9;
    }

    public boolean perpendicular(AlgebraVectorial b, double epsilon) {
        return Math.abs(this.productoEscalar(b)) < epsilon;
    }

    public boolean perpendicular(AlgebraVectorial b, boolean usarPitagoras) {
        if (!usarPitagoras) {
            return perpendicular(b);
        }
        double lhs = Math.pow(this.sumar(b).magnitud(), 2);
        double rhs = Math.pow(this.magnitud(), 2) + Math.pow(b.magnitud(), 2);
        return Math.abs(lhs - rhs) < 1e-9;
    }

    public boolean paralela(AlgebraVectorial b, double r) {
        AlgebraVectorial rb = b.multiplicar(r);
        return Math.abs(this.x - rb.x) < 1e-9 &&
               Math.abs(this.y - rb.y) < 1e-9 &&
               Math.abs(this.z - rb.z) < 1e-9;
    }

    public boolean paralela(AlgebraVectorial b) {
        return Math.abs(this.productoVectorial(b).magnitud()) < 1e-9;
    }

    public AlgebraVectorial proyeccion_de_a_sobre_b(AlgebraVectorial b) {
        double magB2 = Math.pow(b.magnitud(), 2);
        if (magB2 == 0) {
            throw new ArithmeticException("El vector B no puede ser nulo.");
        }
        return b.multiplicar(this.productoEscalar(b) / magB2);
    }

    public double componente_de_a_en_b(AlgebraVectorial b) {
        double magB = b.magnitud();
        if (magB == 0) {
            throw new ArithmeticException("El vector B no puede ser nulo.");
        }
        return this.productoEscalar(b) / magB;
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }
}