import java.util.Arrays;
import java.util.Random;

public class p93_ParesImpares  {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        int MAX = 100;
        int[] a = new int[MAX];
        int[] b = new int[MAX]; 

        rellenarArregloConAleatorios(a, 0, 20);

        System.out.println("Elementos del arreglo a:");
        mostrarArreglo(a);

        int cuentaPares = mostrarYContarElementos(a, true);
        System.out.println("Número de elementos pares: " + cuentaPares);

        int cuentaImpares = mostrarYContarElementos(a, false);
        System.out.println("Número de elementos impares: " + cuentaImpares);
    }

    public static void rellenarArregloConAleatorios(int[] arreglo, int min, int max) {
        Random rand = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rand.nextInt((max - min) + 1) + min;
        }
    }

    public static void mostrarArreglo(int[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
    }

    public static int mostrarYContarElementos(int[] arreglo, boolean contarPares) {
        int contador = 0;
        System.out.println(contarPares ? "Elementos pares:" : "Elementos impares:");
        for (int elemento : arreglo) {
            if (contarPares && elemento % 2 == 0) {
                System.out.print(elemento + " ");
                contador++;
            } else if (!contarPares && elemento % 2 != 0) {
                System.out.print(elemento + " ");
                contador++;
            }
        }
        System.out.println();
        return contador;
    }
}
