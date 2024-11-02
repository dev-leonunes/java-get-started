package ex04;

public class App {
    public static void main(String[] args) {
        Cofrinho c = new Cofrinho();
        c.adicionar(new Moeda(1, "Real"));
        c.adicionar(new Moeda(0.5, "Real"));
        c.adicionar(new Moeda(0.25, "Real"));
        c.adicionar(new Moeda(0.1, "Real"));
        c.adicionar(new Moeda(0.05, "Real"));

        System.out.printf("Total no Cofrinho: %.2f", c.calcularTotal());
    }
}
