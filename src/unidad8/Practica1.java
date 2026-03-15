package unidad8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Practica1 {
    public static void main(String[] args) {

        // 1 Crear objeto y mostrar si existe, si es archivo, si es directorio, su tamaño y su ruta absoluta

        File archivo = new File("misArchivos/prueba.txt");

        System.out.println(archivo.exists());
        System.out.println(archivo.isFile());
        System.out.println(archivo.isDirectory());
        System.out.println(archivo.length());
        System.out.println(archivo.getAbsolutePath());

        //2 Crear archivo, si ya existe, mostrar que el archivo ya existe, y si no existe
        //crear usando createNewFile()

        File archivo2 = new File("./misArchivos/archivo.txt");
        try {
            if (archivo2.createNewFile()) {
                System.out.println("Archivo guardado exitosamente");
            } else {
                System.out.println("Archivo no guardado");
            }
        } catch (IOException a) {
            System.out.println("Error guardando archivo");
        }

        // 3 Crear directorio

        File carpeta = new File("carpeta");

        if (carpeta.mkdir()) {
            System.out.println("Carpeta creada");
        } else {
            System.out.println("Carpeta no creada");
        }
        // 4 Listar archivos de una carpeta

        File documentos = new File("documentos");
        documentos.mkdir();

        System.out.println(documentos.list());

    }
}
