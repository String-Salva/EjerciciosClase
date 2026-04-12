package swing.ej2;

import swing.ej2.excepciones.CalificationsLimitException;
import swing.ej2.excepciones.NotaInvalidaException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

// Como en el ejercicio anterior, esta clase me la ha creado sola el diseñador de Swing y ha declarado como atributos los componentes que se van a utilizar
public class Calificaciones extends JFrame {
    private JPanel mainPanel;
    private JPanel panelBotones;
    private JButton agregarNotaButton;
    private JButton guardarNotasButton;
    private JButton cargarNotasButton;
    private JTextField campoNombre;
    private JTextField campoNota;
    private JTextField campoListadoNotas;
    private JLabel listadoLabel;
    private JLabel calificacionLabel;
    private JLabel nombreLabel;

    // Voy a ir declarando las variables que considero importantes para la lógica de este ejercicio

    String[] nombres = new String[30];
    double[] notas = new double[30];
    int contador = 0;

    //Voy a crear un método de validación para que no haya alumnos repetidos
    public boolean yaTieneNota(String nombre) {
        for (int i = 0; i < nombres.length; i++) {
            if (nombre.equals(nombres[i])) {
                return true;
            }
        }
        return false;
    }

    // Voy a crear los métodos para añadir las calificaciones a los Arrays creados, obligandome posteriormente a gestionar error si se llena el almacenamiento

    public void addNotas(String nombre, String nota) throws CalificationsLimitException, NotaInvalidaException {
        if (contador == nombres.length) {
            throw new CalificationsLimitException("Está el almacenamiento de calificaciones lleno");
        } else if (Double.parseDouble(nota) < 0.0 || Double.parseDouble(nota) > 10.0) {
            throw new NotaInvalidaException("La nota no puede ser negativa ni por encima del máximo (10)");
        } else {
            nombres[contador] = nombre;
            notas[contador] = Double.parseDouble(nota); // Lo hago así porque el parámetro lo va a coger como cadena de texto
            contador++;
        }
    }

    // Método para actualizar listado

    public void updateListadoNotas() {
        String s = "";
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i] != null) {
                s += "Nombre: " + nombres[i] + " Nota: " + notas[i] + "\n";
            } else {
                break;
            }
        }
    }

    // Método para limpiar los inputs
    public void clearInputs() {
        campoNombre.setText("");
        campoNota.setText("");
    }

    // Método para confirmar si se sobreescribe la nota a un usuario que ya existe en memoria
    // Según he visto, este método además de lanzar la pantalla, devuelve 0 si el usuario ha pulsado SÍ y devuelve 1 si el usuario ha pulsado NO
    public void confirmarNotas(String alumno) {
        int siOno = JOptionPane.showConfirmDialog(
                null,
                "Este nombre está guardado en memoria, estás seguro de que quieres sobreescribir su nota?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (siOno == 0) {
            for (int i = 0; i < campoNota.getText().length(); i++) {

            }
        }
    }


    public Calificaciones() {
        setTitle("Gestión de calificaciones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        pack();
        setSize(500, 500);
        setVisible(true);
        setLocationRelativeTo(null);

        // Este es el listener del botón agregar nota

        agregarNotaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (yaTieneNota(campoNombre.getText())) {

                    }
                    if ((!campoNombre.getText().isEmpty() || !campoNota.getText().isEmpty())) {

                        addNotas(campoNombre.getText(), campoNota.getText());
                    }
                } catch (
                        NumberFormatException error) { // Capturo esta Exception porque para el método, le entró el parámetro como texto y puede fallar en la conversión
                    // El método que voy a utilizar a continuación es para que salga una pantalla emergente avisando al usuario de que algo está mal
                    JOptionPane.showMessageDialog(null, "La nota ingresada no es un número");
                } catch (CalificationsLimitException |
                         NotaInvalidaException error) { // Estas son las dos excepciones que he creado para validaciones
                    JOptionPane.showMessageDialog(null, error.getMessage());
                }
            }
        });
    }
}
