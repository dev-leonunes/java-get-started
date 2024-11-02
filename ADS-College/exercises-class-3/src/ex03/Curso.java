package ex03;

public class Curso {
    private String nome;
    private double mensalidade;

    public Curso(String nome, double mensalidade) {
        this.setNome(nome);
        this.setMensalidade(mensalidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public void descrever() {
        System.out.println("Nome: " + this.getNome() +
                "\nMensalidade: " + this.getMensalidade());
        System.out.println("===================================");
    }

}
