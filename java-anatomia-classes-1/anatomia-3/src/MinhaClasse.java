class MinhaClasse {
  public static void main(String[] args) {
    String meuNome = "Kauã";
    int idade = 18;
    Double altura = 1.80;

    System.out.println("Meu nome é " + meuNome + ", tenho " + idade + " anos e " + altura + " de altura.");
    System.out.println(nomeCompleto("Kauã","Maximino"));
  }

  public static String nomeCompleto(String nome, String sobrenome) {
    return nome.concat(" ").concat(sobrenome);
  }
}
