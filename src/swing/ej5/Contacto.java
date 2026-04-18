package swing.ej5;

public class Contacto {

    private String nombre;
    private String telefono;
    private String email;
    private Categoria categoria;


    public Contacto(String nombre, String telefono, String email, Categoria categoria) {

        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.categoria = categoria;

    }


    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public Categoria getCategoria() {
        return categoria;
    }


    @Override
    public String toString() {

        return "[Contacto]\n" +
                "Nombre: " + nombre + "\n" +
                "Telefono: " + telefono + "\n" +
                "Email: " + email + "\n" +
                "Categoria: " + categoria + "\n";

    }
}