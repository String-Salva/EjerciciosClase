
/*
Pide números al usuario hasta que escriba -1.
Cada número que introduzca, guárdalo en un ArrayList<Integer>.

Cuando el usuario escriba -1, el programa debe mostrar:

Cuántos números ha introducido

Cuántos son pares

Cuántos son impares

Cuántos son mayores de 100 */
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList3 {
  public static void main(String[] args) {

    // Declaro el uso del teclado para introducir un valor por el usuario

    Scanner sc = new Scanner(System.in);
    // Declaro variables que vamos a utilizar

    ArrayList<Integer> lista = new ArrayList<>();
    int contador = 0;
    int pares = 0;
    int impares = 0;
    int mayores = 0;
    int variable;
    // Le pido al usuario que meta ingrese números al terminal y hago que pare
    // cuando escriba -1

    do {
      System.out.println("Introduce números enteros, cuando quieras que termine, introduce -1");
      variable = sc.nextInt();
      lista.add(variable);
    } while (variable != -1);

    for (int i = 0; i < lista.size(); i++) {
      if (lista.get(i) % 2 == 0) {
        pares++;
      }
      if(lista.get(i) % 2 != 0) {
        impares++;
      }
      if (lista.get(i) > 100) {
        mayores++;
      }
    }

    System.out.println("El número total de números ha sido " + lista.size() + "\n El número de pares ha sido " + pares + "\nEl número de impares ha sido " + impares + "\nEl número total de números mayores de 100 ha sido " + mayores);

  }
}
