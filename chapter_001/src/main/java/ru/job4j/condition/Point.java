package ru.job4j.condition;

/**
 * Расчет расстояния между двумя точками
 *
 * @author Vladimir Grankin
 * @version 0.4
 * @since 0.1
 */
public class Point {
    /*Точка x*/
    private int x;
    /*Точка y*/
    private int y;

    /* Создаем конструктор Point */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Вычисляем расстояние между двумя точками по формуле Декарта
     *
     * @param that - конечная точка
     * @return - расстояние между двумя заданными точками, вычисленное по формуле Декарта
     */
    public double distanceTo(Point that) {
        //Point a = this;
        // Точка b - это входящая точка. К ней можно обратиться через переменную that.
        // или для удобства мы создали новую переменную b и к ней присвоили переменную that
        //Point b = that;
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
    }
}
