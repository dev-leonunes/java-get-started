package ex02;

public class IngressoVip extends Ingresso {
    public double adicional;

    public IngressoVip(String nomeEvento, double valor, double adicional) {
        super(nomeEvento, valor);
        this.adicional = adicional;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Valor do ingresso VIP: R$" + (super.valor + this.adicional));
    }
}
