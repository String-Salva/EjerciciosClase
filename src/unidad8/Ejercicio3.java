package unidad8;

import java.io.*;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la ruta de un archivo .txt");
        String ruta1 = sc.nextLine();
        System.out.println("Introduce la ruta de un archivo .txt");
        String ruta2 = sc.nextLine();

        File archivo1 = new File(ruta1);
        File archivo2 = new File(ruta2);

        if (!(archivo1.exists()) || !(archivo2.exists())) {
            throw new RuntimeException("Alguno de los dos archivos no existe subnormal");
        }
        if (!ruta1.endsWith(".txt") || !ruta2.endsWith(".txt")) {
            throw new RuntimeException("Alguno de los dos archivo no son formato .txt");
        }

        System.out.println("Introduce la ruta donde quieres guardarlo");
        String rutaDestino = sc.nextLine();

        String nombreFusion = ruta1.substring(ruta1.lastIndexOf("/") + 1, ruta1.lastIndexOf(".")) + "_" + ruta2.substring(ruta2.lastIndexOf("/") + 1, ruta2.lastIndexOf(".")) + ".txt";

        File fusion = new File(rutaDestino.concat(nombreFusion));

        //Proceso de fusión

        try {
            FileReader fr = new FileReader(ruta1);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(fusion);
            BufferedWriter bw = new BufferedWriter(fw);

            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }
            br.close();
            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("No existe dicho archivo");
        } catch (IOException a) {
            System.out.println("Problemas de escritura");
        }

        try (FileReader fr = new FileReader(ruta2);
             BufferedReader br = new BufferedReader(fr);
             FileWriter fw = new FileWriter(fusion, true);
             BufferedWriter bw = new BufferedWriter(fw);) {


            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }
            br.close();
            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("No existe dicho archivo");
        } catch (IOException a) {
            System.out.println("Problemas de escritura");
        }

        //Ahora vamos a leer en consola el resultado

        try {
            FileReader fr = new FileReader(fusion);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("No existe dicho archivo");
        } catch (IOException a) {
            System.out.println("Problemas de lectura");
        }
    }
}
