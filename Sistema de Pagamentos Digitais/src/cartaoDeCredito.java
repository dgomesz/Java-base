import java.util.Scanner;

public class cartaoDeCredito extends Pagamento{
    void pagar(double valor){
        Scanner sc = new Scanner(System.in);

        IO.println("Opções");
        IO.println("1 - Pagamento a vista");
        IO.println("2 - 2x sem juros");
        IO.println("3 - 3x sem juros");
        int escolha = sc.nextInt();
        if(escolha == 1){
            IO.println("Seu pagamento " + valor + "foi realizado a vista ");
            
        } else if (escolha == 2) {
            IO.println("seu pagamento " + valor + "foi realizado em 2x sem juros");
        } else {
            IO.println("seu pagamento" + valor + "foi realizado em 3x sem juros");
        }
    }
}
