//Calcula el volumen de un cilindro

import java.util.Scanner;

public class p13_VolumenCilindro {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner scanner = new Scanner(System.in);
        double volumen, radio, altura;

        System.out.print("Introduce el valor del radio del cilindro: ");
         radio = scanner.nextDouble();
        System.out.print("Introduce el valor de la altura del cilindro: ");
         altura = scanner.nextDouble();

         volumen = Math.PI * (radio * radio) * altura;

         System.out.println("El volumen del cilindro es: " + volumen + " unidades cúbicas.");

    
    }
}