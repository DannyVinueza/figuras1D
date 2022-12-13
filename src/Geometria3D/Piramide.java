package Geometria3D;

public class Piramide {
    private double ladoBase, altura;

    public Piramide(double ladoBase, double altura) {
        this.ladoBase = ladoBase;
        this.altura = altura;
    }

    public double getLadoBase() {
        return ladoBase;
    }

    public double getAltura() {
        return altura;
    }

    //Area de la Base
    public double areaBase(Piramide piramide){
        return Math.pow(piramide.getLadoBase() ,2);
    }

    //Perimetro de la
}
