package unidad8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Nivel6 {
    public static void main(String[] args) {
    // Copiar archivo usando BufferedInputStream y BufferedOutputStream

        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        FileInputStream fis = null;
        BufferedInputStream bis = null;

        String archivo = "misArchivos/numeros.dat";
        try {
            fos = new FileOutputStream("misArchivos/copiaNumeros.dat");
            bos = new BufferedOutputStream(fos);
            fis = new FileInputStream(archivo);
            bis = new BufferedInputStream(fis);

            int dato;
            while ((dato = bis.read()) != -1) {
                bos.write(dato);
            }
            bis.close();
            bos.close();



        } catch(java.io.FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (java.io.IOException e) {
            System.out.println("Error al abrir el archivo");
        }

    }
}
