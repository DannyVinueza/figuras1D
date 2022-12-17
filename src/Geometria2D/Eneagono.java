package Geometria2D;

public class Eneagono {
    private int lado=9;
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

    public Eneagono(double lados, double apotema) {
        this.lados = lados;
        this.apotema = apotema;
    }
    public double areaEne (Eneagono eneagono){
        return ((eneagono.getLado()*eneagono.getApotema()*eneagono.getLados())/2);
    }
}