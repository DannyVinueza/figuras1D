package Geometria3D;

public class Cubo {
    private double diagonal, lado;

    public Cubo(double diagonal, double lado) {
        this.diagonal = diagonal;
        this.lado = lado;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public double getLado() {
        return lado;
    }

    //Volumen del Cubo
    public double volumen(Cubo cubo){
        return Math.pow(cubo.getLado() ,3 );
    }

    //Diagonal de la base
    public double diagonalBase(Cubo cubo){
        return cubo.getLado() * Math.sqrt(2);
    }

    //Area de la Base

    public double areaBase(Cubo cubo){
        return Math.pow(cubo.getLado() ,2 );
    }
}