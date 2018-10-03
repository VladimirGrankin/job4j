package ru.job4j.calculator;

/**
 * Calculator - class for basic math operations
 *
 * @author Vladimir Grankin
 * @version 0.1
 * @since 0.1
 */
public class Calculator {
	private double result;

    /**
     * adding two variable
     * @param first - first variable
     * @param second - second variable
     */
	public void add(double first, double second) {
		this.result = first + second;
	}

    /**
     * substract two variable
     * @param first - first variable
     * @param second - second variable
     */
	public void substract(double first, double second) {
		this.result = first - second;
	}

    /**
     * divide two variable
     * @param first - first variable
     * @param second - second variable
     */
	public void div(double first, double second) {
		this.result = first / second;
	}

    /**
     * multiple two variable
     * @param first - first variable
     * @param second - second variable
     */
	public void multiple(double first, double second) {
		this.result = first * second;
	}

    /**
     * Method getResult - get result
     * @return result
     */
    public double getResult() {
        return this.result;
    }
}