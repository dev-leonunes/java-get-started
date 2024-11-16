package ex02;

public class App {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso("Show do Metallica", 500.0);
        IngressoVip ingressoVip = new IngressoVip(ingresso.nomeEvento, ingresso.valor, 200.0);

        ingresso.imprimir();
        System.out.println();
        ingressoVip.imprimir();
    }
}
