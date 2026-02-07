package unidad6.ejercicio2;

import unidad6.ejercicio2.Garajes.Garaje;
import unidad6.ejercicio2.Vehiculos.Coches;
import unidad6.ejercicio2.Vehiculos.Colores;
import unidad6.ejercicio2.Vehiculos.Motos;

public class Main {
    public static void main(String[] args) {
        Garaje mercedes = new Garaje(10, 10.0);

        Coches c1 = new Coches(4, "Clase C", 4, 3.200, 88700.5, true, Colores.BLANCO);
        Coches c2 = new Coches(4, "Clase C", 4, 3.200, 882700.9, true, Colores.AZUL);
        Coches c3 = new Coches(4, "Clase C", 4, 3.200, 12000.12, true, Colores.NEGRO);
        Coches c4 = new Coches(4, "Clase C", 4, 3.200, 88999.13, true, Colores.ROJO);
        Motos m1 = new Motos(2, "Yamaha", 1.200, 43500.99, Colores.NEGRO);

        mercedes.introducir(c1);
        mercedes.introducir(c2);
        mercedes.introducir(c3);
        mercedes.introducir(c4);
        mercedes.introducir(m1);
        System.out.println(c1.toString());
        System.out.println(m1.toString());
        System.out.println(mercedes.kmMedio());







    }
}
