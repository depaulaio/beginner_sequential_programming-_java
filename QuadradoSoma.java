import java.util.Scanner;

public class QuadradoSoma {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int varA, varB, varC, sumVars, calcQuadSum;

    System.out.print("Digite o valor de A: ");
    varA = sc.nextInt();

    System.out.print("Digite o valor de B: ");
    varB = sc.nextInt();

    System.out.print("Digite o valor de C: ");
    varC = sc.nextInt();

    sumVars = (varA + varB + varC);
    System.out.print("O valor da soma das variáveis de entrada é de: " + sumVars);

    calcQuadSum = (sumVars * sumVars);
    System.out.println("Logo, o quadrado da soma das variáveis de entrada é de: " + calcQuadSum);
  }
}