package automat;

public class UansetBilletprisHarManForLidtHvisUnder10kr
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;



		System.out.println("*** Tjek at den udskriver sætningen \"Du mangler at indbetale nogle penge\" selvom man har nok");
		automat.setBilletpris(5);
		automat.indsætPenge(5);
		automat.udskrivBillet();
		
		if (automat.getBilletpris() > automat.getBalance()){
			System.out.println("FEJL, den udskrev sætningen, selvom balancen og prisen var i orden ");
			antalFejl =antalFejl+1;
		}

		System.out.println();
		System.out.println();
		System.out.println("Der blev fundet "+antalFejl+" fejl i automaten");
		if (antalFejl == 0) {
			System.out.println("Automaten er fejlfri, HURRA!!!");
		} else {
			System.out.println("Automaten har fejl, Ã˜V!!!");                      
		}
	}
}