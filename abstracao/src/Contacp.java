public class Contacp extends Conta {
    public Contacp(float numero, String agencia, String titular, float saldo) {
        super(numero, agencia, titular, saldo);
    }

    public Contacp() {
    }

    @Override
    public void calcularTarifaMensal() {
        setSaldo(getSaldo());
        IO.println("Conta POUPANÇA não tarifada: " + exibirSaldo());


    }



}
