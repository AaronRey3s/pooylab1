import java.util.Scanner;

public class p35_ContinentesMundo{
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Dado un número entre 1 y 6 imprime el continente del mundo\n");
        System.out.print("Dame el continente con número? ");
        int continente = new Scanner(System.in).nextInt();

        switch (continente) {
            case 1:
                System.out.println("ASIA");
                break;
            case 2:
                System.out.println("ÁFRICA");
                break;
            case 3:
                System.out.println("AMERICA DEL NORTE");
                break;
            case 4:
                System.out.println("AMERICA DEL SUR");
                break;
            case 5:
                System.out.println("ANTÁRTIDA");
                break;
            case 6:
                System.out.println("EUROPA");
                break;
            
            default:
                System.out.println("Continente inválido, en que mundo vives !!!");
                break;
        }
        System.out.println("\n\nProceso terminado ...");
    }
}
