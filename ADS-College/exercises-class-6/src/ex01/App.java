package ex01;

public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta("Joao", 1000);
        Conta c2 = new Conta("Maria", 2000);

        System.out.println("Saldo de " + c1.getNome() + ": " + c1.getSaldo());
        System.out.println("Saldo de " + c2.getNome() + ": " + c2.getSaldo());

        c1.depositar(1000);
        c1.sacar(200);
        c1.transferir(c2, 300);

        System.out.println("Saldo de " + c1.getNome() + ": " + c1.getSaldo());
        System.out.println("Saldo de " + c2.getNome() + ": " + c2.getSaldo());

        c2.depositar(-100);
        c2.sacar(-200);
        c2.transferir(c2, -10);
        c2.sacar(3000);
        c2.transferir(c1, 5000);
    }
}
