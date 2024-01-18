# JAVA

## Class

- Estrutura mais básica do JAVA é a classe;

- Classe tem que ter o nome do arquivo e nome da classe iguais;

- A classe é composta por:

  > Nome da Classe
  > Tipo de acesso da classe (public/private)
  > Tipo da classe (class)

- A partir do JAVA 11 é possivel compilar pela linha de comando digitando apenas "java nomeArquivo.java"

- Toda projeto precisa ter uma classe com método MAIN, pois, é a classe de execução

> Public informa que pode ser acessado de qualquer parte do programa

> static indica que o main pertence a essa classe

> void é o tipo de retorno, onde indica que não retorna nenhum valor com a execução

> main é o ponto de partida de execução

> strings é o tipo do argumento e a [] indica que pode retornar uma array

```java
// Digite main e clique em CTRL + SPACE
public class HelloWorld {

  public static void main(String[] args) {

  }

}
```

- `Tipos de dados`

> Number (int, double, float, long) - Quando a variável for do tipo float, é preciso que coloque o "f" na frente do número; Long é para armazenar número muito grandes e é necessário colocar o L na frente
> String
> Boolean (true or false)
> Other

```java
public class HelloWorld {

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
  }

}
```

- `Condicionais`

> if / else

```java

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
    if (dadoTipoInt < 35) {
      System.out.println("Ainda tem tempo!");
    } else if (dadoTipoInt == 35) {
      System.out.println("Tá velho hein!");
    } else {
      System.out.println("Corre que o pé de galinha ta vindo ai!");
    }
  }

}
```

> While

```java

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
  }

}
```

> For

```java

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
```

- `Lista`

> Para utilizar o lista é preciso fazer o "import java.util.List;"

> Ao utilizar uma Lista no java você precisa definir e entender alguns pontos:

> Ponto 1 - Para instanciar uma lista é preciso colocar no inicio da linha a palavra "List"

```java
List
```

> Ponto 2 - Definir qual será o tipo de lista que vai retornar

```java
List<String>
```

> Ponto 3 - Informar a variável que receberá essa lista

```java
List<String> nomes
```

> Ponto 4 - retornar essa lista, como nesse caso foi do tipo String, será incluido um new ArrayList

```java
List<String> nomes = new ArrayList<>();
```

> Para adicionar os itens a uma lista é nomes.add();, mas existe outras funções que podem ser executadas, ao colocar o ponto irá aparecer

```java
List<String> nomes = new ArrayList<>();
nomes.add();
```

- Utilizando o for, foreach e método de referência para percorrer uma `lista`

```java
// FOR
import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {

  public static void main(String[] args) {

    // Lista
    List<String> nomes = new ArrayList<>();
    nomes.add("Bruno Silva");
    nomes.add("Jéssica Sanches");
    nomes.add("João Felipe Sanches Silva");

    // Pegando o index
    System.out.println(nomes.get(1));

    // Percorrendo a lista (tipoLista:listaQueVaiPercorrer)
    for (String nome : nomes) {
      System.out.println("O nome é: " + nome);
    }
  }
}

```

```java
// FOREACH e Método de referência
import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {

  public static void main(String[] args) {

    // Lista
    List<String> nomes = new ArrayList<>();
    nomes.add("Bruno Silva");
    nomes.add("Jéssica Sanches");
    nomes.add("João Felipe Sanches Silva");

    // Pegando o index
    System.out.println(nomes.get(1));
    System.out.println("----------------------------------------------------------------");

    // Percorrendo a lista (tipoLista:listaQueVaiPercorrer)
    System.out.println("Utilizando FOR");
    for (String nome : nomes) {
      System.out.println("O nome é: " + nome);
    }
    System.out.println("----------------------------------------------------------------");
    System.out.println("Utilizando FOREACH");

    // utilizando o ofr de outra forma passando com forEach
    nomes.forEach(nome -> System.out.println("O nome é: " + nome));
    System.out.println("----------------------------------------------------------------");
    System.out.println("Método de referência");

    // fazendo método de referência onde ele vai printar somente o retorno
    nomes.forEach(System.out::println);
  }
}
```

- `MAP`

> O map é uma coleção onde consegue colocar chave e valor para dentro da estrutura, será preciso definir qual é o tipo da chave e o tipo do valor da estrutura. Na declaração do tipo de valor da estrutura, o map não aceita a variáveis primitivas

```java
Map<String, Integer> notas = new HashMap<>();
```

> No map para adicionar não é mais possível com add mas agora usasse .put(valor1, valor2). A partir do java 10 é possivel declarar variáveis utilizando var podendo utilizar somente nos casos onde o tipo já é definido como no hash abaixo

```java
import java.util.HashMap;
import java.util.Map;

public class Colecoes {

  public static void main(String[] args) {

    Map<String, Integer> notas = new HashMap<>();
    notas.put("Bruno Silva", 8);
    notas.put("Jessica Sanches", 9);
    notas.put("João Felipe", 10);

    var nota = notas.get("Bruno Silva");
    System.out.println(nota);
  }
}
```

> Percorrendo o HashMap de forma diferente do FOR. O Map retorna sempre a última chave, então se tiver várias chaves iguais só será retornado a última inserida

```java
import java.util.HashMap;
import java.util.Map;

public class Colecoes {

  public static void main(String[] args) {

    Map<String, Integer> notas = new HashMap<>();
    notas.put("Bruno Silva", 8);
    notas.put("Jessica Sanches", 9);
    notas.put("João Felipe", 10);

    var nota = notas.get("Bruno Silva");
    System.out.println(nota);

    for (Map.Entry<String, Integer> entry : notas.entrySet()) {
      String key = entry.getKey();
      Integer value = entry.getValue();

      System.out.println("A chave é " + key + "e o valor é " + value);
    }
  }
}
```

