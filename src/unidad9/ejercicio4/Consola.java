package unidad9.ejercicio4;

public abstract class Consola {
    protected String nombre;
    protected String fabricante;
    protected boolean pantallaExterna;

    public Consola(String nombre, String fabricante,boolean pan) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.pantallaExterna = pan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public boolean getPantallaExterna() {
        return pantallaExterna;
    }
    public void setPantallaExterna(boolean pantallaExterna) {
        this.pantallaExterna = pantallaExterna;
    }

    public abstract void mostrarInfo();


}
