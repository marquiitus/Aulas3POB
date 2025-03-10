/*Conversão de Notas para Conceito
Descrição:
Escreva um programa que leia uma nota de 0 a 10 e exiba o conceito
correspondente, utilizando switch-case.
Tabela de Conceitos:
• 9 a 10 → A
• 7 a 8 → B
• 5 a 6 → C
• 3 a 4 → D
• 0 a 2 → E

Requisitos:
• Se a nota estiver fora do intervalo 0 a 10, exibir "Nota inválida.". */

package exercicios2.problema5;

import java.util.Scanner;

public class ConversaoNotasConceito {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.println("Entre com uma nota de 0 a 10: ");  //pedindo a nota ao usuário
    int nota = entrada.nextInt();
    char conceito = 0;

    if(nota<0 || nota>10) {  //verificando a nota

      System.err.println("Nota Inválida.");
      System.exit(0);
    } else if(nota < 3){

      conceito = 'E';
    } else if (nota<5) {

      conceito = 'D';
    } else if(nota<7) {

      conceito = 'C';
    } else if(nota<9) {

      conceito = 'B';
    } else {

      conceito = 'A';
    }

    System.out.println("O conceito é: " + conceito);  //imprimindo o resultado

    entrada.close();
  }
}