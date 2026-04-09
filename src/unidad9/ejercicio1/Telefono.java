package unidad9.ejercicio1;

public abstract class Telefono {
    String numTelefono;

    public Telefono() {};

    public Telefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public abstract void llamar(String telefono);


}
