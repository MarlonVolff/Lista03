package Exercicio15;

public class Carango {
    private double valor;
    private String combustivel;

    public Carango(double valor, String combustivel) {
        this.valor = valor;
        this.combustivel = combustivel;
    }

    public double calDesconto() {
        if (combustivel.equalsIgnoreCase("álcool")) {
            return valor * 0.25; 
        } else if (combustivel.equalsIgnoreCase("gasolina")) {
            return valor * 0.21;
        } else if (combustivel.equalsIgnoreCase("diesel")) {
            return valor * 0.14;
        } else {
            return 0;
        }
    }

    public double calValorPago() {
        return valor - calDesconto();
    }
}