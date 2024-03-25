import java.util.Scanner;

public class Exercicio12 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        int total2000 = 0;
        int totalCarros = 0;

        while (true) {
            System.out.print("Informe o ano do carro: ");
            int ano = leitor.nextInt();

            Carro carro = new Carro(ano);
            double desconto = carro.calDesconto();
            double valorOriginal = 30000;

            double valorD = valorOriginal * desconto;
            double valorF = valorOriginal - valor;

            System.out.println("Desconto aplicado: " + (desconto * 100) + "%");
            System.out.println("Valor do desconto: R$" + valorD);
            System.out.println("Valor a ser pago: R$" + valorF);

            totalCarros++;
            if (ano <= 2000) {
                total2000++;
            }

            System.out.print("Deseja continuar calculando desconto? (S/N): ");
            String continuar = leitor.next();
            if (!continuar.Case("S")) {
                break;
            }
        }

        System.out.println("Total de carros com ano até 2000: " + total2000);
        System.out.println("Total geral de carros: " + totalCarros);

        leitor.close();
    }
}