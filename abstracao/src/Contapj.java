public class Contapj extends Conta {

    public Contapj(float numero, String agencia, String titular, float saldo) {
        super(numero, agencia, titular, saldo);
    }

    public Contapj() {
    }

    @Override
    public void calcularTarifaMensal() {
        IO.println("seu saldo atual de PESSOA JURIDICA é: " + exibirSaldo());
        setSaldo(getSaldo() - 20);
        IO.println("sua tarifa foi debitada da conta: " + exibirSaldo());

    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor + 1.50);
        calcularTarifaMensal();
    }
}


