// calcula el tercer angulo de un triangulo

import java.util.Scanner;

public class  p11_CalcularAngulo {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        double angulo1, angulo2, angulo3;

        System.out.println("Dame el valor del primer angulo");
        angulo1 = input.nextDouble();

        System.out.println("Dame el valor del segundo angulo");
        angulo2 = input.nextDouble();

        angulo3 = 180 - (angulo1 + angulo2);

        System.out.println("El valor de angulo es: " + angulo3  +  " grados" );

    }
}    
