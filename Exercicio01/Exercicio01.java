package Exercicio01;

import java.util.Scanner;

public class Exercicio01{
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Informe o nome do aluno: ");
        aluno.Nome = leitor.nextLine();

        System.out.print("Informe a nota da primeira prova: ");
        aluno.Nota1 = leitor.nextDouble();

        System.out.print("Informe a nota da segunda prova: ");
        aluno.Nota2 = leitor.nextDouble();

        System.out.print("Informe a nota da terceira prova: ");
        aluno.Nota3 = leitor.nextDouble();

        System.out.println("Nome do aluno: " + aluno.Nome());
        System.out.println("Média do aluno: " + aluno.CalcMedia());

        leitor.close();
    }
}