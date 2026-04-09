package unidad9.ejercicio2;

public class Main {
    static void main(String[] args) {
        Smartphone iphone = new Smartphone("14 pro max", "iPhone",false);
        SmartTV television = new SmartTV("Vita","Samsung",false);


        iphone.hacerLlamada("622738530");
        iphone.conectarWifi();
        System.out.println(iphone.estaConectado());
        iphone.desconectarWifi();
        System.out.println(iphone.estaConectado());

        television.reproducirVideo("2 Girls 1 Cup");
        television.conectarWifi();
        System.out.println(television.estaConectado());
        television.desconectarWifi();
        System.out.println(television.estaConectado());

    }
}
