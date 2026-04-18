package swing.ej4;

import javax.swing.*;

public class Calculadora extends JFrame {

    private JPanel mainPanel;
    private JTextField display;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton cButton;
    private JButton a5Button;
    private JButton a8Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton equalsButton;
    private JButton addButton;
    private JButton minusButton;
    private JButton xButton;
    private JButton divisionButton;

    /* Variables para almacenar el estado de la operación */

    private double numero1;
    private String operacion;

    // Método para añadir números al display
    public void addNumber(String numero){

        display.setText(display.getText() + numero);

    }

    // Método para almacenar el número y la operación seleccionada
    public void setOperation(String op){

        numero1 = Double.parseDouble(display.getText());
        operacion = op;

        // Limpio el display para escribir el siguiente número
        display.setText("");

    }

    // Método para calcular el resultado
    public void calculate(){

        double numero2 = Double.parseDouble(display.getText());
        double resultado = 0;

        switch (operacion){

            case "+":
                resultado = numero1 + numero2;
                break;

            case "-":
                resultado = numero1 - numero2;
                break;

            case "*":
                resultado = numero1 * numero2;
                break;

            case "/":
                resultado = numero1 / numero2;
                break;
        }

        display.setText(String.valueOf(resultado));

    }

    // Método para limpiar la pantalla y resetear la operación
    public void clear(){

        display.setText("");
        numero1 = 0;
        operacion = "";

    }

    public Calculadora() {

        // Configuración básica de la ventana
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 250);

        // Introduzco el panel principal creado en el diseñador gráfico
        setContentPane(mainPanel);

        // Centro la ventana en pantalla
        setLocationRelativeTo(null);




        // Asigno manualmente los action listeners a los botones numéricos

        a1Button.addActionListener(e -> addNumber("1"));
        a2Button.addActionListener(e -> addNumber("2"));
        a3Button.addActionListener(e -> addNumber("3"));
        a4Button.addActionListener(e -> addNumber("4"));
        a5Button.addActionListener(e -> addNumber("5"));
        a6Button.addActionListener(e -> addNumber("6"));
        a7Button.addActionListener(e -> addNumber("7"));
        a8Button.addActionListener(e -> addNumber("8"));
        a9Button.addActionListener(e -> addNumber("9"));
        a0Button.addActionListener(e -> addNumber("0"));


        // Listeners para las operaciones

        addButton.addActionListener(e -> setOperation("+"));
        minusButton.addActionListener(e -> setOperation("-"));
        xButton.addActionListener(e -> setOperation("*"));
        divisionButton.addActionListener(e -> setOperation("/"));


        // Listener para calcular el resultado

        equalsButton.addActionListener(e -> calculate());


        // Listener para limpiar la pantalla

        cButton.addActionListener(e -> clear());


        // Hago visible la ventana
        setVisible(true);
    }


}
