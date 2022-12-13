package Geometria3D;

public class PrismaPentagular {
    private double apotema, lado , altura;

    public PrismaPentagular(double apotema, double lado, double altura) {
        this.apotema = apotema;
        this.lado = lado;
        this.altura = altura;
    }

    public double getApotema() {
        return apotema;
    }

    public double getLado() {
        return lado;
    }

    public double getAltura() {
        return altura;
    }

    //Area del Prisma
    public double area(PrismaPentagular prismaPentagular){
        return 5 * prismaPentagular.getLado() * (prismaPentagular.getApotema() + prismaPentagular.getAltura());
    }

    //Area de la Base del Prisma Pentagular
    public double areaBase(PrismaPentagular prismaPentagular) {
        return (5 * prismaPentagular.getLado() * prismaPentagular.getApotema())/2;
    }

    //Volumen del Prisma Pentangular
    public double volumen(PrismaPentagular prismaPentagular){
        return prismaPentagular.areaBase(prismaPentagular) * prismaPentagular.getAltura();
    }
}

