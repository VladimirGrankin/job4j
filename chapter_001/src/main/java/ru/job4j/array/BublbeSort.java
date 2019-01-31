package ru.job4j.array;

public class BublbeSort {
    public int[] sort(int[] array) {
        for (int i = 0; i != array.length; i++) {
            if (array[i] > array[i+1] {
                    // меняем местами правый и левый элемент массива
                int tmp = array[i];
                array[i] = array[i+1];
                array[i+1] = tmp;

            }
        }
    }

}