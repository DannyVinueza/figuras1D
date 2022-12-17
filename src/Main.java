import Geometria2D.*;
import Geometria3D.*;

import java.text.DecimalFormat;
import java.util.Scanner;

//Si se usa el * se importan todas las clases tambien es lo mismo
//Escribir import Geometria2D
public class Main {
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat dc = new DecimalFormat("##.00");//Redondeo a los numeros de resultado por 2 decimales
    static final String RESET = "\u001B[0m";//Elimina el color anterior
    static final String AZUL = "\u001B[34m";//Color azul a las letras
    static final String ROJO = "\u001B[31m";//Color rojo a las letras
    static final String VERDE = "\u001B[32m";//Color verde a las letras
    public static void main(String[] args) {



        boolean pausa = false; //Variable para para la repeticion del ciclo while

        try{
            while (!pausa){
                int opcion = menuPrincipal();
                switch(opcion){
                    case 1:{
                        boolean pausaA = false;//Variable de finalizacion del ciclo while
                        System.out.println("\n\n\t\t*** FIGURAS 2D ***");
                        while(!pausaA){
                            int opcionF2D = menuFiguras();
                            switch(opcionF2D){
                                case 1:{
                                    System.out.println("1. Cuadrado");
                                }break;
                                case 2:{
                                    System.out.println("2. Circulo");
                                }break;
                                case 3:{
                                    System.out.println("3. Decagono");
                                }break;
                                case 4:{
                                    System.out.println("4. Endeagono");
                                }break;
                                case 5:{
                                    System.out.println("5. Eneagono");
                                }break;
                                case 6:{
                                    System.out.println("6. Heptagono");
                                }break;
                                case 7:{
                                    System.out.println("7. Hexagono");
                                }break;
                                case 8:{
                                    System.out.println("8. Octogono");
                                }break;
                                case 9:{
                                    }break;
                                case 10:{
                                    System.out.println("10. Triangulo");
                                }break;
                                case 11:{
                                    System.out.println(VERDE + "Volviendo al menu principal...." + RESET);
                                    pausaA = true;
                                }break;
                            }

                        }
                    }break;
                    case 2:{
                        boolean pausaP = false;//Variable de finalizacion del ciclo while
                        System.out.println("\n\t\t\t*** FIGURA 3D ***");
                        while(!pausaP){
                            int opcionF3D = menuFiguras_volumenes();
                            switch(opcionF3D){
                                case 1:{
                                    double alturaCil, radioCil;
                                    System.out.println("1. Cilindro");
                                    System.out.print("Ingrese el valor de la altura: ");
                                    alturaCil = sc.nextDouble();
                                    System.out.print("Ingrese el valor del radio: ");
                                    radioCil = sc.nextDouble();
                                    Cilindro cilindro = new Cilindro(alturaCil,radioCil);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Volumen: " + cilindro.volumen(cilindro));
                                    System.out.println("Area de la Base: " + cilindro.areaBase(cilindro));
                                    System.out.println("Superficie Lateral: " + cilindro.supLateral(cilindro));
                                }break;
                                case 2:{
                                    System.out.println("2. Cono");
                                    double radioCono, alturaCono, apotemaCono;
                                    System.out.print("Radio: ");
                                    radioCono = sc.nextDouble();
                                    System.out.print("Altura: ");
                                    alturaCono = sc.nextDouble();
                                    System.out.print("Apotema: ");
                                    apotemaCono = sc.nextDouble();

                                    Cono cono = new Cono(radioCono, alturaCono, apotemaCono);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Volumen: " + cono.supLateral(cono));
                                    System.out.println("Superficie Lateral" + cono.volumen(cono));
                                    System.out.println("Area de la Base" + cono.areaBase(cono));
                                }break;
                                case 3:{
                                    System.out.println("3. Cubo");
                                    double diagonalCubo, ladoCubo;

                                    System.out.println("Diagonal: ");
                                    diagonalCubo = sc.nextDouble();
                                    System.out.println("Lado: ");
                                    ladoCubo = sc.nextDouble();

                                    Cubo cubo = new Cubo(diagonalCubo, ladoCubo);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Volumen: " + cubo.volumen(cubo));
                                    System.out.println("Area de la Base: " + cubo.areaBase(cubo));
                                    System.out.println("Diagonal Base" + cubo.diagonalBase(cubo));
                                }break;
                                case 4:{
                                    System.out.println("4. Esfera");
                                    double radioEsfera;

                                    System.out.println("Radio: ");
                                    radioEsfera = sc.nextDouble();

                                    Esfera esfera = new Esfera(radioEsfera);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Volumen: " + esfera.volumen(esfera));
                                    System.out.println("Area Total: " + esfera.areaTotal(esfera));
                                    System.out.println("Circunferencia" + esfera.circunferencia(esfera));
                                }break;
                                case 5:{
                                    System.out.println("5. Ortoedro");
                                    double ortoA, ortoB, ortoC;

                                    System.out.println("Lado A: ");
                                    ortoA = sc.nextDouble();
                                    System.out.println("Lado B: ");
                                    ortoB = sc.nextDouble();
                                    System.out.println("Lado C: ");
                                    ortoC = sc.nextDouble();

                                    Ortoedro ortoedro = new Ortoedro(ortoA,ortoB,ortoC);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Volumen: " + ortoedro.volumen(ortoedro));
                                    System.out.println("Area: " + ortoedro.area(ortoedro));
                                    System.out.println("Diagonal Interna: " + ortoedro.diagonalInterna(ortoedro));
                                }break;
                                case 6:{
                                    System.out.println("6. Piramide");
                                    double basePiramide, alturaPiramide;

                                    System.out.println("Lado Base: ");
                                    basePiramide = sc.nextDouble();
                                    System.out.println("Altura: ");
                                    alturaPiramide = sc.nextDouble();

                                    Piramide piramide = new Piramide(basePiramide, alturaPiramide);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Area de la Base: " + piramide.areaBase(piramide));
                                    System.out.println("Perimetro de la Base: " + piramide.perimetroBase(piramide));
                                    System.out.println("Volumen: " + piramide.volumenPiramide(piramide));

                                }break;
                                case 7:{
                                    System.out.println("7. Piramide Hexagonal");
                                    double ladoPiramHexa, alturaPiramHexa, apotemaPiramHexa;

                                    System.out.println("Lado: ");
                                    ladoPiramHexa = sc.nextDouble();
                                    System.out.println("Altura: ");
                                    alturaPiramHexa = sc.nextDouble();
                                    System.out.println("Apotema: ");
                                    apotemaPiramHexa = sc.nextDouble();

                                    PiramideHexagonal piramideHexagonal = new PiramideHexagonal(ladoPiramHexa, alturaPiramHexa, apotemaPiramHexa);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Volumen: " + piramideHexagonal.volumen(piramideHexagonal));
                                    System.out.println("Perimetro de la Base: " + piramideHexagonal.perimetroBase(piramideHexagonal));
                                    System.out.println("Area de la base: " + piramideHexagonal.areaBase(piramideHexagonal));

                                }break;
                                case 8:{
                                    System.out.println("8. Prisma Pentagular");
                                    double apotemaPP, ladoPP, alturaPP;

                                    System.out.println("Apotema: ");
                                    apotemaPP = sc.nextDouble();
                                    System.out.println("Lado: ");
                                    ladoPP = sc.nextDouble();
                                    System.out.println("Altura: ");
                                    alturaPP = sc.nextDouble();

                                    PrismaPentagular prismaPentagular = new PrismaPentagular(apotemaPP, ladoPP, alturaPP);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Volumen: " + prismaPentagular.volumen(prismaPentagular));
                                    System.out.println("Area: " + prismaPentagular.area(prismaPentagular));
                                    System.out.println("Area de la base: " + prismaPentagular.areaBase(prismaPentagular));

                                }break;
                                case 9:{
                                    System.out.println("9. Prisma Triangular");
                                    double ladoPT, altuaPT;

                                    System.out.println("Lado: ");
                                    ladoPT = sc.nextDouble();
                                    System.out.println("Altura: ");
                                    altuaPT = sc.nextDouble();

                                    PrismaTriangular prismaTriangular = new PrismaTriangular(ladoPT, altuaPT);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Volumen: " + prismaTriangular.volumen(prismaTriangular));
                                    System.out.println("Area: " + prismaTriangular.area(prismaTriangular));
                                    System.out.println("Area de la base: " + prismaTriangular.areaBase(prismaTriangular));

                                }break;
                                case 10:{
                                    System.out.println("10. Tetrahedro");
                                    double aristaTetra;

                                    System.out.println("Arista: ");
                                    aristaTetra = sc.nextDouble();

                                    Tetrahedro tetrahedro = new Tetrahedro(aristaTetra);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Volumen: " + tetrahedro.volumen(tetrahedro));
                                    System.out.println("Area: " + tetrahedro.area(tetrahedro));
                                    System.out.println("Area de la Cara: " + tetrahedro.areaCara(tetrahedro));

                                }break;
                                case 11:{
                                    System.out.println(VERDE + "Saliendo...." + RESET);
                                    pausaP = true;
                                }break;
                            }
                        }
                    }break;
                    case 3:{
                        System.out.println(VERDE + "Saliendo...." + RESET);
                        pausa = true;
                    }break;

                }
            }
        } catch (Exception ex) {
            System.out.println(ROJO + "\n\tTipo de dato ingresado incorrectamente!!!" + ex.getLocalizedMessage() + RESET);
        } finally {
            System.out.println(VERDE + "Programa Finalizado..." + RESET);
        }

    }
    public static int menuPrincipal(){
        int opPrincipal = 0;//Variable para el menu
        System.out.println("\t\t\t\t*** MENU ***");
        System.out.println("1. Areas y Perimetros");
        System.out.println("2. Volumenes");
        System.out.println("3. Salir");
        System.out.print("Opcion?: ");
        opPrincipal = sc.nextInt();
        while((opPrincipal < 1) || (opPrincipal > 3)){
            System.out.print("Ingrese una opcion entre 1-3: ");
            opPrincipal = sc.nextInt();
        }
        return opPrincipal;
    }

