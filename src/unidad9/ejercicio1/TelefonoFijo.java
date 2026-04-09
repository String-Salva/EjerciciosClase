package unidad9.ejercicio1;

public class TelefonoFijo extends Telefono {
    String marca;
    String modelo;

    public TelefonoFijo() {
        super();
    }

    public TelefonoFijo(String marca,String modelo, String numero) {
        super(numero);
        this.marca = marca;
        this.modelo = numero;
    }


    @Override
    public void llamar(String OtroNumero) {
        System.out.println("Llamando al número " + OtroNumero + " ...");
    }


}
