/*/*- El convertidor de medidas
Estamos desarrollando una aplicación que realiza conversiones de unidades de medida. El
sistema debe permitir convertir un valor de centímetro a pulgada y viceversa, de libra a
kilogramo y viceversa, de Galón a litro y viceversa.
Tener en cuenta que existe una escala de conversión por la cual una pulgada es igual a 2,54
centímetros, una libra es igual a 0,453592 kilos y por último un galón es igual a 3,78541
litros. Definir las constantes necesarias para poder realizar las conversiones y la clase que se
encargue de las conversiones no debe tener que instanciarse para poder usarse.
*/
public class Convertidor {

    // Constantes de conversión
    private static final double CENTIMETROS_POR_PULGADA = 2.54;
    private static final double KILOS_POR_LIBRA = 0.453592;
    private static final double LITROS_POR_GALON = 3.78541;

    // Métodos para conversiones de longitud
    public static double centimetrosAPulgadas(double centimetros) {
        return centimetros / CENTIMETROS_POR_PULGADA;
    }

    public static double pulgadasACentimetros(double pulgadas) {
        return pulgadas * CENTIMETROS_POR_PULGADA;
    }

    // Métodos para conversiones de masa
    public static double librasAKilos(double libras) {
        return libras * KILOS_POR_LIBRA;
    }

    public static double kilosALibras(double kilos) {
        return kilos / KILOS_POR_LIBRA;
    }

    // Métodos para conversiones de volumen
    public static double galonesALitros(double galones) {
        return galones * LITROS_POR_GALON;
    }

    public static double litrosAGalones(double litros) {
        return litros / LITROS_POR_GALON;
    }
}
