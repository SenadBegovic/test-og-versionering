package automat;
/**
 * Model af en simpel billetautomat til enkeltbilletter med én fast pris.
 */
public class Billetautomat {
	private int billetpris;    // Prisen for én billet.
	private int balance; // Hvor mange penge kunden p.t. har puttet i automaten
	private int antalBilletterSolgt; // Antal billetter automaten i alt har solgt
	private int indkomst;
	private boolean mont�rtilstand;

	/**
	 * Opret en billetautomat der s�lger billetter til 10 kr.
	 */
	public Billetautomat() {
		billetpris = 10;
		balance = 0;
		antalBilletterSolgt = 0;
	}

	/**
	 * Giver prisen for en billet. 
	 */
	public int getBilletpris() {
		int resultat = billetpris;
		return resultat;
	}

	/**
	 * Modtag nogle penge (i kroner) fra en kunde.
	 */
	public void inds�tPenge(int bel�b) {
		balance = balance + bel�b;
	}

	/**
	 * Giver balancen (bel�bet maskinen har modtaget til den n�ste billet).
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * Udskriv en billet.
	 * Opdater total og nedskriv balancen med billetprisen
	 */
	public void udskrivBillet() {
		if (balance<10) {
			System.out.println("Du mangler at indbetale nogle penge");
		}
		System.out.println("##########B##T#########");
		System.out.println("# BlueJ Trafikselskab #");
		System.out.println("#                     #");
		System.out.println("#        Billet       #");
		System.out.println("#        " + billetpris + " kr.       #");
		System.out.println("#                     #");
		System.out.println("##########B##T#########");
		System.out.println("# Du har " + (balance-billetpris) + " kr til gode       #");
		System.out.println("##########B##T#########");
		System.out.println();
		indkomst += billetpris;
		antalBilletterSolgt = antalBilletterSolgt + 1;
		balance = balance - billetpris; // Billetter koster 10 kroner
	}


	public int returpenge() {
		int returbel�b = balance;
		balance = 0;
		System.out.println("Du f�r "+returbel�b+" kr retur");
		return returbel�b;
	}

	
	void mont�rLogin(String adgangskode) {
		if ("1234".equals(adgangskode)) {
			mont�rtilstand = true;
			System.out.println("Mont�rtilstand aktiveret");
			System.out.println("Du kan nu angive billetpris");
		} else {
			mont�rtilstand = false;
			System.out.println("Mont�rtilstand deaktiveret");
		}
	}


	public int getTotal() {
		if (mont�rtilstand) {
			return indkomst;
		} else {
			System.out.println("Afvist - log ind f�rst");
			return 0;
		}
	}

	public int getAntalBilletterSolgt() {
		if (mont�rtilstand) {
			return antalBilletterSolgt;
		} else {
			System.out.println("Afvist - log ind f�rst");
			return 0;
		}
	}

	public void setBilletpris(int billetpris) {
		if(mont�rtilstand){
			this.billetpris = billetpris;
		} else {
			System.out.println("Afvist - log ind f�rst");
		}
	}

	public void nulstil() {
		if (mont�rtilstand) {
			antalBilletterSolgt = 0;
		} else {
			System.out.println("Afvist - log ind f�rst");
		}
	}

	public void setAntalBilletterSolgt(int antalBilletterSolgt) {
		if (mont�rtilstand) {
			this.antalBilletterSolgt = antalBilletterSolgt;
		} else {
			System.out.println("Afvist - log ind f�rst");
		}
	}

	public boolean erMont�r() {
		return mont�rtilstand;
	}
}