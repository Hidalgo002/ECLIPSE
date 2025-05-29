package a;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MatematicasTest {
	
//==========NÚMEROS PRIMOS==========
	
	//TRUE
	@Test
	public void esPrimo() {
		Matematicas matematicas = new Matematicas();
		 assertEquals(true, matematicas.esPrimo(5));
	}
	//FALSE
	@Test
	public void esPrimo2() {
		Matematicas matematicas = new Matematicas();
		assertEquals(true, matematicas.esPrimo(9));
	}

//==========ES DIVISIBLE==========
		
	//TRUE
	@Test
	public void esDivisible() {
		Matematicas matematicas = new Matematicas();
		assertEquals(true, matematicas.esDivisible(9,3));
	}
	//FALSE
	@Test
	public void esDivisible2() {
		Matematicas matematicas = new Matematicas();
		assertEquals(true, matematicas.esDivisible(5,8));
	}

	
//==========ES CAPICUA==========
	
	//TRUE
	@Test
	public void esCapicua() {
		Matematicas matematicas = new Matematicas();
		assertEquals(true, matematicas.esCapicua(910525019));
	}
	//FALSE
	@Test
	public void esCapicua2() {
		Matematicas matematicas = new Matematicas();
		assertEquals(true, matematicas.esCapicua(911805798));
	}
}
