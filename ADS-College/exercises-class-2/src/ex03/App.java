package ex03;

public class App {
    public static void main(String[] args) {
        Conta c1 = new Conta(123, "Fulano", 0, 500);
        c1.depositar(400);
        c1.sacar(500);
        c1.depositar(600);
        c1.sacar(1000);
        c1.sacar(200);
        c1.info();

        Conta c2 = new Conta(456, "Ciclano", 0, 1000);
        c2.depositar(1000);
        c2.transferir(c1, 500);

        c2.info();
        c1.info();
    }
}
