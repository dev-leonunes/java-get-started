import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = 0;
        double media = 0;
        int totalDeNotas = 0;

        while (true) {
            System.out.println("Digite uma nota ou -1 pra sair: ");
            nota = scanner.nextDouble();

            if (nota == -1) {
                break;
            }

            media += nota;
            totalDeNotas++;
        }

        if (media == 0) {
            System.out.println("Nenhuma nota fornecida!");
        } else {
            System.out.println("A media das avaliações é: %.2f".formatted(media / totalDeNotas));
        }
        scanner.close();

    }
}
