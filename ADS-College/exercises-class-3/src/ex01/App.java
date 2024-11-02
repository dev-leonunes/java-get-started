package ex01;

public class App {
    public static void main(String[] args) {
        Nota aluno1 = new Nota();
        aluno1.setNota1(6);
        aluno1.setNota2(8);
        aluno1.setFaltas(0);
        aluno1.resultado();

        Nota aluno2 = new Nota();
        aluno2.setNota1(4);
        aluno2.setNota2(9);
        aluno2.setFaltas(4);
        aluno2.resultado();

        Nota aluno3 = new Nota();
        aluno3.setNota1(2);
        aluno3.setNota2(3);
        aluno3.setFaltas(6);
        aluno3.resultado();

        Nota aluno4 = new Nota();
        aluno4.setNota1(5);
        aluno4.setNota2(7);
        aluno4.setFaltas(8);
        aluno4.resultado();
    }
}
