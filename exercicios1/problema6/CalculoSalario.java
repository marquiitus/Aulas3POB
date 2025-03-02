/*6. Cálculo do Salário
Escreva um programa que receba o salário bruto de um funcionário 
e o valor de desconto do INSS. O programa deve calcular e exibir o salário líquido.*/

package exercicios1.problema6;

import java.util.Scanner;

public class CalculoSalario {
  
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.println("\n\nEntre com o seu salário bruto:");
    float salarioBruto = entrada.nextFloat();

    float salarioLiquido = 0.1f * salarioBruto;  //arrendondando o desconto para 10%

    System.out.println("Seu salário liquido é: " + salarioLiquido);

    entrada.close();
  }
}