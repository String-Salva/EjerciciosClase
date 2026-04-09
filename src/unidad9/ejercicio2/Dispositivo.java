package unidad9.ejercicio2;

public abstract class Dispositivo implements Conectable {
    protected String modelo;
    protected String marca;
    protected boolean conectado;

    public Dispositivo(String modelo, String marca, boolean conectado) {

    }


    @Override
    public void conectarWifi() {
        this.conectado = true;

    }

    @Override
    public void desconectarWifi() {
this.conectado = false;
    }

    @Override
    public boolean estaConectado() {
        return this.conectado;
    }

    public void mostrarInfo() {
        System.out.println("Modelo: " + this.modelo + " Marca: " + this.marca + " Conectado?: " + ((this.conectado) ? "conectado":"desconectado"));
    }
}
