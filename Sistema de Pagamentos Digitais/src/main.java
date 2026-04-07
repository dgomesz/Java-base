void main() {
    cartaoDeCredito cartãoCredito = new cartaoDeCredito();
    cartãoCredito.pagar(1000);
    IO.println("============================");


    cartaoDebito cartãoDebito = new cartaoDebito();
    cartãoDebito.pagar(1000);
    IO.println("============================");


    Pix pix = new Pix();
    pix.pagar(280);
    IO.println("============================");


    Boleto boleto = new Boleto();
    boleto.pagar(3000);
    IO.println("============================");
}

