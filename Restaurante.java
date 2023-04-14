import java.util.Scanner;

public class Restaurante {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double kg, pesoPrato, valorAPagar;
    kg = 32.50;

    System.out.print("O peso do prato em quilos é de: ");
    pesoPrato = sc.nextDouble();

    valorAPagar = (kg * pesoPrato);
    System.out.println("O valor a pagar é de: R$ " + valorAPagar);

  }
}