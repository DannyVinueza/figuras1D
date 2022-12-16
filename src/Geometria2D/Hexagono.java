package Geometria2D;

public class Hexagono {
    private int lados=6;
    double lado2;
    double apotema;

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public int getLados() {
        return lados;
    }

    public Hexagono(double lado2, double apotema) {
        this.lado2 = lado2;
        this.apotema = apotema;
    }
    public double areaHexa(Hexagono hexagono){
        return ((hexagono.getLados()*hexagono.getLado2()*hexagono.getApotema())/2)
    }
}
