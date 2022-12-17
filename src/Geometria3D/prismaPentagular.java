package Geometria3D;

public class prismaPentagular {
    private double apotema, lado , altura;

    public prismaPentagular(double apotema, double lado, double altura) {
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
    public double area(prismaPentagular prismaPentagular){
        return 5 * prismaPentagular.getLado() * (prismaPentagular.getApotema() + prismaPentagular.getAltura());
    }

    //Area de la Base del Prisma Pentagular
    public double areaBase(prismaPentagular prismaPentagular) {
        return (5 * prismaPentagular.getLado() * prismaPentagular.getApotema())/2;
    }

    //Volumen del Prisma Pentangular
    public double volumen(prismaPentagular prismaPentagular){
        return prismaPentagular.areaBase(prismaPentagular) * prismaPentagular.getAltura();
    }
}