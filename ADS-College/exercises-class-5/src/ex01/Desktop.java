package ex01;

public class Desktop extends Computador {
    double acessorios;

    public Desktop(int gbMemoria, int numProcessadores, double acessorios) {
        super(gbMemoria, numProcessadores);
        this.acessorios = acessorios;
    }

    @Override
    double calculaValor() {
        return acessorios + (gbMemoria * 200) + (numProcessadores * 400);
    }
}
