package com.goodcorner.utilities;


public class StringFunctions {

    protected static String cleanWhiteSpaceAndTrim(String stringToClean) {
        return stringToClean.trim().replaceAll("\\s+", "");
    }

    public static Boolean isBlank(String stringToTest) {
        if (stringToTest == null) return null;

        return cleanWhiteSpaceAndTrim(stringToTest).isEmpty();
    }
}
