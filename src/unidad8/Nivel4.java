package unidad8;

import java.io.*;

public class Nivel4 {
    public static void main(String[] args) {
        //Ejercicio 12 --> Copiar archivos de origen a copia
        File origen = new File("misArchivos/origen.txt");
        File copia = new File("misArchivos/copia.txt");
        FileWriter fw = null;

        try {
            fw = new FileWriter(origen);
            fw.write("Hola soy gitano y vengo a tu casamiento\nAsí soy yoooooooooooo");
            fw.close();

        } catch (java.io.IOException e) {
            System.out.println("Error escribiendo mensajes");
        }

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader("misArchivos/origen.txt"));
            bw = new BufferedWriter(new FileWriter("misArchivos/copia.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }
            br.close();
            bw.close();
        } catch (java.io.FileNotFoundException a) {
            System.out.println("Error leyendo el archivo de origen");
        } catch (java.io.IOException e) {
            System.out.println("Error escribiendo el archivo de copia");
        }


        //Ejercicio 13 Convertir a mayúsculas un archivo

        BufferedReader br4 = null;
        BufferedWriter bw4 = null;
        try {
            br4 = new BufferedReader(new FileReader("misArchivos/origen.txt"));
            bw4 = new BufferedWriter(new FileWriter("misArchivos/copia.txt"));
            String frase;

            while ((frase = br4.readLine()) != null ) {
                bw4.write(frase.toUpperCase());
                bw4.newLine();
            }
            br4.close();
            bw4.close();
        } catch (java.io.FileNotFoundException a) {
            System.out.println("Error leyendo el archivo de origen");
        } catch (java.io.IOException a) {
            System.out.println("Error escribiendo el archivo de copia");
        }

        //Ejercicio 14 --> Filtrar solo palabras con mas de 5 caracteres para el nuevo archivo

        FileReader fr = null;
        BufferedReader br1 = null;
        BufferedWriter bw1 = null;

        try {
            fr = new FileReader("misArchivos/origen.txt");
            br1 = new BufferedReader(fr);
            bw1 = new BufferedWriter(new FileWriter("misArchivos/copia.txt"));

            String linea;
            String fraseFiltrada;
            while ((linea = br1.readLine()) != null) {
                fraseFiltrada = "";
                String[] palabras = linea.split(" ");
                for (String palabra1 : palabras) {
                    if (palabra1.length() > 4) {
                        fraseFiltrada += palabra1 + " ";
                    }
                }
                bw1.write(fraseFiltrada);
                bw1.newLine();
            }
            br1.close();
            bw1.close();
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error leyendo el archivo de origen");
        } catch (java.io.IOException e) {
            System.out.println("Error escribiendo el archivo de copia");
        }

    }
}
