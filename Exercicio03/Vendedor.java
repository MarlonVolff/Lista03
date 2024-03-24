package Exercicio03;

public class Vendedor {
    public String nome;
    public double salarioFixo;
    public double totalVendas;

    // public Vendedor(String nome, double salarioFixo, double totalVendas) {
    //     this.nome = nome;
    //     this.salarioFixo = salarioFixo;
    //     this.totalVendas = totalVendas;
    // }

    public double calSalarioF() {
        return salarioFixo + (totalVendas * 0.15);
    }

    public void SalarioFinal() {
        System.out.println("\nNome do vendedor: " + nome);
        System.out.println("Salário no final do mês: " + calSalarioF());
    }
}
