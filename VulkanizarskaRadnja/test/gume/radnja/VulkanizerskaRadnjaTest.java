package gume.radnja;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gume.AutoGuma;

public class VulkanizerskaRadnjaTest {
	
	private VulkanizerskaRadnja vr;
	private AutoGuma ag1, ag2, ag3;

	@Before
	public void setUp() throws Exception {
		vr = new VulkanizerskaRadnja();
		
		ag1 = new AutoGuma();
		ag1.setMarkaModel("Marka model");
		ag1.setPrecnik(15);
		ag1.setSirina(150);
		ag1.setVisina(50);
		
		ag2 = new AutoGuma();
		ag2.setMarkaModel("Marka model2");
		ag2.setPrecnik(16);
		ag2.setSirina(151);
		ag2.setVisina(51);
		
		ag3 = new AutoGuma();
		ag3.setMarkaModel("Marka model2");
		ag3.setPrecnik(17);
		ag3.setSirina(152);
		ag3.setVisina(52);
	}

	@After
	public void tearDown() throws Exception {
		vr = null;
		ag1 = null;
		ag2 = null;
	}

	@Test
	public void testDodajGumu() {
		vr.dodajGumu(ag1);
		
		List<AutoGuma> gume = vr.pronadjiGumu(ag1.getMarkaModel());
		
		assertTrue(gume.contains(ag1));
		
		//assertTrue(gume.size() == 1);
		//assertEquals(ag1, gume.get(0));
	}
	
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuNull() {
		vr.dodajGumu(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuDuplikat() {
		vr.dodajGumu(ag1);
		vr.dodajGumu(ag1);
	}

	@Test
	public void testPronadjiGumu() {
		vr.dodajGumu(ag1);
		vr.dodajGumu(ag2);
		
		List<AutoGuma> gume = vr.pronadjiGumu(ag1.getMarkaModel());
		
		assertTrue(gume.size() == 1);
		assertEquals(ag1, gume.get(0));
	}
	
	@Test
	public void testPronadjiGumuIstiMarkaModelRazlicitoOstalo() {
		vr.dodajGumu(ag1);
		vr.dodajGumu(ag2);
		vr.dodajGumu(ag3);
		
		List<AutoGuma> gume = vr.pronadjiGumu(ag2.getMarkaModel());
		
		assertTrue(gume.size() > 1);
		assertTrue(gume.contains(ag2));
		assertTrue(gume.contains(ag3));
	}
	
	@Test
	public void testPronadjiGumuKriterijumNull() {
		List<AutoGuma> gume = vr.pronadjiGumu(null);

		assertNull(gume);
	}
	
	@Test
	public void testPronadjiGumuNemaTakve() {
		List<AutoGuma> gume = vr.pronadjiGumu(ag1.getMarkaModel());

		assertEquals(new LinkedList<AutoGuma>(), gume);
	}
	
	

}
