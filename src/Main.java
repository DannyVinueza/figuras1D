import Geometria2D.*;

import java.text.DecimalFormat;
import java.util.Scanner;

//Si se usa el * se importan todas las clases tambien es lo mismo
//Escribir import Geometria2D
public class Main {
    static Scanner sc = new Scanner(System.in);
    static DecimalFormat dc = new DecimalFormat("##.00");
    public static void main(String[] args) {
        double apo, perimetro;
        System.out.println("Ingrese el apotema: ");
        apo = sc.nextDouble();
        System.out.println("Ingrese el perimetro: ");
        perimetro = sc.nextInt();
        Pentagono pentagono = new Pentagono(apo, perimetro);
        System.out.println("El area del pentagono es: " + dc.format(pentagono.areaPent(pentagono)));
    }
}