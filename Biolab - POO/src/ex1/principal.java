package ex1;

import java.util.Scanner;

public class principal {
    static void main() {
        Scanner sc = new Scanner(System.in);
        IO.println("digite o nome");
         String nome = sc.next();
        IO.println("digite a idade");
         int idade = sc.nextInt();
        IO.println("digite o sexo");
         String sexo = sc.next();
        IO.println("digite sua raça");
         String raca = sc.next();

        cachorro gato = new cachorro(nome,sexo,raca,idade);



    }
}
