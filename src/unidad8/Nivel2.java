package unidad8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Nivel2 {
    public static void main(String[] args) {
        //5 Escribir en archivo

        File mensaje = new File("misArchivos/mensaje.txt");

        FileWriter fw = null;
        try {
            fw = new FileWriter(mensaje);
            fw.write("Hola bro\n");
            fw.write("Estoy haciendo pruebas en Java\n");
            fw.close();
        } catch (IOException a) {
            System.out.println("Error guardando mensaje");
        }


        //Ejercicio 6 Escribir números del 1 al 10: Guardarlos en 'numeros.txt' cada uno en una linea usando un for

        File numeros = new File("misArchivos/numeros.txt");

        FileWriter fw2 = null;

        try {
            fw2 = new FileWriter(numeros);
            for (int i = 1; i <= 10; i++) {
                fw2.write(i + "\n");
            }
            fw2.close();
        } catch (java.io.IOException error) {
            System.out.println("Error guardando mensaje");
        }

        //Ejercicio 7: Añadir texto sin borrar: Añadir 'Programa ejectuado' al final de 'log.txt' usando FileWriter en modo append

        File log =  new File("misArchivos/log.txt");
        FileWriter fw3 = null;

        try {
            fw3 = new FileWriter(log);
            fw3.write("Esto es un fichero de prueba al cual le quiero añadir un mensaje");
            fw3.close();
        } catch (IOException a) {
            System.out.println("Error guardando mensaje");
        }
        FileWriter fw4 = null;
        try {
            fw4 = new FileWriter(log,true);
            fw4.write("\nEjecución exitosa");
            fw4.close();
        } catch (java.io.IOException error) {
            System.out.println("Error guardando mensaje");
        }


    }


}


