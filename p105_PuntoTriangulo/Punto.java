package p105_PuntoTriangulo;

public class Punto {
    private int x;
    private int y;
   
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public double getDistancia(Punto punto) {
        return Math.sqrt(Math.pow(punto.getX() - this.x, 2) + Math.pow(punto.getY() - this.y, 2));
    }


    @Override
    public String toString() {
        return "Punto [x=" + x + ", y=" + y + "]";
    }

    
}
