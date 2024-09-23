// Muestra un arreglo y lo eleva al cuadrado usando funciones

public class p86_ArregloMostrar {
    public static void Mostrar(int[] a) {
        for (int i = 0; i < a.length; i++)

            System.out.print(a[i] + " ");

    }

    public static void Cuadrado(int[] a) {
        for (int i = 0; i < a.length; i++)
            a[i] = a[i] * a[i];

    }

    public static void main(String[] args) {
        int[] A = { 2, 4, 6, 8, 3, 5, 7 };
        int[] B = {1, 3, 5, 7, 9, 11}; 
        System.out.print("\033[H\033[2J");
        System.out.println("\nElementos del arreglo A");
        Mostrar(A);
        System.out.println("\nElementos del Arreglo A al Cuadrado");
        Cuadrado(A);
        Mostrar(A);
        System.out.println("\nElementos del arreglo B");
        Mostrar(B);
        System.out.println("\nElementos del Arreglo B al Cuadrado");
        Cuadrado(B);
        Mostrar(B);
    }
}