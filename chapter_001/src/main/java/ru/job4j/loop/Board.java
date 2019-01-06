package ru.job4j.loop;

/**
 * Рисует шахматную доску в псевдографике
 *
 * @author Vladimir Grankin
 * @since 0.1
 * @version 0.1
 */
public class Board {
    /**
     * Метод рисует шахматную доску из символов Х и пробелов
     * @param width - ширина доски
     * @param height - длина доски
     * @return - шахматную доску в псевдографике (строка символов Х и пробел)
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int heightChess = 0; heightChess < height; heightChess++) {
            for (int widthChess = 0; widthChess < width; widthChess++) {
                if ((widthChess + heightChess) % 2 == 0) {
                    screen.append('X');
                } else {
                    screen.append(' ');
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}