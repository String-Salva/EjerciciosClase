package unidad9.ejercicio1;

public class MovilConRadio extends TelefonoMovil implements Radioable {
    String sintonia;

    public MovilConRadio() {
        super();

    }
    public MovilConRadio(String sintonia,String numero,String operador) {
        super(numero,operador);
        this.sintonia = sintonia;
    }

    public void escuchar() {
        System.out.println("Se está escuchando la sintonía de este movil " + this.sintonia);
    }


    @Override
    public void escuchar(String sintonia) {

    }
}
