import java.util.*;

public class Consoantes {
  public static void main(String[] args) {
    String[] vetor = { "a", "a", "a", "a", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };

    int consoantes = 0;
    List<String> list = new ArrayList<String>();

    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i].equals("a") || vetor[i].equals("e") || vetor[i].equals("i") || vetor[i].equals("o")
          || vetor[i].equals("u")) {
            consoantes++;
            list.add("Consoante: " + vetor[i]);
          }

    }

    System.out.println("Consoantes: " + consoantes);
    System.out.println("Todas as consoantes: " + list);
  }
}
