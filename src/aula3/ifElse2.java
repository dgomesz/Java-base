package aula3;

import java.security.DrbgParameters;
import java.util.Scanner;

public class ifElse2 {
    static void main() {
        Scanner media = new Scanner(System.in);

        IO.println("digite sua primeira nota");
        double nota = media.nextDouble();

        IO.println("digite sua segundo nota");
        double nota2 = media.nextDouble();

        IO.println("digite sua terceira nota");
        double nota3 = media.nextDouble();

        double mediagg = (nota + nota2 + nota3) / 3;
        IO.println("resultado final:");

        if (mediagg < 4) {
            IO.println("Reprovado");
        } else if (mediagg <= 6) {
            IO.println("recuperação");
        } else
            IO.println("aprovado");
    }
}