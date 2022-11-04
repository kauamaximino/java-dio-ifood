import java.util.Scanner;

public class NotaMedia {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {

      int numero;

      int count = 0;
      int maior = 0;
      int media = 0;

      do {
        System.out.println("Digite o número: ");
      numero = scanner.nextInt();
      count += 1;
      if (numero > maior) {
        maior = numero;
      }
      media = media + numero;

      }
      while (count < 5);

      System.out.println("A média de todos os números é: " + media / 5);
      System.out.println("Maior número: " + maior);
    }
  }
}
