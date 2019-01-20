package ru.job4j.array;

/**
 * Класс Turn меняет элементы в массиве задом-наперед, т.е. первый - последний
 * второй - предпоследний и т.д.
 *
 * @author Vladimir Grankin
 * @since 0.1
 * @version 0.1
 */
public class Turn {
    /**
     * Метод переставляет элементы в массиве: первый - последний, второй - предпоследний
     * и т.д циклом до середины длины массива (array.length / 2) проверяя строгим неравенством
     * @param array - начальный массив
     * @return - "зеркальный" по отношению к array массив
     */
    public int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int tmp = array[index]; // запоминаем текущий элемент массива слева
            array[index] = array[array.length - index - 1]; // левому элементу массива присваиваем "зеркальный" правый
            array[array.length - index - 1] = tmp; // правому элементу массива присваиваем сохр. в tmp зеркальный ему левый
        }
        return array;
    }
}
