package p94_Empleado01;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Empleado01 empleado1 = new Empleado01();
        Empleado01 empleado2 = new Empleado01();
        Empleado01 empleado3 = new Empleado01();

        empleado1.Nombre = "Juan Perez";
        empleado1.Edad = 45;
        empleado2.Nombre = "María Lopez";
        empleado2.Edad = 40;
        empleado3.Nombre = "Lucho";
        empleado3.Edad = 5;



        System.out.println("Empleado 1 nombre: " + empleado1.Nombre);
        System.out.println("Empleado 1 edad: " + empleado1.Edad);
        System.out.println(empleado1.toString());
        System.out.println("Empleado 2 nombre: " + empleado2.Nombre);
        System.out.println("Empleado 2 edad: " + empleado2.Edad);
        System.out.println(empleado2.toString());
        System.out.println("Empleado 3 edad: " + empleado2.Edad);
        System.out.println(empleado3.toString());
    }
   
}
