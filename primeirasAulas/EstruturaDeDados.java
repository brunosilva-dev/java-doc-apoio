package primeirasAulas;

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
