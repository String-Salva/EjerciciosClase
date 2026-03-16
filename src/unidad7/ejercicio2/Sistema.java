package unidad7.ejercicio2;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        final int CONSTANTE = 10;
        Mundo[] mundos = new Mundo[CONSTANTE];

        for (int i = 0; i < CONSTANTE; i++) {
            mundos[i] = new Mundo();
        }

        Scanner sc = new Scanner(System.in);

        try {
            for (int i = 0; i < CONSTANTE; i++) {
                System.out.println("Introduce el tamaño del diametro de cada mundo");
                mundos[i].setDiametro(Float.parseFloat(sc.nextLine()));
            }
        } catch (NumberFormatException e) {
            System.out.println("Formato inválido, por favor introduzca otro número");

        }
    }
}
