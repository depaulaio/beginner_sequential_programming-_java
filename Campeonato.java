import java.util.Scanner;

public class Campeonato {
  public static void main(String[] args) {
    double numeroVitorias, numeroEmpates, numeroDerrotas, partRest, totalJogos, calcPts;
    Scanner sc = new Scanner(System.in);

    totalJogos = 10;
    System.out.print("Em um total de 10 partidas, qual o número do vitórias do time: ");
    numeroVitorias = sc.nextDouble();
    partRest = (totalJogos - numeroVitorias);

    System.out.print("Em um total de " + partRest + ", qual o número de empates do time: ");
    numeroEmpates = sc.nextDouble();

    partRest = (totalJogos - (numeroVitorias + numeroEmpates));
    numeroDerrotas = partRest;
    System.out.println("Com isso " + numeroDerrotas + ", foi o número de derrotas do time.");

    calcPts = ((numeroVitorias * 3) + (numeroEmpates * 1));
    System.out.println("Então o número de pontos feito pelo time foi de: " + calcPts + " pontos.");

    if (calcPts >= 18) {
      System.out.print("LOGO, O TIME FEZ UMA BOA CAMPANHA!");
    } else {
      System.out.print("LOGO, O TIME DEIXOU A DESEJAR!");
    }

  }
}
