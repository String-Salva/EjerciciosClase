public class Ejercicio7 {
    public static void main(String[] args) {


        int[] a = {1, 2, 3, 4, 5};

        int[] b = new int[a.length];

        for (int i = a.length - 1; i >= 0; i--) {
            b[a.length - 1 - i] = a[i];

        }
        for (int i : b) {
            System.out.print(i + " ");
        }
    }
}
