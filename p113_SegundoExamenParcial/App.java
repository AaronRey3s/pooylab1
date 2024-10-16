package p113_SegundoExamenParcial;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Equipo miequipo = new Equipo("Wolves", "Liga de Futbol Trancoso");
        miequipo.reporte();
        miequipo.agregarJugador(new JugadorEntrenador("Cesar Tamayo", 'H', "Entrenador Principal", 1000, 8, 1));
        miequipo.agregarJugador(new JugadorEntrenador("Emmanuel Romero", 'H', "Principal No 7", 900, 10, 2));
        miequipo.agregarJugador(new JugadorActivo("Refugio Hernandez", 'H', "Principal No 18", 900, 2, 2));
        miequipo.agregarJugador(new JugadorActivo("Roberto Almeida", 'H', "Principal No 9", 900, 3, 1));
        miequipo.agregarJugador(new JugadorActivo("Alejandra Escalona", 'M', "Principal No 21", 900, 3, 3));
        miequipo.agregarJugador(new JugadorActivo("Aarón Reyes", 'H', "Principal No 3", 900, 4, 1));
        miequipo.agregarJugador(new JugadorActivo("Juan Medina", 'H', "Principal No 25", 900, 4, 4));
        miequipo.agregarJugador(new JugadorActivo("Gael Zapata", 'H', "Banca No 20", 300, 5, 3));
        miequipo.agregarJugador(new JugadorActivo("Andrea Solis", 'M', "Principal No 12", 900, 5, 5));
        miequipo.agregarJugador(new JugadorActivo("Marissa Hernandez", 'M', "Principal No 12", 600, 4, 2));
        miequipo.agregarJugador(new JugadorActivo("Diana Soto", 'M', "Principal No 12", 700, 5, 3));
        miequipo.agregarJugador(new JugadorActivo("Benjamin Cuevas", 'H', "Principal No 11", 900, 5, 3));
        miequipo.agregarJugador(new JugadorActivo("Eder Hernandez", 'H', "Principal No 8", 900, 5, 3));
        miequipo.agregarJugador(new JugadorActivo("German Alvarado", 'H', "Principal No 30", 900, 5, 3));
        miequipo.agregarJugador(new JugadorActivo("Ernesto Galvan", 'H', "Principal No 10", 900, 5, 3));
        miequipo.agregarJugador(new JugadorActivo("Andy Juarez", 'H', "Principal No 16", 900, 5, 3));
        miequipo.agregarJugador(new JugadorActivo("Juan Romero", 'H', "Principal No 4", 900, 5, 3));
        miequipo.agregarJugador(new JugadorActivo("Neri Juarez", 'H', "Banca No 77", 300, 5, 2));
        miequipo.reporte();
    }
}