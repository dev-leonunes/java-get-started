package ex01;

public class App {
    public static void main(String[] args) {
        Autor a = new Autor("J. R. R. Tolkien", "tolkien@email.com", "Inglês");
        LivroDigital ld = new LivroDigital("O Senhor dos Anéis", a, "Fantasia", 1, 1000, 10.5);
        LivroFisico lf = new LivroFisico("O Hobbit", a, "Fantasia", 1, 1000, 10);
        ld.info();
        lf.info();
    }
}
