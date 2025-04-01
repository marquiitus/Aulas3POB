/* Exercício 1: Adicionar e Exibir Números
Descrição:
Crie um programa que permita ao usuário inserir quantos números desejar em
um ArrayList<Integer>. Após a inserção, o programa deve exibir todos os números
digitados.

Requisitos:
• Criar um ArrayList<Integer> para armazenar os números.
• Utilizar um loop while para permitir múltiplas inserções até o usuário
decidir parar.
• Exibir os números armazenados no ArrayList. */

import java.util.Scanner;
import java.util.ArrayList;  //importando a biblioteca do ArrayList

public class AdicionarExibirNumeros {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numeros = new ArrayList<>();  //criando um arraylist do tipo inteiro

    while(true) {

      System.out.println("Entre com um número inteiro(digite '-1' para sair): ");
      int num = sc.nextInt();
      if(num == -1) {

        break;  //para sair do loop
      }

      numeros.add(num);
    }

    System.out.println("Exibindo todos os números que foram digitados: ");
    for(int i=0; i<numeros.size(); i++) {

      System.out.println(numeros.get(i));
    }

    sc.close();
  }
}