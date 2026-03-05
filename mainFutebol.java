package Futebol;

public class mainFutebol {

    static void main() {


        clube palmeiras = new clube();
        palmeiras.setNome("palmeiras");

        estadio allianz = new estadio();
        allianz.setNome("allianz");

        jogador flaco = new jogador();
        flaco.setNome("flaco");

        presidente leila = new presidente();
        leila.setNome("leila");

        torcida mancha = new torcida();
        mancha.setNome("mancha");

        treinador abel = new treinador();
        abel.setNome("leila");

        IO.println(palmeiras.getNome() +  allianz.getNome() +  flaco.getNome() +  leila.getNome() +  mancha.getNome() +  abel.getNome());




    }

}
