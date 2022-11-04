import java.util.Random;

public class NumerosAleatorios {
  public static void main(String[] args) {
    Random random = new Random();


    int[] aleatory = new int[10];

    for (int i = 0; i < aleatory.length; i++) {
      int numero = random.nextInt(100);
      aleatory[i] = numero;
    };
    
    System.out.print("números Aleatórios: ");
    for (int i = 0; i < aleatory.length; i++) {
      System.out.print(aleatory[i] + " ");
    }

  }
}
