package pl.bank.domain.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pl.bank.domain.Kwota;

public class SaldoTest {

//	@Test
//	public void testDodaj() {
//		Kwota saldo = new Kwota(0);
//		Kwota wplata = new Kwota(1000); 
//		saldo.add(wplata);
//		assertEquals(wplata, saldo);
//	}
	
	@Test
	public void testAdd(){
		Kwota wynik = (new Kwota(1)).add(new Kwota(2));
		assertEquals(new Kwota(3), wynik);		

	}
	
	@Test 
	public void testOdejmij(){
		Kwota wynik = (new Kwota(4)).minus(new Kwota(4));
		assertEquals(new Kwota(0), wynik);	
		
	}
}
