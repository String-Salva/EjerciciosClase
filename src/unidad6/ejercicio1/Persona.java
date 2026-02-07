package unidad6.ejercicio1;

public class Persona {
  int idPersona;
  String nombre;
  static int contadorPersonas = 0;

  public Persona(int idPersona, String nombre) {
    this.idPersona = idPersona;
    this.nombre = nombre;
    contadorPersonas++;
  }

  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public int getContadorPersonas() {
    return contadorPersonas;
  }

  public String toString() {
    return "La persona " + this.getNombre() + " con id " + this.idPersona + " es la persona número " + getContadorPersonas();
  }

  public static void main(String[] args) {
      Persona p1 = new Persona(123,"Salva");
      Persona p2 = new Persona(1234, "Esperanza");

    System.out.println(p1.toString());
    System.out.println(p2.toString());



  }
}
