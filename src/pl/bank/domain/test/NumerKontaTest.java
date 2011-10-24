package pl.bank.domain.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import pl.bank.domain.NumerKonta;

public class NumerKontaTest {

	
	
	@Before
	public void setUp(){
		
	}
	
	@Test
	public void TestNumerKonta(){
		NumerKonta konto = new NumerKonta(new BigDecimal(23232));		
		assertNotNull(konto);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void TestPokazNumerKonta(){
		//try{
		NumerKonta konto = new NumerKonta(null);
//		fail("nie wykrylismy nulla");
//		}catch(IllegalArgumentException ex){
//			assertEquals("Numer konta musi byc okreœlony", ex.getMessage());
//		}
		
	}
}
