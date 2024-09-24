// p03_AreaTriangulo - Calcula el área de un triángulo 

import java.util.Scanner;

public class p03_AreaTriangulo {
    public static void main(String[] args) {
        int bas, altura;
        double area;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nCalculando el área de un triángulo\n");
        System.out.print("Dame la base ? ");
        bas = obj.nextInt();
        System.out.print("Dame la altura ? ");
        altura = obj.nextInt();

        area = (bas * altura) /2;

        System.out.println( String.format("El triángulo de base %d y altura %d tiene un área de %.2f",
        bas, altura, area) );
    }
}
