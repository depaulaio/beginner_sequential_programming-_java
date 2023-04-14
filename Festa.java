import java.util.Scanner;

public class Festa {
  public static void main(String[] args) {
    double idadeBaladeiro, idadeParametro;
    Scanner sc = new Scanner(System.in);

    idadeParametro = 18;

    System.out.print("Qual a idade do baladeiro: ");
    idadeBaladeiro = sc.nextDouble();

    if (idadeBaladeiro < idadeParametro) {
      System.out.print("ATENÇÃO: O baladeiro é menor de idade, ENTRADA NÃO PERMITIDA!");
    } else {
      System.out.print("ATENÇÃO: FESTA!!! O baladeiro TEM MAIORIDADE, sua entrada é PERMITIDA! ;) ");
    }
  }
}