package unidad6.ejercicio2.Vehiculos;

public class Motos extends Vehiculo {
    public Motos(int numRuedas, String marca, double cilindrada, double km, Colores color) {
        super(numRuedas, marca, cilindrada, km, color);
    }

    public String toString() {
        return "Este vehículo  es una moto y dispone de " + numRuedas + " ruedas\n" +
                "Su marca es: " + marca + "\n" +
                "Su cilindrada es: " + cilindrada + "\n" +
                "Su kilometraje es: " + km + " kilómetros\n" +
                "Y es de color: " + color+"\n";

    }

}
