//Convertir temperatura de grados celsius a fahrenheit y viceversa

import java.util.Scanner;

public class p23_ConvertirTemperaturasv2 {
    public static void main(String[] args) {
        char op;
        float temp, res;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Convertir de grados Celsius a Fahrenheit y viceversa\n");
        System.out.println("[F]ahrenheit a Centigrados");
        System.out.println("[C]entigrados a Fahrenheit");
        System.out.print("Elije una opción: ");
        op = obj.next().charAt(0);
        op = Character.toUpperCase(op);

        if (op == 'F') {
            System.out.println("\nConvertir de Fahrenheit a Centigrados\n");
            System.out.print("Dame los grados Fahrenheit: ");
            temp = obj.nextFloat();
            res = (temp - 32) * 5 / 9;
            System.out.printf("%.2f Fahrenheit, equivale a %.2f Centigrados\n", temp, res);
        } else if (op == 'C') {
            System.out.println("\nConvertir de Centigrados a Fahrenheit\n");
            System.out.print("Dame los grados Centigrados: ");
            temp = obj.nextFloat();
            res = (temp * 9 / 5) + 32;
            System.out.printf("%.2f Centigrados, equivale a %.2f Fahrenheit\n", temp, res);
        } else {
            System.out.println("\nElegiste una opción invalida...\n");
        }

        System.out.println("\nGracias por utilizar este programa");
    }
}

