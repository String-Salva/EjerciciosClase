import java.util.Scanner;

public class Ejercicio9 {

    public static void fibonacci(int n) {
        int[] numero = new int[n];
        numero[0] = 1;
        numero[1] = 1;

        if (n < 2) {
            throw new Error("El número debe ser mayor de 2");
        }
        String s = "";
        for (int i = 2; i < n; i++) {
            numero[i] += numero[i - 1] + numero[i - 2];
        }

        for (int i = 0; i < n; i++) {
            if (i == (n - 1)) {
                s += numero[i];
            } else {
                s += numero[i] + ", ";
            }
        }
        s = "Aquí están los " + n + " primeros números de la secuencia de Fibonacci --> \n" + "[" + s + "]";
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de valores que quieres de la sucesión de números de Fibonacci");
        int n = sc.nextInt();
        

        try {
            fibonacci(n);
        } catch (Error a) {
            System.out.println("El número a introducir debe ser mayor que 2 bro, introduce otro");
            n = sc.nextInt();
            fibonacci(n);
        }
        sc.close();
    }
}
