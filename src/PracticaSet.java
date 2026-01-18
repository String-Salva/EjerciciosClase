import java.util.*;

public class PracticaSet {
  public static void main(String[] args) {
    // Ejercicio 1, hacer una lista sin duplicados a partir de una lista
    List<Integer> numeros = List.of(1, 2, 2, 3, 4, 4, 5);

    Set<Integer> sinDuplicados = new HashSet(numeros);

    // System.out.println(sinDuplicados);

    // EJERCICIO 2, CONTAR DUPLICADOS

    int[] datos = { 1, 3, 3, 5, 7, 7, 7, 9 };

    Set<Integer> contaIntegers = new HashSet();

    for (int i = 0; i < datos.length; i++) {
      contaIntegers.add(datos[i]);
    }
    int contadorRepetidos = datos.length - contaIntegers.size();

    // System.out.println(contadorRepetidos);

    // EJERCICIO 3 – Caracteres únicos de una palabra

    String palabra = "programacion";

    Set<Character> uniqueCharacters = new HashSet();

    for (int i = 0; i < palabra.length(); i++) {
      uniqueCharacters.add(palabra.charAt(i));
    }
    // System.out.println(uniqueCharacters.size());

    // EJERCICIO 4 - palabras únicas en una frase

    String frase = "java java sql html java sql";
    String[] palabras = frase.split(" ");
    Set<String> noDuplicateWords = new HashSet<>();

    for (int i = 0; i < palabras.length; i++) {
      noDuplicateWords.add(palabras[i]);
    }
    // System.out.println("Hay " + noDuplicateWords.size() + " palabras únicas en la
    // frase");

    // EJERCICIO 5 - Sets con objetos

    Set<Persona> personas = new HashSet<>();

    personas.add(new Persona("Ana", "123A"));
    personas.add(new Persona("Luis", "456B"));
    personas.add(new Persona("Pedro", "123A"));

    System.out.println(personas.size());

  }
  /*
   * Enunciado
   * 
   * Queremos guardar personas en un Set, pero no se pueden repetir personas con
   * el mismo DNI.
   * 
   * Cada persona tiene:
   * 
   * nombre
   * 
   * dni
   * 
   * Si intentas añadir dos personas con el mismo DNI, solo debe quedarse una.
   */

  public static class Persona {
    String nombre;
    String dni;

    Persona(String nombre, String dni) {
      this.nombre = nombre;
      this.dni = dni;
    }

    public boolean equals(Object p) {
      if (this == p) {
        return true;
      }
      if (!(p instanceof Persona)) {
        return false;
      }
      Persona x = (Persona) p;
      return this.dni.equals(x.dni);
    }

    public int hashCode() {
      return this.dni.hashCode();
    }
  }
}
