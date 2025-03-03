/*10. Distância Entre Dois Pontos
Desenvolva um programa que leia as coordenadas x1, y1 e x2, y2 de dois pontos 
no plano cartesiano e calcule a distância entre eles.

Fórmula: D = sqrt((x2 - x1)² + (y2 - y1)²)  sqrt = Raiz Quadrada*/

package exercicios1.problema10;

import java.util.Scanner;

public class DistanciaPontos {
  
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.println("\nEntre com o valor de 'x1'(1º ponto): ");
    int x1 = entrada.nextInt();

    System.out.println("\nEntre com o valor de 'x2'(1º ponto): ");
    int y1 = entrada.nextInt();

    System.out.println("\nEntre com o valor de 'y1'(2º ponto): ");
    int x2 = entrada.nextInt();

    System.out.println("\nEntre com o valor de 'y2'(2º ponto): ");
    int y2 = entrada.nextInt();

    double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

    System.out.println("\nA distância entre os 2 pontos é: " + Math.round(distancia));

    entrada.close();
  }
}