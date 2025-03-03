/*9. Conversão de Moeda
Faça um programa que leia um valor em reais (R$) e a cotação do dólar no dia. 
O programa deve calcular e exibir o valor equivalente em dólares (US$).*/

package exercicios1.problema9;

import java.util.Scanner;

public class ConversaoMoeda {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.println("\nEntre com um valor em Reais(R$): ");
    float reais = entrada.nextFloat();

    float dolar = reais * 5.88f;

    System.out.println("\nO Valor equivalente em dólares(US$) é: " + dolar);

    entrada.close();
  }
}