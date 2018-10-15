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

        public double distanceTo(Point that) { // это каркас метода
            // расчитывающего расстояние между двумя точками
            return -1;
        }

        public static void main(String[] args) {    // введем метод main
            Point a = new Point(0, 1);  // создаем два объекта типа Point
            Point b = new Point(2, 5);  // и заполняем их значениями x1=0; y1=1
                                            //x2=2; y2=5
        }
    }
}
