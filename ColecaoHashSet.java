import java.util.HashSet;

public class ColecaoHashSet {

  public static void main(String[] args) {

    HashSet<Integer> numeros = new HashSet<>();
    numeros.add(10);
    numeros.add(11);
    numeros.add(12);
    numeros.add(13);

    // Removendo elemento
    numeros.remove(12);

    // Percorrendo o conjunto
    for (Integer elemento : numeros) {
      System.out.println(numeros.size());
    }

    // Verificando se o número existe
    System.out.println(numeros.contains(12));
  }
}
