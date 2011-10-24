package pl.bank.domain.test;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.bank.domain.Klient;

public class KlientTest {

	
	@Test
	public void TestujStworzenieKlient(){
	Klient klient = new Klient("Jan","Kowalski");
	
		assertNotNull(klient);
	}
}
