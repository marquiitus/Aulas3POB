/*2. Área de um Círculo
Desenvolva um programa que leia o raio de um círculo e calcule sua área.

Fórmula: Área = π * raio²
Considere π = 3.14159.*/

package exercicios1.problema2;

import java.util.Scanner;

public class AreaCirculo {
 public static void main(String[] args) {

   Scanner entrada = new Scanner(System.in);
   System.out.println("Entre com o raio da circunferência:");
   float raio = entrada.nextFloat();


   double resultado = Math.PI * Math.pow(raio, 2);
   System.out.println("A área da circuferência é: " + Math.round(resultado));  //Math.round() arredonda o valor

   entrada.close();
 }
}