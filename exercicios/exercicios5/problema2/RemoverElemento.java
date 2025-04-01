/* Exercício 2: Remover um Elemento da Lista
Descrição:
Escreva um programa que solicite ao usuário inserir 5 nomes em um
ArrayList<String>. Em seguida, peça para o usuário informar um nome para ser
removido da lista. Exiba a lista após a remoção.

Requisitos:
• Criar um ArrayList<String> para armazenar os nomes.
• Utilizar remove() para excluir o nome informado.
• Se o nome não existir na lista, exibir uma mensagem informando. */

package exercicios5.problema2;

import java.util.Scanner;
import java.util.ArrayList;

public class RemoverElemento {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ArrayList<String> nomes = new ArrayList<>();

    for(int i=0; i<5; i++) {

      System.out.println("Entre com um nome: ");
      String str = sc.next();
      nomes.add(str);
    }

    for(int i=0; i<nomes.size(); i++) {

      System.out.println(nomes.get(i));
    }

    System.out.println("Qual nome você quer remover: ");
    String strRemovida = sc.next();
    nomes.remove(strRemovida); 
    
    for(int i=0; i<nomes.size(); i++) {

      System.out.println(nomes.get(i));
    }

    sc.close();
  }
}