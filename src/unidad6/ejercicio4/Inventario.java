package unidad6.ejercicio4;

public class Inventario {

    int total = Producto.totalProductos;
    Producto[] productos = new Producto[total];


    public void agregarProducto(Producto producto) {
        for ( int i = 0; i < productos.length; i++) {
            if (productos[i] == null) {
                productos[i] = producto;
                break;
            }
        }

    }

    public void listarProductos() {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == null) {
                continue;
            }
            if (productos[i] != null) {
                System.out.println(productos[i].mostrarDetalles());
            }
        }
    }

    public void listarProductosPorTipo(String tipo) {
        tipo = tipo.toLowerCase();
        System.out.println("Productos de tipo " + tipo);
        if (tipo.equals("electronico")) {
            for (int i = 0; i < productos.length; i++) {
                if ( (productos != null) && (productos[i] instanceof ProductoElectronico)) {
                    System.out.println("[ " + productos[i].mostrarDetalles() + " ]");
                }
            }
        }
        else {
            for (int i = 0; i < productos.length; i++) {
                if ((productos[i] != null) && (productos[i] instanceof ProductoRopa)) {
                    System.out.println("[ " + productos[i].mostrarDetalles() + " ]");
                }
            }
        }
    }
}
