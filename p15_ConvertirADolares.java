//Convierte el peso mexicano en dolares 
//El dolar al día de 19/08/2024 a las 6:32pm cuesta en 18.69 pesos mexicanos

import java.util.Scanner;

public class p15_ConvertirADolares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.print("Ingresa el monto en pesos: ");
        double pesos = scanner.nextDouble();


        double tipoDeCambio = 18.69;
        double dolares = pesos / tipoDeCambio;

        System.out.printf("%.2f pesos equivalen a %.2f dólares%n", pesos, dolares);
    }
}

