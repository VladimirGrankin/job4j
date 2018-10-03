package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test - Calculator test
 *
 * @author Vladimir Grankin
 * @version 0.1
 * @since 0.1
 */
public class CalculatorTest {
	@Test
	public void whenAddOnePlusThenTwo() {
		Calculator calc = new Calculator();
		calc.add(1D, 1D);
		double result = calc.getResult();
		double expected = 2D;
		assertThat(result, is(expected));
	}
	
	@Test
	public void whenSubstractTwoOnOneThenOne() {
		Calculator calc = new Calculator();
		calc.substract(2d, 1d);
		double result = calc.getResult();
		double expected = 1D;
		assertThat(result, is(expected));
	}
	
	@Test
	public void whenDivTwoOnTwoThenOne() {
		Calculator calc = new Calculator();
		calc.div(2d, 2d);
		double result = calc.getResult();
		double expected = 1D;
		assertThat(result, is(result));
	}
	
	@Test
	public void whenMultipleTwoOnOneThenTwo() {
		Calculator calc = new Calculator();
		calc.div(2D, 1D);
		double result = calc.getResult();
		double expected = 2D;
		assertThat(result, is(result));
	}
}