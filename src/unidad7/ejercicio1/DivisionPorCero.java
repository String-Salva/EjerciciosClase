package unidad7.ejercicio1;

public class DivisionPorCero {
    public static int division(int a, int b) {
        if (b == 0) {
            throw new DivisionPorCeroException("No se puede dividir por zero");
        } else {
            return a / b;
        }
    }
    public static void main(String[] args) {

        try {
            int a = division(1, 0);


            System.out.println(a);
        } catch (DivisionPorCeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
