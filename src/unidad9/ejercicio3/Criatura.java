package unidad9.ejercicio3;

public abstract class Criatura {
    //Atributes
    private int vidaMaxima;
    private int vidaActual;
    private int fuerza;
    private String nombre;


    //Operations

    public int getFuerza() {
        return fuerza;
    }
    public int getVidaActual() {
        return vidaActual;
    }
    public void setVidaActual(int vidaActual) {
        this.vidaActual = vidaActual;
    }

    public Criatura(String nombre, int vida, int fuerza) {
        this.nombre = nombre;
        this.vidaMaxima = vida;
        this.fuerza = fuerza;
    }

    public void luchar(Criatura a) {}

    public void recuperar(){}

    public void descansar(){}

    /*public String toString() {
        String s = "Nombre de la criatura: " + nombre

    }
*/
}
