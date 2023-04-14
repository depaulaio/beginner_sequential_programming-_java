import java.util.Scanner;

public class Reajuste {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double salarioAtual, calcReajuste;

    System.out.print("Informe o salário atual do funcionário o qual se deseja reculcular o reajuste: R$ ");
    salarioAtual = sc.nextDouble();

    calcReajuste = ((salarioAtual) + (salarioAtual * 0.25));
    System.out
        .print("O salário atual do funcionário passará a ser de: R$ " + calcReajuste + " após o reajuste de 25%.");
  }
}