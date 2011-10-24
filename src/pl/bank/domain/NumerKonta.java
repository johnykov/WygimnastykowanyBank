package pl.bank.domain;

import java.math.BigDecimal;

public class NumerKonta {
	private BigDecimal numer;

	public NumerKonta(BigDecimal numer) {
		if (numer == null) {
			throw new IllegalArgumentException("Numer konta musi byc okre�lony");
		}
		this.numer = numer;

	}

	public NumerKonta(int i) {
		this.numer = numer;
	}

	public BigDecimal zwrocNumer() {
		// TODO Auto-generated method stub
		return numer;
	};

}
