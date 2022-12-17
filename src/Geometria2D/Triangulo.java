package Geometria2D;

public class Triangulo {
    private int lados=3;
    double base;
    double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getLados() {
        return lados;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double areaTri (Triangulo triangulo){
        return ((triangulo.getBase()*triangulo.getAltura())/2);
    }
}