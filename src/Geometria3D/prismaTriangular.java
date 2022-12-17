package Geometria3D;

public class prismaTriangular {
    double lado, altura;

    public prismaTriangular(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public double getAltura() {
        return altura;
    }

    //Area de la Base del Prisma Triangular
    public double areaBase(prismaTriangular prismaTriangular) {
        return (Math.sqrt(3)/4) * Math.pow(prismaTriangular.getLado(),2);
    }

    //Volumen del Prisma Triangular
    public  double volumen(prismaTriangular prismaTriangular){
        return prismaTriangular.areaBase(prismaTriangular) * prismaTriangular.getAltura();
    }

    //Area del prisma triangular
    public double area(prismaTriangular prismaTriangular){
        return prismaTriangular.getLado()*((Math.sqrt(3)/2 * prismaTriangular.getLado()) + 3 * prismaTriangular.getAltura());
    }
}