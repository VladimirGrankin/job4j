package ru.job4j.array;

/**
 * Заполняет матрицу значениями таблицы умножения
 * @author Vladimir Grankin
 * @since 0.1
 * @version 0.1
 */
public class Matrix {
    /**
     * Метод multiple заполняет матрицу значениями таблицы умножения
     * @param size - размерность матрицы
     * @return - заполненную таблицу
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int columnIndex = 1; columnIndex <= size; columnIndex++) {
            for (int stringIndex = 1; stringIndex <= size; stringIndex++) {
                table[stringIndex - 1][columnIndex - 1] = stringIndex * columnIndex;
            }
        }
        return table;
    }
}
