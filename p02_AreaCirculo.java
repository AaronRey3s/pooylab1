// p02_AreaCirculo - Calcular el área de un circulo

import java.util.Scanner;

public class p02_AreaCirculo {
    public static void main (String[] args) {
        double radio, a;
        Scanner lradio = new Scanner(System.in);

        System.out.println("\nCalculando el area de un circulo\n");
        System.out.println("Dame el radio ?");
        radio = lradio.nextFloat();

        a = Math.PI * Math.pow(radio, 2);

        System.out.println("\nEl circulo de radio " + radio + " tiene un area de " + a);
    }
}
