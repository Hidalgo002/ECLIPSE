package P1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTestes {

	@Test
	public void testSumar() {
		Calculadora calculadora = new Calculadora();
		assertEquals(4, calculadora.sumar(1, 2));
	}
}
