import java.util.Scanner;

public class ConvMoedas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double valorDolar, cotDolar, convMoedas;

    System.out.print("Qual o valor em dólar (U$$) a ser convertido: ");
    valorDolar = sc.nextDouble();

    System.out.print("Qual o valor da cotação do U$$ em relação ao R$: ");
    cotDolar = sc.nextDouble();

    convMoedas = (valorDolar * cotDolar);
    System.out.print("Logo, o valor convertido em R$ do valor apresentado em USS é de: R$ " + convMoedas);
  }

}