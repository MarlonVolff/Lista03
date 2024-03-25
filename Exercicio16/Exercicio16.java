package Exercicio16;
import java.util.Scanner;

public class Exercicio16 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        double sl = 1400;

        for (int i = 0; i < 584; i++) {
            System.out.println("Informe o salario do funcionario " + i + " em reais: ");
            double sl = leitor.nextDouble();

            double rt;
            if(sl < 3 * slMinimo){
                rt = sl *0.5;
            }else if(sl >= 3 * slMinimo && sl <= 10 *slMinimo){
                rt = sl * 0.2;
            }else if (sl > 10 * slMinimo && sl <= 20 * slMinimo) {
                rt = sl * 0.15; 
            } else {
                rt = sl * 0.1;
            }
            double novoSalario = sl + rt;

            System.out.println("Novo salario do funcionario: "+ i + ": R$ " + novoSalario);
        }
    leitor.close();
}
}
