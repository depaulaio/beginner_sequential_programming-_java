import java.util.Scanner;

public class Padaria {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double quantPaes, quantPq, quantTotal, precoPao, precoPq, valorAPagar, inv;
    precoPao = 0.20;
    precoPq = 2.80;
    System.out.print("Qual a quantidade de pães franceses vendidos: ");
    quantPaes = sc.nextDouble();
    System.out.print("Qual a quantidade de pães de queijo vendidos: ");
    quantPq = sc.nextDouble();

    quantTotal = (quantPaes + quantPq);
    System.out.println("A quantidade de pães franceses e pães de queijos vendidos foi de: " + quantTotal);

    valorAPagar = ((precoPao * quantPaes) + (precoPq * quantPq));
    System.out.println("O valor arrecadado em venda de pães franceses e de pães de queijo foi de : R$ " + valorAPagar);

    inv = valorAPagar * 0.1;
    System.out.println("O valor a ser investido é de: R$ " + inv);
  }
}