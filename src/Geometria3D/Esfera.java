package Geometria3D;

public class Esfera {
    private double radio;
    private double NPi = 3.141516;

    public Esfera(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double getNPi() {
        return NPi;
    }

    //Volumen de la esfera
    public double volumen(Esfera esfera){
        return (4/3) * esfera.getNPi() * Math.pow(esfera.getRadio(),3);
    }

    //Area Total de la esfera
    public double areaTotal(Esfera esfera){
        return 4 * esfera.getNPi() * Math.pow(esfera.getRadio(), 2);
    }

    //Circunferencia de la esfera
    public double circunferencia(Esfera esfera){
        return 2 * esfera.getNPi() * esfera.getRadio();
    }
}
