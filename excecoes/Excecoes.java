package excecoes;

import pessoa.Pessoa;

public class Excecoes {

  public static void main(String[] args) {
    // // TRY/CATCH
    // try {
    // validaNumero();
    // } catch (Exception e) {
    // System.out.println("Deu ruim");
    // e.printStackTrace();
    // }

    Pessoa p = null;
    p.getCpf();

  }

  public static void validaNumero() throws Exception {
    int numero = 10;
    if (numero < 100) {
      // Checked exceptions
      throw new Exception("O número é menor que 100");
    }
  }
  // Unchecked exceptions
}
