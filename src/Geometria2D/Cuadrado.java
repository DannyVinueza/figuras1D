package Geometria2D;

public class Cuadrado {
    double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    public double areaCua (Cuadrado cuadrado){
        return ((cuadrado.getLado())*2);
    }
}