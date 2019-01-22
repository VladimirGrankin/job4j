package ru.job4j.array;

/**
 * Проверяет булевый массив и если все элементы одинаковые, то выдает true, в противном случае - false
 * @author Vladimir Grankin
 * @since 0.1
 * @version 0.1
 */
public class Check {
    /**
     * Метод перебирает каждый элемент массива и проверяет, чтобы он был одинаково true либо false
     * @param data - булевый масссив
     * @return - true если все элементы одинаковые, иначе false
     */
    public boolean mono(boolean[] data) {
        boolean result = false;
            for (int i = 0; i <= data.length; i++) {
                if (data[i]) {
                    result = true;
                } else if (!data[i]) {
                    result = true;
                }
            }
            return result;
    }
}
