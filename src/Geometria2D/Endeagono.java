package Geometria2D;

public class Endeagono {
    private int lado=11;
    double lados;
    double apotema;

    public double getLados() {
        return lados;
    }

    public void setLados(double lados) {
        this.lados = lados;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public int getLado() {
        return lado;
    }

    public Endeagono(double lados, double apotema) {
        this.lados = lados;
        this.apotema = apotema;
    }
    public double areaEnde(Endeagono endecagono){
        return ((endecagono.getLado()*endecagono.getLados()*endecagono.getApotema())/2);
    }
}
