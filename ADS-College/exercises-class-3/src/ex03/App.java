package ex03;

public class App {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Ciência da Computação", 1000.0);
        curso1.descrever();

        Aluno aluno1 = new Aluno("João", 123, 0.1, curso1);
        aluno1.descrever();
    }
}
