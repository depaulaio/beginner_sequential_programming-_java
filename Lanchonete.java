import java.util.Scanner;

public class Lanchonete {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    double fatQueijos, fatPresunto, burguer, quantSanduba, convQueijos, convPresunto, convBurgues, quantQueijos,
        quantPresunto, quantBurguers;

    fatQueijos = 50;
    fatPresunto = 50;
    burguer = 100;
    System.out.print("Informe a quantidade de sanduíches a serem feitos: ");
    quantSanduba = sc.nextDouble();

    convQueijos = 0.05;
    convPresunto = 0.05;
    convBurgues = 0.1;
    quantQueijos = (quantSanduba * convQueijos);
    quantPresunto = (quantSanduba * convPresunto);
    quantBurguers = (quantSanduba * convBurgues);
    System.out.println("A quantidade necessária em quilo de queijo para compra é de: " + quantQueijos + " Kg.");
    System.out.println("A quantidade necessária em quilo de presunto para compra é de: " + quantPresunto + " Kg.");
    System.out.println("A quantidade necessária em quilo de hamburguers para compra é de: " + quantBurguers + " Kg.");
  }
}