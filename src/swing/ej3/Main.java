package swing.ej3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BlocNotas b = new BlocNotas();
            b.setVisible(true);
        });
    }
}
