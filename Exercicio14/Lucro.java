package Exercicio14;

public class Lucro {
    public double somaCusto;
    public double somaVenda;

    public Lucro(double somaCusto, double somaVenda) {
        this.somaCusto = somaCusto;
        this.somaVenda = somaVenda;
    }

    public double getSomaCusto() {
        return this.somaCusto;
    }

    public void setSomaCusto(double somaCusto) {
        this.somaCusto = somaCusto;
    }

    public double getSomaVenda() {
        return this.somaVenda;
    }

    public void setSomaVenda(double somaVenda) {
        this.somaVenda = somaVenda;
    }
}