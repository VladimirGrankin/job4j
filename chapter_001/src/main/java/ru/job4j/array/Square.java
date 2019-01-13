package ru.job4j.array;

/**
 * Заполняет массив степенями чисел
 * @author Vladimir Grankin
 * @since 0.1
 * @version 0.1
 */
public class Square {
    /**
     * Метод вычисляет квадрат числа и записывает в массив
     * @param bound размерность массива
     * @return rst
     */
    public int[] calculate(int  bound) {
        int[] rst = new int[bound];
        for (int i = 1; i <= bound; i++) {
            rst[i - 1] = i * i;
        }
        return rst;
    }
}
