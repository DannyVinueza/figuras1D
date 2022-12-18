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
                                    double lado;
                                    System.out.print("Ingrese el lado: ");
                                    lado = sc.nextDouble();
                                    Cuadrado cuadrado= new Cuadrado(lado);
                                    System.out.println("----Resultados----");
                                    System.out.println("El area del Cudrado es: " + dc.format(cuadrado.areaCua(cuadrado)));
                                    System.out.println("El perimetro del Cudrado es: " + dc.format(cuadrado.periCua(cuadrado)));
                                }break;
                                case 2:{
                                    System.out.println("2. Circulo");
                                    double rad,perimetro;
                                    System.out.print("Ingrese el radio: ");
                                    rad = sc.nextDouble();
                                    System.out.print("Ingrese el perimetro: ");
                                    perimetro = sc.nextInt();
                                    circuloBlanco circuloBlanco = new circuloBlanco(rad, perimetro);
                                    System.out.println("----Resultados----");
                                    System.out.println("El area del circulo es: " + dc.format(circuloBlanco.areaCir (circuloBlanco)));
                                    System.out.println("El perimetro del circulo es: " + dc.format(circuloBlanco.periCir (circuloBlanco)));
                                }break;
                                case 3:{
                                    System.out.println("3. Decagono");
                                    double apo,perimetro;
                                    System.out.print("Ingrese el apotema: ");
                                    apo = sc.nextDouble();
                                    System.out.print("Ingrese el perimetro: ");
                                    perimetro = sc.nextInt();
                                    Decagono decagono = new Decagono(apo, perimetro);
                                    System.out.println("----Resultados----");
                                    System.out.println("El area del Decagono es: " + dc.format(decagono.areaDeca (decagono)));
                                }break;
                                case 4:{
                                    System.out.println("4. Endeagono");
                                    double apo,lado;
                                    System.out.print("Ingrese el valor del lado: ");
                                    lado = sc.nextDouble();
                                    System.out.print("Ingrese el apotema: ");
                                    apo = sc.nextInt();
                                    Endeagono endecagono = new Endeagono(lado, apo);
                                    System.out.println("----Resultados----");
                                    System.out.println("El area del Endecagono es: " + dc.format(endecagono.areaEnde (endecagono)));
                                }break;
                                case 5:{
                                    System.out.println("5. Eneagono");
                                    double apo,lado;
                                    System.out.print("Ingrese el valor del lado: ");
                                    lado = sc.nextDouble();
                                    System.out.print("Ingrese el apotema: ");
                                    apo = sc.nextInt();
                                    Eneagono eneagono = new Eneagono(lado, apo);
                                    System.out.println("----Resultados----");
                                    System.out.println("El area del Eneagono es: " + dc.format(eneagono.areaEne (eneagono)));
                                }break;
                                case 6:{
                                    System.out.println("6. Heptagono");
                                    double apo,lados;
                                    System.out.print("Ingrese el valor del lado: ");
                                    lados = sc.nextDouble();
                                    System.out.print("Ingrese el apotema: ");
                                    apo = sc.nextInt();
                                    Heptagono heptagono= new Heptagono(lados,apo);
                                    System.out.println("----Resultados----");
                                    System.out.println("El area del Heptagono es: " + dc.format(heptagono.areaHepta (heptagono)));
                                }break;
                                case 7:{
                                    System.out.println("7. Hexagono");
                                    double apo,lado;
                                    System.out.print("Ingrese el valor del lado: ");
                                    lado = sc.nextDouble();
                                    System.out.print("Ingrese el apotema: ");
                                    apo = sc.nextInt();
                                    Hexagono hexagono= new Hexagono(lado, apo);
                                    System.out.println("----Resultados----");
                                    System.out.println("El area del Hexagono es: " + dc.format(hexagono.areaHexa (hexagono)));
                                }break;
                                case 8:{
                                    System.out.println("8. Octogono");
                                    double apo,lado;
                                    System.out.print("Ingrese el valor del lado: ");
                                    lado = sc.nextDouble();
                                    System.out.print("Ingrese el apotema: ");
                                    apo = sc.nextInt();
                                    Octogono octogono= new Octogono(lado, apo);
                                    System.out.println("----Resultados----");
                                    System.out.println("El area del Octogono es: " + dc.format(octogono.areaOcto(octogono)));

                                }break;
                                case 9:{
                                    System.out.println("9. Pentagono");
                                    double apo, perimetro, lado;
                                    System.out.print("Ingrese el apotema: ");
                                    apo = sc.nextDouble();
                                    System.out.print("Ingrese la longitud del lado: ");
                                    lado = sc.nextDouble();
                                    Pentagono pentagono = new Pentagono();
                                    Pentagono pentagonoP = new Pentagono(lado);
                                    System.out.println("El area del pentagono es: " + dc.format(pentagono.areaPent(apo, pentagonoP.periPent(pentagonoP))));
                                    System.out.println("El perimetro del pentagono es: " + dc.format(pentagonoP.periPent(pentagonoP)));
                                }break;
                                case 10:{
                                    System.out.println("10. Triangulo");
                                    double base,altura;
                                    System.out.print("Ingrese la base: ");
                                    base = sc.nextDouble();
                                    System.out.print("Ingrese el apotema: ");
                                    altura = sc.nextInt();
                                    Triangulo triangulo= new Triangulo(base,altura);
                                    System.out.println("----Resultados----");
                                    System.out.println("El area del Triangulo es: " + dc.format(triangulo.areaTri(triangulo)));
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
                                    System.out.println("1. Cilindro");
                                    double alturaCil, radioCil;
                                    System.out.print("Ingrese el valor de la altura: ");
                                    alturaCil = sc.nextDouble();
                                    System.out.print("Ingrese el valor del radio: ");
                                    radioCil = sc.nextDouble();
                                    Cilindro cilindro = new Cilindro(alturaCil,radioCil);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Volumen: " + dc.format(cilindro.volumen(cilindro)));
                                    System.out.println("Area de la Base: " + dc.format(cilindro.areaBase(cilindro)));
                                    System.out.println("Superficie Lateral: " + dc.format(cilindro.supLateral(cilindro)));
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
                                    System.out.println("Volumen: " + dc.format(cono.supLateral(cono)));
                                    System.out.println("Superficie Lateral" + dc.format(cono.volumen(cono)));
                                    System.out.println("Area de la Base" + dc.format(cono.areaBase(cono)));
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
                                    System.out.println("Volumen: " + dc.format(cubo.volumen(cubo)));
                                    System.out.println("Area de la Base: " + dc.format(cubo.areaBase(cubo)));
                                    System.out.println("Diagonal Base" + dc.format(cubo.diagonalBase(cubo)));
                                }break;
                                case 4:{
                                    System.out.println("4. Esfera");
                                    double radioEsfera;

                                    System.out.println("Radio: ");
                                    radioEsfera = sc.nextDouble();

                                    Esfera esfera = new Esfera(radioEsfera);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Volumen: " + dc.format(esfera.volumen(esfera)));
                                    System.out.println("Area Total: " + dc.format(esfera.areaTotal(esfera)));
                                    System.out.println("Circunferencia" + dc.format(esfera.circunferencia(esfera)));
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
                                    System.out.println("Volumen: " + dc.format(ortoedro.volumen(ortoedro)));
                                    System.out.println("Area: " + dc.format(ortoedro.area(ortoedro)));
                                    System.out.println("Diagonal Interna: " + dc.format(ortoedro.diagonalInterna(ortoedro)));
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
                                    System.out.println("Area de la Base: " + dc.format(piramide.areaBase(piramide)));
                                    System.out.println("Perimetro de la Base: " + dc.format(piramide.perimetroBase(piramide)));
                                    System.out.println("Volumen: " + dc.format(piramide.volumenPiramide(piramide)));
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

                                    piramideHexagonal piramideHexagonal = new piramideHexagonal(ladoPiramHexa, alturaPiramHexa, apotemaPiramHexa);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Volumen: " + dc.format(piramideHexagonal.volumen(piramideHexagonal)));
                                    System.out.println("Perimetro de la Base: " + dc.format(piramideHexagonal.perimetroBase(piramideHexagonal)));
                                    System.out.println("Area de la base: " + dc.format(piramideHexagonal.areaBase(piramideHexagonal)));
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

                                    prismaPentagular prismaPentagular = new prismaPentagular(apotemaPP, ladoPP, alturaPP);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Volumen: " + dc.format(prismaPentagular.volumen(prismaPentagular)));
                                    System.out.println("Area: " + dc.format(prismaPentagular.area(prismaPentagular)));
                                    System.out.println("Area de la base: " + dc.format(prismaPentagular.areaBase(prismaPentagular)));
                                }break;
                                case 9:{
                                    System.out.println("9. Prisma Triangular");
                                    double ladoPT, altuaPT;

                                    System.out.println("Lado: ");
                                    ladoPT = sc.nextDouble();
                                    System.out.println("Altura: ");
                                    altuaPT = sc.nextDouble();

                                    prismaTriangular prismaTriangular = new prismaTriangular(ladoPT, altuaPT);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Volumen: " + dc.format(prismaTriangular.volumen(prismaTriangular)));
                                    System.out.println("Area: " + dc.format(prismaTriangular.area(prismaTriangular)));
                                    System.out.println("Area de la base: " + dc.format(prismaTriangular.areaBase(prismaTriangular)));
                                }break;
                                case 10:{
                                    System.out.println("10. Tetrahedro");
                                    double aristaTetra;

                                    System.out.println("Arista: ");
                                    aristaTetra = sc.nextDouble();

                                    Tetrahedro tetrahedro = new Tetrahedro(aristaTetra);

                                    System.out.println("\tResultados: ");
                                    System.out.println("Volumen: " + dc.format(tetrahedro.volumen(tetrahedro)));
                                    System.out.println("Area: " + dc.format(tetrahedro.area(tetrahedro)));
                                    System.out.println("Area de la Cara: " + dc.format(tetrahedro.areaCara(tetrahedro)));
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