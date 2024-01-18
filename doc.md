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
