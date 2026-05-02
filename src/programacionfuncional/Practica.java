package programacionfuncional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practica {
  public static void main(String[] args) {
    List<Coche> coches = Arrays.asList(

    new Coche("Volkswagen", "Amarok", 25000.0),
    new Coche("Volkswagen","Taos",21000.0),
    new Coche("Chevrolet","Onix",22000),
    new Coche("Chevrolet","Tracker",30000),
    new Coche("Fiat","Cronos",21000),
    new Coche("Fiat","Pulse",24000),
    new Coche("Toyota","Corolla",28000),
    new Coche("Toyota","Yaris",23000),
    new Coche("Renault","Stepway",20000),
    new Coche("Renault","Duster",27000),
    new Coche("Nissan","Versa",25000)


    );

    //Ordenar la lista de vehiculos por precio de menor a mayor e imprimir por pantalla el resultado

    List<Coche> listaOrdenadaPorPrecio = new ArrayList<Coche>(coches);
    listaOrdenadaPorPrecio.sort(Comparator.comparing(Coche::getPrecio));

    //listaOrdenadaPorPrecio.stream().forEach(System.out::println);


    //Ordenar al mismo tiempo tanto por marca como por precio (ambos criterios) e imprimir el resultado por pantalla

    List<Coche> listaOrdenadaPorMarcaYPrecio = coches.stream()
    .sorted(Comparator.comparing(Coche::getMarca).thenComparing(Coche::getPrecio))
    .toList();

    //listaOrdenadaPorMarcaYPrecio.forEach(System.out::println);


    //Extraer una lista de todos los vehículos cuyo precio no supere los 23000

    List<Coche> cochesFiltrados = coches.stream()
    .filter(a -> a.getPrecio() <= 23000.0)
    .toList();

    //cochesFiltrados.forEach(System.out::println);


    //Filtrar unicamente los vehiculos de marca Chevrolet y Volkswagen

    coches.stream()
    .filter(a -> (a.getMarca().contains("Chevrolet") || a.getMarca().contains("Volkswagen")))
    .forEach(System.out::println);


    //Mostrar todos los autos cuyo modelo contenga por lo menos una letra "a"
  }
}