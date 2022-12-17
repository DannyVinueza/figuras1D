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

    //Perimetro de la Base
    public double perimetroBase(Piramide piramide){
        return (piramide.getLadoBase() * 4) / 2;
    }

    //Volumen de la Base
    public double volumenPiramide(Piramide piramide){
        return (Math.pow(piramide.getLadoBase(),2) * piramide.getAltura())/3;
    }
}