package conta;

public class TesteContaBancaria {

  public static void main(String[] args) {

    ContaBancaria contaBancaria1 = new ContaBancaria();
    contaBancaria1.setNumero("9999");
    contaBancaria1.setTitular("João Felipe");

    contaBancaria1.depositar(450);
    contaBancaria1.sacar(200);
  }
}
