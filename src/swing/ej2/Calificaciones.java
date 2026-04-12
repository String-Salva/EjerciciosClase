package swing.ej2;

import swing.ej2.excepciones.CalificationsLimitException;
import swing.ej2.excepciones.NotaInvalidaException;
import swing.ej2.Herramientas;

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
    private JTextArea campoListadoNotas;
    private JLabel listadoLabel;
    private JLabel calificacionLabel;
    private JLabel nombreLabel;





    // Voy a ir declarando las variables que considero importantes para la lógica de este ejercicio

    String[] nombres = new String[30];
    double[] notas = new double[30];
    int contador = 0;


    // Método para limpiar los inputs
    public void clearInputs() {
        campoNombre.setText("");
        campoNota.setText("");
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
                    if (Herramientas.yaTieneNota(campoNombre.getText(), nombres)) {
                        Herramientas.confirmarNotas(campoNombre.getText(), Double.parseDouble(campoNota.getText()), nombres, notas, campoListadoNotas);
                        clearInputs();
                    }
                    if ((!campoNombre.getText().isEmpty() && !campoNota.getText().isEmpty())) {

                        Herramientas.addNotas(contador, campoNombre.getText(), campoNota.getText(), nombres, notas, campoListadoNotas);

                        contador++; // No estoy orgullosos de esta chapuza, pero lo he visto necesario porque era más complicado hacer que se actualice el contador desde métodos estáticos
                    } else {
                        throw new NotaInvalidaException("Algún campo está vacío, reintroduce los valores");
                    }

                    clearInputs();
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
        guardarNotasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Herramientas.guardarNotas(Herramientas.updateListadoNotas(nombres,notas));
                JOptionPane.showMessageDialog(null, "Notas guardadas con exito");
            }
        });
        cargarNotasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Herramientas.cargarNotas(nombres,notas,campoListadoNotas);
            }
        });
    }
}
