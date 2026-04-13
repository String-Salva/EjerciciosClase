package swing.ej2;

import swing.ej2.excepciones.CalificationsLimitException;
import swing.ej2.excepciones.NotaInvalidaException;

import javax.swing.*;
import java.io.*;

public class Herramientas {
    //Voy a crear un método de validación para que no haya alumnos repetidos
    public static boolean yaTieneNota(String nombre, String[] nombres) {
        for (int i = 0; i < nombres.length; i++) {
            if (nombre.equals(nombres[i])) {
                return true;
            }
        }
        return false;
    }

    // Voy a crear los métodos para añadir las calificaciones a los Arrays creados, obligandome posteriormente a gestionar error si se llena el almacenamiento

    public static void addNotas(int contador, String nombre, String nota, String[] nombres, double[] notas, JTextArea a) throws CalificationsLimitException, NotaInvalidaException {
        if (contador == nombres.length) {
            throw new CalificationsLimitException("Está el almacenamiento de calificaciones lleno");
        } else if (Double.parseDouble(nota) < 0.0 || Double.parseDouble(nota) > 10.0) {
            throw new NotaInvalidaException("La nota no puede estar vacía, ser negativa ni ser por encima del máximo (10)");
        } else {
            nombres[contador] = nombre;
            notas[contador] = Double.parseDouble(nota);
            mostrarNotas(nombres, notas, a);
        }
    }


    // Método para formatear las líneas del TextArea

    public static String updateListadoNotas(String[] nombres, double[] notas) {
        String s = "";
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i] != null) {
                s += nombres[i] + "   ->   " + notas[i] + "\n";
            } else {
                break;
            }
        }
        return s;
    }


    // Método para confirmar si se sobreescribe la nota a un usuario que ya existe en memoria
    // Según he visto, este método además de lanzar la pantalla, devuelve 0 si el usuario ha pulsado SÍ y devuelve 1 si el usuario ha pulsado NO
    public static void confirmarNotas(String alumno, double nota, String[] nombres, double[] notas, JTextArea textArea) {
        int siOno = JOptionPane.showConfirmDialog(
                null,
                "Este nombre está guardado en memoria, estás seguro de que quieres sobreescribir su nota?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (siOno == 0) {
            for (int i = 0; i < nombres.length; i++) {
                if (nombres[i] != null) {
                    if (nombres[i].equals(alumno)) {
                        notas[i] = nota;
                    } else {
                        notas[i] = notas[i];
                    }
                } else {
                    break;
                }
            }


        } else {

            mostrarNotas(nombres, notas, textArea);
        }
        mostrarNotas(nombres, notas, textArea);
    }


    // Método para mostrar listado de notas conforme se agrega

    public static void mostrarNotas(String[] nombres, double[] notas, JTextArea textArea) {
        textArea.setText(updateListadoNotas(nombres, notas));
    }


    // Ahora voy a hacer los métodos para guardar notas

    public static void guardarNotas(String notas) {
        File file = new File("directorioNotas/notas.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(notas);

            bw.close();
            fw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar");
        }
    }

    // Ahora un método para cargar las notas del archivo de texto creado previamente

    public static void cargarNotas(String[] nombres, double[] notas, JTextArea textArea) {
        File archivo = new File("directorioNotas/notas.txt");
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            int i = 0;
            while ((linea = br.readLine()) != null) {
                String[] separador = linea.split("   ->   "); // Iba a hacerlo con separadores estilo | y me daba problemas

                nombres[i] = separador[0].trim();
                notas[i] = Double.parseDouble(separador[1].trim());

                i++;

            }
            br.close();
            fr.close();
            mostrarNotas(nombres, notas, textArea);

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar");
        }
    }
}
