/*7. Cálculo do Perímetro e Área de um Retângulo
Faça um programa que solicite a base e a altura de um retângulo e exiba o seu perímetro e sua área.

Fórmulas:
Área = base × altura
Perímetro = 2 × (base + altura).*/

package exercicios1.problema7;

import java.util.Scanner;

public class PerimetroAreaRetangulo {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.println("\n\nEntre com a base do retângulo:");  //pegando a base
    float base = entrada.nextFloat();

    System.out.println("\nEntre com a altura do retângulo:");  //pegando a altura
    float altura = entrada.nextFloat();

    float area = base * altura;  //calculando os resultados
    float perimetro = 2 * (base + altura);

    System.out.println("A área do retângulo é: " + area);  //imprimindo os resultados
    System.out.println("O perímetro do retângulo é: " + perimetro);

    entrada.close();
  }
}