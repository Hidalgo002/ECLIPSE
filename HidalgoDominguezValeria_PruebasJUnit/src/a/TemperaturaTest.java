package a;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TemperaturaTest {
	
	//TRUE
	@Test
	public void testConvertirCelsiusAFahrenheit() {
        Temperatura temp = new Temperatura();
        assertEquals(32.0, temp.convertirCelsiusAFahrenheit(0), 0.0);
	}
      
	//FALSE
    @Test
    public void testConvertirCelsiusAFahrenheit2() {
        Temperatura temp = new Temperatura();
        assertEquals(800.9, temp.convertirCelsiusAFahrenheit(0), 0.0);
    }
}
