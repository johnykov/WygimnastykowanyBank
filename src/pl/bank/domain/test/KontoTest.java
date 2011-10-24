package pl.bank.domain.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import pl.bank.domain.Konto;
import pl.bank.domain.Kwota;
import pl.bank.domain.NumerKonta;

public class KontoTest {

	@Test
	public void testujWplate() {
		Konto konto = new Konto(new NumerKonta(new BigDecimal(23423)));
		Kwota wplata = new Kwota(1000);
		konto.wplac(wplata);
		assertEquals(wplata, konto.podajSaldo());
	}

	@Test
	public void testujUjemnaWplate() {
		Konto konto = new Konto(new NumerKonta(new BigDecimal(23423)));
		konto.wplac(new Kwota(1000));
		try {
			konto.wplac(new Kwota(-10));
			fail();
		} catch (IllegalArgumentException iae) {

		}
	}

	@Test
	public void testujWplateNull() {
		Konto konto = new Konto(new NumerKonta(new BigDecimal(23423)));
		konto.wplac(new Kwota(1000));
		try {
			konto.wplac(null);
			fail();
		} catch (IllegalArgumentException iae) {

		}
	}

	@Test
	public void testujWyplate() {
		Konto konto = new Konto(new NumerKonta(new BigDecimal(23423)));
		konto.wplac(new Kwota(1000));
		konto.wyplac(new Kwota(10));
		assertEquals(new Kwota(990), konto.podajSaldo());

	}
}
