package ex04;

import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> moedas = new ArrayList<Moeda>();

    public void adicionar(Moeda m) {
        this.moedas.add(m);
    }

    public double calcularTotal() {
        double total = 0;
        for (Moeda m : this.moedas) {
            total += m.getValor();
        }
        return total;
    }
}
