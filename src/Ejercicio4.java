
/*
Escribe un programa en Java que solicite al usuario introducir un número entero N, y
genere un array de N posiciones con números primos. Entre esos números pertenecientes
al array, el programa deberá indicarnos cuál es el de mayor valor.
import java.util.Scanner;
*/

import java.util.Scanner;

/*
Escribe un programa en Java que solicite al usuario introducir un número entero N, y
genere un array de N posiciones con números primos. Entre esos números pertenecientes
al array, el programa deberá indicarnos cuál es el de mayor valor.
 */
public class Ejercicio4 {
    public static boolean checkPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero N para generar un array de N posiciones con números primos");
        int N = sc.nextInt();

        int[] array = new int[N];


        int contador = 0;
        int numero = 2;

        while (contador < N) {
            if (checkPrimo(numero)) {
                array[contador++] = numero;
            }
            numero++;
        }
        for (int i : array) {
            System.out.print(i + ", ");
        }
        sc.close();
    }
}


