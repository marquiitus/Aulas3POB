/*Exercício 2: Cálculo da Média de Notas
Descrição:
Desenvolva um programa que peça ao usuário para inserir 4 notas e armazene-as
em um array. Depois, o programa deve calcular e exibir a média das notas.


Requisitos:
• Criar um array de tamanho 4 para armazenar as notas.
• Utilizar um loop for para somar todas as notas e calcular a média.
• Se a média for maior ou igual a 7, exibir "Aprovado", senão, exibir
"Reprovado".*/

package exercicios4.problema2;

import java.util.Scanner;

public class CalculoMedia {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    float vetor[] = new float[4];
    float soma=0, media;
    int i;

    for(i=0; i<4; i++) {

      System.out.println("Entre com uma nota: ");
      vetor[i] = sc.nextFloat();
      soma+=vetor[i];
    }

   media = soma/i;   

    System.out.println("A média do(a) aluno(a) é: " + media);
    if(media>=7) {


      System.out.println("Aprovado!");
    } else {

      System.out.println("Reprovado!");
    }

    sc.close();
  }
}