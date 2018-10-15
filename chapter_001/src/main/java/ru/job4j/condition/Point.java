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
    }
        public double distanceTo(Point that) {
            // Точка а - это текущая, начальная точка. К ней мы обращаемся через оператор this.
            Point a = this;
            // Точка b - это входящая точка. К ней можно обратиться через переменную that.
            // или для удобства мы создали новую переменную b и к ней присвоили переменную that
            Point b = that;

            int x1 = a.x;
            int y1 = a.y;
            int x2 = b.x;
            int y2 = b.y;
            return Math.sqrt(
                    Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
            );
        }

        public static void main(String[] args) {    // введем метод main
            // создаем два объекта типа Point
            // и заполняем их значениями x1=0; y1=1
            //x2=2; y2=5
            Point a = new Point(0, 1);
            Point b = new Point(2, 5);

            System.out.println("x1 = "+ a.x);
            System.out.println("y1 = "+ a.y);
            System.out.println("y1 = "+ b.x);
            System.out.println("y2 = "+ b.y);

            double result = a.distanceTo(b);
            System.out.println("Расстояние между точками А и Б: " + result);

        }
    }
