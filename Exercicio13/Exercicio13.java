package Exercicio13;
import java.util.Scanner;

public class Exercicio13 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o número de pessoas: ");
        int qtPessoas = leitor.nextInt();

        int totalAptos = 0;
        int totalInaptos = 0;

        for (int i = 0; i < qtPessoas; i++) {
            System.out.println("Dados da pessoa: " + (i + 1));
            System.out.print("Nome: ");
            String nome = leitor.next();

            System.out.print("Sexo (M/F): ");
            char sexo = leitor.next().charAt(0);

            System.out.print("Idade: ");
            int idade = leitor.nextInt();

            System.out.print("Saúde (S/N): ");
            boolean saude = leitor.nextBoolean();

            Apto apto = new Apto(nome, sexo, idade, saude);
            if (apto.estaAptoSM()) {
                System.out.println("Apto para o serviço militar obrigatório.");
                totalAptos++;
            } else {
                System.out.println("Não apto para o serviço militar obrigatório.");
                totalInaptos++;
            }
        }

        System.out.println("\nTotal de pessoas aptas: " + totalAptos);
        System.out.println("Total de pessoas inaptas: " + totalInaptos);

        leitor.close();
    }
}