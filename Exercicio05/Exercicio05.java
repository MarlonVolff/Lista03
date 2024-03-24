package Exercicio05;
import java.util.Scanner;

public class Exercicio05 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        Compra compra = new Compra();

        System.out.print("Digite o valor da compra: ");
        compra.valorCompra = leitor.nextDouble();

        compra.valorCompra = compra.calcularPrestacoes();
        System.out.println("O valor de cada prestação é: R$" + compra.valorCompra);

        leitor.close();
    }
}