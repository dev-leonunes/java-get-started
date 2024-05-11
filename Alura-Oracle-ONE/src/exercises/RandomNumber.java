// Exercício 7

// Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório
// entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas.
// A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou
// menor do que o número gerado.

package exercises;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome the game: Discover the number");

        System.out.println(
                """
                        Rules:
                        1. The number is always between 0 and 100;
                        2. You have 5 attemps;
                        3. With each attempt, the program will tell you if the number is smaller or larger than the guessed number.
                        4. Good luck!
                        """);

        int number = new Random().nextInt(100);
        int countAttemps = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("What number do you think it is?");
            int attemp = scanner.nextInt();

            if (number > attemp) {
                System.out.println("The number is bigger");
            }

            if (number < attemp) {
                System.out.println("the number is smaller");
            }

            if (attemp == number) {
                System.out.println("Congrats you got it right!");
                break;
            }

            countAttemps++;
        }

        if (countAttemps >= 5) {
            System.out.println("The number was %d".formatted(number));
            System.out.println("Try again");
        }

        scanner.close();
    }
}
