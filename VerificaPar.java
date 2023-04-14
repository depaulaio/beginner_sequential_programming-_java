import java.util.Scanner;

public class VerificaPar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num;

    System.out.print("Digite o número: ");
    num = sc.nextInt();

    if (num % 2 == 0) {
      System.out.print("O " + num + " é um múltiplo de 2!");
    } else {
      System.out.print("O " + num + " não é um múltiplo de 2!");
    }
  }
}