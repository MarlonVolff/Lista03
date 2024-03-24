package Exercicio08;

public class Estudante {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    // public Estudante(String nome, double nota1, double nota2, double nota3) {
    //     this.nome = nome;
    //     this.nota1 = nota1;
    //     this.nota2 = nota2;
    //     this.nota3 = nota3;
    // }

    public double calMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String Mencao() {
        double media = calMedia();
        if (media >= 6) {
            return "Aprovado";
        } else if (media >= 5.1) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public String getNome() {
        return nome;
    }
}