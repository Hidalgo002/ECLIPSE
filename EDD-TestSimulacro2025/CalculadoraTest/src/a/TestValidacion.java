package a;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestValidacion {

	@Test
	public void testvalidarCorreo() {
		Validacion v = new Validacion();
		assertEquals(true,v.validarCorreo("beatriz@salesianos.com"));
	}

}
