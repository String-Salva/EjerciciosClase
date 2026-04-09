package unidad9.ejercicio1;

public class RadioPortatil implements Radioable {
    String sintonia;

    public RadioPortatil(String sintonia) {
        this.sintonia = sintonia;
    }


    @Override
    public void escuchar(String sintonia) {
        System.out.println("Se está escuchando la melodia " + this.sintonia);
    }
}
