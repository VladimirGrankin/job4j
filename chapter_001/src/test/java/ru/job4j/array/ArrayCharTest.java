package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {
    /**
     * Проверка условий, если слово начинается с заданнного префикса
     */
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("He");
        assertThat(result, is(true));
    }
    /**
     * Проверка условий, если слово не начинается с заданного префикса
     */
    @Test
    public void whenNotStartPrefixThenFalse() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith(("Hi"));
        assertThat(result, is(false));
    }
}