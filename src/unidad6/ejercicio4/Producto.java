package unidad6.ejercicio4;

public class Producto {
    protected String nombre;
    protected static double[] preciosHistoricos;
    protected static int totalProductos = 0;


// Constructor

    public Producto(String nombre, double[] preciosHistoricos) {
        this.nombre = nombre;
        this.preciosHistoricos = preciosHistoricos;
        Producto.totalProductos++;
    }
    public Producto() {}

    // Getters and Setters
    public double[] getPreciosHistoricos() {
        return preciosHistoricos;
    }

    public void setPreciosHistoricos(double[] preciosHistoricos) {
        this.preciosHistoricos = preciosHistoricos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTotalProductos() {
        return Producto.totalProductos;
    }

    // Métodos

    public void agregarPrecio(double nuevoPrecio) {
        for (int i = 0; i < preciosHistoricos.length; i++) {
            if (preciosHistoricos[i] == 0) {
                preciosHistoricos[i] = nuevoPrecio;
                break;
            }
        }
    }

    public double obtenerPrecioActual() {
        return this.getPreciosHistoricos()[preciosHistoricos.length - 1];
    }

    public String mostrarHistorico() {
        String s = "";
        for (double i : preciosHistoricos) {
            s += " " + i + " ";
        }
        s = "[" + s + "]";
        return s;

    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + this.getNombre() + "\n" +
                "Precio Actual: " + this.obtenerPrecioActual() + "\n" +
                "Historial de precios del producto: " + this.mostrarHistorico());
    }

    public static int obtenerTotalProductos() {
        return Producto.totalProductos;
    }

    public String MostrarDetalles() {
        String s = "";
        s = " El nombre del producto es: " + this.obtenerPrecioActual() + "\n" +
                "Historial de precios de este producto: " + this.mostrarHistorico();
        return s;
    }
}
