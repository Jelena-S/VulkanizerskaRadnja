package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AutoGumaTest {
	
	AutoGuma guma;

	@Before
	public void setUp() throws Exception {
		guma = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		guma = null;
	}

	@Test
	public void testSetMarkaModel() {
		guma.setMarkaModel("Marka model");
		
		assertEquals("Marka model", guma.getMarkaModel());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		guma.setMarkaModel(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelPrekratko() {
		guma.setMarkaModel("Ma");
	}

	@Test
	public void testSetPrecnik() {
		guma.setPrecnik(16);
		
		assertEquals(16, guma.getPrecnik());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManji() {
		guma.setPrecnik(8);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVeci() {
		guma.setPrecnik(105);
	}

	@Test
	public void testSetSirina() {
		guma.setSirina(200);
		
		assertEquals(200, guma.getSirina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaManji() {
		guma.setSirina(50);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaVeci() {
		guma.setSirina(999);
	}

	@Test
	public void testSetVisina() {
		guma.setVisina(50);
		
		assertEquals(50, guma.getVisina());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaManje() {
		guma.setVisina(10);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaVeci() {
		guma.setVisina(100);
	}

	@Test
	public void testToString() {
		guma.setMarkaModel("Marka model");
		guma.setPrecnik(15);
		guma.setSirina(150);
		guma.setVisina(50);
		
		String s = guma.toString();
		
		assertTrue(s.contains("Marka model"));
		assertTrue(s.contains("15"));
		assertTrue(s.contains("150"));
		assertTrue(s.contains("50"));
	}

	@Test
	public void testEqualsObject() {
		guma.setMarkaModel("Marka model");
		guma.setPrecnik(15);
		guma.setSirina(150);
		guma.setVisina(50);
		
		AutoGuma guma2 = new AutoGuma();
		guma2.setMarkaModel("Marka model");
		guma2.setPrecnik(15);
		guma2.setSirina(150);
		guma2.setVisina(50);
		
		assertTrue(guma.equals(guma2));
		
	}
	
	@Test
	public void testEqualsObjectNull() {
		assertFalse(guma.equals(null));
	}
	
	@Test
	public void testEqualsObjectDrugaKlasa() {
		assertFalse(guma.equals(new Object()));
	}
	
	@Test
	public void testEqualsObjectNisuIsti() {
		guma.setMarkaModel("Marka model");
		guma.setPrecnik(15);
		guma.setSirina(150);
		guma.setVisina(50);
		
		AutoGuma guma2 = new AutoGuma();
		guma2.setMarkaModel("Marka model");
		guma2.setPrecnik(16);
		guma2.setSirina(151);
		guma2.setVisina(51);
		
		assertFalse(guma.equals(guma2));
		
	}

}
