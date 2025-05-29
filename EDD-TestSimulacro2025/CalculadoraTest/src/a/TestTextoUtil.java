package a;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTextoUtil {

	@Test
	public void testTextoUtil() {
		TextoUtil texto = new TextoUtil();
		assertEquals("cba",texto.invertirCadena("abc"));
		assertEquals("abc",texto.invertirCadena("abc"));
	}

}
