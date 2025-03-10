/*Exercício 2: Tabuada de um número
Descrição:
Escreva um programa que solicite um número ao usuário e exiba a tabuada
desse número de 1 a 10, utilizando um loop while.

Requisitos:
• O programa deve pedir um número inteiro ao usuário.
• Utilizar um contador para iterar de 1 a 10.
• Exibir a multiplicação do número pelo contador em cada iteração.*/

package exercicios3.problema2;

import java.util.Scanner;

public class TabuadaNumerica {
 
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.println("Entre com um número entre 1 a 10: ");  //pedindo ao usuário um número
    int num = entrada.nextInt();

    if(num<1 || num>10) {  //verificando se o número é válido

      System.err.println("Número inválido!");
      System.exit(0);
    }

    int contador=0;  //inicializando um contador 
    System.out.println("TABUADA DE " + num);
    while(contador<11) {  //exibindo a tabuada de 'num'
    
      System.out.println(num + " * " + contador + " = " + num*contador);
      contador++;
    }

    entrada.close();
  }
}