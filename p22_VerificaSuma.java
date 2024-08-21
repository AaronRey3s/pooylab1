//Verifica si la suma de dos numeros es igual a un tercero

import java.util.Scanner;

public class p22_VerificaSuma {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        float n1,n2,n3;
        Scanner obj = new Scanner(System.in);

        System.out.println("Verificar si la suma de dos numeros es igual a un tercero\n");
        System.out.print("Dame el primer numero ? "); n1 = obj.nextFloat();
        System.out.print("Dame el seguno numero ? "); n2 = obj.nextFloat();
        System.out.print("Dame el tercer numero ? "); n3 = obj.nextFloat();

        if( n1+n2 == n3 )
        System.out.println("\nSon iguales");
        else
        System.out.println("\nSon distintos");
        System.out.println("\nGracias por utilizar este programa");

    }
}    
