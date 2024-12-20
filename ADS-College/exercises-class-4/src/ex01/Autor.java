package ex01;

public class Autor {
    private String nome;
    private String email;
    private String nacionalidade;

    public Autor(String nome, String email, String nacionalidade) {
        this.nome = nome;
        this.email = email;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void info() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Nacionalidade: " + nacionalidade);
    }
}
