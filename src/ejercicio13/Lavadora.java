package ejercicio13;

public class Lavadora extends Electrodomestico {
    double carga;

    public Lavadora() {
        super();
        carga = 0;
    }
    public Lavadora(double precio, int peso) {
        super(precio,peso);
        carga = 0;
    }
    public Lavadora(double carga) {
        super();
        this.carga = carga;
    }

    public double getCarga() {
        return this.carga;
    }

    public double precioFinal() {
        double incCarga = 0;
        if (this.carga > 30.0) {
            incCarga = 50.0;
        }

        return super.precioFinal() + incCarga;
    }
    
}
