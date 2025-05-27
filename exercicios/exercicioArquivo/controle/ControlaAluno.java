package exercicioArquivo.controle;

import exercicioArquivo.dominio.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;  //Arquivos


//controlaAluno, adicionar, listar, alterar, excluir 
public class ControlaAluno {
  
  private ArrayList<Aluno> alunos;
  private final String arquivoAlunos = "alunos.txt";

  public ControlaAluno() {

    this.alunos = new ArrayList<>();
    carregarAluno();
  }

  private void carregarAluno() {

    try(BufferedReader reader = new BufferedReader(new FileReader(arquivoAlunos))) {

      String linha;


    }
  }

  public void adicionarProduto(int matricula, String nome, double coeficienteRendimento) {
    
    Aluno aluno = new Aluno(matricula, nome, coeficienteRendimento);
    alunos.add(aluno);
    salvarAlunos();

    System.out.println("Aluno adicionado com sucesso!");
  }

  public void alterarProduto(String nome) {

    Aluno aluno = buscarAlunoPorNome(nome);
    if (aluno != null) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Novo nome do produto: ");
      String novoNome = scanner.nextLine();
      System.out.print("Novo valor do produto: ");
      double novoValor = scanner.nextDouble();
      scanner.close();
            
      produto.setNome(novoNome);
      produto.setValor(novoValor);
      salvarProdutos();
      System.out.println("Produto alterado com sucesso!");
    } else 
        System.out.println("Produto com ID " + id + " não encontrado.");
  }


  public void listarAluno() {

    if (alunos.isEmpty()) 
      System.out.println("Nenhum produto cadastrado.");
    else {
      System.out.println("Lista de Produtos:");
      for (Aluno aluno : alunos) 
        aluno.listarAluno();
    }
  }

  public static void main(String[] args) {

    ControlaAluno controla = new ControlaAluno();
    Scanner sc = new Scanner(System.in);
    int op;

    do {
      System.out.println("\nMenu:");
      System.out.println("1. Adicionar Aluno");
      System.out.println("2. Listar Alunos");
      System.out.println("3. Alterar Aluno");
      System.out.println("4. Excluir Aluno");
      System.out.println("0. Sair");
      System.out.print("Escolha uma opção: ");
      op = sc.nextInt();
      
      switch (op) {
        case 1:
          System.out.print("ID do Produto: ");
          int id = sc.nextInt();
          sc.nextLine(); //limpando o buffer
          System.out.print("Nome do Produto: ");
          String nome = sc.nextLine();
          System.out.print("Valor do Produto: ");
          double valor = sc.nextDouble();
          controla.adicionarProduto(id, nome, valor);          
          break;

        case 2:
          controla.listarAluno();
          break;
        
        case 3:
          System.out.print("ID do Aluno para alterar: ");
          int idAlterar = sc.nextInt();
          sc.nextLine(); // Limpa o buffer
          controla.alterarALuno(idAlterar);
          break;

        case 4:
          System.out.print("ID do Aluno para excluir: ");
          int idExcluir = sc.nextInt();
          controla.excluirAluno(idExcluir);
          break;

        case 0:
          System.out.println("Encerrando o programa.");
          break;

        default:
          System.out.println("Opção Inválida. Tente novamente.");
      }

    } while(op!=0);

    sc.close();
  }
}