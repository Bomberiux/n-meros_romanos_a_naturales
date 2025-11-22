package numeros_romanos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class numeros_romanosTest {

    private numeros_romanos numerosRomanos = new numeros_romanos();

    // ========== PRIMERA PARTE: NATURAL A ROMANO ==========

    @Test
    public void pasar1ARomanos() {
        String romano = numerosRomanos.convertirARomanos(1);
        assertEquals("I", romano);
    }

    @Test
    public void pasar2ARomanos() {
        String romano = numerosRomanos.convertirARomanos(2);
        assertEquals("II", romano);
    }

    @Test
    public void pasar3ARomanos() {
        String romano = numerosRomanos.convertirARomanos(3);
        assertEquals("III", romano);
    }

    @Test
    public void pasar4ARomanos() {
        String romano = numerosRomanos.convertirARomanos(4);
        assertEquals("IV", romano);
    }

    @Test
    public void pasar5ARomanos() {
        String romano = numerosRomanos.convertirARomanos(5);
        assertEquals("V", romano);
    }

    @Test
    public void pasar6ARomanos() {
        String romano = numerosRomanos.convertirARomanos(6);
        assertEquals("VI", romano);
    }

    @Test
    public void pasar7ARomanos() {
        String romano = numerosRomanos.convertirARomanos(7);
        assertEquals("VII", romano);
    }

    @Test
    public void pasar8ARomanos() {
        String romano = numerosRomanos.convertirARomanos(8);
        assertEquals("VIII", romano);
    }

    @Test
    public void pasar9ARomanos() {
        String romano = numerosRomanos.convertirARomanos(9);
        assertEquals("IX", romano);
    }

    @Test
    public void pasar10ARomanos() {
        String romano = numerosRomanos.convertirARomanos(10);
        assertEquals("X", romano);
    }

    @Test
    public void pasar11ARomanos() {
        String romano = numerosRomanos.convertirARomanos(11);
        assertEquals("XI", romano);
    }

    @Test
    public void pasar12ARomanos() {
        String romano = numerosRomanos.convertirARomanos(12);
        assertEquals("XII", romano);
    }

    @Test
    public void pasar13ARomanos() {
        String romano = numerosRomanos.convertirARomanos(13);
        assertEquals("XIII", romano);
    }

    @Test
    public void pasar14ARomanos() {
        String romano = numerosRomanos.convertirARomanos(14);
        assertEquals("XIV", romano);
    }

    @Test
    public void pasar15ARomanos() {
        String romano = numerosRomanos.convertirARomanos(15);
        assertEquals("XV", romano);
    }

    @Test
    public void pasar16ARomanos() {
        String romano = numerosRomanos.convertirARomanos(16);
        assertEquals("XVI", romano);
    }

    @Test
    public void pasar17ARomanos() {
        String romano = numerosRomanos.convertirARomanos(17);
        assertEquals("XVII", romano);
    }

    @Test
    public void pasar18ARomanos() {
        String romano = numerosRomanos.convertirARomanos(18);
        assertEquals("XVIII", romano);
    }

    @Test
    public void pasar19ARomanos() {
        String romano = numerosRomanos.convertirARomanos(19);
        assertEquals("XIX", romano);
    }

    @Test
    public void pasar20ARomanos() {
        String romano = numerosRomanos.convertirARomanos(20);
        assertEquals("XX", romano);
    }

    @Test
    public void verificaVeintenaNumeroRomanos() {
        List<Integer> numerosNaturales = Arrays.asList(20, 21, 22, 23, 24, 25, 26, 27, 28, 29);

        List<String> romanos = numerosNaturales.stream()
                .map(number -> numerosRomanos.convertirARomanos(number))
                .collect(Collectors.toList());

        assertEquals("XX", romanos.get(0));
        assertEquals("XXI", romanos.get(1));
        assertEquals("XXII", romanos.get(2));
        assertEquals("XXIII", romanos.get(3));
        assertEquals("XXIV", romanos.get(4));
        assertEquals("XXV", romanos.get(5));
        assertEquals("XXVI", romanos.get(6));
        assertEquals("XXVII", romanos.get(7));
        assertEquals("XXVIII", romanos.get(8));
        assertEquals("XXIX", romanos.get(9));
    }

    @Test
    public void verificarTreintenaNumeroRomanos() {
        List<Integer> numerosNaturales = Arrays.asList(30, 31, 32, 33, 34, 35, 36, 37, 38, 39);

        List<String> romanos = numerosNaturales.stream()
                .map(number -> numerosRomanos.convertirARomanos(number))
                .collect(Collectors.toList());

        assertEquals("XXX", romanos.get(0));
        assertEquals("XXXI", romanos.get(1));
        assertEquals("XXXII", romanos.get(2));
        assertEquals("XXXIII", romanos.get(3));
        assertEquals("XXXIV", romanos.get(4));
        assertEquals("XXXV", romanos.get(5));
        assertEquals("XXXVI", romanos.get(6));
        assertEquals("XXXVII", romanos.get(7));
        assertEquals("XXXVIII", romanos.get(8));
        assertEquals("XXXIX", romanos.get(9));
    }

    @Test
    public void verificarDecimalesRomanos() {
        List<Integer> numerosNaturales = Arrays.asList(40, 50, 60, 70, 80, 90, 88, 67);

        List<String> romanos = numerosNaturales.stream()
                .map(number -> numerosRomanos.convertirARomanos(number))
                .collect(Collectors.toList());

        assertEquals("XL", romanos.get(0));
        assertEquals("L", romanos.get(1));
        assertEquals("LX", romanos.get(2));
        assertEquals("LXX", romanos.get(3));
        assertEquals("LXXX", romanos.get(4));
        assertEquals("XC", romanos.get(5));
        assertEquals("LXXXVIII", romanos.get(6));
        assertEquals("LXVII", romanos.get(7));
    }

    @Test
    public void verificarRomanos() {
        List<Integer> numerosNaturales = Arrays.asList(100, 200, 300, 400, 500, 600, 700, 800, 900, 3234);

        List<String> romanos = numerosNaturales.stream()
                .map(number -> numerosRomanos.convertirARomanos(number))
                .collect(Collectors.toList());

        assertEquals("C", romanos.get(0));
        assertEquals("CC", romanos.get(1));
        assertEquals("CCC", romanos.get(2));
        assertEquals("CD", romanos.get(3));
        assertEquals("D", romanos.get(4));
        assertEquals("DC", romanos.get(5));
        assertEquals("DCC", romanos.get(6));
        assertEquals("DCCC", romanos.get(7));
        assertEquals("CM", romanos.get(8));
        assertEquals("MMMCCXXXIV", romanos.get(9));
    }

    // ========== SEGUNDA PARTE: ROMANO A NATURAL ==========

    @Test
    public void convertirIRomanoANatural() {
        Integer natural = numerosRomanos.convertirANatural("I");
        assertEquals(1, natural);
    }

    @Test
    public void convertirIIRomanoANatural() {
        Integer natural = numerosRomanos.convertirANatural("II");
        assertEquals(2, natural);
    }

    @Test
    public void convertirIIIRomanoANatural() {
        Integer natural = numerosRomanos.convertirANatural("III");
        assertEquals(3, natural);
    }

    @Test
    public void convertirIVRomanoANatural() {
        Integer natural = numerosRomanos.convertirANatural("IV");
        assertEquals(4, natural);
    }

    @Test
    public void convertirVRomanoANatural() {
        Integer natural = numerosRomanos.convertirANatural("V");
        assertEquals(5, natural);
    }

    @Test
    public void convertirVIRomanoANatural() {
        Integer natural = numerosRomanos.convertirANatural("VI");
        assertEquals(6, natural);
    }

    @Test
    public void convertirVIIRomanoANatural() {
        Integer natural = numerosRomanos.convertirANatural("VII");
        assertEquals(7, natural);
    }

    @Test
    public void convertirVIIIRomanoANatural() {
        Integer natural = numerosRomanos.convertirANatural("VIII");
        assertEquals(8, natural);
    }

    @Test
    public void convertirIXRomanoANatural() {
        Integer natural = numerosRomanos.convertirANatural("IX");
        assertEquals(9, natural);
    }

    @Test
    public void convertirXRomanoANatural() {
        Integer natural = numerosRomanos.convertirANatural("X");
        assertEquals(10, natural);
    }

    @Test
    public void convertirXIVRomanoANatural() {
        Integer natural = numerosRomanos.convertirANatural("XIV");
        assertEquals(14, natural);
    }

    @Test
    public void convertirXIXRomanoANatural() {
        Integer natural = numerosRomanos.convertirANatural("XIX");
        assertEquals(19, natural);
    }

    @Test
    public void convertirXXRomanoANatural() {
        Integer natural = numerosRomanos.convertirANatural("XX");
        assertEquals(20, natural);
    }

    @Test
    public void convertirXLIVRomanoANatural() {
        Integer natural = numerosRomanos.convertirANatural("XLIV");
        assertEquals(44, natural);
    }

    @Test
    public void convertirLXXXVIIIRomanoANatural() {
        Integer natural = numerosRomanos.convertirANatural("LXXXVIII");
        assertEquals(88, natural);
    }

    @Test
    public void convertirXCIXRomanoANatural() {
        Integer natural = numerosRomanos.convertirANatural("XCIX");
        assertEquals(99, natural);
    }

    @Test
    public void convertirCDXLIVRomanoANatural() {
        Integer natural = numerosRomanos.convertirANatural("CDXLIV");
        assertEquals(444, natural);
    }

    @Test
    public void convertirCMXCIXRomanoANatural() {
        Integer natural = numerosRomanos.convertirANatural("CMXCIX");
        assertEquals(999, natural);
    }

    @Test
    public void convertirMMMCCXXXIVRomanoANatural() {
        Integer natural = numerosRomanos.convertirANatural("MMMCCXXXIV");
        assertEquals(3234, natural);
    }

    @Test
    public void convertirNumerosComplejosRomanoANatural() {
        assertEquals(1990, numerosRomanos.convertirANatural("MCMXC"));
        assertEquals(2024, numerosRomanos.convertirANatural("MMXXIV"));
        assertEquals(1666, numerosRomanos.convertirANatural("MDCLXVI"));
        assertEquals(3999, numerosRomanos.convertirANatural("MMMCMXCIX"));
    }

    @Test
    public void convertirRomanosCaseInsensitive() {
        assertEquals(1, numerosRomanos.convertirANatural("i"));
        assertEquals(5, numerosRomanos.convertirANatural("v"));
        assertEquals(10, numerosRomanos.convertirANatural("x"));
        assertEquals(49, numerosRomanos.convertirANatural("xlix"));
    }

    // ========== TESTS DE VALIDACIÓN ==========

    @Test
    public void validarRomanosInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> numerosRomanos.convertirANatural(""));
        assertThrows(IllegalArgumentException.class, () -> numerosRomanos.convertirANatural(" "));
        assertThrows(IllegalArgumentException.class, () -> numerosRomanos.convertirANatural(null));
        assertThrows(IllegalArgumentException.class, () -> numerosRomanos.convertirANatural("IIII"));
        assertThrows(IllegalArgumentException.class, () -> numerosRomanos.convertirANatural("VV"));
        assertThrows(IllegalArgumentException.class, () -> numerosRomanos.convertirANatural("IL"));
        assertThrows(IllegalArgumentException.class, () -> numerosRomanos.convertirANatural("IC"));
        assertThrows(IllegalArgumentException.class, () -> numerosRomanos.convertirANatural("VX"));
        assertThrows(IllegalArgumentException.class, () -> numerosRomanos.convertirANatural("ABC"));
        assertThrows(IllegalArgumentException.class, () -> numerosRomanos.convertirANatural("X1V"));
    }

    // ========== TESTS DE IDEMPOTENCIA ==========

    @Test
    public void testIdempotencia() {
        // Verificar que convertir de natural a romano y viceversa da el mismo resultado
        for (int i = 1; i <= 100; i++) {
            String romano = numerosRomanos.convertirARomanos(i);
            Integer natural = numerosRomanos.convertirANatural(romano);
            assertEquals(i, natural, "Falló para el número: " + i);
        }
    }

    @Test
    public void testIdempotenciaRomanos() {
        List<String> romanosValidos = Arrays.asList("I", "IV", "IX", "XIV", "XIX", "XLIV", "LXXXVIII", "XCIX", "CDXLIV", "CMXCIX", "MMMCMXCIX");

        for (String romano : romanosValidos) {
            Integer natural = numerosRomanos.convertirANatural(romano);
            String romanoConvertido = numerosRomanos.convertirARomanos(natural);
            assertEquals(romano, romanoConvertido, "Falló para el romano: " + romano);
        }
    }
}