package Geometria2D;

public class Endecagono {
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

    public Endecagono(double lados, double apotema) {
        this.lados = lados;
        this.apotema = apotema;
    }
    public double areaEnde(Endecagono endecagono){
        return ((endecagono.getLado()*endecagono.getLados()*endecagono.getApotema())/2);
    }
}


