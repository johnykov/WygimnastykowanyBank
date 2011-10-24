package pl.bank.domain.test;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import pl.bank.domain.Konto;
import pl.bank.domain.Kwota;
import pl.bank.domain.Przelew;
import pl.bank.domain.RejestrKont;
public class PrzelewTest {

	@Test
	public void TestujPrzelew(){
		Kwota kwotaPrzelewu = new Kwota(5647);
		Konto kontoAdresata = RejestrKont.zwrocKonto(1);
		Konto kontoNadawcy = RejestrKont.zwrocKonto(2);
		Przelew przelew = new Przelew(kwotaPrzelewu, kontoAdresata, kontoNadawcy);
		przelew.wykonaj();
		assertTrue(przelew.zrealizowany());
	}
}
