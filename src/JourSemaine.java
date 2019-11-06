package date;

public class JourSemaine {

	String nom;
	int index;
	
	/**
	 * le constructeur de la classe
	 * @param pNom
	 */
	public JourSemaine(String pNom) {
		this.nom = pNom;
	}
	
	public JourSemaine(String pNom, int pIndex) {
		this.nom = pNom;
		this.index = pIndex;
	}
	
	
}
