// DESAFIO 1

// A ideia é controlarmos nossa conta bancária virtual e nomearemos os métodos como
// recebeTransferencia(), fazTransferencia(), enviaPix() ou recebePix(), por exemplo.
// Mas poderemos nomear como acharmos melhor.

// A proposta é iniciarmos os dados do cliente como um extrato, e em seguida, teremos
// quatro opções de operações com a linha para inserir a opção desejada.

package challenge;

import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {
        String nome = "Peter Parker";
        String tipoConta = "Corrente";
        double saldo = 0.0;
        int op = 0;

        System.out.println("""
                **************************
                Dados iniciais do cliente:

                Nome: %s
                Tipo conta: %s
                Saldo inicial: %.2f
                **************************
                    """.formatted(nome, tipoConta, saldo));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    Menu:

                    1. Consultar saldo
                    2. Receber valor
                    3. Transferir valor
                    4. Sair
                    """);

            System.out.print("Entre com a opção desejada: ");
            op = scanner.nextInt();

            if (op == 1) {
                consultarSaldo(saldo);
                continue;
            } else if (op == 2) {
                System.out.print("Entre com o valor a ser depositado: ");
                double valor = scanner.nextDouble();
                saldo = depositar(saldo, valor);
                continue;
            } else if (op == 3) {
                System.out.print("Entre com o valor a ser transferido: ");
                double valor = scanner.nextDouble();
                saldo = transferir(saldo, valor);
                continue;
            } else if (op == 4) {
                System.err.println("Encerrando o programa...");
                break;
            } else {
                System.out.println("\nOpção inválida\n");
                continue;
            }

        }
        scanner.close();

    }

    private static void consultarSaldo(double saldoAtual) {
        System.out.printf("\nO Saldo atual da conta é: %.2f\n\n", saldoAtual);
    }

    private static double depositar(double saldoAtual, double valor) {
        if (valor <= 0) {
            System.out.println("\nO Valor do depósito deve ser maior que zero!\n");
            return saldoAtual;
        }

        saldoAtual += valor;
        System.out.println("\nDepósito realizado com sucesso!\n");
        return saldoAtual;
    }

    private static double transferir(double saldoAtual, double valor) {
        if (valor > saldoAtual) {
            System.out.println("\nNão há saldo suficiente para realizar a transferência.\n");
            return saldoAtual;
        }
        saldoAtual -= valor;
        System.out.println("\nTransferência realizada com sucesso!\n");
        return saldoAtual;
    }
}
