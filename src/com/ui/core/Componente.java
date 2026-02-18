package com.ui.core;

import com.ui.utils.HerramientasUI;

public class Componente {
    String nombre;
    final int ID = totalComponentes;
    String[] registroCambios;
    static int totalComponentes;
    public EstadoUI estado;
    public Componente(String nombre, String[] registroCambios) {}

    public Componente(String nombre) {
        this.nombre = nombre;
        final int ID = totalComponentes;
        totalComponentes++;
        EstadoUI estado = EstadoUI.BOCETO;
        registroCambios = new String[0];
    }
    public void añadirCambio(String descripcion) {
        String[] nuevoArray = new String[registroCambios.length + 1];
        nuevoArray[nuevoArray.length - 1] = descripcion;
        this.registroCambios = nuevoArray;
    }

    public void mostrarInfo() {
        System.out.println(HerramientasUI.PREFIJO_SISTEMA + " " + this.ID + " " + this.nombre + " " + this.estado + " " + this.registroCambios.length);

    }

}
