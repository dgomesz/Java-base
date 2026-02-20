package ex2;

public class Conta {
    public double saldo;
    public int conta;
    public int agencia;
    public void sacar(double saque) {
        if (saldo >= saque) {
        saldo = saldo - saque;
            IO.println("saque realizado com sucesso \n seu saldo atual é" + saldo);
        }else {
            IO.println("saldo insulficiente !!");
        }
    }

    public String depositar(double deposito) {
        saldo = saldo + deposito;
        return "seu novo saldo é: " + saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", conta=" + conta +
                ", agencia=" + agencia +
                '}';
    }
}
