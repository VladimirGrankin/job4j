package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Petr Arsentev (parsentev@ya.ru)
 * @version %Id%
 * @since 0.1
 */
public class MaxTest {
    @Test
    public void whenFirstLessSecond() {
        Max maximum = new Max();
        int result = maximum.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenFirstMoreSecond() {
        Max maximum = new Max();
        int result = maximum.max(2, 1);
        assertThat(result, is(2));
    }
    @Test
    public void whenFirstEqualSecond() {
        Max maximum = new Max();
        int result = maximum.max(1, 1);
        assertThat(result, is(1));
    }
    @Test
    public void whenFirstLessThird() {
        Max maximum = new Max();
        int result = maximum.max(1, 2, 3);
        assertThat(result, is(3));
    }
    @Test
    public void whenFirstMoreThird() {
        Max maximum = new Max();
        int result = maximum.max(3, 2, 2);
        assertThat(result, is(3));
    }
    @Test
    public void whenTwoMoreThird() {
        Max maximum = new Max();
        int result = maximum.max(1, 3, 2);
        assertThat(result, is(3));
    }
  }
