package unidad9.ejercicio1;

public class Pruebas {

    public static void prueba() {
        MovilConCamaraYRadio movil1 = new MovilConCamaraYRadio("4 mbpx", "622738530", "Vodafone");

        movil1.echarFoto();
        movil1.escuchar("La Gozadera");
        movil1.llamar("654897456");


        TelefonoFijo fijo1 = new TelefonoFijo("SIEMENS", "c55", "564156456");

    }

    public static void main(String[] args) {
        prueba();

        //Iniciamos un almacen

        Telefono[] almacenTelefonos = new Telefono[4];
        RadioPortatil[] almacenRadios = new RadioPortatil[40];

        //Introducimos la mercancía que nos llega

        almacenTelefonos[0] = new MovilConCamaraYRadio("4k","622738530","Vodafone");
        almacenTelefonos[1] = new MovilConCamara("5mbpx","652356658","Orange");
        almacenTelefonos[2] = new TelefonoMovil("622738530","Movistar");
        almacenTelefonos[3] = new TelefonoFijo("SIEMENS","AVENTADOR","952334454");


        almacenRadios[0] = new RadioPortatil("Radio María");


    }
}
