package unidad9.ejercicio1;

public class MovilConCamaraYRadio extends MovilConCamara {
    public MovilConCamaraYRadio(String resolucion, String numero, String operador) {
        super(numero, operador, resolucion);
    }

    //Métodos:
    public void escuchar(String sintonia) {
        System.out.println("Escuchando la emisora " + sintonia);
    }

    public void echarFoto() {
        System.out.println("He echado una foto con una resolución " + this.resolucion);
    }
}
