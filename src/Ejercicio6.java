public class Ejercicio6 {
    public static void main(String[] args) {
        int dni = 25733196;

        int indice = dni % 23;

        char[] letras =  { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
                'L', 'C', 'K', 'E' };

        String dniConLetra = String.valueOf(dni) + letras[indice];
        System.out.println(dniConLetra);

    }
}
