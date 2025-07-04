/* Criar um projeto para cadastro de produtos. Nessa primeira versão 
nosso projeto "ProjetoBase" vai usar o padrão MVC para criar uma classe 
Produto(id int, nome: String, qtd int) e realizar as operações de inclusão, 
alteração, consulta, listagem e exclusão de produtos por meio de um ArrayList. 
A camada de controle vai cuidar das regras de negócio e a 
camada de visão vai cuidar da interação com o usuário. */

public class Produto {

  private int id;
  private String nome;
  private int qtd;
  
  public Produto(int id, String nome, int qtd) {
    this.id = id;
    this.nome = nome;
    this.qtd = qtd;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getQtd() {
    return qtd;
  }

  public void setQtd(int qtd) {
    this.qtd = qtd;
  }


  
}