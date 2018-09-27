package ru.job4j.calculate;
/*
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
*/
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test
*
* @author Vladimir Grankin
* @version 0.1
* @since 0.1
*/

public class CalculateTest{
/**
* Test echo.
*/
@Test
public void whenTakeNameThenTreeEchoPlusName() {
	String input = "Vladimir Grankin";
	String expect = "Echo, echo, echo : Vladimir Grankin";
	Calculate calc = new Calculate();
	String result = calc.echo(input);
	assertThat(result, is(expect));
	}
}