package unidad6.ejercicio3;

public class Math2 {

    public static double maxN(double[] n) {
        double maximo = n[0];
        for (int i = 1; i < n.length; i++) {
            if (n[i] >= maximo) {
                maximo = n[i];
            }
        }
        return maximo;
    }

    public static double minN(double[] n) {
        double minimo = n[0];
        for (int i = 1; i < n.length; i++) {
            if (n[i] < minimo) {
                minimo = n[i];
            }
        }
        return minimo;
    }

    public static double sumatorio(double[] n) {
        double total = 0.0;
        for (int i = 0; i < n.length; i++) {
            total += n[i];
        }
        return total;
    }

    public static double mediaAritmetica(double[] n) {
        return sumatorio(n) / n.length;
    }

    public static double mediaGeometrica(double[] n) {
        double interiorRaiz = 1.0;
        for (int i = 0; i < n.length; i++) {
            interiorRaiz *= n[i];
        }
        return Math.pow(interiorRaiz, 1.0 / n.length);
    }
}
