package p118_Calculadora;

public class App {
    public static void main(String[] args) {
        Calculadora maizoro = new Calculadora();
        System.out.print("\033[H\033[2J");

        maizoro.sumar(10, 20);
        maizoro.restar(10, 20);
        maizoro.multiplicar(5, 5);
        maizoro.dividir(10, 2);
    }
    
}
