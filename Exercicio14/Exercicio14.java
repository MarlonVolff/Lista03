package Exercicio14;
import java.util.Scanner;

public class Exercicio14 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        double somaCusto = 0;
        double somaVenda = 0;
        
        for (int i = 0; i < 40; i++) {
            System.out.println("Informe o Produto " + (i + 1) + ":");
            System.out.print("Preço de custo: R$");
            double custo = leitor.nextDouble();
            System.out.print("Preço de venda: R$");
            double venda = leitor.nextDouble();

            if (venda > custo) {
                System.out.println("Produto " + (i + 1) + ": Lucro");
            } else if (venda < custo) {
                System.out.println("Produto " + (i + 1) + ": Prejuízo");
            } else {
                System.out.println("Produto " + (i + 1) + ": Empate");
            }
            somaCusto += custo;
            somaVenda += venda;
        }
        
        double mediaCusto = somaCusto / 40;
        double mediaVenda = somaVenda / 40;

        System.out.println("Média de custo: " + mediaCusto);
        System.out.println("Média de venda: " + mediaVenda);

        leitor.close();
    }
}