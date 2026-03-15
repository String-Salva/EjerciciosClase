package unidad8;

import java.io.*;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileRoot = "misArchivos/log.txt";
        File log = new File(fileRoot);
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(fileRoot);
            bw = new BufferedWriter(fw);
            String linea = "";

            while (!linea.equalsIgnoreCase("fin")) {
                System.out.println("Dame cadenas de caracteres");
                linea = sc.nextLine();
                linea = linea.trim().toLowerCase();
                bw.write(linea);
                bw.newLine();
            }
            sc.close();
            bw.close();
        } catch (java.io.FileNotFoundException a) {
            System.out.println("No se encontro el archivo");
        } catch (java.io.IOException a) {
            System.out.println("Error al cargar el archivo");
        }

        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(fileRoot);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (FileNotFoundException a) {
            System.out.println("Archivo no encontrado");
        } catch (IOException a) {
            System.out.println("Error al leer el archivo");
        }


    }
}
