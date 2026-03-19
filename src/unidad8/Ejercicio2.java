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
        String nombreCarpeta = ruta.substring(0, ruta.lastIndexOf("/") + 1);

        File nuevoArchivo = new File(nombreCarpeta + nombreArchivo + ".bak");


        if (!isBinary) {

            try {
                System.out.println("Archivo identificado como TEXTO\nIniciando copia de seguridad...");

                //Voy a calcular el tamaño total de caracteres primero para utilizar porcentajes
                FileReader fr1 = new FileReader(ruta);
                BufferedReader br1 = new BufferedReader(fr1);
                int total = 0;
                String s;
                while ((s = br1.readLine()) != null) {
                    total += s.length();
                }
                fr1.close();
                br1.close();


                FileReader fr = new FileReader(ruta);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(nuevoArchivo);
                BufferedWriter bw = new BufferedWriter(fw);
                String linea;
                int carga = 0;
                while ((linea = br.readLine()) != null) {

                    bw.write(linea);
                    carga += linea.length();
                    System.out.println(( carga / total * 100 + " %..."));
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

            int tamanioBinario = 0;

            try (FileInputStream fis = new FileInputStream(ruta);
                 BufferedInputStream bis = new BufferedInputStream(fis);
            ) {

                int c;
                while ((c = bis.read()) != -1) {
                    tamanioBinario ++;
                }

            } catch (IOException a) {
                System.out.println("Error en la contabilización de caracteres binarios");
            }

            try {
                FileInputStream fis = new FileInputStream(ruta);
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream(nuevoArchivo);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                int dato;
                int tamanioActual = 0;
                while ((dato = bis.read()) != -1) {
                    bos.write(dato);
                    tamanioActual++;
                    System.out.println("Copiando... " + ((tamanioActual*100) / tamanioBinario) + " %");

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
