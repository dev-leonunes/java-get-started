package ex02;

public class App {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joao", "Engenharia", new Avaliacao(9, 10, 7));
        Aluno a2 = new Aluno("Maria", "Medicina", new Avaliacao(8, 9, 10));

        a1.exibir();
        a2.exibir();
    }
}
