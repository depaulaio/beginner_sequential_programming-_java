import java.util.Scanner;

public class QuadradoDaDiferenca {
  public static void main(String[] args) {
    int valorA, valorB, calcDif, calcQuadDif;
    Scanner sc = new Scanner(System.in);

    System.out.print("Infome o valor de A: ");
    valorA = sc.nextInt();

    System.out.print("Informe o valor de B: ");
    valorB = sc.nextInt();

    calcDif = (valorA - valorB);
    System.out.println("O valor da diferença entre os valores A e B é de: " + calcDif);

    calcQuadDif = (calcDif * calcDif);
    System.out.print("Logo, o quadrado da diferença dos valores A e B são de: " + calcQuadDif);
  }
}