package unidad8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Nivel3 {
    public static void main(String[] args) {
        // 8 -> Leer archivo carácter a carácter usando FileReader y mostrarlo por pantalla

        File log = new File("misArchivos/log.txt");

        FileReader fr = null;

        try {
            fr = new FileReader(log);
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
            fr.close();

        } catch (java.io.FileNotFoundException error) {
            System.out.println("No se encuentra el archivo");
        } catch (java.io.IOException error) {
            System.out.println("Error guardando mensaje");
        }


        //Ejercicio 9 --> Leer archivo línea por línea usando BufferedReader

        BufferedReader br = null;

        try {
            fr = new FileReader(log);
            br = new BufferedReader(fr);
            System.out.println();
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();
        } catch (java.io.IOException error) {
            System.out.println("Error LEYENDO mensaje");
        }


        //Ejercicio 10, contar lineas de un fichero

        FileReader fr2 = null;
        BufferedReader br2 = null;
        int i = 0;
        try {
            fr2 = new FileReader("misArchivos/log.txt");
            br2 = new BufferedReader(fr2);
            String lineas;
            while ((lineas = br2.readLine()) != null) {
                i++;
            }
            br2.close();
            System.out.println("En este archivo hay " + i + " líneas");
        } catch (java.io.FileNotFoundException error) {
            System.out.println("Archivo no encontrado");
        } catch (java.io.IOException a) {
            System.out.println("Error LEYENDO mensaje");
        }

        //Ejercicio 11 --> Contar palabras usando split

        FileReader fr3 = null;
        BufferedReader br3 = null;

        try {
            fr3 = new FileReader("misArchivos/log.txt");
            br3 = new BufferedReader(fr3);
            String lineas;
            String[] palabras;
            int j = 1;

            while ((lineas = br3.readLine()) != null) {
                palabras = lineas.split(" ");
                System.out.println("La línea " + j++ + " tiene " + palabras.length + " palabras");
            }
            br3.close();
        } catch (java.io.FileNotFoundException a) {
            System.out.println("Archivo no encontrado");
        } catch (java.io.IOException b) {
            System.out.println("Error LEYENDO mensaje");
        }


    }
}
