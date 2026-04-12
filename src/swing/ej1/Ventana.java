package swing.ej1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Aquí se han declarado automáticamente todos los componentes que he creado visualmente en la herramienta gráfica
public class Ventana extends JFrame {
    private JPanel panelPrincipal;
    private JLabel pistasLabel;
    private JPanel panelEntrada;
    private JPanel panelIzquierda;
    private JPanel panelDerecha;
    private JButton adivinarButton;
    private JButton nuevoJuegoButton;
    private JTextField campoNumero;
    private JLabel contador;

    // Voy a declarar las variables (no componentes) que vamos a utilizar

    private int numeroAdivinar;
    private int contadorIntentos;

    // Voy a crear un método porque el hecho de actualizar los intentos en cada interacción resulta muy repetitivo para lo simple que es

    public void intentos() {
        contador.setText("Contador: " + contadorIntentos);
    }
    // Voy a crear un método para resetear el textField, para que cada vez que le des a adivinar, se ponga en blanco y no tengas que borrar el anterior resultado manualmente

    public void textFieldReset() {
        campoNumero.setText("");
    }



    // Voy a crear un método reseteo, para cuando haga el listener del botón de Juego Nuevo
    public void resetear() {
        numeroAdivinar = (int)(Math.random() * 100) + 1;
        contadorIntentos = 0;
        contador.setText("Contador: 0");
        pistasLabel.setText("Intenta adivinar el número secreto");
        textFieldReset();
    }

    // Aquí he creado un iniciador de ventana, el cual vamos a utilizar en la clase Main para que funcione.
    public Ventana() {
        setTitle("Juego de adivinar el número secreto"); // Título de la ventana que va a aparecer arriba cuando esté funcionando en mi caso en Windows
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // El comportamiento que va a tener el programa cuando le de a cerrar (Se va a cerrar obviamente)
        setContentPane(panelPrincipal); //Se le atribuye
        pack(); //Ajusta el tamaño de la pantalla mínimo para que se puedan visualizar todos los componentes
        setLocationRelativeTo(null); // Como dice en el temario, se establece la posición del Frame en el centro de la pantalla

        numeroAdivinar = (int) (Math.random() * 100) + 1; // Hago que la variable sea un número aleatorio entre 1 y 100
        contadorIntentos = 0; //Siempre va a iniciar en 0, posteriormente irá incrementándose

        // Éste método se me ha generado solo desde el diseñador gráfico, pulsando en opciones del botón: "Create Listener" (Obviamente la lógica de dentro la he desarrollado yo)
        adivinarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int numeroUsuario = Integer.parseInt(campoNumero.getText());
                    contadorIntentos++;
                    if (numeroUsuario < 1 || numeroUsuario > 100) {
                        pistasLabel.setText("Te he indicado que el número tiene que estar entre 1 y 100, introduce otro, por favor");
                        intentos();
                        textFieldReset();
                    } else {
                        if (numeroUsuario == numeroAdivinar) {
                            pistasLabel.setText("¡Correcto! Has adivinado el número en " + contadorIntentos + " intentos.");
                            intentos();

                        } else if (numeroUsuario > numeroAdivinar) {
                            pistasLabel.setText("El número secreto es menor");
                            intentos();
                            textFieldReset();
                        } else {
                            pistasLabel.setText("El número secreto es mayor");
                            intentos();
                            textFieldReset();
                        }
                    }

                } catch (NumberFormatException erro) {
                    pistasLabel.setText("Introduce un número válido, por favor");
                    intentos();
                    textFieldReset();
                }
            }
        });
        nuevoJuegoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetear();
            }
        });
    }


}




