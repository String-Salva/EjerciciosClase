import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4practica {
  public static boolean checkPrimo(int n) {
    if (n < 2)
      return false;
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }

    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número para utilizarlo de tamaño en el array");
    int N = sc.nextInt();
     sc.close();
    int[] arrayPrimos = new int[N];

    int contadorPrimos = 0;
    int testNumero = 1;

    while (contadorPrimos < N) {
      if (checkPrimo(testNumero)) {
        arrayPrimos[contadorPrimos] = testNumero;
        contadorPrimos++;
      }
      testNumero++;
    }
    String s = "";
    for (int i = 0; i < arrayPrimos.length; i++) {
      if (i == arrayPrimos.length - 1) {
        s += arrayPrimos[i];
      } else {
        s += arrayPrimos[i] + ", ";
      }
    }
    s = "[" + s + "]";

    System.out.println(s);

    System.out.println(
        "El mayor número primo, siempre va a coincidir con el último, así que el mayor será el último número almacenado en el Array");
    Arrays.sort(arrayPrimos);
    System.out.println("El número más grande del array es --> " + "[" + arrayPrimos[(arrayPrimos.length - 1)] + "]");
  }

}
