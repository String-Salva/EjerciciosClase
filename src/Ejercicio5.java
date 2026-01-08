import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

    // HAGO UN MÉTODO PARA QUE DEVUELVA EL RESULTADO DE ESCALAR DOS ARRAYS DE SIMILAR MEDIDA

    public static int escalar(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new Error("Arrays iguales, tienen que tener la misma medida");

        }
        int resultado = 0;
        for (int i = 0; i < a.length; i++) {
            resultado += a[i] * b[i];
        }
        return resultado;

    }

    public static void main(String[] args) {

        // INICIO EL TECLADO, LA FUNCIÓN RANDOM Y PREGUNTO AL USUARIO UN VALOR PARA N


        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Introduce un valor para N");
        int N = sc.nextInt();


        // DECLARO LOS DOS PRIMEROS ARRAYS QUE ME PIDE EL EJERCICIO

        int[] A1 = new int[N];
        int[] A2 = new int[N];

        // HAGO UN BUCLE PARA DARLE VALORES ALEATORIOS EN LOS ARRAYS

        for (int i = 0; i < N; i++) {
            A1[i] = r.nextInt(N) + 1;
            A2[i] = r.nextInt(N) + 1;
        }

        // DECLARO EL NUEVO ARRAY (A3) CONSTRUIDO A PARTIR DE LA SUMA DE LOS OTROS DOS

        int[] A3 = new int[N];

        for (int i = 0; i < N; i++) {
            A3[i] = A1[i] + A2[i];
        }

        // DECLARO EL NUEVO ARRAY (A4) CONSTRUIDO A PARTIR DE LA MULTIPLICACIÓN DE LOS OTROS DOS

        int[] A4 = new int[N];

        for (int i = 0; i < N; i++) {
            A4[i] = A1[i] * A2[i];
        }

        // UTILIZO EL MÉTODO PARA HAYAR EL RESULTADO DE ESCALAR LOS DOS ARRAYS
        System.out.println("A1");
        for (int i : A1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("A2");
        for (int i : A2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Escalar:");

        System.out.println(escalar(A1, A2));


    }
}
