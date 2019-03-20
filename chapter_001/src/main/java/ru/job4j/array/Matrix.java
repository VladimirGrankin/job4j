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
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                table[j - 1][i - 1] = j * i;
            }
        }
        return table;
    }
}
