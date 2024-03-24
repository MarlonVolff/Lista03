package Exercicio03;
import java.util.Scanner;

public class Exercicio03 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Vendedor vendedor = new Vendedor();

        System.out.println("Digite o nome do vendedor:");
        vendedor.nome = leitor.nextLine();

        System.out.println("Digite o salário fixo do vendedor:");
        vendedor.salarioFixo = leitor.nextDouble();

        System.out.println("Digite o total de vendas efetuadas pelo vendedor em dinheiro:");
        vendedor.totalVendas = leitor.nextDouble();
        vendedor.SalarioFinal();

        leitor.close();
    }
}