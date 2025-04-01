/* Exercício 5: Ordenação de Lista de Números
Descrição:
Crie um programa que solicite ao usuário inserir quantos números desejar em
um ArrayList<Integer>. Em seguida, ordene os números em ordem crescente e
exiba a lista ordenada.

Requisitos:
• Criar um ArrayList<Integer> para armazenar os números.
• Utilizar Collections.sort() para ordenar os números.
• Exibir a lista ordenada após a ordenação. */

package exercicios5.problema5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoNumeros {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numeros = new ArrayList<>();

    while(true) {

      System.out.println("Entre com um número(digite -1 para sair): ");
      int num = sc.nextInt();

      if(num==-1)
        break;
      
      numeros.add(num);
    }

    System.out.println("Exibindo os números pela ordem de inserção: " + numeros);

    Collections.sort(numeros);  //ordenando por ordem crescente

    System.out.println("Exibindo os números ordenados por ordem crescente: " + numeros);

    sc.close();
  }
}