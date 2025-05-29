package a;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {

	@Test
	public void testSumar() {
		Calculadora calc= new Calculadora();
		assertEquals(5, calc.Sumar(3,2));
	}
	
	@Test
	public void testRestar() {
		Calculadora calc= new Calculadora();
		assertEquals(5, calc.Sumar(3,2));
	}
}
