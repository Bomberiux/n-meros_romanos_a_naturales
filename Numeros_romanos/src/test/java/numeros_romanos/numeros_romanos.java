package numeros_romanos;

import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class numeros_romanos {

    private static final int[] VALORES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] SIMBOLOS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    private static final Map<Character, Integer> VALORES_ROMANOS = new HashMap<>();

    static {
        VALORES_ROMANOS.put('I', 1);
        VALORES_ROMANOS.put('V', 5);
        VALORES_ROMANOS.put('X', 10);
        VALORES_ROMANOS.put('L', 50);
        VALORES_ROMANOS.put('C', 100);
        VALORES_ROMANOS.put('D', 500);
        VALORES_ROMANOS.put('M', 1000);
    }

    // Conversión de natural a romano (parte 1)
    public String convertirARomanos(Integer numeroNatural) {
        if (numeroNatural <= 0 || numeroNatural > 3999) {
            throw new IllegalArgumentException("El número debe estar entre 1 y 3999");
        }

        StringBuilder resultado = new StringBuilder();
        int numeroRestante = numeroNatural;

        for (int i = 0; i < VALORES.length; i++) {
            while (numeroRestante >= VALORES[i]) {
                resultado.append(SIMBOLOS[i]);
                numeroRestante -= VALORES[i];
            }
        }

        return resultado.toString();
    }

    // Conversión de romano a natural (parte 2)
    public Integer convertirANatural(String numeroRomano) {
        if (numeroRomano == null || numeroRomano.trim().isEmpty()) {
            throw new IllegalArgumentException("El número romano no puede estar vacío");
        }

        String romano = numeroRomano.toUpperCase().trim();
        validarRomano(romano);

        int resultado = 0;
        int longitud = romano.length();

        for (int i = 0; i < longitud; i++) {
            int valorActual = VALORES_ROMANOS.get(romano.charAt(i));

            // Si hay un siguiente carácter y el valor actual es menor que el siguiente
            if (i < longitud - 1 && valorActual < VALORES_ROMANOS.get(romano.charAt(i + 1))) {
                resultado -= valorActual;
            } else {
                resultado += valorActual;
            }
        }

        // Validar que el resultado esté en el rango válido
        if (resultado <= 0 || resultado > 3999) {
            throw new IllegalArgumentException("Número romano inválido: " + numeroRomano);
        }

        return resultado;
    }

    private void validarRomano(String romano) {
        // Validar caracteres permitidos
        if (!romano.matches("[IVXLCDM]+")) {
            throw new IllegalArgumentException("Caracteres inválidos en el número romano: " + romano);
        }

        // Validar repeticiones excesivas
        if (romano.matches(".*I{4,}.*") || romano.matches(".*X{4,}.*") ||
                romano.matches(".*C{4,}.*") || romano.matches(".*M{4,}.*") ||
                romano.matches(".*V{2,}.*") || romano.matches(".*L{2,}.*") ||
                romano.matches(".*D{2,}.*")) {
            throw new IllegalArgumentException("Repetición inválida en el número romano: " + romano);
        }

        // Validar restas inválidas
        if (romano.matches(".*IL.*") || romano.matches(".*IC.*") || romano.matches(".*ID.*") ||
                romano.matches(".*IM.*") || romano.matches(".*XD.*") || romano.matches(".*XM.*") ||
                romano.matches(".*VX.*") || romano.matches(".*VL.*") || romano.matches(".*VC.*") ||
                romano.matches(".*VD.*") || romano.matches(".*VM.*") || romano.matches(".*LC.*") ||
                romano.matches(".*LD.*") || romano.matches(".*LM.*") || romano.matches(".*DM.*")) {
            throw new IllegalArgumentException("Sustracción inválida en el número romano: " + romano);
        }
    }
}