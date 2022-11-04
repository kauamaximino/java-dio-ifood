import java.util.Scanner;

class ParEImpar {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int count = 0;
      int numero;
      int numerosPares = 0;
      int numerosImpares = 0; 

      System.out.println("Quantos números você quer digitar?");
      int quantidade = scanner.nextInt();

      do {
        System.out.println("Informe um número: ");
        numero = scanner.nextInt();

        if (numero % 2 == 0) numerosPares++;
        else numerosImpares++;

        count++;

      } while (count < quantidade);

      System.out.println("Você digitou " + numerosPares + " números pares e " + numerosImpares + " números ímpares");
    }
  }
}