package ex01;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Computador> computadores = new ArrayList<>(3);
        computadores.add(new Notebook(8, 4, 15));
        computadores.add(new Desktop(16, 8, 200));
        computadores.add(new Notebook(16, 8, 17));

        for (Computador computador : computadores) {
            System.out.println(computador.calculaValor());
        }
    }
}
