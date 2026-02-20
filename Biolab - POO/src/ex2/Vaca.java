package ex2;

public class Vaca {
    public String nome;
    private String leite;
    public int filhos;


    public Vaca() {

    }

    public int bezerros(int filhos){
        filhos = filhos + filhos;
        return filhos;
    }

    public Vaca(String nome, String leite, int filhos) {
        this.nome = nome;
        this.leite = leite;
        this.filhos = filhos;

    }

    @Override
    public String toString() {
        return "Vaca{" +
                "nome='" + nome + '\'' +
                ", leite='" + leite + '\'' +
                ", filhos=" + filhos +
                '}';
    }
}