public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Screen Match");

        int anoDeLancamento = 2022;
        String filme = "Top Gun - Maverick";
        // System.out.println("Filme: " + filme);
        // System.out.println("Ano de Lançamento: " + anoDeLancamento);

        double mediaDeAvaliacoes = (9.8 + 6.3 + 8.0) / 3;
        // System.out.println(mediaDeAvaliacoes);

        String sinopse = "Filme de aventura com Galã dos anos 80";
        // System.out.println(sinopse);

        // Mudando todas os Outprints para um textblock com o método format()
        String mensagem = """
                Filme: %s
                Ano de Lançamento: %d
                Nota: %.2f
                Sinopse: %s.
                """.formatted(filme, anoDeLancamento, mediaDeAvaliacoes, sinopse);

        System.out.println(mensagem);
    }
}
