package pessoa;

public class Professor extends Pessoa {

  private double salario;

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  @Override
  public String toString() {
    System.out.println(super.toString());
    return "É o professor";
  }
}
