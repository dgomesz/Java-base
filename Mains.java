package Zoologico;

public class Mains {
    static void main() {
        Gato gato = new Gato();
        IO.println(gato.fazerSom());

        gato.setCor("laranja");
        gato.setPeso(4);
        gato.setNome("Garfield");


        Vaca vaca = new Vaca ();
        IO.println(vaca.fazerSom());

        vaca.setCor("preta e branco");
        vaca.setNome("margarida");
        vaca.setPeso(15);

        Cachorro cachorro = new Cachorro();
        IO.println(cachorro.fazerSom());

        cachorro.setCor("branca");
        cachorro.setPeso(2);
        cachorro.setNome("Nala");


    }
}
