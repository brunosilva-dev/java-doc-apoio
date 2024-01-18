package primeirasAulas;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

public class HelloWorld {

  // private static final Logger logger =
  // LoggerFactory.getLogger(HelloWorld.class);

  public static void main(String[] args) {

    /**
     * Tipos de variáveis
     */
    int dadoTipoInt = 35;
    double dadoTipoDouble = 35.01;
    float dadoTipoFloat = 35.01f;
    long dadoTipoLong = 987465132089456L;
    String dadoTipoString = "Bruno Silva";
    Boolean dadoTipoBoolean = 32 > 35;

    // logger.debug("dadoTipoInt: " + dadoTipoInt);
    // logger.debug("dadoTipoDouble: " + dadoTipoDouble);
    // logger.debug("dadoTipoFloat: " + dadoTipoFloat);
    // logger.debug("dadoTipoLong: " + dadoTipoLong);
    // logger.debug("dadoTipoString: " + dadoTipoString);
    // logger.debug("dadoTipoBoolean: " + dadoTipoBoolean);
    System.out.println(dadoTipoInt);
    System.out.println(dadoTipoDouble);
    System.out.println(dadoTipoFloat);
    System.out.println(dadoTipoLong);
    System.out.println(dadoTipoString);
    System.out.println(dadoTipoBoolean);

    /**
     * Condicionais
     */
    // IF- ELSE
    if (dadoTipoInt < 35) {
      System.out.println("Ainda tem tempo!");
    } else if (dadoTipoInt == 35) {
      System.out.println("Tá velho hein!");
    } else {
      System.out.println("Corre que o pé de galinha ta vindo ai!");
    }

    // WHILE
    int valorInicial = 0;
    while (valorInicial < 3) {
      System.out.println("Menor que 3");
      System.out.println(valorInicial);
      valorInicial++;
    }

    // FOR
    for (int i = 0; i <= 10; i++) {
      System.out.println("Valor de i: " + i);
    }
  }

}