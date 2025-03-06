/*4. Cálculo de Média Simples
Faça um programa que solicite ao usuário três notas
(valores decimais) e exiba a média aritmética delas.*/

package exercicios1.problema4;

import java.util.Scanner;

public class MediaSimples {
 public static void main(String[] args) {

   Scanner entrada = new Scanner(System.in);
   float soma = 0;

   for(int i=1; i<4; i++) {

     System.out.println("Digite a " + i + "ª nota:");
     float valor = entrada.nextFloat();

     soma += valor;
   }

   System.out.println("A media desse aluno é:" + soma/3);

   entrada.close();
 }
}