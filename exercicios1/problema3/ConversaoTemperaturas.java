/*3. Conversão de Temperatura
Crie um programa que leia uma temperatura em graus Celsius e a converta para Fahrenheit.

Fórmula: F = (C × 9/5) + 32.*/

package exercicios1.problema3;

import java.util.Scanner;

public class ConversaoTemperaturas {
 public static void main(String[] args){

   Scanner entrada = new Scanner(System.in);
   System.out.println("Digite a temperatura em Celsius que deseja converter: "); 
   float celsius = entrada.nextFloat();

   float conversao = (celsius*(9/5)) + 32;

   System.out.println("O resultado da conversão é " + conversao + "°F");

   entrada.close();
 }
}