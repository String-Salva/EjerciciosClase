package swing.ej3;

import javax.swing.*;
import java.io.*;

public class BlocNotas extends JFrame {

    private JPanel mainPanel;
    private JMenuBar optionsBar;
    private JMenu fileOption;
    private JTextArea textArea;
    private JScrollPane scrollPane;

    // Solo he podido crear este desde el diseñador gráfico, el resto de JMenuItems los he creado desde el código porque no me deja añadir más
    private JMenuItem newOption;

    // Todos estos JMenuItems los he creado aquí en el código manualmente
    private JMenuItem openOption;
    private JMenuItem saveOption;
    private JMenuItem leaveOption;



    /* Aprovecho para comentarte que iba a hacer una clase tools donde incluir las herramientas y hacerlas estáticas pero va a incrementar mucho la
    dificultad a la hora de hacerlo todo, así que voy a optar por hacerlo todo aquí. */



    public BlocNotas() {

        // Configuración básica de la ventana
        setTitle("Bloc Notas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // En este caso voy a redimensionar al este tamaño como alternativa a pack()
        // para que quede visualmente como quiero y no ajustándose al mínimo
        setSize(600,450);

        // Introduzco el panel principal creado en el diseñador gráfico como contenido del JFrame
        setContentPane(mainPanel);

        // Centro la ventana en pantalla
        setLocationRelativeTo(null);



        // Creo manualmente la barra de menú
        optionsBar = new JMenuBar();

        // Creo el menú principal llamado "Archivo"
        fileOption = new JMenu("Archivo");



        // Creo manualmente TODOS los JMenuItems (He tenido problemas durante horas porque no me deja añadir más de un JMenuItem en el diseñador)
        newOption = new JMenuItem("Nuevo");
        openOption = new JMenuItem("Abrir");
        saveOption = new JMenuItem("Guardar");
        leaveOption = new JMenuItem("Salir");



        // Ahora voy a incluir los JMenuItems dentro del JMenu llamado fileOption
        fileOption.add(newOption);
        fileOption.add(openOption);
        fileOption.add(saveOption);

        // Introduzco un separador para separar visualmente la opción de salir para que quede como el que has enseñado de ejemplo
        fileOption.addSeparator();

        fileOption.add(leaveOption);



        // Introduzco el menú "Archivo" dentro de la barra de opciones
        optionsBar.add(fileOption);



        // Introduzco la barra de opciones dentro del JFrame
        setJMenuBar(optionsBar);



        // Asigno manualmente los action listeners a sus respectivos métodos al hacer click en las options
        newOption.addActionListener(e -> newFile());
        openOption.addActionListener(e -> openFileTxt());
        saveOption.addActionListener(e -> saveFileTxt());
        leaveOption.addActionListener(e -> leave());



        // Hago visible la ventana
        setVisible(true);
    }



    // Método newFile para empezar de nuevo un documento de texto
    public void newFile() {

        // Simplemente limpiamos el contenido del área de texto
        textArea.setText("");
    }



    // Método para abrir un archivo de texto existente
    public void openFileTxt() {

        // Creo un selector de archivos para buscar con interfaz gráfica la ruta del archivo que queremos abrir
        JFileChooser selector = new JFileChooser();

        int resultado = selector.showOpenDialog(this);

        // Si el usuario selecciona un archivo
        if (resultado == JFileChooser.APPROVE_OPTION) {

            File archivo = selector.getSelectedFile();

            try {

                // Creo un BufferedReader y un FileReader para leer el archivo
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);

                // Limpio primero el JTextArea
                textArea.setText("");

                String linea;

                // Leo el archivo línea por línea y lo voy añadiendo al JTextArea
                while ((linea = br.readLine()) != null) {
                    textArea.append(linea + "\n");
                }

                br.close();
                fr.close();

            } catch (IOException e) {

                // Si ocurre algún error al abrir el archivo muestro un mensaje
                JOptionPane.showMessageDialog(this, "Error al abrir el archivo");
            }
        }
    }



    // Método para guardar el contenido actual del JTextArea en un archivo
    public void saveFileTxt() {

        // Creo un selector de archivos para elegir dónde guardar
        JFileChooser selector = new JFileChooser();

        int resultado = selector.showSaveDialog(this);

        // Si el usuario acepta guardar
        if (resultado == JFileChooser.APPROVE_OPTION) {

            File archivo = selector.getSelectedFile();

            try {

                // Creo un BufferedWriter y un FileWriter para escribir en el archivo
                FileWriter fw = new FileWriter(archivo);
                BufferedWriter bw = new BufferedWriter(fw);

                // Escribo todo el contenido del JTextArea en el archivo
                bw.write(textArea.getText());

                bw.close();
                fw.close();

            } catch (IOException e) {

                // Si ocurre algún error al guardar muestro un mensaje
                JOptionPane.showMessageDialog(this, "Error al guardar el archivo");
            }
        }
    }



    // Método para cerrar la aplicación
    public void leave() {

        // Cierro completamente la aplicación
        System.exit(0);
    }
}