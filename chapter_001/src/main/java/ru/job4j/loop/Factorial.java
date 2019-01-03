package ru.job4j.loop;

/**
 * Class Factorial
 * @author Vladimir Grankin
 * @since 0.1
 * @version 0.1
 */
public class Factorial {
    /**
     * Метод calcFactorial вычисляет факториал заданного числа
     * @param number - число, факториал которого будет вычислен
     * @return - факториал числа
     */
    public int calcFactorial(int number) {
        int sum = 1;
        for (int  range = 1; range <= number; range++) {
            sum = sum * range;
        }
        return sum;
    }
}
