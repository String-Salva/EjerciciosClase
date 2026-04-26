package unidad11.ej1;

import java.util.*;

public class GestorTareas {
    List<Tarea> lista = new ArrayList<Tarea>();

    public void agregarTarea(String titulo, String descripcion, String fecha) {
        this.lista.add(new Tarea(titulo, descripcion, fecha));
    }

    public boolean eliminarTarea(String t) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getTitulo().equals(t)) {
                lista.remove(i);
                return true;
            }
        }
        return false;
    }

    public void mostrarTareas() {
        for (Tarea tarea : lista) {
            System.out.println(tarea.toString());
        }
    }

}
