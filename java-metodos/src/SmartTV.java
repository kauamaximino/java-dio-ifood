public class SmartTV {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void mudarCanal(int novoCanal) {
    canal = novoCanal;
  }

  public void aumentarCanal() {
    if (ligada) {
      canal++;
    }
  }

  public void diminuirCanal() {
    if (ligada) {
      canal--;
    }
  }

  public void aumentarVolume() {
    if (ligada) {
      volume++;
    }
  }

  public void diminuirVolume() {
    if (ligada) {
      volume--;
    }
  }

  public void ligar() {
    ligada = true;
  }

  public void desligar() {
    ligada = false;
  }
}
