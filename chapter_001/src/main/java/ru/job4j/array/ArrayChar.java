package ru.job4j.array;

/**
 * @author Vladimir Grankin
 * @since 0.1
 * @version 0.1
 */
public class ArrayChar {
    private char[] data;

    /**
     * Массив, начальные элементы которого будем сравнивать
     * @param line - массив который сравниваем преобразуем в строку
     */
    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Метод, в котором сравниваются элементы из массива data с префиском (элементами массива value)
     * в цикле перебираем элементы до размера наименьшего массива, т.е. с которым сравниваем - value
     * @param prefix - массив, который содержит префикс для сравнения
     * @return true - если все элементы из массива data совпадают с массивом-префиксом value, иначе - false
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int i = 0; i != value.length; i++) {
            if (data[i] != value[i]) {
               result = false;
            }
        }
        return result;
    }
}
