package ru.job4j.array;

/**
 * Проверяет квадратный булевый массив на содержание в прямой и обратной диагонялях одинаковых булевых значений
 * @author VladimirGrankin
 * @version 0.2
 * @since 0.1
  */
public class MatrixCheck {
    /**
     * Метод проверяет в цикле диагонали (сначала прямую, потом обратную) на содержание одинаковых булевых значений
     *
     * @param data - квадратный булевый массив, в котором проверяются диагонали
     * @return true - если обе диагонали содержат одинаковые значения (внутри одной диагонали), иначе - false
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[0][0] != data[i + 1][i + 1]) {
                result = false;
                break;
                }
            if (data[0][data.length - 1] != data[i + 1][data.length - (i + 2)]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
