package unidad6.ejercicio4;

public class ProductoRopa extends Producto {
    public enum Talla {
        M,L,XL
    }
    public enum Material {
        Algodón,Lino,Lana
    }

    protected Talla talla;
    protected Material material;

    public ProductoRopa(String nombre, double[] preciosHistoricos,Talla t, Material material) {
        super (nombre,preciosHistoricos);
        this.talla = t;
        this.material = material;
    }

    public Talla getTalla() {
        return this.talla;
    }
    public Material getMaterial() {
        return this.material;
    }
    public String mostrarDetalles() {
        String s = super.mostrarDetalles() + " Talla: " + this.getTalla() + "\n" + "Material: " + this.getMaterial();
        return s;
    }


}
