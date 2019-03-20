package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {
    /**
     * Тестирует матрицу размером 2х2
     */
    @Test
    public void when2on2() {
        Matrix matrix = new Matrix();
        int[][] table = matrix.multiple(2);
        int[][] expect = {
                {1, 2},
                {2, 4}
        };
        assertThat(table, is(expect));
    }
    /**
     * Тестирует матрицу размером 11х11
     */
    @Test
    public void when11on11() {
        Matrix matrix = new Matrix();
        int[][] table = matrix.multiple(11);
        int[][] expect = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11},
                {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22},
                {3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33},
                {4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44},
                {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55},
                {6, 12, 18, 24, 30, 36, 42, 48, 54, 60, 66},
                {7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77},
                {8, 16, 24, 32, 40, 48, 56, 64, 72, 80, 88},
                {9, 18, 27, 36, 45, 54, 63, 72, 81, 90, 99},
                {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110},
                {11, 22, 33, 44, 55, 66, 77, 88, 99, 110, 121}
        };
        assertThat(table, is(expect));
    }
}