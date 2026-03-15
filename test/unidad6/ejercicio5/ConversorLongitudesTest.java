package unidad6.ejercicio5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversorLongitudesTest {
    @BeforeEach
    void setUp() {

    }

    @org.junit.jupiter.api.Test
    void kmAMillas() {
    }

    @org.junit.jupiter.api.Test
    void millasAKm() {
    }

    @org.junit.jupiter.api.Test
    void millasAmetros() {
    }

    @org.junit.jupiter.api.Test
    void convertir() {
    }

    @Test
    void testKmAMillas() {


        assertEquals(ConversorLongitudes.KM_A_MILLAS, ConversorLongitudes.kmAMillas(1));
    }

    @Test
    void testMillasAKm() {


        assertEquals(ConversorLongitudes.MILLAS_A_KM, ConversorLongitudes.millasAKm(1));
    }

    @Test
    void testMillasAmetros() {


        assertEquals(ConversorLongitudes.MILLAS_A_KM * 1000,ConversorLongitudes.millasAmetros(1));
    }

    @Test
    void testConvertir() {


        assertEquals(2.286,ConversorLongitudes.convertir(2.5, Unidad.YARDA, Unidad.METRO));
    }

    @Test
    void testConversionNoValida() {
        IllegalArgumentException a = assertThrows(IllegalArgumentException.class, () -> ConversorLongitudes.convertir(-4.0,Unidad.YARDA, Unidad.METRO));
        assertEquals(null, a.getMessage());
    }
}
/*
public static final double KM_A_MILLAS = 0.621371;
    public static final double MILLAS_A_KM = 1.0 / KM_A_MILLAS;
    public static final double pulgadaAmetro = 0.0254;
    public static final double KmAMetro = 1000;
    public static final double pieAMetro = 0.3048;
    public static final double yardaAMetro = 0.9144;
    public static final double millaAmetro = MILLAS_A_KM * 1000;
    public static final double nauticaAMetro = 1.852;
 */