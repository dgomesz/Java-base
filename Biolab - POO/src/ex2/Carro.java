package ex2;

public class Carro {
    public String cor;
    private String modelo;
    private double velocidade;

    public void som(){
        IO.println("vruummm");
    }
    public Carro(){

    }

    public Carro(String cor, String modelo, double velocidade) {
        this.cor = cor;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }
}
