import java.util.Scanner;

public class Tabuada {
  public static void main(String[] args) {
    int numero = 0;

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Digite um número para ver sua tabuada: ");
      numero = scanner.nextInt();
    }

    for (int i = 1; i <= 10; i++) {
      System.out.println(numero + " x " + i + " = " + (numero * i));
    }

  }
}
