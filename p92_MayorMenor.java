//Pide al usuario ingresar el total de números en el arregllo y despues calcula el mayor y el menor y los muestra

import java.util.Scanner;

public class p92_MayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");

        System.out.println("¿Cuántos números quieres ingresar?");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Los números ingresados son: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");

        }
        System.out.println();

        int max = numeros[0];
        int min = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
            if (numeros[i] < min) {
                min = numeros[i];
            }

        }
        System.out.println("El número mayor ingresado es: " + max);
        System.out.println("El número menor ingresado es: " + min);
    }
}