/*Exercício 3: Calculadora Simples com switch-case
Crie um programa que simule uma calculadora simples, permitindo ao usuário
escolher uma operação matemática básica (+, -, *, /) e dois números.

Requisitos:
• O programa deve solicitar dois números e a operação desejada.
• Deve usar switch-case para executar a operação correspondente.
• Caso a operação não seja válida, exibir "Operação inválida.".
• Se a operação for divisão (/), verificar se o segundo número é zero antes de
calcular.*/

package exercicios.exercicios2.problema3;

import java.util.Scanner;

public class CalculadoraSimples {

  public static void main(String[] args) {


    Scanner entrada = new Scanner(System.in);
    System.out.println("Qual operação quer realizar:");
    System.out.println("soma(1); Subtração(2); Multiplicação(3); Divisão(4)");
    int operacao = entrada.nextInt();

    System.out.println("Qual o 1º número:");
    int num1 = entrada.nextInt();

    System.out.println("Qual o 2º número:");
    int num2 = entrada.nextInt();


    float resultado;
    switch (operacao) {
      case 1:
        resultado = num1+num2;
        System.out.println("O resultado da operação escolhida é: " + resultado);
        break;
  
      case 2:
        resultado = num1-num2;
        System.out.println("O resultado da operação escolhida é: " + resultado);
        break;
    
      case 3:
        resultado = num1*num2;
        System.out.println("O resultado da operação escolhida é: " + resultado);
        break;

      case 4:
        if(num2==0) {

          System.err.println("Divisão sem resultado!");
          break;
        }
        resultado = num1/num2;
        System.out.println("O resultado da operação escolhida é: " + resultado);
        break;

      default:
        System.err.println("OPERAÇÃO INEXISTENTE!");
        break;
    }

    entrada.close();
  }
}