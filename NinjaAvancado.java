package Desafios.Desafio04;

public class NinjaAvancado extends NinjaBasico implements Ninja{


    String especialidade;


    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome do ninja: " + nome);
        System.out.println("Idade do ninja: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialidade: " + especialidade);

    }

    @Override
    public void executarHabilidade() {
        System.out.println("Eu sou " + nome + " e estou ativando " + especialidade + "!");
    }

    public NinjaAvancado(String nome, int idade, Tipohabilidade habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }
}
