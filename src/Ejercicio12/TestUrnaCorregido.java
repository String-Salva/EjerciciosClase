package ejercicio12;

public class TestUrnaCorregido {
    public static void main(String[] args) {
        Urna urna = new Urna(10,10);

        while (urna.totalBolas() > 1) {
            Urna.Colores c1  = urna.bola();
            Urna.Colores c2 = urna.bola();
            if (c1 == c2) {

                urna.ponerBlanca();

            } else {
                urna.ponerNegras();
            }
        }
        System.out.println("Solo queda una bola en la runa.");
        Urna.Colores color = urna.bola();
        System.out.println("El color de la última bola es " + color.toString());

    }
}
