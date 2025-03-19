/*Exercício 1: Maior e Menor Valor em um Array
Descrição:
Crie um programa que solicite ao usuário 5 números inteiros e armazene-os em
um array. Após isso, o programa deve exibir o maior e o menor número do array.


Requisitos:
• Criar um array de tamanho 5.
• Utilizar um loop for para percorrer o array e encontrar o maior e o menor
valor.
• Exibir o maior e o menor número armazenados no array. */

package exercicios4.problema1;

import java.util.Scanner;

public class MaiorMenorValor {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    int vetor[] = new int[5];  //declarando vetor
    int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;  //máximo e mínimo valores inteiros

    for(int i=0; i<5; i++) {

      System.out.println("Entre com um valor inteiro: ");
      vetor[i] = entrada.nextInt();
    }

    for(int i=0; i<5; i++) {

      if(vetor[i]>maior) {

        maior = vetor[i];
      }
    
      if(vetor[i]<menor) {

        menor = vetor[i];
      }
    }

    System.out.println("Maior valor: " + maior);
    System.out.println("Menor valor: " + menor);

    entrada.close();
  }
}