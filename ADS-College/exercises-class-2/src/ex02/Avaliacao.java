package ex02;

public class Avaliacao {
    double n1, n2, n3;

    Avaliacao(double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public double mediaAritmetica() {
        return (n1 + n2 + n3) / 3;
    }

    public double mediaPonderada() {
        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 4;
        return (n1 * peso1 + n2 * peso2 + n3 * peso3) / (peso1 + peso2 + peso3);
    }
}
