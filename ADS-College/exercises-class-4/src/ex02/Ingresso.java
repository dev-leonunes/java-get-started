package ex02;

public class Ingresso {
    public String nomeEvento;
    public double valor;

    public Ingresso(String nomeEvento, double valor) {
        this.nomeEvento = nomeEvento;
        this.valor = valor;
    }

    public void imprimir() {
        System.out.println("Ingresso para o evento: " + this.nomeEvento);
        System.out.println("Valor do ingresso: R$" + this.valor);
    }

    public void ingresso() {
        System.out.println("Ingresso para o evento: " + this.nomeEvento);
    }
}
