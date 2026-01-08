import java.util.Scanner;

public class Ejercicio8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de alumnos");
        int numeroAlumnos = sc.nextInt();
        double[] notas = new double[numeroAlumnos];
        int suma = 0;

        for (int i = 0; i < numeroAlumnos; i++) {
            System.out.println("Introduce la nota del alumno " + (i + 1));
            notas[i] = sc.nextDouble();
            suma += notas[i];
        }
        double media = (double) suma / (double) numeroAlumnos;
        int contadorEncimaMedia = 0;
        for (int i = 0; i < numeroAlumnos; i++) {
            if (notas[i] > media) {
                contadorEncimaMedia++;
            }

        }
        int acumulador = 0;
        int numero = 0;
        double[] notasEncimaMedia = new double[contadorEncimaMedia];

        while (numero < contadorEncimaMedia) {
            if (notas[acumulador] > media) {
                notasEncimaMedia[acumulador] = notas[acumulador++];
            }
            numero++;
        }
        sc.close();

        String a = "";


        for (double i : notasEncimaMedia) {
            a += (i + " ");
        }


        a = "[" + a + "]";
        System.out.println("Número de alumnos: " + numeroAlumnos);
        System.out.println("Media de notas " + media);
        System.out.println("Hay " + contadorEncimaMedia + " notas por encima de la media, son las siguientes:");
        a = "[" + a + "]";
        System.out.println(a);


    }
}
