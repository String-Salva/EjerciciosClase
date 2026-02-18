package com.ui.app;

import com.ui.core.Componente;
import com.ui.core.EstadoUI;
import com.ui.core.LienzoGrid;
import com.ui.utils.HerramientasUI;

public class Main {
    public static void main(String[] args) {
        Componente navbar = new Componente("Navbar");
        navbar.añadirCambio("Añadido logo");
        navbar.añadirCambio("Cambiado padding");
        navbar.estado = EstadoUI.REVISION;

        navbar.mostrarInfo();

        HerramientasUI.validarEtiquetas("header","navegacion","top");

        LienzoGrid lienzo = new LienzoGrid();

        lienzo.posicionar(0,0,navbar);
        lienzo.posicionar(5,5,navbar);

        lienzo.renderizarLienzo();
    }
}
