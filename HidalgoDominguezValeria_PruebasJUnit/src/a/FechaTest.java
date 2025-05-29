package a;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FechaTest {
	
	//TRUE
	@Test
	public void esBisiesto() {
		Fecha fecha = new Fecha();
		assertEquals(true, fecha.esBisiesto(2025));
	}
	
	@Test
	public void esBisiesto2() {
		Fecha fecha = new Fecha();
		assertEquals(true, fecha.esBisiesto(2020));
	}
	
	
	//FALSE
	@Test
	public void esBisiesto3() {
		Fecha fecha = new Fecha();
		assertEquals(false, fecha.esBisiesto(2025));
	}
	
	@Test
	public void esBisiesto4() {
		Fecha fecha = new Fecha();
		assertEquals(false, fecha.esBisiesto(2020));
	}
}


