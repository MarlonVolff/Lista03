package Exercicio15;
import java.util.Scanner;

public class Exercicio15 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        double totalDesconto = 0;
        double totalPago = 0;

        while (true) {
            System.out.print("Informe o valor do veículo: R$");
            double valorVeiculo = leitor.nextDouble();

            System.out.print("Informe o tipo de combustível (álcool, gasolina ou diesel): ");
            String combustivel = leitor.next();

            Carango carango = new Carango();
            double desconto = carango.calDesconto();
            double valorPago = carango.calValorPago();

            totalDesconto += desconto;
            totalPago += valorPago;

            System.out.println("Desconto: R$" + desconto);
            System.out.println("Valor a ser pago pelo cliente: R$" + valorPago);
        }

        System.out.println("\nTotal de desconto dado aos clientes: R$" + totalDesconto);
        System.out.println("Total pago pelos clientes: R$" + totalPago);

     leitor.close();
    }
}