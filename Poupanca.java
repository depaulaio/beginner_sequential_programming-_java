import java.util.Scanner;

public class Poupanca {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double quant1Cent, quant5Cent, quant10Cent, quant25Cent, quant50Cent, quant1Real, quantEco;

    System.out.print("Qual a quantidade de moedas de 1 centavo que Pedrinho economizou: ");
    quant1Cent = sc.nextDouble();
    System.out.print("Qual a quantidade de moedas de 5 centavos que Pedrinho economizou:");
    quant5Cent = sc.nextDouble();
    System.out.print("Qual a quantidade de moedas de 10 centavos que Pedrinho economizou:");
    quant10Cent = sc.nextDouble();
    System.out.print("Qual a quantidade de moedas de 25 centavos que Pedrinho economizou:");
    quant25Cent = sc.nextDouble();
    System.out.print("Qual a quantidade de moedas de 50 centavos que Pedrinho economizou:");
    quant50Cent = sc.nextDouble();
    System.out.print("Qual a quantidade de moedas de 1 real que Pedrinho economizou:");
    quant1Real = sc.nextDouble();
    quantEco = (quant1Cent * 0.01) + (quant5Cent * 0.05) + (quant10Cent * 0.10) + (quant25Cent * 0.25)
        + (quant50Cent * 0.50) + (quant1Real * 1.00);
    System.out.print("O valor economizado em real é de: R$ " + quantEco);
  }
}