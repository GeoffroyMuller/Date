package date;

public class Mois {

	final static String[] nomsMois = {"Janvier", "F�vrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Ao�t", "Septembre", "Octobre", "Novembre", "D�cembre"};
	String nom;
	int nbJours;
	int numMois;
	
	/**
	 * le constructeur de la classe
	 * @param pNom
	 */
	public Mois(String pNom) {
		this.nom = pNom;
	}
	
	public Mois(String pNom, int pNbJours, int pNumMois) {
		this.nom = pNom;
		this.nbJours = pNbJours;
		this.numMois = pNumMois;
	}
	
	public Mois pr�c�dent(Mois pMois) {
		
	}
	
	
}
