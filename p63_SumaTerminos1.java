import java.util.Scanner;

public class p63_SumaTerminos1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Ingrese el número hasta el que se sumarán los términos: ");
        int n = scanner.nextInt();

        double suma = 0.0;

        System.out.print("Salida: ");
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print("1");
            } else {
                System.out.print(" + 1/" + i);
            }
            suma += 1.0 / i;
        }

        System.out.println("\nSuma: " + suma);
    }
}