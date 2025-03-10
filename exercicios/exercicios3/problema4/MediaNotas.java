/*Exercício 4: Média de notas de uma turma
Descrição:
Desenvolva um programa que calcule a média das notas de uma turma, onde
o usuário informe quantos alunos há na turma e suas respectivas notas.

Requisitos:
• O programa deve solicitar a quantidade de alunos.
• Deve utilizar um loop for para receber as notas de cada aluno.
• Utilizar um acumulador para somar todas as notas.
• No final, exibir a média da turma. */

package exercicios3.problema4;

import java.util.Scanner;
import java.util.Locale;

public class MediaNotas {
 
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.println("Entre com a quantidade de alunos na turma: ");
    int quantAlunos = entrada.nextInt();

    float soma=0;
    for(int i = 1; i<=quantAlunos; i++) {
      
      System.out.println("Entre com a nota do aluno: ");
      entrada.useLocale(Locale.US); // Define o formato de números com ponto decimal
      float nota = entrada.nextFloat();
      soma+= nota;
    }

    float mediaNotas = soma/quantAlunos;
    System.out.println("A media das notas de todos os alunos é: " + mediaNotas);

    entrada.close();
  }
}