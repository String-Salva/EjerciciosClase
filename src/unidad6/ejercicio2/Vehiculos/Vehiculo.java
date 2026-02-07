package unidad6.ejercicio2.Vehiculos;

public class Vehiculo {
    protected int numRuedas;
    String marca;
    double cilindrada;
    double km;
    Colores color;

    public Vehiculo(int numRuedas, String marca, double cilindrada, double km, Colores color) {
        this.numRuedas = numRuedas;
        this.marca = marca;
        this.cilindrada = cilindrada;
        this.km = km;
        this.color = color;
    }
    public String toString(){
        return "Este vehículo dispone de " + numRuedas + " ruedas\n" +
                "Su marca es: " + marca + "\n" +
                "Su cilindrada es: " + cilindrada + "\n" +
                "Su kilometraje es: " + km + "kilómetros\n" +
                "Y es de color: " + color;

    }
    public int getRuedas() {
        return numRuedas;
    }
    public double getKm() {
        return km;
    }
}
