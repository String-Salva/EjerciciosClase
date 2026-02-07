package unidad6.ejercicio2.Vehiculos;

public class Coches extends Vehiculo {
    boolean extras;
    int numPuertas;

    public Coches(int numRuedas,String marca, int numPuertas,double cilindrada, double km, boolean extras, Colores color) {
        super(numRuedas, marca, cilindrada, km, color);
        this.extras = extras;
        this.numPuertas = numPuertas;

    }
    public String toString(){
        return "Este vehículo es un coche y dispone de " + numRuedas + " ruedas\n" +
                "Su marca es: " + marca + "\n" +
                "Su cilindrada es: " + cilindrada + "\n" +
                "Su kilometraje es: " + km + "kilómetros\n" +
                "Número de puertas: " + numPuertas + "\n" +
                "Extras: " + (extras ? "Sí":"No") + "\n" +

                "Y es de color: " + color;


    }
}
