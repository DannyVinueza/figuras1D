import Geometria2D.*;

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
                                    System.out.println("9. Pentagono");
                                    double apo, perimetro, lado;
                                    System.out.print("Ingrese el apotema: ");
                                    apo = sc.nextDouble();
                                    System.out.print("Ingrese el perimetro: ");
                                    perimetro = sc.nextInt();
                                    System.out.print("Ingrese la longitud del lado: ");
                                    lado = sc.nextDouble();
                                    Pentagono pentagono = new Pentagono(apo, perimetro);
                                    Pentagono pentagonoP = new Pentagono(lado);
                                    System.out.println("El area del pentagono es: " + dc.format(pentagono.areaPent(pentagono)));
                                    System.out.println("El perimetro del pentagono es: " + dc.format(pentagonoP.periPent(pentagonoP)));
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
                                    System.out.println("1. Cilindro");
                                }break;
                                case 2:{
                                    System.out.println("2. Cono");
                                }break;
                                case 3:{
                                    System.out.println("3. Cubo");
                                }break;
                                case 4:{
                                    System.out.println("4. Esfera");
                                }break;
                                case 5:{
                                    System.out.println("5. Ortoedro");
                                }break;
                                case 6:{
                                    System.out.println("6. Piramide");
                                }break;
                                case 7:{
                                    System.out.println("7. Piramide Hexagonal");
                                }break;
                                case 8:{
                                    System.out.println("8. Prisma Pentagular");
                                }break;
                                case 9:{
                                    System.out.println("9. Prisma Triangular");
                                }break;
                                case 10:{
                                    System.out.println("10. Tetrahedro");
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