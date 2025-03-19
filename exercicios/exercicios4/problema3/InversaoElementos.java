/*Exercício 3: Inversão de Elementos de um Array
Descrição:
Escreva um programa que solicite ao usuário 6 números inteiros e os armazene
em um array. Em seguida, exiba os números na ordem inversa à de entrada.

Requisitos:
• Criar um array de tamanho 6.
• Utilizar um loop for para preencher o array.
• Utilizar outro loop for para exibir os elementos na ordem inversa.*/

package exercicios4.problema3;

import java.util.Scanner;

public class InversaoElementos {
   public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int vetor[] = new int[6];

    for(int i=0; i<6; i++) {

      System.out.println("Entre com um número inteiro: ");
      vetor[i] = entrada.nextInt();
    }

    for(int i=vetor.length-1; i>=0; i--) {

      System.out.print(vetor[i]);
    }

    entrada.close();
  }
}