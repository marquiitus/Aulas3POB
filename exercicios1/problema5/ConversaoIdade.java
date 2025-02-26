/*5. Conversão de Idade para Dias
Desenvolva um programa que leia a idade de uma pessoa em anos 
e exiba a quantidade aproximada de dias que ela já viveu.

Considere um ano com 365 dias.*/

package exercicios1.problema5;

import java.util.Scanner;

public class ConversaoIdade{

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.println("Entre com uma idade:");
    int idadeAnos = entrada.nextInt();

    idadeAnos *= 365;

    System.out.println("A idade em dias aproximadamente é: " + idadeAnos);

    entrada.close();
  }
}