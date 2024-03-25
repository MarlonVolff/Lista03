package Exercicio09;
import java.util.Scanner;

public class Exercicio09 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        int contador = 0;
        for (int i = 0; i < 80; i++) {
            System.out.println("Informe um número: ");
            int numero = leitor.nextInt();

            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }
        System.out.println("Quantidade de números entre 10 e 150: " + contador);
        leitor.close();
    }
}