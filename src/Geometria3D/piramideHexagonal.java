package Geometria3D;

public class piramideHexagonal {
    private double lado, altura, apotema;

    public piramideHexagonal(double lado, double altura, double apotema) {
        this.lado = lado;
        this.altura = altura;
        this.apotema = apotema;
    }

    public double getLado() {
        return lado;
    }

    public double getAltura() {
        return altura;
    }

    public double getApotema() {
        return apotema;
    }

    //Volumen de la Piramide Hexagonal
    public double volumen(piramideHexagonal piramHexag){
        return ((Math.sqrt(3))/2) * Math.pow(piramHexag.getLado(),2) * piramHexag.getAltura();
    }

    //Perimetro de la base de la Piramide Hexagonal
    public double perimetroBase(piramideHexagonal piramideHexagonal){
        return 6 * piramideHexagonal.getLado();
    }

    //Area de la Base de la Piramide Hexagonal
    public double areaBase(piramideHexagonal piramideHexagonal){
        return (perimetroBase(piramideHexagonal) * piramideHexagonal.getApotema())/2;
    }
}