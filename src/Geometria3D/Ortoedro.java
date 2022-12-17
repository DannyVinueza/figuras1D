package Geometria3D;
public class Ortoedro {
    private double ladoA, ladoB, ladoC;

    public Ortoedro(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    //Area del Ortoedro
    public double area(Ortoedro ortoedro){
        return 2 * ((ortoedro.getLadoA() * ortoedro.getLadoB()) + (ortoedro.getLadoB() * ortoedro.getLadoC()) + (ortoedro.getLadoC() * getLadoA()));
    }

    //Volumen del Ortoedro
    public double volumen(Ortoedro ortoedro){
        return ortoedro.getLadoA() * ortoedro.getLadoC() *
                ortoedro.getLadoB();
    }

    //Diagonal Interna del Ortoedro
    public double diagonalInterna(Ortoedro ortoedro){
        return Math.sqrt(Math.pow(ortoedro.getLadoA(),2) + Math.pow(ortoedro.getLadoB(),2)
                + Math.pow(ortoedro.getLadoC(),2));
    }

}