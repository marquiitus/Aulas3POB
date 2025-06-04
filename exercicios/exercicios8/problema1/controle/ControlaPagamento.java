/* Exercício 1: Interface para Pagamentos
Descrição: Crie um sistema que represente diferentes formas de pagamento, garantindo que
todas sigam um contrato comum.

Requisitos:
1. Criar a interface Pagamento com o método:
* realizarPagamento(double valor).

2. Criar duas classes que implementam Pagamento:

3. Criar um programa que instancie objetos das duas classes e chame o
método realizarPagamento(). */

package exercicios8.problema1.controle;

import exercicios8.problema1.dominio.*;

public class ControlaPagamento {
  public static void main(String[] args) {

    Pagamento cartao = new CartaoCredito();
    Pagamento boleto = new BoletoBancario();

    cartao.realizarPagamento(200);
    boleto.realizarPagamento(199);
  }
}