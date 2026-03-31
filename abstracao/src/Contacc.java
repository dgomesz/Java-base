public class Contacc extends Conta {

    public Contacc(float numero, String agencia, String titular, float saldo) {
        super(numero, agencia, titular, saldo);
    }

    public Contacc() {
    }

    @Override
    public void calcularTarifaMensal() {
        IO.println( "seu saldo atual da CONTA CORRENTE é: "  + exibirSaldo());
                setSaldo(getSaldo() - 12);
        IO.println("sua tafrifa foi debitada da sua, seu saldo é: " + exibirSaldo());
    }
}
