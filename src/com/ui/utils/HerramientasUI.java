package com.ui.utils;

import java.util.Arrays;

public class HerramientasUI {
    public static final String PREFIJO_SISTEMA = "UI-COMP-";


    public static boolean validarEtiquetas(String... etiquetas) {
        if (etiquetas.length < 1) {
            return false;
        } else {

            System.out.println(Arrays.toString(etiquetas));
            return true;
        }

    }
    public static String[] clonarHistorial(String[] original) {
        String[] resultado = new String[original.length];
        System.arraycopy(original,0,resultado,0,resultado.length);
        return resultado;
    }
}
