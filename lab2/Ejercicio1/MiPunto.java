public class MiPunto {
    private double x;
    private double y;
    public MiPunto() {
        this(0.0, 0.0);
    }
    public MiPunto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() { 
        return x; 
    }
    public double getY() { 
        return y; 
    }
    public double distancia(MiPunto p) {
        return distancia(p.getX(), p.getY());
    }
    public double distancia(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}