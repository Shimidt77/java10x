package Desafios.Desafio04;

public class NinjaBasico implements Ninja {

    String nome;
    int idade;
    Tipohabilidade habilidade;

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome do ninja: " + nome);
        System.out.println("Idade do ninja: " + idade);
        System.out.println("Habilidade: " + habilidade);

    }
    @Override
    public void executarHabilidade() {
        System.out.println("Eu sou um ninja básico não tenho habilidade especial!");
    }

    public NinjaBasico(String nome, int idade, Tipohabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }
}
