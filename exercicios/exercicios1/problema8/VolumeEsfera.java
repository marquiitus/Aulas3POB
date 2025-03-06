/*8. Cálculo do Volume de uma Esfera
Crie um programa que leia o raio de uma esfera e calcule o seu volume.

Fórmula: V = (4/3) * π * raio³.
Use π = 3.14159.*/

package exercicios1.problema8;

import java.util.Scanner;

public class VolumeEsfera {
  
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.println("\nEntre com o raio de uma esfera:");  //recebendo o raio da esfera
    float raio = entrada.nextFloat();

    double volume = (4.0/3.0) * 3.14159 * Math.pow(raio, 3);  //calculando seu volume

    System.out.println("\nO volume da esfera é: " + volume);  //exibindo o resultado

    entrada.close();
  }
}