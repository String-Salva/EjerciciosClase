package practicaTodoCode.videojuegos;

public class VideoJuego {
    private int codigo;
    private String titulo;
    private String consola;
    private int cantidadJugadores;
    private String categoría;

    public VideoJuego(int codigo, String titulo, String consola, int cantidadJugadores) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.cantidadJugadores = cantidadJugadores;

    }
    public VideoJuego() {}



    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    public void setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }
    public String toString() {
        String s = "Título: " + getTitulo() + "\nConsola: " + getConsola() + "\nCantidad de Jugadores: " +  getCantidadJugadores();

        s = "[" + s + "]";
        return s;
    }


}
