
/*
Escribe un programa en Java que solicite al usuario introducir un número entero N, y
genere un array de N posiciones con números primos. Entre esos números pertenecientes
al array, el programa deberá indicarnos cuál es el de mayor valor.
import java.util.Scanner;
*/
import java.util.Scanner;

public class Ejercicio4 {

  public static boolean checkPrimo(int n) {
    if (n < 2)
      return false;
    for (int i = 2; i < n; i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el tamaño del array");
    int N = sc.nextInt();

    int[] arrayPrimos = new int[N];

    // Aquí declaro una variable para contabilizar los primos que son válidos para
    // entrar en el array de N tamaño y meto también la variable inicial

    int nPrimos = 0;
    int numero = 0;
    // Aquí hago un bucle para meter los primos

    while (nPrimos < N) {
      if (checkPrimo(numero)) {
        arrayPrimos[nPrimos++] = numero;

      }
      numero++;
    }

    String resultado = "";
    for (int i = 0; i < arrayPrimos.length; i++) {

      if (i < arrayPrimos.length - 1) {
        resultado += arrayPrimos[i] + ", ";
      } else {
        resultado += arrayPrimos[i];
      }

    }
    resultado = "[" + resultado + "]";
    System.out.println(resultado);
    sc.close();
  }

}
