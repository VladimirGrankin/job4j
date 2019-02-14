package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    /**
     * Метод тестирует пузырьковую сортировку
     */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubbles = new BubbleSort();
        int[] input = new int[] {10, 2, 9, 4, 7, 5, 6, 8, 3, 1};
        int[] result = bubbles.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(result, is(expect));
    }
}
