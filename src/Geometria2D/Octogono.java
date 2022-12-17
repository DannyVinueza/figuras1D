package Geometria2D;

public class Octogono {
    private int lados=8;
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

    public Octogono(double lado2, double apotema) {
        this.lado2 = lado2;
        this.apotema = apotema;
    }
    public double areaOcto (Octogono octogono){
        return((octogono.getLados()*octogono.getLado2()*octogono.getApotema())/2);
    }
}