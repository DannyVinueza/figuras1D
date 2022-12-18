package Geometria2D;

public class circuloBlanco {
    double  radio;
    double perimetroo;
    private double pi=3.14;

    public double getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getPerimetroo() {
        return perimetroo;
    }

    public void setPerimetroo(double perimetroo) {
        this.perimetroo = perimetroo;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public circuloBlanco (double radio, double perimetroo ) {
        this.radio=radio;
        this.perimetroo = perimetroo;
    }

    public double areaCir (circuloBlanco circuloBlanco){
        return ((circuloBlanco.getPi()*circuloBlanco.getRadio())/2);
    }
    public double periCir (circuloBlanco circuloBlanco){
        return ((2*circuloBlanco.getPi()*circuloBlanco.getRadio()));
    }

}
