package Geometria3D;

public class Tetrahedro {
    double arista;

    public Tetrahedro(double arista) {
        this.arista = arista;
    }

    public double getArista() {
        return arista;
    }

    //Area de una de las caras del tetrahedro
    public double areaCara(Tetrahedro tetrahedro){
        return (Math.sqrt(3)/4) * Math.pow(tetrahedro.getArista(),2);
    }

    //Area del tetrahedro
    public double area(Tetrahedro tetrahedro){
        return Math.sqrt(3) * Math.pow(tetrahedro.getArista(),2);
    }

    //Volumen del tetrahedro
    public double volumen(Tetrahedro tetrahedro){
        return (Math.sqrt(2)/12) * Math.pow(tetrahedro.getArista(),3);
    }
}
