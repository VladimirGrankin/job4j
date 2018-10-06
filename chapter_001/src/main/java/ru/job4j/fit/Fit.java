package ru.job4j.fit;

/**
 * Программа для вычисления идеального веса
 * у мужчин и женщин.
 *
 * @author Vladimir Grankin
 * @version %I, %G
* */
public class Fit {

    /*
    * Идеальный вес для мужчины
    * @param height - рост
    * @return - идеальный вес
    * */
    public double manWeight(double heigth){
        return (heigth - 100) * 1.15;
    }

    /*
    * Идеальный вес для женщин
    * @param height - рост
    * @return - идеальный вес
    * */
    public double womanWeight(double height) {
        return (height - 110) * 1.15;
    }
}
