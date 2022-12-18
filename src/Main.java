import Geometria2D.*;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat dc = new DecimalFormat("##.00");
    public static void main(String[] args) {
        System.out.println("1. Cuadrado");
        double lado;
        System.out.println("Ingrese el lado: ");
        lado = sc.nextDouble();
        Cuadrado cuadrado= new Cuadrado(lado);
        System.out.println("----Resultados----");
        System.out.println("El area del Cudrado es: " + dc.format(cuadrado.areaCua(cuadrado)));
        System.out.println("El perimetro del Cudrado es: " + dc.format(cuadrado.periCua(cuadrado)));



       /* System.out.println("2. Circulo");
        double rad,perimetro;
        System.out.println("Ingrese el radio: ");
        rad = sc.nextDouble();
        System.out.println("Ingrese el perimetro: ");
        perimetro = sc.nextInt();
        circuloBlanco circuloBlanco = new circuloBlanco(rad, perimetro);
        System.out.println("----Resultados----");
        System.out.println("El area del circulo es: " + dc.format(circuloBlanco.areaCir (circuloBlanco)));
        System.out.println("El perimetro del circulo es: " + dc.format(circuloBlanco.periCir (circuloBlanco)));

        */
        -----------------------------------------------------------------------------------------------------------------
        /* System.out.println("3. Decagono");
        double apo,perimetro;
        System.out.println("Ingrese el apotema: ");
        apo = sc.nextDouble();
        System.out.println("Ingrese el perimetro: ");
        perimetro = sc.nextInt();
        Decagono decagono = new Decagono(apo, perimetro);
        System.out.println("----Resultados----");
        System.out.println("El area del Decagono es: " + dc.format(decagono.areaDeca (decagono)));
        ------------------------------------------------------------------------------------------------------
        System.out.println("4. Endecagono");
        double apo,lado;
        System.out.println("Ingrese el valor del lado: ");
        lado = sc.nextDouble();
        System.out.println("Ingrese el apotema: ");
        apo = sc.nextInt();
        Endecagono endecagono = new Endecagono(lado, apo);
        System.out.println("----Resultados----");
        System.out.println("El area del Endecagono es: " + dc.format(endecagono.areaEnde (endecagono)));
        ---------------------------------------------------------------------------------------------------------
        System.out.println("5. Eneagono");
        double apo,lado;
        System.out.println("Ingrese el valor del lado: ");
        lado = sc.nextDouble();
        System.out.println("Ingrese el apotema: ");
        apo = sc.nextInt();
        Eneagono eneagono = new Eneagono(lado, apo);
        System.out.println("----Resultados----");
        System.out.println("El area del Eneagono es: " + dc.format(eneagono.areaEne (eneagono)));
        -------------------------------------------------------------------------------------------------------
         System.out.println("6. Heptagono");
        double apo,lados;
        System.out.println("Ingrese el valor del lado: ");
        lados = sc.nextDouble();
        System.out.println("Ingrese el apotema: ");
        apo = sc.nextInt();
        Heptagono heptagono= new Heptagono(lados,apo);
        System.out.println("----Resultados----");
        System.out.println("El area del Heptagono es: " + dc.format(heptagono.areaHepta (heptagono)));
        -------------------------------------------------------------------------------------------------------
        System.out.println("7. Hexagono");
        double apo,lado;
        System.out.println("Ingrese el valor del lado: ");
        lado = sc.nextDouble();
        System.out.println("Ingrese el apotema: ");
        apo = sc.nextInt();
        Hexagono hexagono= new Hexagono(lado, apo);
        System.out.println("----Resultados----");
        System.out.println("El area del Hexagono es: " + dc.format(hexagono.areaHexa (hexagono)));
        ------------------------------------------------------------------------------------------------------
        /*System.out.println("8.Octogono");
        double apo,lado;
        System.out.println("Ingrese el valor del lado: ");
        lado = sc.nextDouble();
        System.out.println("Ingrese el apotema: ");
        apo = sc.nextInt();
        Octogono octogono= new Octogono(lado, apo);
        System.out.println("----Resultados----");
        System.out.println("El area del Octogono es: " + dc.format(octogono.areaOcto(octogono)));
        -----------------------------------------------------------------------------------------------------------
                /*System.out.println("10.Triangulo");
        double base,altura;
        System.out.println("Ingrese la base: ");
        base = sc.nextDouble();
        System.out.println("Ingrese el apotema: ");
        altura = sc.nextInt();
        Triangulo triangulo= new Triangulo(base,altura);
        System.out.println("----Resultados----");
        System.out.println("El area del Triangulo es: " + dc.format(triangulo.areaTri(triangulo)));
        */





    }
}
