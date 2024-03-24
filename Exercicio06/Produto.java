package Exercicio06;

public class Produto {
    public double precoCusto;
    public double precoVenda;
    public double percentualAcrescimo;

    // public void PrecoCusto() {
    //     this.precoCusto = precoCusto;
    //     this.precoVenda = precoVenda;
    //     this.percentualAcrescimo = percentualAcrescimo;
    // }

    public double calcularPrecoVenda() {
        return precoCusto * (1 + percentualAcrescimo / 100);
    }
}