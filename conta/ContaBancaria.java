package conta;

public class ContaBancaria {

  private String numero;
  private String titular;
  private double saldo;

  // Método Construtor
  public ContaBancaria() {
    this.saldo = 0.0;
  }

  // Getters and Setters
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
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

  // Depositar
  void depositar(double valor) {
    if (valor > 0) {
      saldo = saldo + valor;
      System.out.println("Depósito de R$ " + valor + ". Seu saldo atual é de R$ " + saldo + ".");
    } else {
      System.out.println("Valor de depósito inválido!");
    }
  }

  // Sacar
  void sacar(double valor) {
    if (valor > 0 && valor <= saldo) {
      saldo = saldo - valor;
      System.out.println("Saque de R$ " + valor + ". Saldo atual R$ " + saldo);
    }
  }

}
