import java.util.*;

public class Vogais {
  public static void main(String[] args) {
    String[] vetor = { "a", "a", "a", "a", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };

    int vogais = 0;
    List<String> list = new ArrayList<String>();

    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i].equals("a") || vetor[i].equals("e") || vetor[i].equals("i") || vetor[i].equals("o")
          || vetor[i].equals("u")) {
            vogais++;
            list.add("Consoante: " + vetor[i]);
          }

    }

    System.out.println("Consoantes: " + vogais);
    System.out.println("Todas as consoantes: " + list);
  }
}
