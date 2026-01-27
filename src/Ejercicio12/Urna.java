package ejercicio12;

import java.util.Random;

public class Urna {

  public enum Colores {
    BLANCA, NEGRA
  }

  protected int negras;
  protected int blancas;

  public Urna(int negras, int blancas) {
    this.negras = negras;
    this.blancas = blancas;
  }

  public Urna() {
    this.negras = 0;
    this.blancas = 0;
  }

  public int totalBolas() {
    return (this.negras + this.blancas);
  }

  public Colores bola() {
    Random r = new Random();
    int aleatorio = r.nextInt(totalBolas()) + 1;
    if (aleatorio <= this.blancas) {
      blancas--;
      return Colores.BLANCA;

    } else {
      negras--;
      return Colores.NEGRA;
    }
  }

  public void ponerBlanca() {
    this.blancas++;
  }
  public void ponerNegras() {
    this.negras++;
  }

  

}
