package unidad9.ejercicio4;

public class ConsolaPortatil extends Consola {
    String duracionBateria;

    public ConsolaPortatil(String nombre, String fabricante,boolean pan, String dur) {
        super(nombre,fabricante,pan);
        this.duracionBateria = dur;

    }

    public String getDuracionBateria() {
        return duracionBateria;
    }

    public void setDuracionBateria(String duracionBateria) {
        this.duracionBateria = duracionBateria;
    }

    public void mostrarInfo() {
        String s = "Nombre consola: " + getNombre() + "\nFabricante: " + getFabricante() + "\nDuracion Batería: " +getDuracionBateria() +  "\nPantalla externa: " + getPantallaExterna() + "\n";
        System.out.println(s);
    }
}
