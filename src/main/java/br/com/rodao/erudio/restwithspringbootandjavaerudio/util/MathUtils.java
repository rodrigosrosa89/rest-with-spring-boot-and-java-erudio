package br.com.rodao.erudio.restwithspringbootandjavaerudio.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class MathUtils {

    public static boolean isNumeric(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        return s.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
