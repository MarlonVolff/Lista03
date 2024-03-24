package Exercicio01;

public class Aluno{

    public String Nome;
    public Double Nota1;
    public Double Nota2;
    public Double Nota3;

    // public Aluno(String nome, String Nota1, String Nota2, String Nota3){
    //     this.Nome = nome;
    //     this.Nota1 = nota1;
    //     this.Nota2 = nota2;
    //     this.Nota3 = nota3;
    // }

    public double CalcMedia(){
        double nota1 = Nota1;
        double nota2 = Nota2;
        double nota3 = Nota3;
        return (nota1 + nota2 + nota3) / 3;
    }

    public String Nome(){
        return Nome;
    }
}