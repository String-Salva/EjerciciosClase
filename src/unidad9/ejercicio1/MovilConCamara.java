package unidad9.ejercicio1;

public class MovilConCamara extends TelefonoMovil {
    String resolucion;

    public MovilConCamara() {
        super();
    }
    public MovilConCamara(String resolucion,String numero, String operador) {
        super(numero,operador);
        this.resolucion = resolucion;
    }

    public void echarFoto() {
        System.out.println("He echado una foto con una resolución " + this.resolucion);
    }


}
