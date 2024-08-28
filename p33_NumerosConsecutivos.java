//Verifica si tres numeros son consecutivos

import java.util.Scanner;

public class p33_NumerosConsecutivos {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tres números enteros");
        System.out.println("Ingresa el primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Ingresa el segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Ingresa el tercer número:");
        int num3 = scanner.nextInt();

        if (num2 == num1 + 1 && num3 == num2 + 1) {
            System.out.println("Los números " + num1 + ", " + num2 + ", " + num3 + ", son consecutivos.");
        } else {
            System.out.println("Error: Los números no son consecutivos.");
        }
    }
}
