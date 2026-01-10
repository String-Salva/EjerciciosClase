
/*
Implementar en Java un algoritmo matemático para generar un triángulo de Tartaglia de 6
filas. Este triángulo tiene una forma tal que así:
    1
    1 1
    1 2 1
    1 3 3 1
    1 4 6 4 1
    1 5 10 10 5 1
    1 6 15 20 15 6 1
Donde cada número se calcula como la suma de los dos que tiene colocados sobre sí
mismo, salvo aquellos que están en las aristas (que serán siempre de valor 1).
 */
public class Ejercicio10 {

    public static void main(String[] args) {

        int[][] matriz = new int[7][7];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = matriz[i - 1][j - 1] + matriz[i - 1][j];
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {

            for (int s = 0; s < matriz.length - 1 - i; s++) {
                System.out.print(" "); 
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

}
