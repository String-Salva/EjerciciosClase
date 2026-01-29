package ejercicio13;

public class Televisor extends Electrodomestico {


    double pulgadas;
    boolean isSint;

    public Televisor() {
        super();
        pulgadas = 0.0;
        isSint = false;
    }

    public Televisor(double pulgadas, boolean isSint) {
        super();
        this.pulgadas = pulgadas;
        this.isSint = isSint;
    }

    public double getPulgadas() {
        return this.pulgadas;
    }
    public boolean getisSint() {
        return isSint;
    }

    public double precioFinal() {
        double incPulg = 0.0;
        if (this.pulgadas > 40.0) {
            incPulg = super.precioBase * 0.3;
        }

        double incIsSint = 0.0; 
        if (this.isSint == true) {
            incIsSint = 50.0;
        }

        return super.precioFinal() + incPulg + incIsSint;
    }
    
}
