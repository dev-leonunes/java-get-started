package ex02;

public class Jogo implements Imprimivel {
    String nome;
    String desenvolvedora;
    String plataforma;
    int anoLancamento;
    int notaGeral;

    public Jogo(String nome, String desenvolvedora, String plataforma, int anoLancamento, int notaGeral) {
        this.nome = nome;
        this.desenvolvedora = desenvolvedora;
        this.plataforma = plataforma;
        this.anoLancamento = anoLancamento;
        this.notaGeral = notaGeral;
    }

    @Override
    public void imprimir() {
        System.out.println("Jogo: " + nome);
        System.out.println("Desenvolvedora: " + desenvolvedora);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Ano de lancamento: " + anoLancamento);
        System.out.println("Nota geral: " + notaGeral);
    }
}
