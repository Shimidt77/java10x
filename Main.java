package Desafios.Desafio04;

public class Main {
    public static void main(String[] args) {

        NinjaBasico rodrigo = new NinjaBasico("Rodrigo Shimidt", 47, Tipohabilidade.NINJUTSU);
        rodrigo.mostrarInformacoes();
        rodrigo.executarHabilidade();

        NinjaAvancado naruto = new NinjaAvancado("Naruto Uzumaki", 16, Tipohabilidade.RINNENGAN, "Shoruken");
        naruto.mostrarInformacoes();
        naruto.executarHabilidade();
    }
}
