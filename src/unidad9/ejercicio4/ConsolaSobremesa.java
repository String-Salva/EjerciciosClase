package unidad9.ejercicio4;

public class ConsolaSobremesa extends Consola {
    String resolucionMaxima;
    String pantallaExterna;

    public ConsolaSobremesa(String nombre, String fabricante, String res, boolean pan) {
        super(nombre, fabricante, pan);
        this.resolucionMaxima = res;

    }

    public String getResolucionMaxima() {
        return resolucionMaxima;
    }

    public void setResolucionMaxima(String resolucionMaxima) {
        this.resolucionMaxima = resolucionMaxima;
    }


    public void mostrarInfo() {
        String s = "Nombre consola: " + getNombre() + "\nFabricante: " + getFabricante() + "\nResolución Máxima: " + getResolucionMaxima() + "\nPantalla externa: " + getPantallaExterna() + "\n";
        System.out.println(s);
    }


}
