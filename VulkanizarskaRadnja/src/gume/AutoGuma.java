package gume;

/**
 * Klasa predstavlja auto gumu sa svim svojim svojstvima.
 * 
 * @author Jelena Sreckovic
 *
 */

public class AutoGuma {
	
	/**
	 * Marka i model gume
	 */
	
	private String markaModel = null;
	
	/**
	 * Precnik gume u centimetrima
	 */
	
	private int precnik = 0;
	
	/**
	 * Sirina gume u centimetrima
	 */
	private int sirina = 0;
	
	/**
	 * Visina gume u centimetrima
	 */
	
	private int visina = 0;
	
	/**
	 * Vraca marku i model gume.
	 * 
	 * @return Marka i model gume
	 */
	public String getMarkaModel() {
		return markaModel;
	}
	
	/**
	 * Postavlja marku i model
	 * 
	 * @param markaModel Marka i model koje je potrebno postaviti
	 * 
	 * @throws java.lang.RuntimeException Ako su uneti marka i model null ili je duzina manja od 3
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel==null || markaModel.length()<3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}
	
	/**
	 * Vraca vrednost precnika gume
	 * 
	 * @return Precnik gume
	 */
	
	public int getPrecnik() {
		return precnik;
	}
	
	/**
	 * Postavlja precnik gume 
	 * 
	 * @param precnik Precnik koji je potrebno postaviti
	 * 
	 * @throws java.lang.RuntimeException Ako je precnik manji od 13 ili veci od 22
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}
	
	/**
	 * Vraca vrednost sirine gume
	 * 
	 * @return Sirina gume
	 */
	
	public int getSirina() {
		return sirina;
	}
	
	/**
	 * Postavlja sirinu gume
	 * 
	 * @param sirina Sirina koju je potrebno postaviti
	 * 
	 * @throws java.lang.RuntimeException Ako je sirina manja od 135 ili veca od 355
	 */
	
	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}
	
	/**
	 * Vraca vrednost visine gume
	 * 
	 * @return Visina gume
	 */
	
	public int getVisina() {
		return visina;
	}
	
	/**
	 * Postavlja visinu gume
	 * 
	 * @param visina Visina koju je potrebno postaviti
	 * 
	 * @throws java.lang.RuntimeException Ako je visina manja od 25 ili veca od 95
	 */
	
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}
	
	/**
	 * Vraca string koji tekstualno reprezentuje Autogumu. 
	 * 
	 * @return String sadrzi marku i model, precnik, sirinu i visinu. 
	 */
	
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik +
	", sirina=" + sirina + ", visina=" + visina + "]";
	}
	
	/**
	 * Poredi dva objekta po markaModelu, precniku, sirini i visini
	 * 
	 * @param obj Objekat sa kojim se poredi
	 * 
	 * @return true Ako je prosledjeni objekat razlicit od null i instanca klase AutoGuma i ako su im atributi jednaki, inace false
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}

}
