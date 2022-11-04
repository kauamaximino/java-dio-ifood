import java.util.Scanner;

public class Fatorial {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.println("Fatorial: ");
      int fatorial = scan.nextInt();

      int multiplicacao = 1;

      System.out.print(fatorial + "! = ");

      for (int i = fatorial; i > 0; i--) {
        multiplicacao *= i;
      }

      System.out.println(multiplicacao);
    }
  }
}
