
/*
1. Añadir números y mostrarlos

Crea un ArrayList de enteros.
Añade los números del 1 al 10.
Muestra todos los números usando for, foreach y con un método aparte. */
import java.util.Arrays;
import java.util.ArrayList;

public class ArrayList1 {
  public static void main(String[] args) {
    ArrayList<Integer> listaNum = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    for (int i = 0; i < listaNum.size(); i++) {
      System.out.print(listaNum.get(i) + ", ");
    }
    System.out.println();
    for (Integer i : listaNum) {

      System.out.print(i + ", ");
    }

  }
}
