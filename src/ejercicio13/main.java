package ejercicio13;

public class main {
    public static void main(String[] args) {
        Electrodomestico[] a = new Electrodomestico[10];
        String tele = "";
        String lava = "";
        String electro = "";
        double precioTele = 0.0;
        double precioLava = 0.0;
        double precioElectro = 0.0;

        a[0] = new Televisor(45.1, true);
        a[1] = new Lavadora(40.5);
        a[2] = new Televisor(50.1, false);
        a[3] = new Electrodomestico(45.8, 80);
        a[4] = new Lavadora(80);
        a[5] = new Televisor(80.4, true);
        a[6] = new Electrodomestico(70.4, 90.9);
        a[7] = new Lavadora(10);
        a[8] = new Televisor(40, false);
        a[9] = new Electrodomestico(150.4, 150.0);

        for (int i = 0; i < a.length; i++) {

            if (a[i] instanceof Televisor) {
                tele += "Precio de televisor " + a[i].precioFinal() + "\n";
                precioTele += a[i].precioFinal();
            }

            if (a[i] instanceof Lavadora) {
                lava += "Precio de lavadora " + a[i].precioFinal() + "\n";
                precioLava += a[i].precioFinal();
            } else {
                electro += "Precio de lavadora " + a[i].precioFinal() + "\n";
                precioElectro += a[i].precioFinal();
            }

        }
        System.out.println(tele + "\n" + lava + "\n" + electro + "\n" + "Desglose de precios por familia: " + " Televisiones: " + precioTele + "\n" + "Lavadoras: " + precioLava + "\n" + "Precio del resto de electrodomesticos: " + precioElectro);

    }
}
