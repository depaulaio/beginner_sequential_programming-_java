import java.util.Scanner;

public class SegundosDia {
  public static void main(String[] args) {
    double horas, minutos, segundos, convSeg;
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe a hora atual do dia no sistema 24 horas: ");
    horas = sc.nextDouble();
    System.out.print("Informe os minutos da hora atual do dia no sistema 24 horas: ");
    minutos = sc.nextDouble();
    System.out.print("Informe os segundos da hora atual e de seu(s) minuto(s) atuais do dia: ");
    segundos = sc.nextDouble();
    convSeg = ((horas * 3600) + (minutos * 60) + (segundos));
    System.out.println("A quantidade de segundos passados desde o início do dia é de: " + convSeg + " segundos.");
  }
}