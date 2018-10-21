package ru.job4j.condition;

/**
 *  @author Vladimir Grankin
 *  @version %Id%
 *  @since 0.1
 */
public class Max {
    /**
     * Возвращает максимальное из двух чисел
     * @param first - первое число
     * @param second  - второе число для сравнения с первым.
     * @return - максимальное из двух чисел.
     */
    public int max(int first, int second) {
        return (first > second) ? first : second;
    }
}
