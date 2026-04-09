package unidad9.ejercicio2;

public class Smartphone extends Dispositivo {

    public Smartphone(String modelo, String marca, boolean conectado) {
        super(modelo, marca, conectado);
    }

    public void hacerLlamada(String numero) {
        System.out.println("Está llamando al número " + numero);
    }

}
