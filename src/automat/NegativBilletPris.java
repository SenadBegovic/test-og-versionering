package automat;

public class NegativBilletPris {
	public static void main(String[] arg) {
		java.util.Scanner tastatur = new java.util.Scanner(System.in);
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;

		automat.mont�rLogin("1234");
		automat.setBilletpris(-10);
		retur = automat.getBilletpris();
		if (retur < 0) {
			System.out.println("FEJL, billetprisen skal v�re positiv, men er " + retur);
			antalFejl = antalFejl + 1;
		}
		
		System.out.println("Der blev fundet " + antalFejl + " fejl i automaten");
		if (antalFejl == 0) {
			System.out.println("Automaten er fejlfri, HURRA!!!");
		} else {
			System.out.println("Automaten har fejl, �V!!!");
		}

	}
}