package Exercicio08;
import java.util.Scanner;

public class Exercicio08 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Estudante estudante = new Estudante();

        System.out.print("Informe o nome do aluno: ");
        estudante.nome = leitor.nextLine();

        System.out.print("Informe a primeira nota: ");
        estudante.nota1 = leitor.nextDouble();
        System.out.print("Informe a segunda nota: ");
        estudante.nota2 = leitor.nextDouble();
        System.out.print("Informe a terceira nota: ");
        estudante.nota3 = leitor.nextDouble();

        System.out.println("Nome do aluno: " + estudante.getNome());
        System.out.println("Media: " + estudante.calMedia());
        System.out.println("Menção: " + estudante.Mencao());

        leitor.close();
    }
}