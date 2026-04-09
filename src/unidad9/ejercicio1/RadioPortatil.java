package unidad9.ejercicio1;

public class RadioPortatil {
    String sintonia;

    public RadioPortatil(String sintonia) {
        this.sintonia = sintonia;
    }

    public void escuchar() {
        System.out.println("Se está escuchando la melodia " + this.sintonia);
    }
}
