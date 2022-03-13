package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {
	
	String[] calendari = Calendari.getCalendari();
	
	@Test
	public void testDotze() {//Comprobem que la llista te 12 elements
		assertEquals(12, calendari.length);
		
	}
	@Test
	public void testAgost() {//Comprobem que Agost es el element numero 8
		assertEquals("Agost", calendari[8-1]);//Agost es el mes 8 pero la llista comença en la posicio 0
		
	}
	@Test
	public void testCalendariExist() {//Comprobem que la llista no es igual a null
		assertNotNull(Calendari.getCalendari());
		
	}

}
