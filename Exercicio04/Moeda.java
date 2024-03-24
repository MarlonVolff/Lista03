package Exercicio04;

public class Moeda {
    private double cotacaoDolar;
    private double quantidadeDolares;

    public void CotacaoDolar(double cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }

    public void QuantidadeDolares(double quantidadeDolares) {
        this.quantidadeDolares = quantidadeDolares;
    }

    public double converterParaReal() {
        return quantidadeDolares * cotacaoDolar;
    }
}