package p113_SegundoExamenParcial;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private String liga;
    private List<Jugador> jugadores;

    public Equipo() {
        this.jugadores = new ArrayList<>();
    }

    public Equipo(String nombre, String liga) {
        this.nombre = nombre;
        this.liga = liga;
        this.jugadores = new ArrayList<>();
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public double getTotalBono() {
        return jugadores.stream().mapToDouble(Jugador::getBono).sum();
    }

    public double getTotal() {
        return jugadores.stream().mapToDouble(Jugador::getTotal).sum();
    }

    public int getTotalH() {
        return (int) jugadores.stream().filter(j -> j.getSexo() == 'H').count();
    }

    public int getTotalM() {
        return (int) jugadores.stream().filter(j -> j.getSexo() == 'M').count();
    }

    public void reporte() {
        System.out.println("Datos del equipo:");
        System.out.println(this);
        for (Jugador jugador : jugadores) {
            System.out.println(">> " + jugador);
        }
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", liga='" + liga + '\'' +
                ", jugadores=" + jugadores.size() +
                ", totalBono=" + getTotalBono() +
                ", total=" + getTotal() +
                ", totalHombres=" + getTotalH() +
                ", totalMujeres=" + getTotalM() +
                '}';
    }
}