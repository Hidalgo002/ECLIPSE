package a;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTester {

	@Test
	public void testSumar() {
		Calculadora calculadora = new Calculadora();
		assertEquals(5,calculadora.sumar(3,2));
	}

}
