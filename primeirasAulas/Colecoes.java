package primeirasAulas;

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
