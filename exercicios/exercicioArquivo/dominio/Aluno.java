package exercicioArquivo.dominio;

public class Aluno {

  private int matricula;
  private String nome;
  private double coeficienteRendimento;
  
  public Aluno(int matricula, String nome, double coeficienteRendimento) {  //método construtor 
    this.matricula = matricula;
    this.nome = nome;
    this.coeficienteRendimento = coeficienteRendimento;
  }

  public int getMatricula() {  //getters and setters
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getCoeficienteRendimento() {
    return coeficienteRendimento;
  }

  public void setCoeficienteRendimento(double coeficienteRendimento) {
    this.coeficienteRendimento = coeficienteRendimento;
  }

  public void listarAluno() {

    System.out.println("Nome: " + nome + ", Matrícula: " + matricula + ", CR: " + coeficienteRendimento);
  }
}