import java.util.Scanner;

public class Circulo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double raioCirculo, areaCirculo, pi;
    pi = 3.14;

    System.out.print("Digite o raio do círculo em centímetros: ");
    raioCirculo = sc.nextDouble();

    areaCirculo = (pi * (raioCirculo * raioCirculo));
    System.out.println("A área do círculo de raio informado é de: " + areaCirculo + " centímetros quadrados");

  }
}