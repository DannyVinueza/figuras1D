package Geometria2D;

public class Heptagono {
    private int lados=7;
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

    public Heptagono(double lado2, double apotema) {
        this.lado2 = lado2;
        this.apotema = apotema;
    }
    public double areaHepta (Heptagono heptagono){
        return ((heptagono.getLados()*heptagono.getLado2()*heptagono.getApotema())/2);
    }

}