import java.util.Scanner;

public class NomeIdade {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String nome;
      int idade;


      while (true) {
        System.out.println("Digite seu nome: ");
        nome = scanner.next();
        if (nome.equals("0")) break;

        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();
        if (idade == 0) break;
      }
      
      System.out.println("Saiu do while");
    }
  }
}
