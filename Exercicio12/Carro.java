package Exercicio12;

public class Carro {
    public int ano;

    public Carro(int ano) {
        this.ano = ano;
    }

    public double calDesconto() {
        if (ano <= 2000) {
            return 0.12;
        } else {
            return 0.07;
        }
    }
}