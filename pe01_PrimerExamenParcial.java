import java.util.Scanner;

public class pe01_PrimerExamenParcial {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        String nombre;
        char sexo, tipoParticipante, resp = 'S'; 
        int edad;
        int rechazados = 0;
        int totalAlumnos = 0, totalDocentes = 0, totalTrabajadores = 0;
        int totalHombres = 0, totalMujeres = 0;
        int totalParticipantes = 0;
        int sumaEdades = 0;
        int dineroAlumnos = 0, dineroDocentes = 0, dineroTrabajadores = 0;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("Dame tu nombre: ");
            nombre = obj.nextLine();
            System.out.print("Dame tu sexo [H] o [M]: ");
            sexo = obj.next().charAt(0);
            sexo = Character.toUpperCase(sexo);
            System.out.print("Dame tu edad: ");
            edad = obj.nextInt();
            obj.nextLine(); 
            System.out.print("Dame tu tipo de Participante [A]Alumno [D]Docente [T]Trabajador: ");
            tipoParticipante = obj.next().charAt(0);
            tipoParticipante = Character.toUpperCase(tipoParticipante);

            if (edad >= 23) {
                int costo = 0;
                switch (tipoParticipante) {
                    case 'A':
                        costo = 40;
                        totalAlumnos++;
                        dineroAlumnos += costo;
                        break;
                    case 'D':
                        costo = 60;
                        totalDocentes++;
                        dineroDocentes += costo;
                        break;
                    case 'T':
                        costo = 80;
                        totalTrabajadores++;
                        dineroTrabajadores += costo;
                        break;
                    default:
                        System.out.println("Tipo de participante no válido.");
                        continue;
                }

                if (sexo == 'H') {
                    totalHombres++;
                } else if (sexo == 'M') {
                    totalMujeres++;
                }

                totalParticipantes++;
                sumaEdades += edad;

                System.out.println("\nDatos del Participante:");
                System.out.println("Nombre: " + nombre);
                System.out.println("Sexo: " + sexo);
                System.out.println("Edad: " + edad);
                System.out.println("Tipo de Participante: " + tipoParticipante);
                System.out.println("Costo de inscripción: $" + costo);
                System.out.println("¡Bienvenido al curso!");
            } else {
                rechazados++;
                System.out.println("Lo siento, solo los participantes de 23 años o más pueden asistir al curso.");
            }

            System.out.print("¿Deseas continuar (S / N)? ");
            resp = Character.toUpperCase(obj.next().charAt(0));
            obj.nextLine(); 

        } while (resp != 'N');

        double promedioEdad;
        if (totalParticipantes > 0) {
            promedioEdad = (double) sumaEdades / totalParticipantes;
        } else {
            promedioEdad = 0;
        }
        int dineroTotal = dineroAlumnos + dineroDocentes + dineroTrabajadores;

        System.out.println("\nResumen:");
        System.out.println("Total de Alumnos: " + totalAlumnos);
        System.out.println("Total de Docentes: " + totalDocentes);
        System.out.println("Total de Trabajadores: " + totalTrabajadores);
        System.out.println("Total de Hombres en general: " + totalHombres);
        System.out.println("Total de Mujeres en general: " + totalMujeres);
        System.out.println("Total de todos los participantes: " + totalParticipantes);
        System.out.println("Promedio de la edad de todos los participantes: " + promedioEdad);
        System.out.println("Total de rechazados: " + rechazados);
        System.out.println("Total dinero recaudado de Alumnos: $" + dineroAlumnos);
        System.out.println("Total dinero recaudado de Docentes: $" + dineroDocentes);
        System.out.println("Total dinero recaudado de Trabajadores: $" + dineroTrabajadores);
        System.out.println("Total dinero en general de todos los participantes: $" + dineroTotal);

        if (dineroTotal < 50) {
            System.out.println("El evento concluyó con ganancias BAJAS.");
        } else if (dineroTotal >= 50 && dineroTotal < 1000) {
            System.out.println("El evento concluyó con ganancias MODERADAS.");
        } else {
            System.out.println("El evento concluyó con BUENAS ganancias.");
        }

        obj.close();
    }
} 
