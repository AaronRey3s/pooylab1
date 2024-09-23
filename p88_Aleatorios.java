// Genera números aleatorios

import java.util.Random;

public class p88_Aleatorios {
    public static void main(String[] args) {
        Random rnd = new Random();
        int aleatorio1 = Math.abs(rnd.nextInt());
        int aleatorio2 = Math.abs(rnd.nextInt(30))+1;
        int aleatorio3 = Math.abs(rnd.nextInt(100 - 1)) + 1;
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.printf("\nNúmero aleatorio entero positivo        : %d", aleatorio1);
        System.out.printf("\nNúmero aleatorio 1 ..30                 : %d", aleatorio2);
        System.out.printf("\nNúmero aleatorio en el rango de 1 a 100 : %d", aleatorio3);
    }
}