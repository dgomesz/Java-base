static void main() {

    Contacc contacc = new Contacc();
    contacc.exibirSaldo();
    contacc.setSaldo(2000);
    contacc.calcularTarifaMensal();
    contacc.sacar(1000);
    contacc.exibirSaldo();


    Contacp contacp = new Contacp();
    contacp.exibirSaldo();
    contacp.setSaldo(4500);
    contacp.calcularTarifaMensal();
    contacp.sacar(300);
    contacp.exibirSaldo();

    Contapj contapj = new Contapj();
    contapj.exibirSaldo();
    contapj.setSaldo(7000);
    contapj.calcularTarifaMensal();
    contapj.sacar(2000);
    contapj.exibirSaldo();

}