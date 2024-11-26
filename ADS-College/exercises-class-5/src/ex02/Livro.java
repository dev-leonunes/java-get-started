package ex02;

public class Livro implements Imprimivel {
    String titulo;
    String autor;
    int numPaginas;
    int anoPublicacao;
    String editora;

    public Livro(String titulo, String autor, int numPaginas, int anoPublicacao, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
    }

    @Override
    public void imprimir() {
        System.out.println("Livro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numPaginas);
        System.out.println("Ano de publicacao: " + anoPublicacao);
        System.out.println("Editora: " + editora);
    }

}
