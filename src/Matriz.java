/*
Escribe una clase llamada Matriz, en el fichero Matriz.java, que implemente las estructuras
de datos y métodos necesarios para manejar matrices cuadradas de números enteros, cuya
capacidad puede definir el usuario. Debe incluir los siguientes métodos:
• void asignarDatos(int[] vector)
Rellena el contenido de la matriz por filas con los datos pasados desde un vector
unidimensional.
• void suma(Matriz m)
Suma los valores de la propia clase con los valores de una matriz pasada como
argumento.
• void producto(Matriz m)
Multiplica los valores de la propia clase con los valores de una matriz pasada como
argumento.
• void mostrar()
Muestra el contenido de la matriz.
Después, escribe un programa Java orientado a objetos, llamado MainMatriz.java, que
realice las siguientes operaciones:
• Crear dos matrices de tamaño 3x3.
• Rellenar la primera con los datos: 3, 2, 1, 1, 2, 3, 2, 3, 1.
• Rellenar la segunda con los datos: 1, 1, 2, 2, 1, 1, 1, 2, 1.
• Mostrar el contenido de ambas matrices.
• Multiplicar la primera por la segunda y mostrar el resultado.
• Sumar la primera por la segunda y mostrar el resultado. */
public class Matriz {
  private int size;
  private int[][] matriz;

  public Matriz(int size) {
    this.size = size;
    this.matriz = new int[size][size];

  }

  public int[][] getMatriz() {
    return this.matriz;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public void asignarDatos(int[] vector) {
    if (vector.length != this.getSize() * this.getSize()) {
      throw new Error("Fallo con el tamaño del vector, si le das un tamaño N tienes que darle un vector de tamaño N*N gilipollas");
    }
    int k = 0;
    for (int i = 0; i < this.getSize(); i++) {
      for (int j = 0; j < this.getSize(); j++) {
        this.matriz[i][j] = vector[k++];
      }
    }

  }

  public void mostrarDatos() {
    for (int i = 0; i < getSize(); i++) {
      for (int j = 0; j < getSize(); j++) {
        System.out.print(this.matriz[i][j] + " ");
      }
      System.out.println();
    }
  }

  public void sumaMatriz(Matriz m) {
    for (int i = 0; i < getSize(); i++) {
      for (int j = 0; j < getSize(); j++) {
        this.matriz[i][j] += m.getMatriz()[i][j];
      }
    }
    this.mostrarDatos();
  }

  public void productoMatriz(Matriz m) {
    for (int i = 0; i < getSize(); i++) {
      for (int j = 0; j < getSize(); j++) {
        this.matriz[i][j] *= m.getMatriz()[i][j];
      }
    }
    this.mostrarDatos();
  }

  public static void main(String[] args) {
    Matriz m = new Matriz(3);
    Matriz z = new Matriz(3);

    int[] vector1 = { 3, 2, 1, 1, 2, 3, 2, 3, 1,2 };
    int[] vector2 = { 1, 1, 2, 2, 1, 1, 1, 2, 1 };

    m.asignarDatos(vector1);
    z.asignarDatos(vector2);

    m.productoMatriz(z);
    

  }
}
