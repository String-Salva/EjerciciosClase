package unidad8;

import java.io.*;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la ruta de un archivo existente");
        String ruta = sc.nextLine();
        boolean isBinary;
        if ((ruta.endsWith(".txt")) || (ruta.endsWith(".csv"))) {
            isBinary = false;
        } else {
            isBinary = true;
        }
        String nombreArchivo = ruta.substring(ruta.lastIndexOf("/") + 1, ruta.lastIndexOf("."));
        String nombreCarpeta = ruta.substring(0, ruta.lastIndexOf("/"));

        File nuevoArchivo = new File(nombreCarpeta + nombreArchivo + ".bak");


        if (!isBinary) {
            FileReader fr = null;
            try {
                System.out.println("Archivo identificado como TEXTO\nIniciando copia de seguridad...");
                fr = new FileReader(ruta);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(nuevoArchivo);
                BufferedWriter bw = new BufferedWriter(fw);
                String linea;
                long carga = 0;
                while ((linea = br.readLine()) != null) {
                    bw.write(linea);
                    carga += nuevoArchivo.length();
                    System.out.println(carga / 1024 + " kilobytes copiados...");
                    bw.newLine();
                }
                bw.close();
                fw.close();
                System.out.println("Finalizada la copia de seguridad con éxito: " + nombreArchivo + ".bak");

            } catch (FileNotFoundException a) {
                System.out.println("Archivo no encontrado");
            } catch (IOException a) {
                System.out.println("Error al cargar archivo");
            }
        } else {
            System.out.println("Archivo identificado como BINARIO\nIniciando copia de seguridad...");

            try {
                FileInputStream fis = new FileInputStream(ruta);
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream(nuevoArchivo);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                long carga = 0;
                int dato;
                while ((dato = bis.read()) != -1) {
                    bos.write(dato);
                    carga += nuevoArchivo.length();
                    System.out.println((double)(carga / 1024) + " kilobytes copiados...");

                }
                bos.close();
                fis.close();
                System.out.println("Finalizada la copia de seguridad con éxito: " + nombreCarpeta + nombreArchivo + ".bak");


            } catch (FileNotFoundException e) {
                System.out.println("Archivo no encontrado");
            } catch (IOException e) {
                System.out.println("Error al cargar archivo");
            }


        }
    }
}
