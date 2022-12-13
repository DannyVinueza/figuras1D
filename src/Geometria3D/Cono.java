package Geometria3D;

public class Cono {
    private double radio, altura , apotema;
    private double Npi = 3.141516;

    public Cono(double radio, double altura, double apotema) {
        this.radio = radio;
        this.altura = altura;
        this.apotema = apotema;
    }

    public double getRadio() {
        return radio;
    }

    public double getAltura() {
        return altura;
    }

    public double getApotema() {
        return apotema;
    }

    public double getNpi() {
        return Npi;
    }

    //Volumen del cono
    public double volumen(Cono cono){
        return (cono.getNpi() * Math.pow(cono.getRadio(),2) * getAltura()) / 3;
    }

    //Superficie Lateral del cono
    public double supLateral(Cono cono){
        return cono.getNpi() * cono.getApotema() * cono.getRadio();
    }

    //Area de la base
    public double areaBase(Cono cono){
        return cono.getNpi() * Math.pow(cono.getRadio(),2);
    }
}
