package Geometria2D;

public class Decagono {
    double apotema;
    double perimetro;
    private int lados=10;

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public int getLados() {
        return lados;
    }

    public Decagono(double apotema, double perimetro) {
        this.apotema = apotema;
        this.perimetro = perimetro;
    }
    public double areaDeca (Decagono decagono){
        return ((decagono.getPerimetro()*decagono.getApotema())/2);
    }
}
