package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    /**
     * Первый тест проверяет что факториал  0 = 1
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial factorial = new Factorial();
        int result = factorial.calcFactorial(0);
        assertThat(result, is(1));
    }
    /**
     * Второй тест проверяет, что факториал числа 5 = 120
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial factorial = new Factorial();
        int result = factorial.calcFactorial(5);
        assertThat(result, is(120));
    }
}