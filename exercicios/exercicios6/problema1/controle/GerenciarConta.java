/* Exercício 1: Controle de Conta Bancária
Crie um programa que simule uma conta bancária, permitindo depósitos e saques.

Requisitos:
1. Criar o pacote dominio contendo a classe ContaBancaria:
o Atributos: titular (String), saldo (double).
o Métodos:
▪ depositar(double valor): adiciona um valor ao saldo.
▪ sacar(double valor): subtrai um valor do saldo, se houver
saldo suficiente.
▪ exibirSaldo(): exibe o saldo atual.

2. Criar o pacote controle contendo a classe GerenciadorConta:
* Permitir que o usuário cadastre uma conta e realize operações
(depositar, sacar, consultar saldo).
* Utilizar um while para continuar as operações até o usuário escolher
sair. */

package exercicios6.problema1.controle;

import exercicios6.problema1.dominio.*;
import java.util.Scanner;

public class GerenciarConta {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Nome da Conta:");
    String nome = sc.nextLine();
  
    System.out.println("Senha da Conta:");
    String senha = sc.nextLine();

    System.out.println("Saldo da conta:");
    double saldo = sc.nextDouble();
  
    System.out.println("Exibindo as informações da conta:");
    System.out.println("Nome da Conta: " + nome + " - Senha: " + senha + " - Saldo: R$" + saldo);

    ContaBancaria conta = new ContaBancaria(nome, saldo);
    while(true) {

      System.out.println("\n(1)Depositar (2)Sacar (3)Consultar Saldo (-1)Sair");
      int op = sc.nextInt();
  
      if(op==-1) {
        System.out.println("Programa Finalizado com sucesso!");
        break; 
      } 
    
      switch (op) {
        case 1:
          System.out.println("Qual valor você quer depositar: ");
          double valor = sc.nextDouble();
          conta.depositar(valor);
          break;
        case 2:
          System.out.println("Qual valor quer sacar: ");
          valor = sc.nextDouble();
          conta.sacar(valor);
          break;
        case 3:
          conta.exibirSaldo();
          break;
        default:
          System.out.println("Opção Inexistente!");
          break;
      }
    }

    sc.close();
  }
}