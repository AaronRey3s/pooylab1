//Calcula la hipotenusa de un triangulo

import java.util.Scanner;
import java.lang.Math;

public class p10_HipotenusaTriangulo {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double hipotenusa, catetoAdyacente, catetoOpuesto;

        System.out.println("Dame el valor del Cateto Adyacente");
        catetoAdyacente = input.nextDouble();
        System.out.println("Dame el valor del Cateto Opuesto");
        catetoOpuesto = input.nextDouble();
        hipotenusa = Math.sqrt(Math.pow(catetoAdyacente, 2) + Math.pow(catetoOpuesto, 2));
        System.out.println("Hipotenusa = " + hipotenusa);
    }
}
