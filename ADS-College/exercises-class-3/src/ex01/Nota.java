package ex01;

public class Nota {
    private double nota1;
    private double nota2;
    private int faltas;

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getFaltas() {
        return faltas;
    }

    public void setNota1(double nota1) {
        if (nota1 < 0 || nota1 > 10) {
            System.out.println("Nota inválida");
            return;
        }
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        if (nota1 < 0 || nota1 > 10) {
            System.out.println("Nota inválida");
            return;
        }
        this.nota2 = nota2;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public void resultado() {
        double media = (this.nota1 + this.nota2) / 2;
        System.out.println("Média: " + media);
        System.out.println("Faltas: " + faltas);

        if (faltas > 7) {
            System.out.println("Reprovado por faltas");
            System.out.println();
        } else if (media >= 7) {
            System.out.println("Aprovado");
            System.out.println();
        } else if (media >= 4) {
            System.out.println("Exame Final");
            double precisaTirar = 6;
            System.out.println("Precisa tirar " + precisaTirar + " no exame final");
            System.out.println();
        } else {
            System.out.println("Reprovado");
            System.out.println();
        }
    }

}
