package pl.bank.domain;

import java.math.BigDecimal;

public class Kwota {

	private BigDecimal wartosc;

	public Kwota(BigDecimal wartosc) {
		this.wartosc = wartosc;
	}

	public Kwota(Integer wartosc) {
		this.wartosc = new BigDecimal(wartosc);
	}
	
//	public BigDecimal podajWartosc() {
//		return wartosc;
//	}

//	public void dodaj(Kwota wplata) {
//		//wartosc = wartosc.add(wplata.podajWartosc());
//		wartosc = this.wartosc.add(wplata.podajWartosc());
//	}
	
	

	public boolean jestDodatnia() {
			return wartosc.compareTo(BigDecimal.ZERO) > 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kwota other = (Kwota) obj;
		if (wartosc == null) {
			if (other.wartosc != null)
				return false;
		} else if (!wartosc.equals(other.wartosc))
			return false;
		return true;
	}


	public Kwota add(Kwota kwota) {		
		return new Kwota(wartosc.add(kwota.wartosc));
	}

	public Kwota minus(Kwota kwota) {
		return new Kwota(wartosc.subtract(kwota.wartosc));
	}
	

}
