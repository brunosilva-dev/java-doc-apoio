package pessoa;

public class TesteDePessoa {

  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa();

    pessoa1.setNome("Bruno");
    pessoa1.setCpf("11122233344");
    pessoa1.setIdade(35);

    System.out.println(pessoa1.toString());
    System.out.println("----------------");

    Pessoa pessoa2 = new Pessoa();

    pessoa2.setNome("Jéssica");
    pessoa2.setCpf("44433322211");
    pessoa2.setIdade(32);

    System.out.println(pessoa2.toString());
    System.out.println("----------------");

    Professor professor = new Professor();

    professor.setNome("Daniele");
    professor.setCpf("12345678900");
    professor.setIdade(33);
    professor.setSalario(50000.00);

    System.out.println(professor.toString());

    System.out.println("----------------");

    Aluno aluno = new Aluno();
    aluno.setCpf("98765432100");
    aluno.setIdade(19);
    aluno.setNome("Fernanda");
    aluno.setMatricula("123045607890");

    System.out.println(aluno.toString());

  }
}
