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
     * @param higth - длина доски
     * @return - шахматную доску в псевдографике (строка символов Х и пробел)
     */
    public String paint(int width, int higth) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int wigthChess = 0; wigthChess < width; wigthChess++){
            for (int higthChess = 0; higthChess < higth; higthChess++) {
                if ((wigthChess + higthChess) % 2 == 0) {
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
