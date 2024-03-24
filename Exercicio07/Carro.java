package Exercicio07;

public class Carro {

    public double custoFabrica;

    public Carro(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public double calcularCustoConsumidor() {
        double impostos = custoFabrica * 0.45;
        double custoDistribuidor = (custoFabrica + impostos) * 0.28;
        return custoFabrica + impostos + custoDistribuidor;
    }
}