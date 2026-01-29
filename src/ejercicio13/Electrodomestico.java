package ejercicio13;

public class Electrodomestico {

    double precioBase;
    Consumo consumo;
    double peso;
    Colores color;

    public enum Consumo {
        A('A'), B('A'), C('C'), D('D'), E('E'), F('F');

        char caracter;

        Consumo(char caracter) {
            this.caracter = caracter;
        }
    }

    public enum Colores {
        BLANCO("BLANCO"), NEGRO("NEGRO"), ROJO("ROJO"), AZUL("AZUL"), GRIS("GRIS");

        String color;

        Colores(String color) {
            this.color = color;
        }

    }

    public Electrodomestico() {
        precioBase = 100.0;
        consumo = Consumo.F;
        color = Colores.BLANCO;
        peso = 5;
    }

    public Electrodomestico(double precio, double peso) {
        this();
        this.precioBase = precio;
        this.peso = peso;

    }

    public Electrodomestico(double precio, Consumo consumo, double peso, Colores color) {
        this.precioBase = precio;
        this.consumo = consumo;
        this.peso = peso;
        this.color = color;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precio) {
        this.precioBase = precio;
    }

    public Consumo getConsumo() {
        return this.consumo;
    }

    public void setConsumo(Consumo consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Colores getColor() {
        return this.color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public boolean comprobarConsumoEnergetico(char letra) {
        for (int i = 0; i < Consumo.values().length; i++) {
            if (Consumo.values()[i].caracter == letra) {
                this.consumo = Consumo.values()[i];
                return true;
            }

        }
        return false;
    }

    public boolean comprobarColor(String color1) {
        for (int i = 0; i < Colores.values().length; i++) {
            if (Colores.values()[i].color == color1.toLowerCase().trim()) {
                this.color = Colores.values()[i];
                return true;
            }
        }
        return false;
    }
}
