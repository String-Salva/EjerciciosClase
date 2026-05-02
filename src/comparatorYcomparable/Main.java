package comparatorYcomparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Coche> coches = Arrays.asList(
    new Coche("Volkswagen", "Amarok", 25000),
    new Coche("Volkswagen", "Taos", 21000),
    new Coche("Chevrolet", "Onix", 22000),
    new Coche("Chevrolet", "Tracker", 30000)
);



List<Coche> nuevaLista = coches.stream()
.sorted(Comparator.comparing(Coche::getPrecio))
.toList();

coches.sort(Comparator.comparing(Coche::getMarca).thenComparing(Comparator.comparing(Coche::getPrecio).reversed()));

coches.forEach(System.out::println);






  }

}
