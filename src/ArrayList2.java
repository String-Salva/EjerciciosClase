
/*
Crea un ArrayList<Integer> con diez números.
Imprime:

todos los números

la suma

el mayor

el menor */
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2 {
  public static void main(String[] args) {
    ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    String resultado = "";
    for (Integer i : lista) {
      resultado += (i + " ");
    }
    resultado = "[" + resultado + "]";
    System.out.println(resultado);

    int suma = 0;
    int mayor = lista.get(0);
    int menor = lista.get(0);

    for (int i = 0; i < lista.size(); i++) {
      suma += lista.get(i);
      if (lista.get(i) > mayor) {
        mayor = lista.get(i);
      }
      if (lista.get(i) < menor) {
        menor = lista.get(i);
      }

    }
    System.out.println("La suma es " + suma);
    System.out.println("El número mayor es " + mayor);
    System.out.println("El número menor de la lista es " + menor);

  }
}
