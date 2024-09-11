// Conversion de temperaturas usando funciones

import java.util.Scanner;

public class p67_ConversionTemperaturas {
    public static float Farenheit(float t) {
        return (t * 9 / 5) + 32;
    }

    public static float Celcius(float t) {
        return (t - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        int op;
        float temp, res;
        Scanner obj = new Scanner(System.in);
        
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.print("[1] farenheit\n[2] celcius\n[3] salir\nElige ? ");
            op = obj.nextInt();
            
            switch (op) {
                case 1:
                    System.out.print("Dame la temperatura en grados Celsius: ");
                    temp = obj.nextFloat();
                    res = Farenheit(temp);
                    System.out.printf("\n%.2f grados Celsius equivale a %.2f grados Fahrenheit.\n", temp, res);
                    break;
                case 2:
                    System.out.print("Dame la temperatura en grados Fahrenheit: ");
                    temp = obj.nextFloat();
                    res = Celcius(temp);
                    System.out.printf("\n%.2f grados Fahrenheit equivale a %.2f grados Celsius.\n", temp, res);
                    break;
                case 3:
                    System.out.println("Programa terminado.");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
            System.out.println("Presiona la tecla <Enter> para continuar...");obj.nextLine();obj.nextLine();
        } while (op != 3);
    }
}
