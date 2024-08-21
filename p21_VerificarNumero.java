//Verifica si un número es positivo,negativo o cero

import java.util.Scanner;

public class p21_VerificarNumero {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        int n;

        System.out.println("Verfica si un número es postivo, negativo o cero\n");
        System.out.println("Dame un Número: ");
        n = new Scanner(System.in).nextInt();

        if(n>0)
        System.out.println("El número es POSITIVO");

        if(n<0)
        System.out.println("El número es NEGATIVO");

        if(n==0)
        System.out.println("El número es CERO");
        System.out.println("\nGracias por utilizar el programa\n");
    }
    
}
