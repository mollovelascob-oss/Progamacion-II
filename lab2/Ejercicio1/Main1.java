public class Main1 {
    public static void main(String[] args) {
        MiPunto p1 = new MiPunto();
        MiPunto p2 = new MiPunto(10.0, 30.5);

        double dist = p1.distancia(p2);
        System.out.printf("La distancia entre (%.1f, %.1f) y (%.1f, %.1f) es: %.4f%n",
                p1.getX(), p1.getY(), p2.getX(), p2.getY(), dist);
    }
}