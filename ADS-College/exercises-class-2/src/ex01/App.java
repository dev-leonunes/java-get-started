package ex01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double n1, n2, n3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira notas: ");
        n1 = scanner.nextDouble();
        System.out.print("Digite a segunda notas: ");
        n2 = scanner.nextDouble();
        System.out.print("Digite a terceira notas: ");
        n3 = scanner.nextDouble();

        int op = 0;
        while (op != 1 && op != 2) {
            System.out.print("Digite 1 para media aritmetica e 2 para media ponderada: ");
            op = scanner.nextInt();

            if (op == 1) {
                System.out.printf("Media aritmetica: %.1f%n", media(n1, n2, n3));
            } else if (op == 2) {
                System.out.printf("Media ponderada: %.1f%n", mediaPonderada(n1, n2, n3));
            } else {
                System.out.print("Opcao invalida");
            }
        }

        scanner.close();
    }

    public static double media(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static double mediaPonderada(double n1, double n2, double n3) {
        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 4;
        return (n1 * peso1 + n2 * peso2 + n3 * peso3) / (peso1 + peso2 + peso3);
    }
}
