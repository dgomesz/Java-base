public abstract class Conta {
    private float numero;
    private String agencia;
    private String titular;
    private double saldo;

    public Conta() {

    }


//    public void receberDano(int dano) {
//        vida = vida - dano;
//        IO.println("A vida é: " + vida);
//    }
//
//    public void mostrarStatus() {
//        IO.println("Nome: " + nome  +" A vida é: " + vida + "  O Ataque é: " + ataque + " A defesa é:  " + defesa);
//    }


    public void depositar(double valor) {
        saldo = saldo + valor;
        IO.println("deposito feito com sucesso " + " seu saldo é " + saldo);

    }

    public void sacar(double valor) {
        saldo = saldo - valor;
        IO.println("saque feito com sucesso " + " seu saldo é " + exibirSaldo());

    }

    public double exibirSaldo() {
        return saldo;

    }

    public abstract void calcularTarifaMensal();


    public Conta(float numero, String agencia, String titular, float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }

    public float getNumero() {
        return numero;
    }

    public void setNumero(float numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}