- `HashSet`

> É uma coleção de elementos únicos onde na chave tem somente o valor e a forma de adição dele é parecida com a List

```java
import java.util.HashSet;

public class ColecaoHashSet {

  public static void main(String[] args) {

    HashSet<Integer> numeros = new HashSet<>();
    numeros.add(10);
    numeros.add(11);
    numeros.add(12);
    numeros.add(13);

    System.out.println(numeros.size());
  }
}

```

> Não é possível pegar elementos pelo index no HashSet igual é feito no ArrayList

- `Programação Orientada a Objetos (POO)`

> Packages são as pastas que estruturam o projeto

> Definindo uma classe com objetos por exemplo uma pessoa

```java
package pessoa;

public class Pessoa {

  String nome;
  int idade;
  String cpf;
}
```

> Métodos da classe que podem ocorrer ações. Os métodos são compostos por (tipo, nome e abre parenteses). O método pode ou não receber argumentos e quando for void para métodos sem retorno.

```java
package pessoa;

public class Pessoa {

  String nome;
  int idade;
  String cpf;

  @Override
  public String toString() {
    return "O nome da pessoa é " + nome + ", sua idade é " + idade + " e o seu documento CPF é " + cpf;
  }

}
```

```java
package pessoa;

public class TesteDePessoa {

  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa();

    pessoa1.nome = "Bruno";
    pessoa1.cpf = "11122233344";
    pessoa1.idade = 35;

    System.out.println(pessoa1.toString());
    System.out.println("----------------");

    Pessoa pessoa2 = new Pessoa();

    pessoa2.nome = "Jéssica";
    pessoa2.cpf = "44433322211";
    pessoa2.idade = 32;

    System.out.println(pessoa2.toString());

  }
}
```

- `Encapsulamento`

> Principio que ele envolve a proteção dos dados de uma classe para proteger os dados, ter controle de acesso e assim tornar a aplicação segura. Uma classe torna-se encapsulada quando seus dados se tornam private onde é removida toda visualização e manipulação de informações dos dados. A partir dai cria-se getter and setters, métodos construtores, hashcode and equals, dentre outros métodos que podem ser criados. O legal é analisar o que cada método faz por exemplo o hashcode and equals que faz uma validação com dados onde não deixa duplicar itens de forma intencional.

> Construtor é um método da classe que ele é chamado automáticamente quando o objeto da classe é criado

```java
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

```

```java
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

```

- `Herança`

> Uma classe herda algo de outra classe, como por exemplo um pouco acima existe a classe pessoa e nessa classe consta algumas variáveis definidas e em algum outro momento você vai precisar criar mais duas classes, porém essas classes vão herdar os atributos da classe pessoa, isso se chama herança. Para que ela possa ser herdada, nas novas classes deve se colocar na frente no nome da class o valor "extends Pessoa".

```java
package pessoa;

public class Professor extends Pessoa {

  private double salario;

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
}

```

- `Polimorfismo`

> São quando nossos atributos tem formas distintas e podemos dar implementações diferente a eles. Por exemplo ao método professor, recebe a String para passar o texto de pessoa e com um super podemos incrementar inserindo mensagem de cada classe.

```java
package pessoa;

public class Aluno extends Pessoa {

  private String matricula;

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  @Override
  public String toString() {
    System.out.println(super.toString());
    return "É o aluno";
  }

}
```

> Outra forma de se usar o polimorfismo é criando uma interface. Diferente das outras quando é interface precisa ser implementada. As interface não podem ser instanciadas com new ...()

```java
package veiculos;

public interface Veiculo {

  void acelerar();

  void frear();
}
```

```java
package veiculos;

public class Carro implements Veiculo {

  @Override
  public void acelerar() {
    System.out.println("Acelerando o carro");
  }

  @Override
  public void frear() {
    System.out.println("Freando o carro");
  }
}
```

```java
package veiculos;

public class TesteDeVeiculo {

  public static void main(String[] args) {
    Veiculo carro = new Carro();
    Veiculo moto = new Moto();

    carro.acelerar();
    carro.frear();

    moto.acelerar();
    moto.frear();
  }
}
```

- `Exceções`

> Existem dois tipos de exceções em java, são as verificadas e não verificadas. Exceções são criadas para tratar os erros.

> verificadas são aquelas que o compilador do java exige que voce trate as exceções, são as previstas.

> não verificadas são as exceções que o compilador não reconhece que vai dar o erro, as inesperadas.

```java
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

```

- `Construtor`

> É um metodo que é chamado quando um objeto é criado, ele também pode ser utilizado para inicializar um atributo. O construtor precisa ter o nome da classe. Um construtor não possui retorno onde automaticamente ele é um VOID. Pode ser um construtor vazio ou com parametros. O mesmo construtor pode ser instanciado mais de uma vez. Quando uma classe é criada sem construtor definido, automaticamente o java irá criar um porém sem parametros.

```java
package construtor;

public class Construtor {

  private int numero;

  public Construtor(int numero) {
    this.numero = numero;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

}
```

```java
package construtor;

public class TesteDeConstrutor {

  public static void main(String[] args) {

    Construtor construtor = new Construtor(35);

    System.out.println(construtor);
  }
}
```

- `Wrapper Classes`

> Objeto para embrulhar os dados do tipo primitivo. Permite ter acesso as propriedades de cada tipo primitivo. No Wrapper é possível definir um valor nulo e no tipo primitivo não é possível.

```java
package wrapper;

public class Wrapper {

  public static void main(String[] args) {

    int tipoInt = 1;
    float tipoFloat = 1;
    boolean tipoBoolean = false;

    Float tipFloat2 = 1F;
    Boolean tipoBoolean2 = false;
    Integer tipoInteger = 1;

  }
}
```
