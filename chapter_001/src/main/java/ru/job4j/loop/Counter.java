package ru.job4j.loop;

/**
 * Class Counter - возвращает сумму четных чисел в заданном диапазоне
 * @author Vladimir Grankin
 * @since 0.1
 * @version 0.1
 */

public class Counter {
    /**
     * Метод add добавляет четные числа в заданном диапазоне
     * @param start - первое число в диапазоне
     * @param finish - последнее число в диапазоне
     * @return - возращает сумму четных чисел в заданном диапазоне
     */
    public int add(int start, int finish) {
       int sum = 0;
       for (int range = start; range <= finish; range++) {
           if (range % 2 == 0) {
               sum = sum + range;
           }
       }
        return sum;
    }
}
