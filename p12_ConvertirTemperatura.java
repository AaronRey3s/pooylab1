//Conversor de grados Fahrenheit a Celsius

import java.util.Scanner;

public class p12_ConvertirTemperatura {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();


        Scanner scanner = new Scanner(System.in);
        double fahrenheit, celsius;

        System.out.print("Introduce los grados Fahrenheit: ");
         fahrenheit = scanner.nextDouble();

         celsius = (fahrenheit - 32) * 5/9;

         System.out.println("Los grados Fahrenheit son: " + fahrenheit + " Convertidos a grados Celsius son: " + celsius + "°C" );

    }
}