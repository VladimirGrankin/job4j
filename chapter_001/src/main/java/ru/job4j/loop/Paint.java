package ru.job4j.loop;

/**
 * Рисует пирамиду в псевдографике
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    /**
     * Рисует правую часть пирамиды
     * @param height - высота пирамиды
     * @return - строка в псевдографике (правая часть пирамиды)
     */
    public String rightSideTriangle(int height) {
        // Буфер для результата.
        StringBuilder screen = new StringBuilder();
        // ширина будет равна высоте.
        int weight = height;
        // внешний цикл двигается по строкам.
        for (int row = 0; row != height; row++) {
            // внутренний цикл определяет положение ячейки в строке.
            for (int column = 0; column != weight; column++) {
                // если строка равна ячейки, то рисуем галку.
                // в данном случае строка определяем, сколько галок будет на строке
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод строки.
            screen.append(System.lineSeparator());
        }
        // Получаем результат.
        return screen.toString();
    }

    /**
     * Рисует левую часть пирамиды
     * @param height - высота пирамиды
     * @return - пирамиду в псевдографике (левую часть)
     */
    public String leftSideTriangle(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= weight - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append((System.lineSeparator()));
        }
        return screen.toString();
    }

    /**
     * Рисует пирамиду в псевдографике
     * @param height - высота пирамиды
     * @return - пирамиду в псевдографике
     */
    public String pyramid(int height) {
        StringBuilder screen = new StringBuilder();
        int weight = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= height - column - 1 && row + height - 1 >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append((System.lineSeparator()));
        }
        return screen.toString();
    }
}