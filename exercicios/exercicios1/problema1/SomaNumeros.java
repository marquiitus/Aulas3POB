/*1. Soma de Dois Números
Escreva um programa que solicite ao
usuário dois números inteiros e exiba a soma deles.*/

package exercicios1.problema1;  //declarando a pasta em que está o arquivo

import java.util.Scanner;  //importando funções

public class SomaNumeros {  //declarando classes

 public static void main(String[] args) {  //declarando a 'main'

   Scanner entradaValor = new Scanner(System.in);  //'Scanner' serve para receber valores do usuário
   System.out.println("Digite um valor inteiro:");
   int valor1 = entradaValor.nextInt();  //transformando o valor que é uma string em um inteiro usando 'nextInt()'

   System.out.println("Digite outro valor inteiro:");
   int valor2 = entradaValor.nextInt();

   int soma = valor1 + valor2;
   System.out.println("A soma dos valores é: " + soma);  //concatenando

   entradaValor.close();  //encerrando a varíavel de entrada (lembrar de arquivos em C)
 }
}