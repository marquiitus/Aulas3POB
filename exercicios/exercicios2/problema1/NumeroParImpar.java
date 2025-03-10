/*Crie um programa que solicite um número inteiro ao usuário e determine se ele é
par ou ímpar, utilizando a estrutura if-else.

Requisitos:
• O programa deve ler um número inteiro.
• Se o número for divisível por 2, exibir "O número é par."
• Caso contrário, exibir "O número é ímpar.".*/

import java.util.Scanner;

public class NumeroParImpar {

  public static void main(String[] args) {


    Scanner entrada = new Scanner(System.in);
    System.out.println("\n\nEntre com um número inteiro: ");  //pedindo ao usuário
    int num = entrada.nextInt();

    if(num%2==0) {  //verificando se o número é par ou ímpar

      System.out.println("\nO número é par!");
    } else {

      System.out.println("\nO número é ímpar!");
    }

    entrada.close();
  }
}