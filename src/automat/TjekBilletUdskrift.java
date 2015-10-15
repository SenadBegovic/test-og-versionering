package automat;

public class TjekBilletUdskrift {
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;


		System.out.println("Tjek af salg af en billet, hvis der er indsat mindre penge end billetpris");
		automat.indsætPenge(9);
		automat.udskrivBillet();
		retur = automat.returpenge();
		if (retur <= -1) {
			System.out.println("FEJL, den burde ikke udskrive en billet, hvis balancen er mindre end 10(billetpris)");
			antalFejl = antalFejl + 1;
		}


		System.out.println();
		System.out.println();
		System.out.println("Der blev fundet "+antalFejl+" fejl i automaten");
		if (antalFejl == 0) {
			System.out.println("Automaten er fejlfri, HURRA!!!");
		} else {
			System.out.println("Automaten har fejl, ØV!!!");                      
		}
	}
}