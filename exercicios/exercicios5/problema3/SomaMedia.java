/* Exercício 3: Soma de Números e Cálculo da Média
Descrição:
Crie um programa que solicite ao usuário inserir números em um
ArrayList<Double> até que ele digite -1. Depois, exiba a soma e a média dos
números inseridos (excluindo o -1).

Requisitos:
• Criar um ArrayList<Double> para armazenar os números.
• Utilizar um loop while para permitir inserções até o usuário digitar -1.
• Utilizar um loop for para calcular a soma e a média dos números inseridos. */

package exercicios5.problema3;

import java.util.Scanner;
import java.util.ArrayList;

public class SomaMedia {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Double> numeros = new ArrayList<>();
    int soma = 0;

    while(true) {

      System.out.println("Entre com um número('-1' para sair): ");
      double num = sc.nextDouble();

      if(num == -1)
        break;
      
      numeros.add(num);
      soma += num;
    }

    float media = soma/numeros.size();
    System.out.println("A media dos números é: " + media);

    sc.close();
  }
}