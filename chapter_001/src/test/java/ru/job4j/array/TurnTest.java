package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    /**
     * Тестирует переворот массива с четным числом элементов
     */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsTurnedArray() {
       Turn turned = new Turn();
       int[] input = new int[] {1, 2, 3, 4};
       int[] result = turned.back(input);
       int[] expect = new int[] {4, 3, 2, 1};
       assertThat(result, is(expect));
    }
    /**
     * Тестирует переворот массива с нечетным числом элементов
     */
    @Test
    public void whenTurnArrayOddAmountOfElementsTurnedArray() {
        Turn invert = new Turn();
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] result = invert.back(input);
        int[] expect = new int[] {5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }
    /**
     * Тестирует переворот массива с одинаковыми элементами
     */
    @Test
    public void whenTurnArrayWithTheSameValuesOfElements() {
        Turn invert = new Turn();
        int[] input = new int[] {2, 2, 2, 2, 2};
        int[] result = invert.back(input);
        int[] expect = new int[] {2, 2, 2, 2, 2};
        assertThat(result, is(expect));
    }
}
