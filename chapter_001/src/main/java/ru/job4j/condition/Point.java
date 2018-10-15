package ru.job4j.condition;

/**
* Расчет расстояния между двумя точками
*
* @author Vladimir Grankin
* @version %I, %G
* */
public class Point { // создаем класс Point
    private int x;  // в этом классе создаем поля (переменные) x
    private int y;  // и y

    public Point(int x, int y) {    // создаем конструктор
        this.x = x; // для записи в поля используем операторы this.x
        this.y = y; // и this.y

        public double distanceTo(Point that) {
            return -1;
        }

        public static void main(String[] args) {
            Point a = new Point(0, 1);
            Point b = new Point(2, 5);
        }
    }
}
