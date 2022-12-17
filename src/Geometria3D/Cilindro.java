package Geometria3D;

public class Cilindro {
    private double altura, radio;
    private double NPi = 3.141516;

    public Cilindro(double altura, double radio) {
        this.altura = altura;
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public double getRadio() {
        return radio;
    }

    public double getNPi() {
        return NPi;
    }

    //Volumen del cilindro
    public double volumen(Cilindro cilindro){
        return cilindro.getNPi() * Math.pow( cilindro.getRadio(),2) * cilindro.getAltura();
    }

    //Area de la Base del cilindro
    public double areaBase(Cilindro cilindro){
        return cilindro.getNPi() * Math.pow( cilindro.getRadio(),2);
    }

    //Superficie Lateral del cilindro

    public double supLateral(Cilindro cilindro){
        return 2 * cilindro.getNPi() * cilindro.getRadio() * cilindro.getAltura();
    }
}