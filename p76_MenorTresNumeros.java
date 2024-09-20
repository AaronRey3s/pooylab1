import java.util.Scanner;

public class p76_MenorTresNumeros {
    public static float Menor(float n1, float n2, float n3, float n4) {
        float men = n1;
        if (n2 < men)
            men = n2;
        if (n3 < men)
            men = n3;
        if (n4 < men)
            men = n4;
        return men;
    }

    public static void main(String[] args) {
        float n1, n2, n3, n4;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Dame cuatro numeros separados por espacio ?\n ");
        n1 = obj.nextFloat();
        n2 = obj.nextFloat();
        n3 = obj.nextFloat();
        n4 = obj.nextFloat();
        System.out.printf("\nEl menor de los tres números es : %.2f", Menor(n1, n2, n3, n4));
    }
}
