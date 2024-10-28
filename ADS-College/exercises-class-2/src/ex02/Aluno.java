package ex02;

public class Aluno {
    String nome, curso;
    Avaliacao media;

    public Aluno(String nome, String curso, Avaliacao media) {
        this.nome = nome;
        this.curso = curso;
        this.media = media;
    }

    public void exibir() {
        System.out.println("Aluno:");
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.printf("Media A: %.1f", media.mediaAritmetica());
        System.out.println();
        System.out.printf("Media P: %.1f", media.mediaPonderada());
        System.out.println();
        System.out.println();
    }
}
