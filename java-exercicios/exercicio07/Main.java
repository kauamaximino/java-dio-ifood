// Uma busca sequencial se caracteriza por percorrermos todos os  elementos de uma estrutura em busca do elemento “X” desejado. Neste desafio, dada uma estrutura de vetor A [a1, a2...an], percorra todo o vetor fazendo as comparações de A[N] = X. Caso a condição seja verdadeira, “X” existe na estrutura e a busca será concluída com sucesso.

import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    int[] elementos = { 64, 137, -16, 43, 67, 81, -90, 212, 10, 75 };

    int numero = leitor.nextInt();

    boolean encontrado = false;

    for (int i = 0; i < elementos.length; i++) {
      if (elementos[i] == numero) {
        System.out.println("Achei " + numero + " na posição " + i);
        encontrado = true;
        break;
      }
    }

    if (!encontrado) {
      System.out.println("Numero " + numero + " nao encontrado");
    }
  }
}
