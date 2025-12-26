
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
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class ArrayList4 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // Declaro las variables que voy a utilizar por ahora

    ArrayList<Double> temperaturas = new ArrayList<>();
    double temperatura;
    double suma = 0;
    double maxima;
    double minima;

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

    // Ahora vamos a calcular la suma de las temperaturas para ayudarnos a calcular
    // la media, y
    // aprovecharemos el bucle para sacar también la máxima y la mínima

    minima = temperaturas.get(0);
    maxima = temperaturas.get(0);

    for (int i = 0; i < temperaturas.size(); i++) {
      suma += temperaturas.get(i);
      if (temperaturas.get(i) > maxima) {
        maxima = temperaturas.get(i);
      }
      if (temperaturas.get(i) < minima) {
        minima = temperaturas.get(i);
      }
    }

    double media = suma / (double) temperaturas.size();

    // Voy a crear un método booleano para determinar cuántas temperaturas se
    // repiten y voy a declarar un contador para contarlas

    int repetidas = 0;

    for (int i = 0; i < temperaturas.size(); i++) {
      for (int j = 1; j < temperaturas.size(); j++) {
        if (temperaturas.get(i) == temperaturas.get(j)) {
          repetidas++;
        }
      }
    }

    // Para contar cuantas temperaturas están por encima de la media voy a crear dos
    // variables para contabilizar y voy a hacer un bucle para contarlas
    int mayorQueMedia = 0;
    int menorQueMedia = 0;

    for (int i = 0; i < temperaturas.size(); i++) {
      if (temperaturas.get(i) > media) {
        mayorQueMedia++;
        ;
      }
      if (temperaturas.get(i) < media) {
        menorQueMedia++;
      }
    }

    // Creo una nueva lista ordenada de mayor a menor, para esto, voy a crear un
    // array y lo voy a ordenar

    double[] orderedArray = new double[temperaturas.size()];
    for (int i = 0; i < temperaturas.size(); i++) {
      orderedArray[i] = temperaturas.get(i);
    }
    Arrays.sort(orderedArray);

    // O bien ordeno la lista con el método de la clase Collections

    ArrayList<Double> orderedArrayList = new ArrayList<>(temperaturas);
    Collections.sort(orderedArrayList);

    // Creo una nueva lista sin duplicados

    Set<Double> eliminarduplicados = new HashSet<>(orderedArrayList);
    ArrayList<Double> sinDuplicados = new ArrayList<>(eliminarduplicados);

    // Ordeno la lista sin duplicados y creo un String para mostrarlo fácil luego
    Collections.sort(sinDuplicados, Collections.reverseOrder());
    String resultado = "";
    for (int i = 0; i < sinDuplicados.size(); i++) {
      if (sinDuplicados.get(i) == sinDuplicados.get(sinDuplicados.size())) {
        resultado += sinDuplicados.get(i);
      } else {
        resultado += sinDuplicados.get(i) + ",";
      }
    }
    resultado = "[" + resultado + "]";

    // Imprimimos por pantalla los datos requeridos

    System.out.println("\nCantidad total de temperaturas -> " + temperaturas.size());
    System.out.println("Temperatura media -> " + media);
    System.out.println("Temperatura más alta -> " + maxima + "grados, y la más baja -> " + minima + " grados");
    System.out.println("Por encima de la media hay " + mayorQueMedia + " temperaturas");
    System.out.println("Por debajo de la media hay " + menorQueMedia + " temperaturas");
    System.out.println("Hay " + repetidas + " temperaturas repetidas");
    System.out.print("La lista sin duplicados de mayor a menor --> " + resultado);

    // Declaro una nueva variable para que el usuario introduzca un valor a buscar
    // en la lista
    int contador = 0;
    double userValue;

    System.out.println("Introduce una temperatura a comprobar, te diré si existe o no");
    userValue = sc.nextDouble();
    sc.close();

    for (int i = 0; i < temperaturas.size(); i++) {
      if (temperaturas.get(i) == userValue) {
        contador++;
      }
    }
    double[] temperaturaUser = new double[contador];
    for (int i = 0; i < temperaturaUser.length; i++) {
      if (temperaturas.get(i) == userValue) {
        temperaturaUser[i] = temperaturas.get(i);
      }
    }
    if (contador > 0) {
      System.out.println("La temperatura que preguntas SÍ está, ha sido introducida en " + temperaturaUser.length + " ocasiones");
    } else {
      System.out.println("La temperatura por la que preguntas no aparece en la base de datos");
    }

  }
}
