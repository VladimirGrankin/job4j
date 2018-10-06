package ru.job4j.converter;

/**
 * Converter - Currency converter
 *
 * @author Vladimir Grankin
 * @since 0.1
 * @version 0.1
* */

public class Converter {
    /**
     * Convert Russian ruble to Euro
     * @param value Rus ruble
     * @return Euro
    * */
    public int rubleToEuro(int value) {
        return value / 70;
    }

    /**
     * Convert Russian ruble to US Dollar
     * @param value Rus ruble
     * @return US Dollar
     * */
    public int rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * Convert Euro to Russian ruble
     * @param value Euro
     * @return Russian ruble
     * */
    public int euroToRuble(int value) {
        return value * 70;
    }

    /**
     * Convert US Dollar to Russian ruble
     * @param value US Dollar
     * @return Russian ruble
     * */
    public int dollarToRuble(int value) {
        return value * 60;
    }

}
