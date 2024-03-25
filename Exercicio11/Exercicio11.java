package Exercicio11;
import java.util.Scanner;

public class Exercicio11 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Quantidade qtd = new Quantidade();
        int mulher = 0;
        int homem = 0;

        for (int i = 0; i < 56; i++) {
            System.out.println("Digite o sexo: ");
            String sexo = leitor.next();
            sexo.toUpperCase();

            if (sexo == "h") {
                System.out.println("Homem");
                homem++;
            }else if (sexo == "m") {
                System.out.println("Mulher");
                mulher++;  
            }
        }
        System.out.println("Qtd Homens: " + homem);
        System.out.println("Qtd Mulher: " + mulher);
    }
}
