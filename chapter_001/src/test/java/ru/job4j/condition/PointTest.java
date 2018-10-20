package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test for Point
 *
 * @author Vladimir Grankin
 * @version 0.4
 * @since 0.1
 */
public class PointTest {
    @Test
    public void distanceBetweenTwoPoint() {
        Point pointOne = new Point(0, 1);
        Point pointTwo = new Point(0, 5);
        double result = pointOne.distanceTo(pointTwo);
        double expect = 4.0;
        assertThat(result, is(expect));
    }
}
