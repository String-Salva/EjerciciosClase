package unidad6.ejercicio3;

public class Main {
    public static void main(String[] args) {
        double[] x = new double[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = 5 * Math.random();
            System.out.println("x[" + i + "] = " + x[i]);
        }
        System.out.println("Minimo : " + Math2.minN(x));
        System.out.println("Maximo : " + Math2.maxN(x));
        System.out.println("Sumatorio : " + Math2.sumatorio(x));
        System.out.println("Media arit. : " + Math2.mediaAritmetica(x));
        System.out.println("Media geom. : " + Math2.mediaGeometrica(x));
    }
}
