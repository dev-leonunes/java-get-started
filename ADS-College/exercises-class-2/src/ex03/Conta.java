package ex03;

public class Conta {
    int numero;
    String titular;
    private float saldo, limite;

    Conta(int numero, String titular, float saldo, float limite) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }

    public boolean sacar(float valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
            return false;
        } else if (valor > this.limite) {
            System.out.println("Limite excedido");
            return false;
        } else if (valor <= 0) {
            return false;
        }

        this.saldo -= valor;
        System.out.println("Saque efetuado com sucesso");
        return true;
    }

    public boolean depositar(float valor) {
        if (valor <= 0) {
            return false;
        }

        this.saldo += valor;
        System.out.println("Deposito efetuado com sucesso");
        return true;
    }

    public boolean transferir(Conta destino, float valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
            return false;
        } else if (valor > this.limite) {
            System.out.println("Limite excedido");
            return false;
        } else if (valor <= 0) {
            System.out.println("Transferencia nao efetuada");
            return false;
        }

        this.saldo -= valor;
        destino.saldo += valor;
        System.out.println("Transferencia efetuada com sucesso");
        return true;
    }

    public void info() {
        System.out.println();
        System.out.println("Numero: " + this.numero);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
        System.out.println();
    }

}
