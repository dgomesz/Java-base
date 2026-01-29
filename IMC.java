package aula2;


import java.util.Scanner;

public class IMC {
    static void main() {



    Scanner sr = new Scanner(System.in);
    System.out.println("digite sua nome");
    String nome = sr.next();

    System.out.println("digite seu peso");
    double peso = sr.nextDouble();

    System.out.println("digite sua altura");
    double altura = sr.nextDouble();

    System.out.println("digite sua idade");
    int idade = sr.nextInt();

    System.out.println("Seu imc é: "+(peso/(altura*altura)));

}

}
