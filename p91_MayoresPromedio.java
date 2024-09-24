//Pide el numero de calificaciones, calcula la suma, el promedio, muestra calificaciones mayores y menores al promedio 
import java.util.Scanner;

public class p91_MayoresPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");

       
        float[] calificaciones = capturarCalificaciones(scanner);

        
        System.out.println("Calificaciones ingresadas:");
        mostrarArreglo(calificaciones);

        
        float suma = calcularSuma(calificaciones);
        float promedio = calcularPromedio(suma, calificaciones.length);
        System.out.println("Suma de las calificaciones: " + suma);
        System.out.println("Promedio de las calificaciones: " + promedio);

        
        int contador = mostrarMayoresPromedio(calificaciones, promedio);
        System.out.println("Número de calificaciones mayores al promedio: " + contador);
    }

    
    public static float[] capturarCalificaciones(Scanner scanner) {
        System.out.print("Ingrese el número de calificaciones: ");
        int n = scanner.nextInt();
        float[] calificaciones = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextFloat();
        }
        return calificaciones;
    }

    
    public static void mostrarArreglo(float[] arreglo) {
        for (float calificacion : arreglo) {
            System.out.print(calificacion + " ");
        }
        System.out.println();
    }

    
    public static float calcularSuma(float[] arreglo) {
        float suma = 0;
        for (float calificacion : arreglo) {
            suma += calificacion;
        }
        return suma;
    }

    
    public static float calcularPromedio(float suma, int cantidad) {
        return suma / cantidad;
    }

    
    public static int mostrarMayoresPromedio(float[] arreglo, float promedio) {
        int contador = 0;
        System.out.println("Calificaciones mayores al promedio:");
        for (float calificacion : arreglo) {
            if (calificacion > promedio) {
                System.out.print(calificacion + " ");
                contador++;
            }
        }
        System.out.println();
        return contador;
    }
}
