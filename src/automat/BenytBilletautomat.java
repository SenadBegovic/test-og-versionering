package automat;



public class BenytBilletautomat
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();
		java.util.Scanner tastatur = new java.util.Scanner(System.in);  // forbered

		System.out.println("BenytBilletautomat version 3");
		System.out.println();
		
		while (true) {
			System.out.println("-----------------------------------------------");
			System.out.println("En billet koster " + automat.getBilletpris() + " kroner");
			System.out.println("Balancen er p� " + automat.getBalance() + " kroner");
			System.out.println();
			System.out.println("Tast 1 for at indbetale penge");
			System.out.println("Tast 2 for at udskrive din billet");
			System.out.println("Tast 3 for at f� returpengene");
			System.out.println();
			System.out.println("Tast 10 for at logge ind som mont�r");
			if (automat.erMont�r()) {
				System.out.println("Tast 11 for at se status (mont�r)");
				System.out.println("Tast 12 for at nulstille (mont�r)");
				System.out.println("Tast 13 for at s�tte billetpris (mont�r)");
				System.out.println("Tast 14 for at logge ud af mont�rtilstand");
			}
			int valg = tastatur.nextInt();
			tastatur.nextLine();
		
			if (valg==1) {
				System.out.print("Skriv bel�b: ");
				int bel�b = tastatur.nextInt();
				automat.inds�tPenge(bel�b);
			}
			else if (valg==2) {
				automat.udskrivBillet();
			}
			else if (valg==3) {
				int bel�b = automat.returpenge();
				System.out.println("Du fik "+bel�b+" retur retur");
			}
			else if (valg==10) {
				System.out.print("Skriv kode: ");
				String kode = tastatur.next();
				automat.mont�rLogin(kode);
			}
			else if (valg==11) {
				System.out.println("Antal billetter solgt: " + automat.getAntalBilletterSolgt());
				System.out.println("Total indkomst: " + automat.getTotal()+" kr");
			}
			else if (valg==12) {
				automat.nulstil();
			}
			else if (valg==13) {
				System.out.print("Skriv bel�b: ");
				int bel�b = tastatur.nextInt();
				automat.setBilletpris(bel�b);
			}
			else if (valg==14) {
				automat.mont�rLogin("");;
			}
			else {
				System.out.println("Ugyldigt valg, pr�v igen");
			}
		}
	}
}