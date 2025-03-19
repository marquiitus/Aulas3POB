/*Exercício 5: Busca de Elemento em um Array
Descrição:
Implemente um programa que solicite ao usuário 10 números inteiros e os
armazene em um array. Em seguida, o usuário deve digitar um número para buscar
no array. O programa deve informar se o número está presente e em qual posição.

Requisitos:
• Criar um array de tamanho 10.
• Solicitar um número ao usuário e verificar se ele está presente no array.
• Se o número for encontrado, exibir sua posição. Caso contrário, exibir
"Número não encontrado.". */

package exercicios4.problema5;

import java.util.Scanner;

public class BuscaElementos {
 
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int vetor[] = new int[10];

    for(int i=0; i<10; i++) {

      System.out.println("Entre com um número inteiro: ");
      vetor[i] = sc.nextInt();
    }

    System.out.println("Qual número deseja buscar: ");
    int num = sc.nextInt();

    for(int i=0; i<10; i++) {

      if(vetor[i]==num) {

        System.out.println("Número encontrado com sucesso!");
        System.exit(1);
      }
    }

    System.out.println("Número não encontrado!");

    sc.close();
  }
}