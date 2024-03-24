package Exercicio06;
import java.util.Scanner;

public class Exercicio06 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.print("Digite o preço de custo do produto: ");
        produto.precoCusto = leitor.nextDouble();

        System.out.print("Digite o percentual de acréscimo (%): ");
        produto.percentualAcrescimo = leitor.nextDouble();

        produto.precoVenda = produto.calcularPrecoVenda();
        System.out.println("O preço de venda do produto é: R$" + produto.precoVenda);

        leitor.close();
    }
}