package a;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNumeros {

	@Test
	public void testNumeros() {
		Numeros numero = new Numeros();
		assertEquals(true,numero.esPar(2));
		assertEquals(false,numero.esPar(1));
		assertEquals(true,numero.esPar(1));
	}

}
