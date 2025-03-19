/* Exercício 4: Contagem de Números Pares em um Array
Descrição:
Crie um programa que solicite ao usuário 8 números inteiros e armazene-os em
um array. O programa deve contar e exibir a quantidade de números pares no
array.

Requisitos:
• Criar um array de tamanho 8.
• Utilizar um loop for para percorrer o array e contar quantos números são
pares.
• Exibir a quantidade de números pares encontrados. */

package exercicios4.problema4;

import java.util.Scanner;

public class ContagemNumerosPares {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int vetor[] = new int[8], cont=0;

    for (int i=0; i<8; i++) {

      System.out.println("Entre com um número inteiro: ");
      vetor[i] = sc.nextInt();

      if(vetor[i]%2==0) 
      cont++; 
    }

    for(int i=0; i<8; i++) {

      if(vetor[i]%2==0) 
      System.out.print(vetor[i] + ", ");
    }

    System.out.println("A quantidade de números pares é: " + cont);

    sc.close();
  }
}