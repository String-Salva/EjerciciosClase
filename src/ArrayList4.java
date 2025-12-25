
/*
Gestor de Estadísticas de Temperaturas

Crea un programa en Java que:

1. Pida al usuario temperaturas diarias (enteros) hasta que escriba -999.

No debes guardar el -999 en la lista.

Guarda cada número en un ArrayList<Integer>.

2. Al finalizar, el programa debe mostrar:
🔹 1. La lista completa de temperaturas registradas

En formato [12, 17, 21, 15...].

🔹 2. La cantidad total de temperaturas introducidas
🔹 3. La temperatura media

Con decimales (tipo double).

🔹 4. La temperatura más alta y la más baja
🔹 5. Cuántas temperaturas están por encima de la media
🔹 6. Cuántas están por debajo de la media
🔹 7. Cuántas temperaturas se repiten (solo cuántas, no cuáles)

Por ejemplo: “hay 3 temperaturas que aparecen más de una vez”.

🔹 8. Crear una nueva lista con las temperaturas ordenadas de menor a mayor (sin modificar la lista original)
🔹 9. Mostrar solo las temperaturas únicas (sin duplicados), ordenadas de mayor a menor
🔹 10. Decir si existe la temperatura EXACTA que te pida el usuario al final del programa

Si existe:
→ indicar cuántas veces aparece
→ indicar las posiciones de la lista donde aparece

Si no existe:
→ mostrar un mensaje avisando */

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList4 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // Declaro las variables que voy a utilizar por ahora

    ArrayList<Double> temperaturas = new ArrayList<>();
    double temperatura;
    double suma = 0;

    // Hago el bucle para preguntar al usuario las temperaturas y decirle como parar
    // cuando termine

    do {
      System.out.println("Introduce las temperaturas, cuando hayas terminado dime \"-999\"");
      temperatura = sc.nextDouble();
      if (temperatura != -999.0) {
        temperaturas.add(temperatura);
      }
    } while (temperatura != -999.0);

    for (int i = 0; i < temperaturas.size(); i++) {
      if (temperaturas.get((i)) == temperaturas.get((temperaturas.size()))) {
        System.out.print(i);
      } else {
        System.out.print(i + ",");
      }
    }
    for (int i = 0; i < temperaturas.size(); i++) {
      suma += temperaturas.get(i);
    }

    double media = suma / (double) temperaturas.size();

    System.out.println("\nCantidad total de temperaturas -> " + temperaturas.size());
    System.out.println("Temperatura media -> " + media);
    System.out.println("Temperatura más alta -> "+ temperaturas.);

  }
}
