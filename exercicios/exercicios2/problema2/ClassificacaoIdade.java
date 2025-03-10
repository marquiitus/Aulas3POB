/*Exercício 2: Classificação de Idade
Escreva um programa que solicite a idade de uma pessoa e classifique-a em uma
das categorias abaixo, utilizando if-else:

• Menor de idade (menos de 18 anos)
• Adulto (entre 18 e 60 anos)
• Idoso (mais de 60 anos)*/

package exercicios2.problema2;

import java.util.Scanner;

public class ClassificacaoIdade {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.println("Entre com uma idade:");  //perguntando a idade
    int idade = entrada.nextInt();

    if(idade<18) {  //verificando o intervalo de idade e imprimindo o resultado

      System.out.println("Menor de idade!");
    } else if(idade<=60){

      System.out.println("Adulto!");
    } else {

      System.out.println("Idoso!");
    }

    entrada.close();
  }
}