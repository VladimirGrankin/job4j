package ru.job4j.condition;

/**
 * @author Granknin Vladimir
 * @version %Id%
 * @since 0.1
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /**
     * Метод вычисления полупериметра по длинам сторон
     *
     * Формула: (ab + ac + bc) / 2
     *
     * @param ab - растояние между точками a и b
     * @param ac - растояние между точками a и с
     * @param bc - растояние между точками b и с
     * @return полупериметр
    */
    public double halfPerimetr(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }
    /**
     * Метод должен вычислить площадь треугольника
     * используя формулу Герона : s=sqrt(p(p-a)*(p-b)*(p-c))
     * начальное значение переменной rsl = -1, т.к. треугольник может и не существовать
     *
     * @return  - возвращает площадь, если тругольник существует или -1, если треугольника нет
     */
    public double area() {
        double rsl = -1;
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.b);
        double bc = this.b.distanceTo(this.c);
        double p = this.halfPerimetr(ab, ac,bc);
        if (this.exist(ab,ac, bc)) {
            rsl = Math.sqrt(p*(p - ab)*(p - ac)*(p - bc));
        }
        return rsl;
    }
    /**
     * Метод проверяет, можно ли построить треугольник по условию:
     * Если большая из сторон меньше суммы двух других сторон - треугольник возможен.
     *
     * @param ab - длина от точки a до точки b
     * @param ac - длина от точки a до точки c
     * @param bc - длина от точки b до точки c
     */
    private boolean exist(double ab, double ac, double bc) {
        return (ab < (bc + ac) && bc < (ab + ac) && ac < (ab + bc));
        }
}
