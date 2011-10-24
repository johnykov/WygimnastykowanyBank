package pl.bank.domain;


public class Konto {

	public Konto(NumerKonta numerKonta) {
		this.numerKonta = numerKonta;
		this.saldo = new Kwota(0);
	}
	private NumerKonta numerKonta;
	private Kwota saldo;
	
	public void wplac(Kwota wplata) {
		if (wplata == null || !(wplata.jestDodatnia()) ){
			throw new IllegalArgumentException("Bledna wartosc wplaty");
		}
		saldo = saldo.add(wplata);
	}

	public Kwota podajSaldo() {
		return saldo;
	}

	public void wyplac(Kwota wyplata) {
		saldo = saldo.minus(wyplata);		
	}	
	
}
