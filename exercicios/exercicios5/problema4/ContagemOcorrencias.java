/* Exercício 4: Contagem de Ocorrências de um Número
Descrição:
Desenvolva um programa que solicite ao usuário inserir 10 números inteiros em
um ArrayList<Integer>. Depois, peça ao usuário para digitar um número e informe
quantas vezes esse número aparece na lista.

Requisitos:
• Criar um ArrayList<Integer> para armazenar os números.
• Utilizar um loop for para contar quantas vezes o número aparece na lista.
• Exibir a quantidade de ocorrências do número digitado pelo usuário. */

package exercicios5.problema4;

import java.util.Scanner;
import java.util.ArrayList;

public class ContagemOcorrencias {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numeros = new ArrayList<>();
    
    for(int i=0; i<10; i++) {

      System.out.println("Entre com um número inteiro: ");
      int num = sc.nextInt();
      numeros.add(num);
    }

    System.out.println("Exibindo todos os números digitados:");
    for(int i=0; i<numeros.size(); i++) {

      System.out.println(numeros.get(i));
    }

    System.out.println("Qual número você quer saber a quantidade de ocorrências: ");
    int numProcurado = sc.nextInt();
    int ocorrencias = 0;

    for(int i=0; i<numeros.size(); i++) {

      if(numeros.get(i) == numProcurado) 
        ocorrencias++;
    }

    System.out.println("A quantidade de ocorrências do número  " + numProcurado + "é: " + ocorrencias);

    sc.close();
  }
}