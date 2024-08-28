/**Dado el nombre del estudiante, sexo (h/m), su edad y tres calificaciones, decidir si el estudiante es 
 * aceptado. La Universidad Kitty Kat SA es solo para mujeres mayores de 21 años con un 
 * promedio de entre 8 y 9.5.**/

 import java.util.Scanner;

 public class p38_AceptarEstudianteV2 {
     public static void main(String[] args) {
         String nombre;
         char sexo;
         int edad;
         double c1, c2, c3, promedio;
         Scanner obj = new Scanner(System.in);
 
         System.out.print("\033[H\033[2J");
 
         System.out.println("Universidad Kitty Kat SA\nSistema de Admision\n");
         System.out.print("Dame tu nombre: ");
         nombre = obj.nextLine();
         System.out.print("Dame tu edad  : ");
         edad = obj.nextInt();
         System.out.print("Dame tu sexo [H] o [M]: ");
         sexo = obj.next().charAt(0);
         sexo = Character.toUpperCase(sexo);
 
         if (edad < 21)
             System.out.print("\nNo aceptamos menores de edad en esta Universidad..");
             if (sexo == 'H') {
                 System.out.println("\nNo aceptamos hombres en esta Universidad..");
             }
         else {  
             System.out.print("\nDame calificacion 1: ");
             c1 = obj.nextFloat();
             System.out.print("Dame calificacion 2: ");
             c2 = obj.nextFloat();
             System.out.print("Dame calificacion 3: ");
             c3 = obj.nextFloat();
             promedio = (c1 + c2 + c3 )/3;
             if (promedio < 8)
                 System.out.print("\nNo tienes el promedio adecuado para estar en esta Universidad");
             else
                 System.out.printf("\n%s Bienvenida a esta Universidad tu promedio %.2f lo permite", nombre, promedio);
         }
         System.out.println("\nGracias por utilizar este sistema");
     }
 }