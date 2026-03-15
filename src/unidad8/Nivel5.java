package unidad8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Nivel5 {
    public static void main(String[] args) {
        //Ejercicio 15 --> Escribir números en binario: Guardar 10, 20, 30, 40 y 50 en 'numeros.dat' usando FileOutputStream.

        int[] n = {10, 20, 30, 40, 50};

        File numeros = new File("misArchivos/numeros.dat");

        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(numeros);
            for (int i : n) {
                fos.write(i);
            }
            fos.close();
        }catch (java.io.FileNotFoundException e){
            System.out.println("No se encontro el archivo");
        } catch (java.io.IOException e) {
            System.out.println("Error de escritura");
        }

        //16. Leer archivo binario 'numeros.dat' y mostrar los números.

        FileInputStream fis;

        try {
            fis = new FileInputStream("misArchivos/numeros.dat");
            int j;
            while ( (j = fis.read()) != -1 ) {
                System.out.println(j);
            }
            fis.close();
        } catch (java.io.FileNotFoundException a) {
            System.out.println("No se encontro el archivo");
        } catch(java.io.IOException e) {
            System.out.println("Error de lectura");
        }
    }
}