    public static int menuFiguras(){//Menu de figuras disponible para el calculo de areas y perimetros
        int opFiugras = 0;//Variable para el menu
        System.out.println("\t\t\t\t*** FIGURAS 2D ***");
        System.out.println("1. Cuadrado");
        System.out.println("2. Circulo");
        System.out.println("3. Decagono");
        System.out.println("4. Endeagono");
        System.out.println("5. Eneagono");
        System.out.println("6. Heptagono");
        System.out.println("7. Hexagono");
        System.out.println("8. Octogono");
        System.out.println("9. Pentagono");
        System.out.println("10. Triangulo");
        System.out.println("11. Salir");
        System.out.print("Opcion?: ");
        opFiugras = sc.nextInt();
        while((opFiugras < 1) || (opFiugras > 11)){
            System.out.print("Ingrese una opcion entre 1-11: ");
            opFiugras = sc.nextInt();
        }
        return opFiugras;
    }

    public static int menuFiguras_volumenes(){//Menu de figuras disponibles para calcular el volumen
        int opPerimetros = 0;
        System.out.println("\t\t\t\t*** FIGURAS 3D ***");
        System.out.println("1. Cilindro");
        System.out.println("2. Cono");
        System.out.println("3. Cubo");
        System.out.println("4. Esfera");
        System.out.println("5. Ortoedro");
        System.out.println("6. Piramide");
        System.out.println("7. Piramide Hexagonal");
        System.out.println("8. Prisma Pentagular");
        System.out.println("9. Prisma Triangular");
        System.out.println("10. Tetrahedro");
        System.out.println("11. Salir");
        System.out.print("Opcion?: ");
        opPerimetros = sc.nextInt();
        while((opPerimetros < 1) || (opPerimetros > 11)){
            System.out.print("Ingrese una opcion entre 1-11: ");
            opPerimetros = sc.nextInt();
        }
        return opPerimetros;
    }
    /*static Scanner sc = new Scanner(System.in);
    static DecimalFormat dc = new DecimalFormat("##.00");
    public static void main(String[] args) {
        double apo, perimetro;
        System.out.println("Ingrese el apotema: ");
        apo = sc.nextDouble();
        System.out.println("Ingrese el perimetro: ");
        perimetro = sc.nextInt();
        Pentagono pentagono = new Pentagono(apo, perimetro);
        System.out.println("El area del pentagono es: " + dc.format(pentagono.areaPent(pentagono)));
    }*/
}
