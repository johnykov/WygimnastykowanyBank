package pl.bank.domain.test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import pl.bank.domain.Konto;
import pl.bank.domain.RejestrKont;

public class RejestrKontTest {

	
	@Test
	public void testujRejestr(){		
		RejestrKont rej = RejestrKont.getInstance();
		List<Konto> lista = rej.pokazKonta();
		assertEquals(2, lista.size());
	}
	
	
}
