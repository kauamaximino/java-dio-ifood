import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
      System.out.println("Qual é o seu nome?");
      String nome = scanner.next();

      System.out.println("Qual é o seu sobrenome?");
      String sobrenome = scanner.next();

      System.out.println("Qual é a sua idade?");
      int idade = scanner.nextInt();

      System.out.println("Qual é a sua altura?");
      double altura = scanner.nextDouble();

      System.out.println("Olá, " + nome + " " + sobrenome + "!");
      System.out.println("Você tem " + idade + " anos e " + altura + " metros de altura.");
    }
  }
}
