package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    /**
     * Тестирует поиск в одномерном массиве из трех эл-ов первого элемента (с индексом 0)
     * первые два теста проходят успешно, два последних - нет
     */
    @Test
    public void whenArrayHasLengh5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    /**
     * Тестирует поиск в массиве из пяти элементов элемента с максимальным индексом (4)
     */
    @Test
    public void whenArrayHasLengh5Then4() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {2, 6, 4, 5, 7};
        int value = 7;
        int result = find.indexOf(input, value);
        int expect = 4;
        assertThat(result, is(expect));
    }
    /**
     * Тестирует поиск в массиве из одинаковых элементов,
     * тест не проходит, т.к. в классе FindLoop метод завершает работу
     * при нахождении первого элемента массива, удовлетворяющего условию
     */
    @Test
    public void whenArrayHasLengh3Then1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {2, 2, 2};
        int value = 2;
        int result = find.indexOf(input, value);
        int expect = 1;
        assertThat(result, is(expect));
    }
    /**
     * Тестирует поиск в массиве элемента и не находит его
     */
    @Test
    public void whenArrayHasLengh3ThenNothing() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {1, 2, 3};
        int value = 4;
        int result = find.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));


    }
}
