public class Usuario {
  public static void main(String[] args) throws Exception {

      SmartTV smartTV = new SmartTV();

      System.out.println("TV ligada? " + smartTV.ligada);
      System.out.println("Canal: " + smartTV.canal);
      System.out.println("Volume: " + smartTV.volume);

      smartTV.ligar();

      // System.out.println("TV ligada? " + smartTV.ligada);

      // smartTV.desligar();

      // System.out.println("TV ligada? " + smartTV.ligada);

      smartTV.aumentarVolume();
      smartTV.aumentarVolume();
      smartTV.aumentarVolume();

      System.out.println("Volume: " + smartTV.volume);

      smartTV.mudarCanal(0);

      System.out.println("Canal: " + smartTV.canal);

      smartTV.mudarCanal(19);

      System.out.println("Canal: " + smartTV.canal);

      smartTV.aumentarCanal();

      System.out.println("Canal: " + smartTV.canal);

      smartTV.diminuirCanal();

      System.out.println("Canal: " + smartTV.canal);
  }
}
