package automat;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest {

	@Test
	public void testgetTotal() {
		Billetautomat automat = new Billetautomat();
		automat.montørLogin("1234");
		automat.indsætPenge(90);
		automat.udskrivBillet();
		automat.setBilletpris(20);
		automat.udskrivBillet();
		int retur = automat.getTotal();
		assertEquals(30, retur);
	}
	
	@Test
	public void testSetBilletpris(){
		Billetautomat automat = new Billetautomat();
		automat.montørLogin("1234");
		automat.setBilletpris(20);
		int retur = automat.getBilletpris();
		assertEquals(20, retur);
	}

	@Test
	public void testSetNegativpris(){
		Billetautomat automat = new Billetautomat();
		automat.montørLogin("1234");
		automat.setBilletpris(-10);
		int retur = automat.getBilletpris();
		assertEquals(10, retur);
	}
	
	@Test
	public void testSetNegativBalance(){
		Billetautomat automat = new Billetautomat();
		automat.indsætPenge(-10);
		automat.udskrivBillet();
		int retur = automat.getBalance();
		assertEquals(0, retur);
	}
}
