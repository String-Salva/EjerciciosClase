package unidad6.ejercicio5;

public class ConversorLongitudes {
    public static final double KM_A_MILLAS = 0.621371;
    public static final double MILLAS_A_KM = 1.0 / KM_A_MILLAS;
    public static final double pulgadaAmetro = 0.0254;
    public static final double KmAMetro = 1000;
    public static final double pieAMetro = 0.3048;
    public static final double yardaAMetro = 0.9144;
    public static final double millaAmetro = MILLAS_A_KM * 1000;
    public static final double nauticaAMetro = 1.852;


    // MÉTODOS
    public static double kmAMillas(double km) {
        return ConversorLongitudes.KM_A_MILLAS * km;
    }

    public static double millasAKm(double millas) {
        return ConversorLongitudes.MILLAS_A_KM * millas;
    }

    public static double millasAmetros(double millas) {
        return ConversorLongitudes.millasAKm(millas) * 1000;
    }


    public static double convertir(double cantidad, Unidad udLongitudInicial, Unidad udLongitudFinal) {
        double metros = 1;
        switch (udLongitudInicial) {
            case Unidad.PULGADA:
                metros = cantidad * pulgadaAmetro;
                break;
            case Unidad.KILOMETRO:
                metros = cantidad * 1000;
                break;
            case Unidad.PIE:
                metros = cantidad * pieAMetro;
                break;
            case Unidad.YARDA:
                metros = cantidad * yardaAMetro;
                break;
            case Unidad.MILLA:
                metros = millasAmetros(cantidad);
                break;
            case Unidad.NAUTICA:
                metros = cantidad * nauticaAMetro;
                break;
            case Unidad.METRO:
                metros = cantidad;
                break;
            case Unidad.MILIMETRO:
                metros = cantidad / 1000;
                break;
        }
        double resultado = 1;

        switch (udLongitudFinal) {
            case Unidad.KILOMETRO:
                resultado = metros * 1000;
                break;
            case Unidad.METRO:
                resultado = metros;
                break;
            case Unidad.MILIMETRO:
                resultado = metros * 1000;
                break;
            case Unidad.MILLA:
                resultado = kmAMillas(metros) / 1000;
                break;
            case Unidad.NAUTICA:
                resultado = metros * (1 / nauticaAMetro);
                break;
            case Unidad.PIE:
                resultado = metros * (1 / pieAMetro);
                break;
            case Unidad.PULGADA:
                resultado = metros * (1 / pulgadaAmetro);
                break;
            case Unidad.YARDA:
                resultado = metros * (1 / yardaAMetro);
                break;

        }

        return resultado;
    }
}
