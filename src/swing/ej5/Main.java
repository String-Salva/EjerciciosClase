package swing.ej5;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GestorContactos gestorContactos = new GestorContactos();
            gestorContactos.setVisible(true);
        });
    }
}
