package ru.job4j.array;

/**
 * Клвсс BubbleSort сортирует массив методом пузырьковой сортировки
 * @author Vladimir Grankin
 * @since 0.1
 * @version 0.2
 */
public class BubbleSort {
    /**
     * Метод sort перебирает и сравнивает элем. массива, и, если левый элемент больше правого, меняет их местами
     * @param array - сортируемый массив
     * @return - возвращает отсортированный массив
     */
    public int[] sort(int[] array) {
        for (int j = array.length; j > 0; j--) {
            for (int i = 0; i != array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
        return array;
    }
}