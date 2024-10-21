package p116_Juego;

public class App {
    public static void main(String[] args) {

        JuegoDados miDados = new JuegoDados();
        System.out.print("\033[H\033[2J");

        miDados.iniciar();
        miDados.jugar();
        miDados.finalizar();
    

        System.out.println("\nJuego de adivinar número ...");
        JuegoAdivina juego2 = new JuegoAdivina();
        juego2.iniciar();
        juego2.jugar();
        juego2.finalizar();
    }
}

