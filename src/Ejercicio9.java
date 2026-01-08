public class Ejercicio9 {
    static void main(String[] args) {
        int[] fibonacci = new int[30];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] += fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int i : fibonacci) {
            System.out.println(i + " ");
        }
    }
}
