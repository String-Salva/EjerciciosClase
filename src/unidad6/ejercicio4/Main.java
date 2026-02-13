package unidad6.ejercicio4;

public class Main {
    static void main(String[] args) {

        double[] historicoCamiseta = {2.5,4.6,10};
        double[] historicoTablet = {2.5,4.6,200.0};
        Producto camiseta = new ProductoRopa("Camiseta",historicoCamiseta, ProductoRopa.Talla.XL, ProductoRopa.Material.Lana);
        Producto tablet = new ProductoElectronico("Tablet",historicoTablet,2);
        Inventario inv = new Inventario();

        inv.agregarProducto(camiseta);
        inv.agregarProducto(tablet);

        inv.listarProductosPorTipo("electronico");
        inv.listarProductosPorTipo("ropa");

        inv.listarProductos();
    }
}
