package unidad9.ejercicio1;

public class TelefonoMovil extends Telefono {
    String operador;

    public TelefonoMovil() {
        super();
    }


    public TelefonoMovil(String numero, String operador) {
        super();
        this.operador = operador;
    }
    @Override
    public void llamar(String numero) {
        System.out.println("Llamando al número " + numero + " con el operador de telefonía" + this.operador);
    }


}
