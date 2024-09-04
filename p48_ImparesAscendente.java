// imprime los números impares ascendentemente, muestra la suma de estos y se repite cuantes veces quiera el usuario

import java.util.Scanner;

public class p48_ImparesAscendente {
    public static void main(String[] args) {
        int inicio, fin, c, s, count;
        char resp;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Imprime números impares ascendente\n");
            System.out.print("Desde donde? ");
            inicio = obj.nextInt();
            System.out.print("Hasta donde? ");
            fin = obj.nextInt();
            s = 0;
            count = 0;
            if (inicio % 2 == 0) {
                inicio++; // Si inicio es par, incrementa en 1 para hacerlo impar
            }
            c = inicio;
            while (c <= fin) {
                if (c % 2 != 0) {
                    System.out.printf("%d ", c);
                    s = s + c;
                    count++;
                }
                c = c + 2;
            }
            double promedio = (double) s / count;
            System.out.printf("\nLa suma es %d", s);
            System.out.printf("\nEl promedio es %.2f", promedio);
            System.out.print("\nDeseas continuar (S/N) ? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
    }
}
