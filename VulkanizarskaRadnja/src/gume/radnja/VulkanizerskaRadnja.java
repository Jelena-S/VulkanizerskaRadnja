package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;

/**
 * 
 * Klasa predstavlja vulkanizersku radnju sa auto gumama.
 * 
 * @author Jelena Sreckovic
 *
 */

public class VulkanizerskaRadnja {
	
	/**
	 * Lista sa auto gumam iz vulkanizerske radnje.
	 */

	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();
	
	/**
	 * Dodaje novu auto gumu u listu. Guma se dodaje na pocetak liste guma.
	 * 
	 * @param a Guma koju je potrebno dodati.
	 * 
	 * @throws java.lang.RuntimeException Ako je uneta guma null ili lista vec sadrzi tu gumu.
	 */
	
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		
		gume.addFirst(a);
	}
	
	/**
	 * Pretrazuje gume po marki i modelu i vraca listu guma koje odgovaraju zadatom kriterijumu.  
	 * 
	 * @param markaModel Marka i model kao kriterijum pretrage
	 * 
	 * @return Lista guma koje odgovaraju kriterijumima ili null ako je kriterijum unet kao null.
	 */
	
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		
		for(int i=0;i<gume.size();i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
					
		return novaLista;
	}

}
