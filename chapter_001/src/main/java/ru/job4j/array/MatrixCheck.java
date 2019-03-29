package ru.job4j.array;

/**
 * Проверяет квадратный булевый массив на содержание в прямой и обратной диагонялях одинаковых булевых значений
 * @author VladimirGrankin
 * @version 0.1
 * @since 0.1
  */
public class MatrixCheck {
    /**
     * Метод проверяет в цикле диагонали (сначала прямую,потом обратную) на содержание одинаковых булевых значений
     * @param data - квадратный булевый массив, в котором проверяются диагонали
     * @return true - если обе диагонали содержат одинаковые значения (внутри одной диагонали), иначе - false
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        // 1. нам нужно пройтись циклом по диагонали от data[0][0] до data[iMax][jMax] слева_сверху до право_внизу
        // 2. потом проверить обратную диагональ право_сверху до слева_внизу
        // т.к. массив квадратный, то у нас только один индекс ячейки - i (верней i=j)
        for (int i = 0; i != data.length - 1; i++) {
            if (data[i][i] != data[i + 1][i + 1]) {
                result = false;
                break;
            }
        }
        for (int i = data.length - 1; i != 0; i--) {
            if (data[i][i] != data[i - 1][i - 1])  {
                result = false;
                break;
            }
        }
        return result;
    }
}
