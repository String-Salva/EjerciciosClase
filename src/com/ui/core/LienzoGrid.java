package com.ui.core;

public class LienzoGrid {
    static final int FILAS = 4;
    static final int COLUMNAS = 4;
    Componente[][] cuadricula;

    public LienzoGrid() {
        this.cuadricula = new Componente[FILAS][COLUMNAS];
    }

    public void posicionar(int fila, int col, Componente comp) {
        if (fila < FILAS && col < COLUMNAS) {
            this.cuadricula[fila][col] = comp;
        } else {
            System.out.println("ERROR: Posición fuera del lienzo");
        }

    }

    public void renderizarLienzo() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (this.cuadricula[i][j] == null) {
                    System.out.print(" [Vacío] ");
                } else {
                    System.out.print("[" + this.cuadricula[i][j].nombre + "]");
                }

            }
            System.out.println();
        }
    }
}
