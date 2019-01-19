package ru.job4j.array;

/**
 * Поиск эелемента и определение его индекса в массиве классическим перебором
 * @author Vladimir Grankin
 * @since 0.1
 * @version 0.1
 */
public class FindLoop {
    /**
     * Метод ищет элемент в массиве
     * @param data - размерность массива
     * @param el - элемент в массиве, индекс которого необходимо найти
     * @return - порядковый номер el
     */
    public int indexOf(int[] data, int el) {
        int rst = -1; // Если элемента нет в массиве, возращаем -1
        for (int index = 0; index != el; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
