package unidad6.ejercicio4;

public class ProductoElectronico extends Producto {
    protected int garantia;

    public ProductoElectronico(String nombre, double[] preciosHistoricos,int garantia) {
        super(nombre,preciosHistoricos);
        this.garantia = garantia;
        Producto.totalProductos++;
    }
    public ProductoElectronico(){}

    public int getGarantia() {
        return this.garantia;
    }


    public String mostrarDetalles() {
        return super.mostrarDetalles() + " Meses de garantía: " + this.getGarantia();
    }
}
