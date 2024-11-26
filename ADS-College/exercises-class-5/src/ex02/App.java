package ex02;

public class App {
    public static void main(String[] args) {
        Livro livro = new Livro("O Senhor dos Aneis", "J.R.R. Tolkien", 1000, 1954, "HarperCollins");
        Jogo jogo = new Jogo("The Legend of Zelda: Breath of the Wild", "Nintendo", "Nintendo Switch", 2017, 10);

        livro.imprimir();
        System.out.println();
        jogo.imprimir();
    }
}
