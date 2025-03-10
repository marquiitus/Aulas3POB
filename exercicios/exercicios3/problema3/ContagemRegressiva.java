/*Exercício 3: Contagem regressiva usando do-while
Descrição:
Crie um programa que solicite um número ao usuário e faça uma contagem
regressiva até 0, utilizando um loop do-while.

Requisitos:
• O programa deve solicitar um número inteiro positivo ao usuário.
• Utilizar um contador decrescente para reduzir o valor até 0.
• Exibir os números da contagem regressiva um por um.*/

package exercicios3.problema3;

import java.util.Scanner;

public class ContagemRegressiva {
  
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.println("Entre com um número inteiro positivo: ");
    int num = entrada.nextInt();

    int contador = num;
    
    System.out.println("CONTAGEM REGRESSIVA COMEÇANDO PELO NÚMERO " + num);
    do {

      System.out.println(contador);
      contador--;
    } while(contador!=0);

    entrada.close();
  }
}