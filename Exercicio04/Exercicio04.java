package Exercicio04;
import java.util.Scanner;

public class Exercicio04{
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Moeda conversor = new Moeda();

        System.out.print("Informe a cotação do dólar: ");
        conversor.CotacaoDolar(leitor.nextDouble());

        System.out.print("Informe a quantidade de dólares disponíveis: ");
        conversor.QuantidadeDolares(leitor.nextDouble());

        double valorReal = conversor.converterParaReal();
        System.out.println("O valor em reais é: R$" + valorReal);

        leitor.close();
    }
}