package Exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Automovel automovel = new Automovel();

        System.out.print("Digite a distancia total percorrida: ");
        automovel.distanciaP = leitor.nextDouble();
        System.out.print("Digite o total de combustivel gasto: ");
        automovel.combustivelGasto = leitor.nextDouble();

        double consumoMedio = automovel.ConsumoMedio();
        System.out.println("O consumo medio do automóvel é: " + consumoMedio + " km/l");

        leitor.close();
    }
}