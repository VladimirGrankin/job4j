package ru.job4j.array;

/**
 * Проверяет булевый массив и если все элементы одинаковые, то выдает true, в противном случае - false
 * @author Vladimir Grankin
 * @since 0.1
 * @version 0.2
 */
public class Check {
    /**
     * Метод перебирает каждый элемент массива и сравнивает со следующим элементом массива
     * @param data - булевый массив
     * @return - true если все элементы одинаковые, иначе false
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
            for (int i = 0; i != (data.length - 1); i++) {
                if (data[i] != data[i + 1]) {
                    result = false;
                    break;
                }
            }
            return result;
    }
}
