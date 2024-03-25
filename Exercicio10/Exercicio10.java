package Exercicio10;
import java.util.Scanner;

public class Exercicio10 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o numero de pessoas: ");
        int numPessoas = leitor.nextInt();

        for (int i = 0; i < numPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = leitor.nextInt();
            Pessoa pessoa = new Pessoa();
            pessoa.verificarIdade();
        }

        leitor.close();
    }
}
