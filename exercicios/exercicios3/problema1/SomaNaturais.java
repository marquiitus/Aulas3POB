/*Exercício 1: Soma dos N primeiros números naturais
Descrição:
Crie um programa que solicite ao usuário um número N e utilize um loop for
para calcular a soma dos primeiros N números naturais.

Requisitos:
• O programa deve utilizar um contador para iterar de 1 até N.
• Deve utilizar um acumulador para somar os valores sucessivos.
• Ao final, exibir a soma total.*/

import java.util.Scanner;

public class SomaNaturais {
  
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.println("Entre com um número N: ");  //pedindo o número ao usuário
    int num = entrada.nextInt();

    int soma=0;
    for(int i=1; i<=num; i++) {  //realizando o loop

      soma += i;
    }

    System.out.println("O resultado da soma é: " + soma);  //exibindo o resultado

    entrada.close();
  }
}