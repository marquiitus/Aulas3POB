package exercicios6.problema1.dominio;

public class ContaBancaria {
  
  private String titular;
  private double saldo;

  public ContaBancaria(String titular, double saldo) {
    this.titular = titular;
    this.saldo = saldo;
  }

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public void listarContaBancaria() {
    System.out.println("\nTitular: " + titular);
    System.out.println("\nSaldo: " + saldo + "\n");
  }

  public double depositar(double valor) {
    saldo += valor;
    return saldo;
  }

  public double sacar(double valor) {
    saldo -= valor;
    return saldo;
  }

  public void exibirSaldo() {
    System.out.println("Exibindo o seu saldo atual: R$" + saldo);
  }
}