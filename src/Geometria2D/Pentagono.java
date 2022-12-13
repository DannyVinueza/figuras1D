package Geometria2D;

public class Pentagono {
    double apotema;
    double perimetro;
    int nLados;

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

    public int getnLados() {
        return nLados;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }

    public Pentagono(double apotema, double perimetro) {
        this.apotema = apotema;
        this.perimetro = perimetro;
    }

    public Pentagono(int nLados) {
        this.nLados = nLados;
    }

    public double areaPent(Pentagono pentagono){
        return ((pentagono.getPerimetro()*pentagono.getApotema())/2);
    }

}
