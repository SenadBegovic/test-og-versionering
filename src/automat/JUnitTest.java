package automat;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest {

	@Test
	public void testgetTotal() {
		Billetautomat automat = new Billetautomat();
		automat.mont�rLogin("1234");
		automat.inds�tPenge(90);
		automat.udskrivBillet();
		automat.setBilletpris(20);
		automat.udskrivBillet();
		int retur = automat.getTotal();
		assertEquals(30, retur);
	}

}