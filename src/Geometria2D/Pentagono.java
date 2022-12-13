package Geometria2D;

public class Pentagono {
    double apotema;
    double perimetro;
    double lonLado;

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getLonLado() {
        return lonLado;
    }

    public void setLonLado(double lonLado) {
        this.lonLado = lonLado;
    }

    public Pentagono(double lonLado) {
        this.lonLado = lonLado;
    }
    public Pentagono() {
    }
    public double areaPent(double pentagono, double perimetro){
        return (((perimetro)*pentagono)/2);
    }

    public double periPent(Pentagono pentagono){
        return ((pentagono.getLonLado() * 5 ));
    }
}
