package swing.ej5;

import javax.swing.*;
import java.io.*;

public class GestorContactos extends JFrame {

    private JPanel mainPanel;
    private JPanel formPanel;
    private JPanel buttonsPanel;
    private JLabel nameLabel;
    private JLabel telephoneLabel;
    private JLabel emailLabel;
    private JLabel categoryLabel;
    private JTextField nameField;
    private JTextField telephoneField;
    private JTextField emailField;
    private JComboBox comboBox1;
    private JTextArea contactsTextArea;
    private JButton newButton;
    private JButton loadContactButton;
    private JButton saveContactButton;

    // Array de contactos con máximo de 30 posiciones
    private Contacto[] listaContactos = new Contacto[30];

    // Contador de contactos almacenados
    private int totalContactos = 0;


    public GestorContactos() {

        // Título de la ventana
        setTitle("Gestor de contactos");

        // El panel creado por el diseñador se pone como contenido de la ventana
        setContentPane(mainPanel);

        // Cerrar aplicación al cerrar ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Ajustar tamaño automáticamente
        pack();

        // Centrar ventana
        setLocationRelativeTo(null);

        // Mensaje inicial
        JOptionPane.showMessageDialog(null,
                "Para cargar contactos existentes pulse 'Cargar contactos'");

        // Añadir categorías al combo
        comboBox1.addItem(Categoria.Familia);
        comboBox1.addItem(Categoria.Amigos);
        comboBox1.addItem(Categoria.Trabajo);

        // Listeners
        newButton.addActionListener(e -> agregarContacto());
        loadContactButton.addActionListener(e -> cargarContactos());
        saveContactButton.addActionListener(e -> guardarContactos());

    }


    // Método que agrega un contacto al array
    private void agregarContacto() {

        // Obtener valores introducidos por el usuario
        String nombre = nameField.getText();
        String telefono = telephoneField.getText();
        String email = emailField.getText();
        Categoria categoria = (Categoria) comboBox1.getSelectedItem();

        // Comprobamos que los campos obligatorios estén rellenos
        if (nombre.isEmpty() || telefono.isEmpty() || email.isEmpty()) {

            JOptionPane.showMessageDialog(null,
                    "Todos los campos son obligatorios");

            return;
        }

        // Comprobar que no se superen los 30 contactos
        if (totalContactos >= 30) {

            JOptionPane.showMessageDialog(null,
                    "Se ha alcanzado el máximo de 30 contactos");

            return;
        }

        // Ventana de confirmación antes de crear el contacto
        int confirmacion = JOptionPane.showConfirmDialog(
                null,
                "Se va a incluir el contacto siguiente:\n\n" +
                        "Nombre: " + nombre + "\n" +
                        "Telefono: " + telefono + "\n" +
                        "Email: " + email + "\n" +
                        "Categoria: " + categoria,
                "Confirmar contacto",
                JOptionPane.YES_NO_OPTION
        );

        // Si el usuario pulsa NO, se cancela la operación
        if (confirmacion != JOptionPane.YES_OPTION) {
            return;
        }

        // Crear objeto contacto
        Contacto nuevo = new Contacto(nombre, telefono, email, categoria);

        // Guardar el contacto en el array
        listaContactos[totalContactos] = nuevo;

        // Incrementar contador
        totalContactos++;

        JOptionPane.showMessageDialog(null,
                "Contacto añadido correctamente.\nRecuerde pulsar 'Guardar contactos' para guardarlo en el archivo.");

        actualizarAreaContactos();

        limpiarCampos();
    }


    // Método que muestra todos los contactos en el área de texto
    private void actualizarAreaContactos() {

        // Limpiar el área de texto antes de escribir
        contactsTextArea.setText("");

        // Recorrer el array de contactos hasta el total almacenado
        for (int i = 0; i < totalContactos; i++) {

            Contacto c = listaContactos[i];

            contactsTextArea.append("[Contacto]\n");
            contactsTextArea.append("Nombre: " + c.getNombre() + "\n");
            contactsTextArea.append("Telefono: " + c.getTelefono() + "\n");
            contactsTextArea.append("Email: " + c.getEmail() + "\n");
            contactsTextArea.append("Categoria: " + c.getCategoria() + "\n\n");

        }

    }


    // Método que limpia los campos del formulario
    private void limpiarCampos() {

        nameField.setText("");
        telephoneField.setText("");
        emailField.setText("");

    }


    // Método para cargar contactos desde un archivo CSV
    private void cargarContactos() {

        JFileChooser selector = new JFileChooser();

        int resultado = selector.showOpenDialog(null);

        if (resultado == JFileChooser.APPROVE_OPTION) {

            File archivo = selector.getSelectedFile();

            try {
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);

                String linea;

                while ((linea = br.readLine()) != null && totalContactos < 30) {

                    String[] datos = linea.split(",");

                    String nombre = datos[0];
                    String telefono = datos[1];
                    String email = datos[2];
                    Categoria categoria = Categoria.valueOf(datos[3]);

                    Contacto contacto = new Contacto(nombre, telefono, email, categoria);

                    listaContactos[totalContactos] = contacto;

                    totalContactos++;

                }

                br.close();
                fr.close();

                actualizarAreaContactos();

                JOptionPane.showMessageDialog(null,
                        "Contactos cargados correctamente");

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null,
                        "Error al leer el archivo o archivo mal formado");

            }

        }

    }


    // Método para guardar contactos en un archivo CSV
    private void guardarContactos() {

        // Archivo donde se guardarán los contactos
        File archivo = new File("contactos.csv");

        try {
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);

            // Recorrer los contactos almacenados
            for (int i = 0; i < totalContactos; i++) {

                Contacto c = listaContactos[i];

                bw.write(
                        c.getNombre() + "," +
                                c.getTelefono() + "," +
                                c.getEmail() + "," +
                                c.getCategoria()
                );

                bw.newLine();
            }

            bw.close();
            fw.close();

            JOptionPane.showMessageDialog(null,
                    "Contactos guardados correctamente en contactos.csv");

        } catch (IOException e) {

            JOptionPane.showMessageDialog(null,
                    "Error al guardar el archivo");

        }

    }

}