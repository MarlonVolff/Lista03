package Exercicio07;
import java.util.Scanner;

public class Exercicio07 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o custo de fábrica do carro: ");
        double custoFabrica = leitor.nextDouble();

        Carro carro = new Carro(custoFabrica);
        double custoConsumidor = carro.calcularCustoConsumidor();
        System.out.println("O custo ao consumidor do carro é: R$" + custoConsumidor);

        leitor.close();
    }
}