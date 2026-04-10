package unidad9.ejercicio4;

public class Videojuego {
    Consola consola;
    String genero;

    public Videojuego(){}

    public Videojuego(Consola consola,String genero) {
        this.consola = consola;
        this.genero = genero;
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
