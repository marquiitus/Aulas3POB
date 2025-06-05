/*Exercício 2: Interface para Formas Geométricas
Descrição: Implemente um sistema que calcule área e perímetro de diferentes formas
geométricas.

Requisitos:
1. Criar a interface FormaGeometrica com os métodos:
* calcularArea().
* calcularPerimetro().

2. Criar duas classes que implementam FormaGeometrica:
* Retangulo (atributos: largura e altura).
* Circulo (atributo: raio).

3. Criar um programa que instancie um Retangulo e um Circulo, solicite os
valores ao usuário e exiba os cálculos da área e perímetro. */

package exercicios8.problema2.controle;

import exercicios8.problema2.dominio.*;
import java.util.Scanner;

public class ControlaFiguraGeometrica {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Entre com o número da largura:");



    sc.close();
  }
}