//Te dice cual número de tres es mayor

import java.util.*;
import java.lang.Math;

public class p34_NumeroMayor {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        float m, a, b, c;

        System.out.println("Ingresa el primer número ");
        a = input.nextFloat();
        System.out.println("Ingresa el segundo número ");
        b = input.nextFloat();
        System.out.println("Ingresa el tercer número ");
        c = input.nextFloat();

        if (a == b && b == c) {
            System.out.println("Todos los números ingresados son iguales.");
        } else {
            if (a > b && a > c) {
                m = a;
            } else if (b > c) {
                m = b;
            } else {
                m = c;
            }
            System.out.println("El mayor de los 3 números ingresados = " + m);
        }
    }
}
