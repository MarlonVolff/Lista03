package Exercicio13;

public class Apto {
    public String nome;
    public char sexo;
    public int idade;
    public boolean saude;

    public Apto(String nome, char sexo, int idade, boolean saude) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }

    public boolean estaAptoSM() {
        return idade >= 18 && saude;
    }
}