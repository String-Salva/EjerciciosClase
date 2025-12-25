/*Implementar en Java un algoritmo matemático para generar un triángulo de Tartaglia de 6
filas. Este triángulo tiene una forma tal que así:
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
1 6 15 20 15 6 1
Donde cada número se calcula como la suma de los dos que tiene colocados sobre sí
mismo, salvo aquellos que están en las aristas (que serán siempre de valor 1). */

public class Ejercicio10 {
  public static void main(String[] args) {
    int[][] tartaglia = new int[6][6];

    for (int i = 0; i < 6; i++) {
      for (int j = 0; j <= i; j++) {
        if (i == 0 || j == i) {
          tartaglia[i][j] = 1;
        } else {
          tartaglia[i][j] += tartaglia[i - 1][j] + tartaglia[i - 1][j];
        }
      }
    }
    for (int i = 0; i < tartaglia.length; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(tartaglia[i][j] + " ");
      }
      System.out.println();
    }

  }
}