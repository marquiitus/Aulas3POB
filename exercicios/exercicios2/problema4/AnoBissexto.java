/*Exercício 4: Verificação de Ano Bissexto
Descrição:
Desenvolva um programa que leia um ano e verifique se ele é bissexto ou não,
utilizando if-else.

Critérios para ser bissexto:
• Deve ser divisível por 4.
• Se for divisível por 100, deve também ser divisível por 400.*/

package exercicios.exercicios2.problema4;

import java.util.Scanner;

public class AnoBissexto {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite um ano:");  //pedindo o ano ao usuário
    int ano = entrada.nextInt();

    if(ano%4==0 || (ano%100==0 && ano%400==0)) {  //fazendo a verificação e imprimindo o resultado

      System.out.println("O ano é bissexto!");
    } else {

      System.out.println("O ano NÃO é bissexto!");
    }

    entrada.close();
  }
}