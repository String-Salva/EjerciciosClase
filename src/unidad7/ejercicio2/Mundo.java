package unidad7.ejercicio2;

public class Mundo {
    protected String nombre;
    protected float diametro;
    protected boolean habitable;

    public Mundo() {
        this.nombre = "";
        diametro = 0f;
        habitable = false;

    }
    public Mundo(String n, float d, boolean h) {
        this.nombre = n;
        this.diametro = d;
        this.habitable = h;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public boolean isHabitable() {
        return habitable;
    }

    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }

}
