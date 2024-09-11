import java.util.Scanner;

public class p65_SistemaPapeleria {
    public static void main(String[] args) {
        int venta, cantidad, cantCarta, cantOficio, cantDoble, totDinero;
        int totCarta, totOficio, totDoble, totVen, precioC, precioO, precioD;
        char resp, tipoC;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("------------------------------------------");
        System.out.println("Papeleria la Malena, SA.  de  CV.");
        System.out.println("Sistema de ventas de copias");
        System.out.println("------------------------------------------");

        venta = cantidad = cantCarta = cantOficio = cantDoble = totVen = 0;
        totCarta = totOficio = totDoble = totDinero = 0;
        precioC = 3;
        precioO = 4;
        precioD = 6;

        do {
            venta++;
            System.out.printf("\nVenta: %d", venta);
            System.out.print("\nTipo de copia (C)arta $3    (O)ficio $4    (D)oble Of $6 : ");
            tipoC = Character.toUpperCase(obj.next().charAt(0));
            System.out.print("Cantidad:  ");
            cantidad = obj.nextInt();

            switch (tipoC) {
                case 'C':
                    cantCarta += cantidad;
                    totCarta += cantidad;
                    totDinero += cantidad * precioC;
                    break;

                case 'O':
                    cantOficio += cantidad;
                    totOficio += cantidad;
                    totDinero += cantidad * precioO;
                    break;

                case 'D':
                    cantDoble += cantidad;
                    totDoble += cantidad;
                    totDinero += cantidad * precioD;
                    break;

                default:
                System.out.println("Este tipo de copia no existe");
                    break;
            }
            System.out.print("\nOtra venta (S/N)?  ");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');

        System.out.println("\n------------------------------------------");
        System.out.print("Resumen diario de ventas");
        System.out.println("\n------------------------------------------");
        System.out.printf("Ventas realizadas: %d", venta);
        System.out.print("\n------------------------------------------");
        System.out.printf("\nCarta        :  %d   -  $ %d", cantCarta, (totCarta * precioC));
        System.out.printf("\nOficio       :  %d   -  $ %d", cantOficio, (totOficio * precioO));
        System.out.printf("\nDoble Of.    :  %d   -  $ %d", cantDoble, (totDoble * precioD));
        System.out.println("\n------------------------------------------");
        totVen = cantCarta + cantOficio + cantDoble;
        System.out.printf("Tot. Ventas  :  %d   -  $ %d", totVen, totDinero);

        
        if (totDinero < 50) {
            System.out.println("\nEsta venta es una: venta moderada");
        } else if (totDinero > 50 & totDinero < 100) {
            System.out.println("\nEsta venta es una: venta frecuente");
        } else if (totDinero > 100) {
            System.out.println("\nEsta venta es una: venta superada");
        }
        obj.close();
    }
}