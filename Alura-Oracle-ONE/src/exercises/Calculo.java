// Exercício 2 e 3

// 2. Crie um menu que oferece duas opções ao usuário: "1. Calcular área do
// quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário
// e realize o cálculo da área com base na opção selecionada.

// 3. Crie um programa que solicite ao usuário um número e calcule o fatorial
// desse número.

package exercises;

import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                """
                        Opções:
                        1. Calcular área do quadrado;
                        2. Calcular área do círculo;
                        3. Cacular fatorial;
                        0. Encerrar o programa;
                        """);

        System.out.println("Entre com a opção desejada.");
        int op = scanner.nextInt();

        if (op == 0) {
            System.out.println("Encerrando o programa...");
        } else if (op == 1) {
            System.out.println("Entre com a medida do lado do quadrado em cm");
            int l = scanner.nextInt();
            int a = square(l);
            System.out.println("\nA área do quadrado de lado %dcm é: %dcm\n".formatted(l, a));
            main(args);
        } else if (op == 2) {
            System.out.println("Entre com o raio do círculo");
            double r = scanner.nextDouble();
            double a = circle(r);
            System.out.println("\nA área do quadrado de lado %.2f é: %.2f\n".formatted(r, a));
            main(args);
        } else if (op == 3) {
            System.out.println("Entre com o número para cálculo da fatorial");
            int n = scanner.nextInt();
            int fatorial = factorial(n);
            System.out.println("\nO fatorial de %d é: %d\n".formatted(n, fatorial));
            main(args);
        } else {
            System.out.println("\nOpção inválida\n");
            main(args);
        }

        scanner.close();
    }

    private static int square(int a) {
        return a * a;
    }

    private static double circle(double r) {
        return r * r * Math.PI;
    }

    private static int factorial(int x) {
        if (x == 0) {
            return 1;
        }
        return x * factorial(x - 1);
    }
}