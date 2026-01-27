package ejercicio12;

public class TestUrna {
  public static void main(String[] args) {
    Urna a = new Urna(4, 6);
    int contadorBlancas = a.blancas;
    int contadorNegras = a.negras;

    int contadorBlancas2;
    int contadorNegras2;

    System.out.println("Hay un total de " + a.totalBolas() + " en la urna");

    if (a.totalBolas() >= 2) {
      a.bola();
      System.out.println("Como quedan mas de 1 bola en la urna, sacamos dos bolas");
      if (a.negras != contadorNegras) {
        System.out.println("Sacamos una bola negra");
        contadorNegras2 = a.negras;
      } else {
        System.out.println("Sacamos una bola blanca");
        contadorBlancas2 = a.blancas;
      }
      a.bola();
      if (a.negras != contadorNegras) {
        System.out.println("Sacamos una bola negra y quedan " + a.totalBolas() + " bolas en la urna");
        contadorNegras2 = a.negras;
        System.out.println("Por lo que quedan " + a.totalBolas());
      } else {
        System.out.println("Sacamos una bola blanca y quedan " + a.totalBolas() + " en la urna");
        contadorBlancas2 = a.blancas;
        System.out.println("Por lo que quedan " + a.totalBolas());
      }
    } else if (a.negras == contadorNegras - 2 || a.blancas == contadorBlancas - 2) {
      a.ponerBlanca();
      System.out.println("Ponemos una bola blanca y quedan " + a.totalBolas() + " en la urna");
    } else {
      a.ponerNegras();
      System.out.println("Ponemos una bola negra y quedan " + a.totalBolas() + " en la urna");
    }

    if (a.totalBolas() == 1) {
      System.out.println("La última bola ha sido de color " + a.bola());
    }

  }
}
