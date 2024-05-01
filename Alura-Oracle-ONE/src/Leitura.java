import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitura.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = leitura.nextInt();
        leitura.nextLine();

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();

        System.out.println("Digite a nota que você da para esse filme: ");
        double nota = leitura.nextDouble();

        System.out
                .println("Seu nome é %s, sua idade é %d, seu filme favorito é %s e a nota que você atribui a ele é %.2f"
                        .formatted(nome, idade, filme, nota));

        leitura.close();
    }
}